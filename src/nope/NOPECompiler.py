import sys
from pathlib import Path


sys.path.insert(0, str(Path(__file__).parent / "src" / "antlr_generated"))

from .antlr_generated.NOPEVisitor import NOPEVisitor
from .antlr_generated.NOPEParser import NOPEParser


class NopeCompilationError(Exception):
    pass


class NopeCompiler(NOPEVisitor):
    global_scope: list[str] = []
    main_scope: list[str] = []
    ignore_ws_active: bool = False
    output_lines_counter: int = 0
    defined_vars: dict[str, str] = {}  # name : type

    def compile(
        self, tree: NOPEParser.ProgramContext, snippet_length: int = 100
    ) -> str:
        self.defined_vars = {}
        self.main_scope: list[str] = [
            "nope_init();",
            f"nope_snippet_length = {snippet_length};",
        ]
        self.global_scope: list[str] = [
            '#include "nope_runtime.h"\n',
        ]

        self.visit(tree)

        full_code = []
        full_code.extend(self.global_scope)
        full_code.append("int main(){")

        self.main_scope.append("nope_expect_eof();")
        self.main_scope.append("nope_cleanup();")
        for line in self.main_scope:
            full_code.append(f"\t{line}")
        full_code.append("\treturn 0;\n}")

        return "\n".join(full_code)

    def visitProgram(self, ctx: NOPEParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitCode(self, ctx: NOPEParser.CodeContext):
        return self.visitChildren(ctx)

    def visitInput_in_escape(self, ctx: NOPEParser.Input_in_escapeContext):
        child = ctx.getChild(1)
        if child is None:
            raise NopeCompilationError("Invalid escape sequence")

        if isinstance(child, NOPEParser.WsContext):
            return None

        text = child.getText()
        for char in text:
            c_char = self._char_to_c_char(char)
            self.main_scope.append(f"nope_expect_char({c_char});")

        escaped_char = child.getText()

        match escaped_char:
            case " ":
                pass
            case "\n":
                pass
            case "\\":
                self.main_scope.append("nope_expect_char('\\\\');")

        return self.visitChildren(ctx)

    def visitBlock(self, ctx: NOPEParser.BlockContext):
        self.main_scope.append("{")
        from_i = len(self.main_scope)
        before = self.ignore_ws_active
        self.ignore_ws_active = True

        if ctx.code() is not None:
            self.visit(ctx.code())

        for i in range(from_i, len(self.main_scope)):
            self.main_scope[i] = "\t" + self.main_scope[i]

        self.ignore_ws_active = before
        self.main_scope.append("}")
        return None

    def visitBlock_with_return(self, ctx: NOPEParser.Block_with_returnContext):
        self.main_scope.append("{\n")
        if ctx.code() is not None:
            self.visit(ctx.code())

        if ctx.expr() is None:
            raise NopeCompilationError(
                "Block with return must have a return expression."
            )

        return_expr = str(self.visit(ctx.expr()))
        self.main_scope.append(f"    return {return_expr};\n")
        self.main_scope.append("}\n")
        return None

    def visitIf_stmt(self, ctx: NOPEParser.If_stmtContext):
        if ctx.logic_expr() is None:
            raise NopeCompilationError("IF statement requires a logical expression.")

        condition = str(self.visit(ctx.logic_expr()))
        self.main_scope.append(f"if ({condition}) ")

        if ctx.block(0) is not None:
            self.visit(ctx.block(0))

        has_else = any(child.getText() == "ELSE" for child in ctx.getChildren())

        if has_else:
            self.main_scope.append("    else ")
            last_child = ctx.getChild(ctx.getChildCount() - 1)
            if last_child is not None:
                self.visit(last_child)

        return None

    def visitRep_loop(self, ctx: NOPEParser.Rep_loopContext):
        iterator_name = ctx.ID().getText() if ctx.ID() is not None else "i"

        expr_list = ctx.expr()
        if not expr_list:
            raise NopeCompilationError(
                "REP loop requires at least one expression (upper bound)."
            )

        if len(expr_list) == 1:
            lower_bound = "0"
            upper_bound = str(self.visit(expr_list[0]))
            step = "1"
        elif len(expr_list) == 2:
            lower_bound = str(self.visit(expr_list[0]))
            upper_bound = str(self.visit(expr_list[1]))
            step = "1"
        else:
            lower_bound = str(self.visit(expr_list[0]))
            upper_bound = str(self.visit(expr_list[1]))
            step = str(self.visit(expr_list[2]))

        loop_str = (
            f"for (int {iterator_name} = {lower_bound}; "
            f"(({step}) > 0 ? ({iterator_name} < {upper_bound}) : ({iterator_name} > {upper_bound})); "
            f"{iterator_name} += ({step})) "
        )

        self.main_scope.append(loop_str)

        had_iter = iterator_name in self.defined_vars
        old_val = self.defined_vars.get(iterator_name)
        self.defined_vars[iterator_name] = "int"

        if ctx.block() is not None:
            self.visit(ctx.block())

        if had_iter:
            self.defined_vars[iterator_name] = old_val
        else:
            self.defined_vars.pop(iterator_name, None)

        return None

    def visitDef(self, ctx: NOPEParser.DefContext):
        func_name = ctx.ID(0).getText()
        old_scope = self.main_scope
        old_vars = self.defined_vars.copy()
        self.main_scope = []
        params_str_list = []

        for i in range(len(ctx.ID()) - 1):
            param_name = ctx.ID(i + 1).getText()
            param_type_ctx = ctx.opt_type(i)
            param_type_str = param_type_ctx.getText().strip() if param_type_ctx else ""
            c_type, dims, is_array = self._parse_type(param_type_str)
            params_str_list.append(f"{c_type} {param_name}{dims}")
            self.defined_vars[param_name] = f"{c_type} array" if is_array else c_type

        ret_c_type = "void"
        if ctx.rtype() is not None:
            ret_type_str = ctx.rtype().getText().replace("->", "").strip()
            ret_c_type, _, _ = self._parse_type(ret_type_str)

        signature = f"{ret_c_type} {func_name}({', '.join(params_str_list)}) "
        self.main_scope.append(signature)

        if ctx.block() is not None:
            self.visit(ctx.block())
        elif ctx.block_with_return() is not None:
            self.visit(ctx.block_with_return())

        function_code = "\n".join(self.main_scope)
        self.global_scope.append(function_code + "\n\n")

        self.main_scope = old_scope
        self.defined_vars = old_vars

        return None

    def visitRtype(self, ctx: NOPEParser.RtypeContext):
        return self.visitChildren(ctx)

    def visitAny_expr(self, ctx: NOPEParser.Any_exprContext):
        if ctx.expr() is not None:
            return str(self.visit(ctx.expr()))
        if ctx.logic_expr() is not None:
            return str(self.visit(ctx.logic_expr()))
        raise NopeCompilationError("Unrecognized expression")

    def visitExpr(self, ctx: NOPEParser.ExprContext):
        if ctx.getTypedRuleContext(NOPEParser.InputContext, 0) is not None:
            return ctx.getTypedRuleContext(NOPEParser.InputContext, 0).getText()

        if ctx.ID() is not None:
            return ctx.getText()

        exprs = ctx.expr()
        if exprs is not None and len(exprs) == 2:
            left = str(self.visit(exprs[0]))
            right = str(self.visit(exprs[1]))
            if ctx.MUL() is not None:
                operator = "*"
            elif ctx.DIV() is not None:
                operator = "/"
            elif ctx.ADD() is not None:
                operator = "+"
            elif ctx.SUB() is not None:
                operator = "-"
            else:
                raise NopeCompilationError("Unknown binary operator in expression.")
            return f"({left} {operator} {right})"

        if ctx.LP() is not None and exprs is not None and len(exprs) > 0:
            inside = str(self.visit(exprs[0]))
            return f"({inside})"

        if ctx.macro_call() is not None:
            return str(self.visit(ctx.macro_call()))

        if hasattr(ctx, "NUMB") and ctx.NUMB() is not None:
            return ctx.NUMB().getText()

        raise NopeCompilationError("Unrecognized mathematical expression format.")

    def visitLogic_expr(self, ctx: NOPEParser.Logic_exprContext):
        logic_exprs = ctx.logic_expr()

        if ctx.LP() is not None and logic_exprs is not None and len(logic_exprs) > 0:
            return f"({str(self.visit(logic_exprs[0]))})"

        if (
            ctx.NEGATION() is not None
            and logic_exprs is not None
            and len(logic_exprs) > 0
        ):
            return f"!({str(self.visit(logic_exprs[0]))})"

        if ctx.ID() is not None:
            return ctx.getText()

        if ctx.macro_call() is not None:
            return str(self.visit(ctx.macro_call()))

        if ctx.comparator() is not None:
            exprs = ctx.expr()
            if exprs is not None and len(exprs) == 2:
                left = str(self.visit(exprs[0]))
                right = str(self.visit(exprs[1]))
                operator = ctx.comparator().getText()
                return f"{left} {operator} {right}"

        if ctx.AND() is not None and logic_exprs is not None and len(logic_exprs) == 2:
            left = str(self.visit(logic_exprs[0]))
            right = str(self.visit(logic_exprs[1]))
            return f"{left} && {right}"

        if ctx.OR() is not None and logic_exprs is not None and len(logic_exprs) == 2:
            left = str(self.visit(logic_exprs[0]))
            right = str(self.visit(logic_exprs[1]))
            return f"{left} || {right}"

        raise NopeCompilationError("Unrecognized logical expression format.")

    def visitOpt_type(self, ctx: NOPEParser.Opt_typeContext):
        return self.visitChildren(ctx)

    def visitMacro_call(self, ctx: NOPEParser.Macro_callContext):
        return self.visitChildren(ctx)

    def visitRange_macro(self, ctx: NOPEParser.Range_macroContext):
        exprs = ctx.expr()
        if exprs is None or len(exprs) < 2:
            raise NopeCompilationError("RANGE macro requires exactly 2 expressions.")

        min_val = str(self.visit(exprs[0]))
        max_val = str(self.visit(exprs[1]))

        is_float = "." in min_val or "." in max_val
        read_fn = "nope_read_float" if is_float else "nope_read_int"
        range_fn = "nope_range_float" if is_float else "nope_range_int"

        self.main_scope.append(f"{range_fn}({read_fn}(), {min_val}, {max_val});")
        return None

    def visitMatch_macro(self, ctx: NOPEParser.Match_macroContext):
        if ctx.expr() is None:
            raise NopeCompilationError("MATCH macro requires a pattern expression.")

        pattern = str(self.visit(ctx.expr()))
        if pattern.startswith("'") and pattern.endswith("'"):
            pattern = pattern[1:-1]

        self.main_scope.append(f"nope_match({self._to_c_string(pattern)});")
        return None

    def visitAnyof_macro(self, ctx: NOPEParser.Anyof_macroContext):
        exprs = ctx.expr()
        if not exprs:
            raise NopeCompilationError("ANYOF macro requires at least one expression.")

        options = []
        for expr_ctx in exprs:
            raw = str(self.visit(expr_ctx))
            if raw.startswith("'") and raw.endswith("'"):
                raw = raw[1:-1]
            options.append(self._to_c_string(raw))

        options_str = ", ".join(options)
        self.main_scope.append(
            f"nope_anyof((const char*[]){{{options_str}}}, {len(options)});"
        )
        return None

    def visitVar_macro(self, ctx: NOPEParser.Var_macroContext):
        var_name = ctx.ID().getText()

        indices = []
        if ctx.expr() is not None:
            indices = [str(self.visit(e)) for e in ctx.expr()]

        index_suffix = "".join(f"[{idx}]" for idx in indices)

        is_new_var = var_name not in self.defined_vars

        if is_new_var:
            var_type_raw = "INT"
            if ctx.opt_type() is not None and ctx.opt_type().getText().strip() != "":
                var_type_raw = ctx.opt_type().getText().strip()
            base_nope_type = var_type_raw.split("[")[0].strip()

            dims = ""
            if "[" in var_type_raw:
                dims = var_type_raw[var_type_raw.index("[") :].strip()
            is_array = len(dims) > 0

            c_type = "int"
            if "FLOAT" in base_nope_type:
                c_type = "float"
            elif "STR" in base_nope_type:
                c_type = "char*"

            self.defined_vars[var_name] = f"{c_type} array" if is_array else c_type
            self.main_scope.append(f"{c_type} {var_name}{dims};")
            if is_array:
                return None

        stored_type = self.defined_vars[var_name]
        base_c_type = stored_type.replace(" array", "")
        assign_target = f"{var_name}{index_suffix}"
        if ctx.ASSIGN() is not None:
            expr_val = str(self.visit(ctx.any_expr()))
            if (
                len(expr_val) >= 2
                and expr_val.startswith("'")
                and expr_val.endswith("'")
            ):
                expr_val = self._to_c_string(expr_val[1:-1])
            self.main_scope.append(f"{assign_target} = {expr_val};")
        else:
            if base_c_type == "char*":
                self.main_scope.append(f"{assign_target} = nope_read_str();")
            elif base_c_type == "int":
                self.main_scope.append(f"{assign_target} = nope_read_int();")
            elif base_c_type == "float":
                self.main_scope.append(f"{assign_target} = nope_read_float();")

        return None

    def visitCheck_macro(self, ctx: NOPEParser.Check_macroContext):
        if ctx.logic_expr() is None:
            raise NopeCompilationError("CHECK macro requires a logical expression.")

        condition = str(self.visit(ctx.logic_expr()))
        c_msg = self._to_c_string(f"CHECK({condition})")

        self.main_scope.append(f"if (!({condition})) {{")
        self.main_scope.append(
            f'\tnope_fail("CHECK assertion failed", "Condition \\"{condition}\\" must be true", "");'
        )
        self.main_scope.append("}")
        return None

    def visitCustom_macro(self, ctx: NOPEParser.Custom_macroContext):
        if ctx.ID() is None:
            raise NopeCompilationError("Custom macro must have an identifier.")

        func_name = ctx.ID().getText()

        args = []
        if ctx.expr() is not None:
            for expr_ctx in ctx.expr():
                val = str(self.visit(expr_ctx))
                if len(val) >= 2 and val.startswith("'") and val.endswith("'"):
                    inner_text = val[1:-1].replace('"', '\\"')
                    val = f'"{inner_text}"'
                args.append(val)
        args_str = ", ".join(args)
        self.main_scope.append(f"    {func_name}({args_str});")
        return None

    def visitIgnore_ws(self, ctx: NOPEParser.Ignore_wsContext):
        before = self.ignore_ws_active
        self.ignore_ws_active = True
        self.main_scope.append("nope_ignore_ws_active = true;")
        if ctx.code() is not None:
            self.visit(ctx.code())

        self.ignore_ws_active = before
        c_bool = "false"
        self.main_scope.append(f"nope_ignore_ws_active = {c_bool};")

        return None

    def _char_to_c_char(self, char: str) -> str:
        """
        Converts a single character from NOPE source to a C char literal.
        """
        if char == "\n":
            return "'\\n'"
        if char == "\t":
            return "'\\t'"
        if char == "\r":
            return "'\\r'"
        if char == "'":
            return "'\\''"
        if char == "\\":
            return "'\\\\'"
        return f"'{char}'"

    def _parse_type(self, nope_type: str) -> tuple[str, str, bool]:
        """
        Parses a NOPE type string into C type components.
        Returns a tuple: (base_c_type, dimensions_string, is_array_flag)
        """
        nope_type = nope_type.strip()
        if not nope_type:
            return "int", "", False

        base = nope_type.split("[")[0].strip()
        dims = ""
        if "[" in nope_type:
            dims = nope_type[nope_type.index("[") :].strip()

        c_type = "int"
        if "FLOAT" in base:
            c_type = "float"
        elif "STR" in base:
            c_type = "char*"

        return c_type, dims, len(dims) > 0

    def _to_c_string(self, s: str) -> str:
        """Zamienia tekst NOPE na bezpieczny literał "..." w C."""
        escaped = (
            s.replace("\\", "\\\\")
            .replace('"', '\\"')
            .replace("\n", "\\n")
            .replace("\t", "\\t")
            .replace("\r", "\\r")
        )
        return f'"{escaped}"'

    def visitInput(self, ctx: NOPEParser.InputContext):
        if ctx.expl_ws() is not None:
            return self.visit(ctx.expl_ws())

        if ctx.STR() is not None:
            text = ctx.getText()
            if text.startswith("'") and text.endswith("'"):
                text = text[1:-1]

            for char in text:
                c_char = self._char_to_c_char(char)
                if ord(char) < 128:  # UTF-encoding
                    self.main_scope.append(f"nope_expect_char('{c_char}');")
                else:
                    self.main_scope.append(f'nope_expect_str("{char}");')
            return None

        if ctx.ID() is not None:
            var_name = ctx.ID().getText()
            if var_name in self.defined_vars:
                c_type = self.defined_vars[var_name]

                if c_type == "int":
                    self.main_scope.append(f"nope_expect_int({var_name});")
                elif c_type == "float":
                    self.main_scope.append(f"nope_expect_float({var_name});")
                elif c_type == "char*":
                    self.main_scope.append(f"nope_expect_str({var_name});")
            else:
                for char in var_name:
                    c_char = self._char_to_c_char(char)
                    self.main_scope.append(f"nope_expect_char({c_char});")
            return None

        if ctx.NUMB() is not None:
            text = ctx.NUMB().getText()
            for char in text:
                c_char = self._char_to_c_char(char)
                self.main_scope.append(f"nope_expect_char({c_char});")
            return None

    def visitComment(self, ctx: NOPEParser.CommentContext):
        return self.visitChildren(ctx)

    def visitSingle_ws(self, ctx: NOPEParser.Single_wsContext):
        return self.visitChildren(ctx)

    def visitWs(self, ctx: NOPEParser.WsContext):
        if self.ignore_ws_active:
            return None
        text = ctx.getText()
        for char in text:
            if char == "\n":
                self.main_scope.append("    nope_match_endl();")
            elif char == "\r":
                continue
            else:
                c_char = self._char_to_c_char(char)
                self.main_scope.append(f"    nope_expect_char({c_char});")

    def visitExpl_ws(self, ctx: NOPEParser.Expl_wsContext):
        text = ctx.getText()
        if text == "SPACE":
            self.main_scope.append("nope_expect_char(' ');")
        elif text == "ENDL":
            self.main_scope.append("nope_match_endl();")
        return None

    def visitType(self, ctx: NOPEParser.TypeContext):
        return self.visitChildren(ctx)

    def visitComparator(self, ctx: NOPEParser.ComparatorContext):
        return self.visitChildren(ctx)
