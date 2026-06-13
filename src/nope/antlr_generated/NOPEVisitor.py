# Generated from NOPE.g4 by ANTLR 4.13.2
from antlr4 import *

if "." in __name__:
    from .NOPEParser import NOPEParser
else:
    from nope.NOPEParser import NOPEParser

# This class defines a complete generic visitor for a parse tree produced by NOPEParser.


class NOPEVisitor(ParseTreeVisitor):
    # Visit a parse tree produced by NOPEParser#program.
    def visitProgram(self, ctx: NOPEParser.ProgramContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#code.
    def visitCode(self, ctx: NOPEParser.CodeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#input_in_escape.
    def visitInput_in_escape(self, ctx: NOPEParser.Input_in_escapeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#block.
    def visitBlock(self, ctx: NOPEParser.BlockContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#block_with_return.
    def visitBlock_with_return(self, ctx: NOPEParser.Block_with_returnContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#if_stmt.
    def visitIf_stmt(self, ctx: NOPEParser.If_stmtContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#rep_loop.
    def visitRep_loop(self, ctx: NOPEParser.Rep_loopContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#def.
    def visitDef(self, ctx: NOPEParser.DefContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#rtype.
    def visitRtype(self, ctx: NOPEParser.RtypeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#any_expr.
    def visitAny_expr(self, ctx: NOPEParser.Any_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#expr.
    def visitExpr(self, ctx: NOPEParser.ExprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#logic_expr.
    def visitLogic_expr(self, ctx: NOPEParser.Logic_exprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#opt_type.
    def visitOpt_type(self, ctx: NOPEParser.Opt_typeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#macro_call.
    def visitMacro_call(self, ctx: NOPEParser.Macro_callContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#range_macro.
    def visitRange_macro(self, ctx: NOPEParser.Range_macroContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#match_macro.
    def visitMatch_macro(self, ctx: NOPEParser.Match_macroContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#anyof_macro.
    def visitAnyof_macro(self, ctx: NOPEParser.Anyof_macroContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#var_macro.
    def visitVar_macro(self, ctx: NOPEParser.Var_macroContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#check_macro.
    def visitCheck_macro(self, ctx: NOPEParser.Check_macroContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#custom_macro.
    def visitCustom_macro(self, ctx: NOPEParser.Custom_macroContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#ignore_ws.
    def visitIgnore_ws(self, ctx: NOPEParser.Ignore_wsContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#input.
    def visitInput(self, ctx: NOPEParser.InputContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#comment.
    def visitComment(self, ctx: NOPEParser.CommentContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#single_ws.
    def visitSingle_ws(self, ctx: NOPEParser.Single_wsContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#ws.
    def visitWs(self, ctx: NOPEParser.WsContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#expl_ws.
    def visitExpl_ws(self, ctx: NOPEParser.Expl_wsContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#type.
    def visitType(self, ctx: NOPEParser.TypeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by NOPEParser#comparator.
    def visitComparator(self, ctx: NOPEParser.ComparatorContext):
        return self.visitChildren(ctx)


del NOPEParser
