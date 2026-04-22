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


    # Enter a parse tree produced by NOPEParser#tag.
    def enterTag(self, ctx:NOPEParser.TagContext):
        pass

    # Exit a parse tree produced by NOPEParser#tag.
    def exitTag(self, ctx:NOPEParser.TagContext):
        pass


    # Enter a parse tree produced by NOPEParser#args.
    def enterArgs(self, ctx:NOPEParser.ArgsContext):
        pass

    # Exit a parse tree produced by NOPEParser#args.
    def exitArgs(self, ctx:NOPEParser.ArgsContext):
        pass


    # Enter a parse tree produced by NOPEParser#arg.
    def enterArg(self, ctx:NOPEParser.ArgContext):
        pass

    # Exit a parse tree produced by NOPEParser#arg.
    def exitArg(self, ctx:NOPEParser.ArgContext):
        pass


    # Enter a parse tree produced by NOPEParser#arg_part.
    def enterArg_part(self, ctx:NOPEParser.Arg_partContext):
        pass

    # Exit a parse tree produced by NOPEParser#arg_part.
    def exitArg_part(self, ctx:NOPEParser.Arg_partContext):
        pass


    # Enter a parse tree produced by NOPEParser#tagname.
    def enterTagname(self, ctx:NOPEParser.TagnameContext):
        pass

    # Exit a parse tree produced by NOPEParser#tagname.
    def exitTagname(self, ctx:NOPEParser.TagnameContext):
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


    # Enter a parse tree produced by NOPEParser#ws.
    def enterWs(self, ctx:NOPEParser.WsContext):
        pass

    # Exit a parse tree produced by NOPEParser#ws.
    def exitWs(self, ctx:NOPEParser.WsContext):
        pass



del NOPEParser