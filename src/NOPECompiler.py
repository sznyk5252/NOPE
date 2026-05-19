from .NOPEVisitor import NOPEVisitor
from .NOPEParser import NOPEParser


class NopeCompiler(NOPEVisitor):
    output_buff: list[str] = []

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
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#block.
    def visitBlock(self, ctx: NOPEParser.BlockContext):
        self.output_buff.append("{\n")
        self.visit(ctx.code())
        self.output_buff.append("}\n")
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#block_with_return.
    def visitBlock_with_return(self, ctx: NOPEParser.Block_with_returnContext):
        self.output_buff.append("{\n")
        self.visit(ctx.code())

        return_expr = str(self.visit(ctx.expr()))
        self.output_buff.append(f"    return {return_expr};\n")
        self.output_buff.append("}\n")

        return None

    # JK
    # Visit a parse tree produced by NOPEParser#if_stmt.
    def visitIf_stmt(self, ctx: NOPEParser.If_stmtContext):
        condition = self.visit(ctx.logic_expr())
        self.output_buff.append(f"if ({condition}) ")
        self.visit(ctx.block(0))
        has_else = any(child.getText() == "ELSE" for child in ctx.getChildren())

        if has_else:
            self.output_buff.append("else ")
            last_child = ctx.getChild(ctx.getChildCount() - 1)
            self.visit(last_child)

        return None

    # JK
    # Visit a parse tree produced by NOPEParser#rep_loop.
    def visitRep_loop(self, ctx: NOPEParser.Rep_loopContext):
        iterator_name = ctx.ID().getText() if ctx.ID() else "i"

        expr_list = ctx.expr()

        upper_bound = str(self.visit(expr_list[0]))

        lower_bound = "0"
        step = "1"

        if len(expr_list) > 1:
            lower_bound = str(self.visit(expr_list[1]))

        if len(expr_list) > 2:
            step = str(self.visit(expr_list[2]))

        loop_str = f"for (int {iterator_name} = {lower_bound}; {iterator_name} < {upper_bound}; {iterator_name} += {step}) "
        self.output_buff.append(loop_str)

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
        if ctx.expr():
            return self.visit(ctx.expr())
        if ctx.logic_expr():
            return self.visit(ctx.logic_expr())
        return ""

    # JK
    # Visit a parse tree produced by NOPEParser#expr.
    def visitExpr(self, ctx: NOPEParser.ExprContext):
        if ctx.getTypedRuleContext(NOPEParser.InputContext, 0):
            return ctx.getTypedRuleContext(NOPEParser.InputContext, 0).getText()

        if ctx.ID():
            return ctx.getText()

        if len(ctx.expr()) == 2:
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            operator = ctx.getChild(1).getText()
            return f"({left} {operator} {right})"

        if ctx.LP():
            inside = self.visit(ctx.expr(0))
            return f"({inside})"

        if ctx.macro_call():
            return self.visit(ctx.macro_call())

        return ""

    # JK
    # Visit a parse tree produced by NOPEParser#logic_expr.
    def visitLogic_expr(self, ctx: NOPEParser.Logic_exprContext):
        if ctx.LP():
            return f"({self.visit(ctx.logic_expr(0))})"

        if ctx.NEGATION():
            return f"!({self.visit(ctx.logic_expr(0))})"

        if ctx.ID():
            return ctx.getText()

        if ctx.macro_call():
            return self.visit(ctx.macro_call())

        if ctx.comparator():
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            operator = ctx.comparator().getText()
            return f"{left} {operator} {right}"

        if ctx.AND():
            left = self.visit(ctx.logic_expr(0))
            right = self.visit(ctx.logic_expr(1))
            return f"{left} && {right}"

        if ctx.OR():
            left = self.visit(ctx.logic_expr(0))
            right = self.visit(ctx.logic_expr(1))
            return f"{left} || {right}"

        return ""

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
        min_val = str(self.visit(ctx.expr(0)))
        max_val = str(self.visit(ctx.expr(1)))
        return f"NOPE_RANGE({min_val}, {max_val})"

    # SK
    # Visit a parse tree produced by NOPEParser#match_macro.
    def visitMatch_macro(self, ctx: NOPEParser.Match_macroContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#anyof_macro.
    def visitAnyof_macro(self, ctx: NOPEParser.Anyof_macroContext):
        args = []
        for expr_ctx in ctx.expr():
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
        condition = str(self.visit(ctx.logic_expr()))

        self.output_buff.append(f"if (!({condition})) {{\n")
        self.output_buff.append(
            f'    printf("[NOPE] Failed test on condition: CHECK({condition})\\n");\n'
        )
        self.output_buff.append("    return 1;\n")
        self.output_buff.append("}\n")

        return None

    # JK
    # Visit a parse tree produced by NOPEParser#custom_macro.
    def visitCustom_macro(self, ctx: NOPEParser.Custom_macroContext):
        func_name = ctx.ID().getText()
        args = []
        for expr_ctx in ctx.expr():
            args.append(str(self.visit(expr_ctx)))

        args_str = ", ".join(args)
        return f"{func_name}({args_str})"

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
        clean_comment = ctx.getText().lstrip("#")
        self.output_buff.append(f"//{clean_comment}\n")
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#single_ws.
    def visitSingle_ws(self, ctx: NOPEParser.Single_wsContext):
        return self.visitChildren(ctx)

    # JK
    # Visit a parse tree produced by NOPEParser#ws.
    def visitWs(self, ctx: NOPEParser.WsContext):
        self.output_buff.append(ctx.getText())
        return None

    # JK
    # Visit a parse tree produced by NOPEParser#expl_ws.
    def visitExpl_ws(self, ctx: NOPEParser.Expl_wsContext):
        if ctx.getText() == "SPACE":
            self.output_buff.append(" ")
        elif ctx.getText() == "ENDL":
            self.output_buff.append("\n")
        return None

    # SK
    # Visit a parse tree produced by NOPEParser#type.
    def visitType(self, ctx: NOPEParser.TypeContext):
        return self.visitChildren(ctx)

    # SK
    # Visit a parse tree produced by NOPEParser#comparator.
    def visitComparator(self, ctx: NOPEParser.ComparatorContext):
        return self.visitChildren(ctx)
