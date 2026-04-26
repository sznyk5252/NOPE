# Generated from NOPE.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .NOPEParser import NOPEParser
else:
    from NOPEParser import NOPEParser

# This class defines a complete listener for a parse tree produced by NOPEParser.
class NOPEListener(ParseTreeListener):

    # Enter a parse tree produced by NOPEParser#program.
    def enterProgram(self, ctx:NOPEParser.ProgramContext):
        pass

    # Exit a parse tree produced by NOPEParser#program.
    def exitProgram(self, ctx:NOPEParser.ProgramContext):
        pass


    # Enter a parse tree produced by NOPEParser#code.
    def enterCode(self, ctx:NOPEParser.CodeContext):
        pass

    # Exit a parse tree produced by NOPEParser#code.
    def exitCode(self, ctx:NOPEParser.CodeContext):
        pass


    # Enter a parse tree produced by NOPEParser#block.
    def enterBlock(self, ctx:NOPEParser.BlockContext):
        pass

    # Exit a parse tree produced by NOPEParser#block.
    def exitBlock(self, ctx:NOPEParser.BlockContext):
        pass


    # Enter a parse tree produced by NOPEParser#if_stmt.
    def enterIf_stmt(self, ctx:NOPEParser.If_stmtContext):
        pass

    # Exit a parse tree produced by NOPEParser#if_stmt.
    def exitIf_stmt(self, ctx:NOPEParser.If_stmtContext):
        pass


    # Enter a parse tree produced by NOPEParser#rep_loop.
    def enterRep_loop(self, ctx:NOPEParser.Rep_loopContext):
        pass

    # Exit a parse tree produced by NOPEParser#rep_loop.
    def exitRep_loop(self, ctx:NOPEParser.Rep_loopContext):
        pass


    # Enter a parse tree produced by NOPEParser#expr.
    def enterExpr(self, ctx:NOPEParser.ExprContext):
        pass

    # Exit a parse tree produced by NOPEParser#expr.
    def exitExpr(self, ctx:NOPEParser.ExprContext):
        pass


    # Enter a parse tree produced by NOPEParser#opt_type.
    def enterOpt_type(self, ctx:NOPEParser.Opt_typeContext):
        pass

    # Exit a parse tree produced by NOPEParser#opt_type.
    def exitOpt_type(self, ctx:NOPEParser.Opt_typeContext):
        pass


    # Enter a parse tree produced by NOPEParser#macro_call.
    def enterMacro_call(self, ctx:NOPEParser.Macro_callContext):
        pass

    # Exit a parse tree produced by NOPEParser#macro_call.
    def exitMacro_call(self, ctx:NOPEParser.Macro_callContext):
        pass


    # Enter a parse tree produced by NOPEParser#range_macro.
    def enterRange_macro(self, ctx:NOPEParser.Range_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#range_macro.
    def exitRange_macro(self, ctx:NOPEParser.Range_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#match_macro.
    def enterMatch_macro(self, ctx:NOPEParser.Match_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#match_macro.
    def exitMatch_macro(self, ctx:NOPEParser.Match_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#anyof_macro.
    def enterAnyof_macro(self, ctx:NOPEParser.Anyof_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#anyof_macro.
    def exitAnyof_macro(self, ctx:NOPEParser.Anyof_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#throws_macro.
    def enterThrows_macro(self, ctx:NOPEParser.Throws_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#throws_macro.
    def exitThrows_macro(self, ctx:NOPEParser.Throws_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#var_macro.
    def enterVar_macro(self, ctx:NOPEParser.Var_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#var_macro.
    def exitVar_macro(self, ctx:NOPEParser.Var_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#check_macro.
    def enterCheck_macro(self, ctx:NOPEParser.Check_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#check_macro.
    def exitCheck_macro(self, ctx:NOPEParser.Check_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#header_macro.
    def enterHeader_macro(self, ctx:NOPEParser.Header_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#header_macro.
    def exitHeader_macro(self, ctx:NOPEParser.Header_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#def_macro.
    def enterDef_macro(self, ctx:NOPEParser.Def_macroContext):
        pass

    # Exit a parse tree produced by NOPEParser#def_macro.
    def exitDef_macro(self, ctx:NOPEParser.Def_macroContext):
        pass


    # Enter a parse tree produced by NOPEParser#ignore_ws.
    def enterIgnore_ws(self, ctx:NOPEParser.Ignore_wsContext):
        pass

    # Exit a parse tree produced by NOPEParser#ignore_ws.
    def exitIgnore_ws(self, ctx:NOPEParser.Ignore_wsContext):
        pass


    # Enter a parse tree produced by NOPEParser#input.
    def enterInput(self, ctx:NOPEParser.InputContext):
        pass

    # Exit a parse tree produced by NOPEParser#input.
    def exitInput(self, ctx:NOPEParser.InputContext):
        pass


    # Enter a parse tree produced by NOPEParser#comment.
    def enterComment(self, ctx:NOPEParser.CommentContext):
        pass

    # Exit a parse tree produced by NOPEParser#comment.
    def exitComment(self, ctx:NOPEParser.CommentContext):
        pass


    # Enter a parse tree produced by NOPEParser#single_ws.
    def enterSingle_ws(self, ctx:NOPEParser.Single_wsContext):
        pass

    # Exit a parse tree produced by NOPEParser#single_ws.
    def exitSingle_ws(self, ctx:NOPEParser.Single_wsContext):
        pass


    # Enter a parse tree produced by NOPEParser#ws.
    def enterWs(self, ctx:NOPEParser.WsContext):
        pass

    # Exit a parse tree produced by NOPEParser#ws.
    def exitWs(self, ctx:NOPEParser.WsContext):
        pass



del NOPEParser