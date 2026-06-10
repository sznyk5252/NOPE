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
    defined_vars: dict[str, str] = {}

    def compile(self, tree: NOPEParser.ProgramContext) -> str:
        self.defined_vars = {}
        self.main_scope: list[str] = ["nope_init();"]
        self.global_scope: list[str] = [
            '#include "nope_runtime.h"\n',
        ]

        self.visit(tree)

        full_code = []
        full_code.extend(self.global_scope)
        full_code.append("int main(){")

        self.main_scope.append("nope_cleanup();")
        for line in self.main_scope:
            full_code.append(f"\t{line}")
        full_code.append("\treturn 0;\n}")

        return "\n".join(full_code)

    # SK
    # Visit a parse tree produced by NOPEParser#program.
    def visitProgram(self, ctx: NOPEParser.ProgramContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#code.
    def visitCode(self, ctx: NOPEParser.CodeContext):
        return self.visitChildren(ctx)

    # SK
    # Visit a parse tree produced by NOPEParser#input_in_escape.
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

    # JK
    # Visit a parse tree produced by NOPEParser#block.
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

    # JK
    # Visit a parse tree produced by NOPEParser#block_with_return.
    # TODO: ujednolicić z zwykłem blokiem
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

    # JK
    # Visit a parse tree produced by NOPEParser#if_stmt.
    # TODO: DODAĆ TOKEN ELSE
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

    # JK
    # Visit a parse tree produced by NOPEParser#rep_loop.
    def visitRep_loop(self, ctx: NOPEParser.Rep_loopContext):
        iterator_name = ctx.ID().getText() if ctx.ID() is not None else "i"

        # TODO: ctx.expr() - może zwrócić None
        iterator_name = ctx.ID().getText() if ctx.ID() is not None else "i"

        expr_list = ctx.expr()
        if not expr_list:
            raise NopeCompilationError(
                "REP loop requires at least an upper bound expression."
            )

        upper_bound = str(self.visit(expr_list[0]))
        lower_bound = "0"
        step = "1"

        if len(expr_list) > 1 and expr_list[1] is not None:
            lower_bound = str(self.visit(expr_list[1]))

        if len(expr_list) > 2 and expr_list[2] is not None:
            step = str(self.visit(expr_list[2]))

        loop_str = f"for (int {iterator_name} = {lower_bound}; {iterator_name} < {upper_bound}; {iterator_name} += {step}) "
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

    # SK
    # Visit a parse tree produced by NOPEParser#def.
    def visitDef(self, ctx: NOPEParser.DefContext):
        func_name = ctx.ID(0).getText()

        # 1. Zapisujemy obecny stan (pozwala wrócić do main() po przetworzeniu funkcji)
        old_scope = self.main_scope
        old_vars = self.defined_vars.copy()

        # 2. Tworzymy nowy, pusty scope na kod wewnątrz definicji funkcji
        self.main_scope = []

        # 3. Parsowanie parametrów funkcji
        params_str_list = []

        # ctx.ID() zwraca listę identyfikatorów. Od indeksu 1 zaczynają się parametry.
        for i in range(len(ctx.ID()) - 1):
            param_name = ctx.ID(i + 1).getText()

            # W gramatyce dla każdego parametru (ID) występuje (opcjonalny) typ opt_type
            param_type_ctx = ctx.opt_type(i)
            param_type_str = param_type_ctx.getText().strip() if param_type_ctx else ""

            c_type, dims, is_array = self._parse_type(param_type_str)

            # W języku C argumenty tablicowe wyglądają tak: int grid[10][10]
            params_str_list.append(f"{c_type} {param_name}{dims}")

            # Rejestrujemy argument w pamięci jako lokalną zmienną, aby VAR wewnątrz funkcji go "widział"
            self.defined_vars[param_name] = f"{c_type} array" if is_array else c_type

        # 4. Parsowanie zwracanego typu (rtype)
        ret_c_type = "void"
        if ctx.rtype() is not None:
            # ctx.rtype().getText() zwróci np. '->INT'. Wycinamy strzałkę.
            ret_type_str = ctx.rtype().getText().replace("->", "").strip()
            ret_c_type, _, _ = self._parse_type(ret_type_str)

        # 5. Generowanie sygnatury i dorzucenie jej na start nowego scope'a
        signature = f"{ret_c_type} {func_name}({', '.join(params_str_list)}) "
        self.main_scope.append(signature)

        # 6. Odwiedzenie bloku kodu (wygeneruje to klamry {} i kod wewnętrzny prosto do self.main_scope)
        if ctx.block() is not None:
            self.visit(ctx.block())
        elif ctx.block_with_return() is not None:
            self.visit(ctx.block_with_return())

        # 7. Złączenie całego wygenerowanego kodu i wyrzucenie do przestrzeni globalnej!
        function_code = "".join(self.main_scope)
        self.global_scope.append(function_code + "\n\n")

        # 8. Przywrócenie głównego środowiska (koniec zamrożenia)
        self.main_scope = old_scope
        self.defined_vars = old_vars

        return None

    # SK
    # Visit a parse tree produced by NOPEParser#rtype.
    def visitRtype(self, ctx: NOPEParser.RtypeContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#any_expr.
    def visitAny_expr(self, ctx: NOPEParser.Any_exprContext):
        # TODO: done
        # czy to nie powinien być if else z wyrzuceniem jakiegoś vustomowego błędu przy braku dopasowania?
        # znowu ctx.expr() - może zwrócić None - poprawić żeby nie czepiał pylance
        # te metody powinny zwracać None a nie str
        if ctx.expr() is not None:
            return str(self.visit(ctx.expr()))
        if ctx.logic_expr() is not None:
            return str(self.visit(ctx.logic_expr()))
        raise NopeCompilationError("Unrecognized expression")

    # JK
    # Visit a parse tree produced by NOPEParser#expr.
    # TODO: znowu ctx.expr() - może zwrócić None - poprawić żeby nie czepiał pylance
    # te metody powinny zwracać None a nie str
    def visitExpr(self, ctx: NOPEParser.ExprContext):
        # TODO: done
        # czy to nie powinien być if else z wyrzuceniem jakiegoś vustomowego błędu przy braku dopasowania?
        # znowu ctx.expr() - może zwrócić None - poprawić żeby nie czepiał pylance
        # te metody powinny zwracać None a nie str
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

        raise NopeCompilationError("Unrecognized mathematical expression format.")

    # JK
    # Visit a parse tree produced by NOPEParser#logic_expr.
    def visitLogic_expr(self, ctx: NOPEParser.Logic_exprContext):
        # TODO: done
        # czy to nie powinien być if else z wyrzuceniem jakiegoś vustomowego błędu przy braku dopasowania?
        # znowu ctx.expr() - może zwrócić None - poprawić żeby nie czepiał pylance
        # te metody powinny zwracać None a nie str
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

    # JK
    # Visit a parse tree produced by NOPEParser#opt_type.
    def visitOpt_type(self, ctx: NOPEParser.Opt_typeContext):
        return self.visitChildren(ctx)

    # SK
    # Visit a parse tree produced by NOPEParser#macro_call.
    def visitMacro_call(self, ctx: NOPEParser.Macro_callContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#range_macro.
    def visitRange_macro(self, ctx: NOPEParser.Range_macroContext):
        # TODO: te metody powinny zwracać None a nie str | done
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

    # SK
    # Visit a parse tree produced by NOPEParser#match_macro.
    def visitMatch_macro(self, ctx: NOPEParser.Match_macroContext):
        if ctx.expr() is None:
            raise NopeCompilationError("MATCH macro requires a pattern expression.")

        pattern = str(self.visit(ctx.expr()))
        if pattern.startswith("'") and pattern.endswith("'"):
            pattern = pattern[1:-1]

        self.main_scope.append(f"nope_match({self._to_c_string(pattern)});")
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#anyof_macro.
    def visitAnyof_macro(self, ctx: NOPEParser.Anyof_macroContext):
        # TODO: te metody powinny zwracać None a nie str | done
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

    # SK
    # Visit a parse tree produced by NOPEParser#var_macro.
    def visitVar_macro(self, ctx: NOPEParser.Var_macroContext):
        var_name = ctx.ID().getText()

        indices = []
        if ctx.expr() is not None:
            indices = [str(self.visit(e)) for e in ctx.expr()]

        index_suffix = "".join(f"[{idx}]" for idx in indices)

        # Sprawdzamy czy to zupełnie nowa zmienna/tablica
        is_new_var = var_name not in self.defined_vars

        if is_new_var:
            var_type_raw = "INT"
            if ctx.opt_type() is not None and ctx.opt_type().getText().strip() != "":
                var_type_raw = ctx.opt_type().getText().strip()

            # Oddzielamy typ bazowy od wymiarów (np. "FLOAT[size][10]" -> "FLOAT" i "[size][10]")
            base_nope_type = var_type_raw.split("[")[0].strip()

            dims = ""
            if "[" in var_type_raw:
                dims = var_type_raw[var_type_raw.index("[") :].strip()

            is_array = len(dims) > 0

            # Mapowanie na C
            c_type = "int"
            if "FLOAT" in base_nope_type:
                c_type = "float"
            elif "STR" in base_nope_type:
                c_type = "char*"

            # Zapisujemy typ w pamięci (z flagą "array", jeśli to tablica)
            self.defined_vars[var_name] = f"{c_type} array" if is_array else c_type

            # Generowanie deklaracji. Dla tablic będzie to tzw. VLA (Variable Length Array)
            self.main_scope.append(f"{c_type} {var_name}{dims};")

            # Zgodnie z dokumentacją: całych tablic NIE wczytujemy niejawnie ze stdout!
            if is_array:
                return None

        # 2. W tym miejscu wiemy, że chcemy wykonać odczyt ze stdout lub przypisanie <<
        # Działa to dla zwykłych zmiennych oraz dla pojedynczych elementów tablicy
        stored_type = self.defined_vars[var_name]
        base_c_type = stored_type.replace(" array", "")

        assign_target = f"{var_name}{index_suffix}"

        if ctx.ASSIGN() is not None:
            # Przypisanie jawne: VAR(buffer[i]) << current_val
            expr_val = str(self.visit(ctx.any_expr()))
            self.main_scope.append(f"{assign_target} = {expr_val};")
        else:
            # Wczytanie z potoku na wskazane miejsce: VAR(buffer[i])
            if base_c_type == "char*":
                self.main_scope.append(f"{assign_target} = nope_read_str();")
            elif base_c_type == "int":
                self.main_scope.append(f"{assign_target} = nope_read_int();")
            elif base_c_type == "float":
                self.main_scope.append(f"{assign_target} = nope_read_float();")

        return None

    # JK
    # Visit a parse tree produced by NOPEParser#check_macro.
    # TODO: korzystaj z funki z nope_runtime.h - między innymi z nope_match, to samo dla innych
    def visitCheck_macro(self, ctx: NOPEParser.Check_macroContext):
        # TODO: pylance wskazuje na możliwośc None
        if ctx.logic_expr() is None:
            raise NopeCompilationError("CHECK macro requires a logical expression.")

        condition = str(self.visit(ctx.logic_expr()))
        c_msg = self._to_c_string(f"CHECK({condition})")

        self.main_scope.append(f"if (!({condition})) {{")
        self.main_scope.append(
            f'\tnope_fail("CHECK assertion failed", {c_msg}, "false");'
        )
        self.main_scope.append("}")
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#custom_macro.
    def visitCustom_macro(self, ctx: NOPEParser.Custom_macroContext):
        # TODO: te metody powinny zwracać None a nie str | done
        if ctx.ID() is None:
            raise NopeCompilationError("Custom macro must have an identifier.")

        func_name = ctx.ID().getText()

        args = []
        if ctx.expr() is not None:
            for expr_ctx in ctx.expr():
                args.append(str(self.visit(expr_ctx)))

        args_str = ", ".join(args)
        self.main_scope.append(f"{func_name}({args_str});")
        return None

    # SK
    # Visit a parse tree produced by NOPEParser#ignore_ws.
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

    # SK
    # Visit a parse tree produced by NOPEParser#input.
    def visitInput(self, ctx: NOPEParser.InputContext):
        if ctx.expl_ws() is not None:
            return self.visit(ctx.expl_ws())

        if ctx.STR() is not None:
            text = ctx.getText()
            if text.startswith("'") and text.endswith("'"):
                text = text[1:-1]

            for char in text:
                c_char = self._char_to_c_char(char)
                self.main_scope.append(f"nope_expect_char({c_char});")
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

    # JK
    # Visit a parse tree produced by NOPEParser#comment.
    def visitComment(self, ctx: NOPEParser.CommentContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#single_ws.
    def visitSingle_ws(self, ctx: NOPEParser.Single_wsContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#ws.
    def visitWs(self, ctx: NOPEParser.WsContext):
        if self.ignore_ws_active:
            return None
        text = ctx.getText()
        for char in text:
            c_char = self._char_to_c_char(char)
            self.main_scope.append(f"nope_expect_char({c_char});")
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#expl_ws.
    def visitExpl_ws(self, ctx: NOPEParser.Expl_wsContext):
        text = ctx.getText()
        if text == "SPACE":
            self.main_scope.append("nope_expect_char(' ');")
        elif text == "ENDL":
            self.main_scope.append("nope_expect_char('\\n');\n")
        return None

    # SK
    # Visit a parse tree produced by NOPEParser#type.
    def visitType(self, ctx: NOPEParser.TypeContext):
        return self.visitChildren(ctx)

    # SK
    # Visit a parse tree produced by NOPEParser#comparator.
    def visitComparator(self, ctx: NOPEParser.ComparatorContext):
        return self.visitChildren(ctx)
