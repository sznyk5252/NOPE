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

    def compile(self, tree: NOPEParser.ProgramContext) -> str:
        self.main_scope: list[str] = []
        self.global_scope: list[str] = [
            '#include "nope_runtime.h"\n\n',
            "int main() {\n",
        ]

        self.visit(tree)

        full_code = []
        full_code.extend(self.global_scope)

        # full_code.append("\nint main() {")
        for line in self.main_scope:
            full_code.append(f"\t{line}")
        full_code.append("\treturn 0;\n}")

        return "".join(full_code)

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

        escaped_char = child.getText()

        match escaped_char:
            case " ":
                pass
            case "\n":
                pass
            case "\\":
                # TODO: CO TO?
                self.main_scope.a

        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#block.
    # TODO: w niektórych blokach musimy ignorować ws, ctx.* - może zwracać None - przynajmniej wg pylance | done
    def visitBlock(self, ctx: NOPEParser.BlockContext):
        self.main_scope.append("{\n")
        before = self.ignore_ws_active
        self.ignore_ws_active = True

        if ctx.code() is not None:
            self.visit(ctx.code())

        self.ignore_ws_active = before
        self.main_scope.append("}\n")
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#block_with_return.
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
    # TODO: Nie powinno się sprawdzać tokenów po tekście - powinno się sprawdzać czy typ to tokenu nazwanego ELSE
    def visitIf_stmt(self, ctx: NOPEParser.If_stmtContext):
        if ctx.logic_expr() is None:
            raise NopeCompilationError("IF statement requires a logical expression.")

        condition = str(self.visit(ctx.logic_expr()))
        self.main_scope.append(f"    if ({condition}) ")

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

        if ctx.block() is not None:
            self.visit(ctx.block())

        return None

    # SK
    # Visit a parse tree produced by NOPEParser#def.
    def visitDef(self, ctx: NOPEParser.DefContext):
        return self.visitChildren(ctx)

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
            operator = ctx.getChild(1).getText()
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
        return f"NOPE_RANGE({min_val}, {max_val})"

    # SK
    # Visit a parse tree produced by NOPEParser#match_macro.
    def visitMatch_macro(self, ctx: NOPEParser.Match_macroContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#anyof_macro.
    def visitAnyof_macro(self, ctx: NOPEParser.Anyof_macroContext):
        # TODO: te metody powinny zwracać None a nie str | done
        exprs = ctx.expr()
        if not exprs:
            raise NopeCompilationError("ANYOF macro requires at least one expression.")

        args = []
        for expr_ctx in exprs:
            args.append(str(self.visit(expr_ctx)))

        args_str = ", ".join(args)
        return f"NOPE_ANYOF({args_str})"

    # SK
    # Visit a parse tree produced by NOPEParser#var_macro.
    def visitVar_macro(self, ctx: NOPEParser.Var_macroContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#check_macro.
    def visitCheck_macro(self, ctx: NOPEParser.Check_macroContext):
        # TODO: pylance wskazuje na możliwośc None
        if ctx.logic_expr() is None:
            raise NopeCompilationError("CHECK macro requires a logical expression.")

        condition = str(self.visit(ctx.logic_expr()))

        self.main_scope.append(f"        if (!({condition})) {{\n")
        self.main_scope.append(
            f'            printf("[NOPE] Failed test on condition: CHECK({condition})\\n");\n'
        )
        self.main_scope.append("            return 1;\n")
        self.main_scope.append("        }\n")
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
        self.main_scope.append(f"    {func_name}({args_str});\n")
        return None

    # SK
    # Visit a parse tree produced by NOPEParser#ignore_ws.
    def visitIgnore_ws(self, ctx: NOPEParser.Ignore_wsContext):
        return self.visitChildren(ctx)

    # SK
    # Visit a parse tree produced by NOPEParser#input.
    def visitInput(self, ctx: NOPEParser.InputContext):
        return self.visitChildren(ctx)

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
        text = ctx.getText()
        if text.strip():
            self.main_scope.append(text)
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#expl_ws.
    def visitExpl_ws(self, ctx: NOPEParser.Expl_wsContext):
        if ctx.getText() == "SPACE":
            self.main_scope.append(" ")
        elif ctx.getText() == "ENDL":
            self.main_scope.append("\n")
        return None

    # SK
    # Visit a parse tree produced by NOPEParser#type.
    def visitType(self, ctx: NOPEParser.TypeContext):
        return self.visitChildren(ctx)

    # SK
    # Visit a parse tree produced by NOPEParser#comparator.
    def visitComparator(self, ctx: NOPEParser.ComparatorContext):
        return self.visitChildren(ctx)
