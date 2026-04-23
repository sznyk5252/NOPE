# Generated from NOPE.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,91,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,1,0,1,0,1,1,1,
        1,1,1,3,1,31,8,1,1,1,1,1,1,1,1,1,5,1,37,8,1,10,1,12,1,40,9,1,1,2,
        1,2,1,2,1,2,3,2,46,8,2,1,2,1,2,1,3,1,3,1,3,5,3,53,8,3,10,3,12,3,
        56,9,3,1,4,4,4,59,8,4,11,4,12,4,60,1,5,1,5,1,5,1,5,3,5,67,8,5,1,
        5,1,5,3,5,71,8,5,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,9,1,9,1,10,
        1,10,1,11,4,11,87,8,11,11,11,12,11,88,1,11,0,0,12,0,2,4,6,8,10,12,
        14,16,18,20,22,0,3,1,0,1,9,1,0,17,18,1,0,12,13,93,0,24,1,0,0,0,2,
        38,1,0,0,0,4,41,1,0,0,0,6,49,1,0,0,0,8,58,1,0,0,0,10,70,1,0,0,0,
        12,72,1,0,0,0,14,74,1,0,0,0,16,79,1,0,0,0,18,81,1,0,0,0,20,83,1,
        0,0,0,22,86,1,0,0,0,24,25,3,2,1,0,25,26,5,0,0,1,26,1,1,0,0,0,27,
        30,5,20,0,0,28,31,3,16,8,0,29,31,3,20,10,0,30,28,1,0,0,0,30,29,1,
        0,0,0,31,37,1,0,0,0,32,37,3,4,2,0,33,37,3,18,9,0,34,37,3,16,8,0,
        35,37,3,22,11,0,36,27,1,0,0,0,36,32,1,0,0,0,36,33,1,0,0,0,36,34,
        1,0,0,0,36,35,1,0,0,0,37,40,1,0,0,0,38,36,1,0,0,0,38,39,1,0,0,0,
        39,3,1,0,0,0,40,38,1,0,0,0,41,42,3,12,6,0,42,45,5,15,0,0,43,46,3,
        8,4,0,44,46,3,6,3,0,45,43,1,0,0,0,45,44,1,0,0,0,45,46,1,0,0,0,46,
        47,1,0,0,0,47,48,5,16,0,0,48,5,1,0,0,0,49,54,3,8,4,0,50,51,5,14,
        0,0,51,53,3,8,4,0,52,50,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,
        1,0,0,0,55,7,1,0,0,0,56,54,1,0,0,0,57,59,3,10,5,0,58,57,1,0,0,0,
        59,60,1,0,0,0,60,58,1,0,0,0,60,61,1,0,0,0,61,9,1,0,0,0,62,71,3,16,
        8,0,63,71,3,4,2,0,64,66,5,15,0,0,65,67,3,6,3,0,66,65,1,0,0,0,66,
        67,1,0,0,0,67,68,1,0,0,0,68,71,5,16,0,0,69,71,3,22,11,0,70,62,1,
        0,0,0,70,63,1,0,0,0,70,64,1,0,0,0,70,69,1,0,0,0,71,11,1,0,0,0,72,
        73,7,0,0,0,73,13,1,0,0,0,74,75,5,10,0,0,75,76,5,15,0,0,76,77,3,2,
        1,0,77,78,5,16,0,0,78,15,1,0,0,0,79,80,7,1,0,0,80,17,1,0,0,0,81,
        82,5,11,0,0,82,19,1,0,0,0,83,84,7,2,0,0,84,21,1,0,0,0,85,87,7,2,
        0,0,86,85,1,0,0,0,87,88,1,0,0,0,88,86,1,0,0,0,88,89,1,0,0,0,89,23,
        1,0,0,0,9,30,36,38,45,54,60,66,70,88
    ]

class NOPEParser ( Parser ):

    grammarFileName = "NOPE.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'RANGE'", "'MATCH'", "'ANYOF'", "'THROWS'", 
                     "'VAR'", "'CHECK'", "'DEF'", "'REP'", "'C_HEADER'", 
                     "'IGNORE_WHITESPACE'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "','", "'('", "')'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'\\'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "COM", "SPACE", 
                      "ENDL", "SEP", "LP", "RP", "NUMB", "STR", "TYPE", 
                      "ESCCHAR" ]

    RULE_program = 0
    RULE_code = 1
    RULE_tag = 2
    RULE_args = 3
    RULE_arg = 4
    RULE_arg_part = 5
    RULE_tagname = 6
    RULE_ignore_ws = 7
    RULE_input = 8
    RULE_comment = 9
    RULE_single_ws = 10
    RULE_ws = 11

    ruleNames =  [ "program", "code", "tag", "args", "arg", "arg_part", 
                   "tagname", "ignore_ws", "input", "comment", "single_ws", 
                   "ws" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    COM=11
    SPACE=12
    ENDL=13
    SEP=14
    LP=15
    RP=16
    NUMB=17
    STR=18
    TYPE=19
    ESCCHAR=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def code(self):
            return self.getTypedRuleContext(NOPEParser.CodeContext,0)


        def EOF(self):
            return self.getToken(NOPEParser.EOF, 0)

        def getRuleIndex(self):
            return NOPEParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = NOPEParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.code()
            self.state = 25
            self.match(NOPEParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CodeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tag(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.TagContext)
            else:
                return self.getTypedRuleContext(NOPEParser.TagContext,i)


        def comment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.CommentContext)
            else:
                return self.getTypedRuleContext(NOPEParser.CommentContext,i)


        def input_(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.InputContext)
            else:
                return self.getTypedRuleContext(NOPEParser.InputContext,i)


        def ws(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.WsContext)
            else:
                return self.getTypedRuleContext(NOPEParser.WsContext,i)


        def ESCCHAR(self, i:int=None):
            if i is None:
                return self.getTokens(NOPEParser.ESCCHAR)
            else:
                return self.getToken(NOPEParser.ESCCHAR, i)

        def single_ws(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.Single_wsContext)
            else:
                return self.getTypedRuleContext(NOPEParser.Single_wsContext,i)


        def getRuleIndex(self):
            return NOPEParser.RULE_code

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCode" ):
                listener.enterCode(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCode" ):
                listener.exitCode(self)




    def code(self):

        localctx = NOPEParser.CodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_code)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1457150) != 0):
                self.state = 36
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [20]:
                    self.state = 27
                    self.match(NOPEParser.ESCCHAR)
                    self.state = 30
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [17, 18]:
                        self.state = 28
                        self.input_()
                        pass
                    elif token in [12, 13]:
                        self.state = 29
                        self.single_ws()
                        pass
                    else:
                        raise NoViableAltException(self)

                    pass
                elif token in [1, 2, 3, 4, 5, 6, 7, 8, 9]:
                    self.state = 32
                    self.tag()
                    pass
                elif token in [11]:
                    self.state = 33
                    self.comment()
                    pass
                elif token in [17, 18]:
                    self.state = 34
                    self.input_()
                    pass
                elif token in [12, 13]:
                    self.state = 35
                    self.ws()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TagContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tagname(self):
            return self.getTypedRuleContext(NOPEParser.TagnameContext,0)


        def LP(self):
            return self.getToken(NOPEParser.LP, 0)

        def RP(self):
            return self.getToken(NOPEParser.RP, 0)

        def arg(self):
            return self.getTypedRuleContext(NOPEParser.ArgContext,0)


        def args(self):
            return self.getTypedRuleContext(NOPEParser.ArgsContext,0)


        def getRuleIndex(self):
            return NOPEParser.RULE_tag

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTag" ):
                listener.enterTag(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTag" ):
                listener.exitTag(self)




    def tag(self):

        localctx = NOPEParser.TagContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_tag)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.tagname()
            self.state = 42
            self.match(NOPEParser.LP)
            self.state = 45
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.state = 43
                self.arg()

            elif la_ == 2:
                self.state = 44
                self.args()


            self.state = 47
            self.match(NOPEParser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.ArgContext)
            else:
                return self.getTypedRuleContext(NOPEParser.ArgContext,i)


        def SEP(self, i:int=None):
            if i is None:
                return self.getTokens(NOPEParser.SEP)
            else:
                return self.getToken(NOPEParser.SEP, i)

        def getRuleIndex(self):
            return NOPEParser.RULE_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgs" ):
                listener.enterArgs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgs" ):
                listener.exitArgs(self)




    def args(self):

        localctx = NOPEParser.ArgsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_args)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.arg()
            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==14:
                self.state = 50
                self.match(NOPEParser.SEP)
                self.state = 51
                self.arg()
                self.state = 56
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arg_part(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(NOPEParser.Arg_partContext)
            else:
                return self.getTypedRuleContext(NOPEParser.Arg_partContext,i)


        def getRuleIndex(self):
            return NOPEParser.RULE_arg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArg" ):
                listener.enterArg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArg" ):
                listener.exitArg(self)




    def arg(self):

        localctx = NOPEParser.ArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_arg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 57
                self.arg_part()
                self.state = 60 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 439294) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Arg_partContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def input_(self):
            return self.getTypedRuleContext(NOPEParser.InputContext,0)


        def tag(self):
            return self.getTypedRuleContext(NOPEParser.TagContext,0)


        def LP(self):
            return self.getToken(NOPEParser.LP, 0)

        def RP(self):
            return self.getToken(NOPEParser.RP, 0)

        def args(self):
            return self.getTypedRuleContext(NOPEParser.ArgsContext,0)


        def ws(self):
            return self.getTypedRuleContext(NOPEParser.WsContext,0)


        def getRuleIndex(self):
            return NOPEParser.RULE_arg_part

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArg_part" ):
                listener.enterArg_part(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArg_part" ):
                listener.exitArg_part(self)




    def arg_part(self):

        localctx = NOPEParser.Arg_partContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_arg_part)
        self._la = 0 # Token type
        try:
            self.state = 70
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [17, 18]:
                self.enterOuterAlt(localctx, 1)
                self.state = 62
                self.input_()
                pass
            elif token in [1, 2, 3, 4, 5, 6, 7, 8, 9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 63
                self.tag()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 64
                self.match(NOPEParser.LP)
                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 439294) != 0):
                    self.state = 65
                    self.args()


                self.state = 68
                self.match(NOPEParser.RP)
                pass
            elif token in [12, 13]:
                self.enterOuterAlt(localctx, 4)
                self.state = 69
                self.ws()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TagnameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return NOPEParser.RULE_tagname

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTagname" ):
                listener.enterTagname(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTagname" ):
                listener.exitTagname(self)




    def tagname(self):

        localctx = NOPEParser.TagnameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_tagname)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1022) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Ignore_wsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LP(self):
            return self.getToken(NOPEParser.LP, 0)

        def code(self):
            return self.getTypedRuleContext(NOPEParser.CodeContext,0)


        def RP(self):
            return self.getToken(NOPEParser.RP, 0)

        def getRuleIndex(self):
            return NOPEParser.RULE_ignore_ws

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIgnore_ws" ):
                listener.enterIgnore_ws(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIgnore_ws" ):
                listener.exitIgnore_ws(self)




    def ignore_ws(self):

        localctx = NOPEParser.Ignore_wsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_ignore_ws)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(NOPEParser.T__9)
            self.state = 75
            self.match(NOPEParser.LP)
            self.state = 76
            self.code()
            self.state = 77
            self.match(NOPEParser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InputContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMB(self):
            return self.getToken(NOPEParser.NUMB, 0)

        def STR(self):
            return self.getToken(NOPEParser.STR, 0)

        def getRuleIndex(self):
            return NOPEParser.RULE_input

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInput" ):
                listener.enterInput(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInput" ):
                listener.exitInput(self)




    def input_(self):

        localctx = NOPEParser.InputContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_input)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 79
            _la = self._input.LA(1)
            if not(_la==17 or _la==18):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COM(self):
            return self.getToken(NOPEParser.COM, 0)

        def getRuleIndex(self):
            return NOPEParser.RULE_comment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComment" ):
                listener.enterComment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComment" ):
                listener.exitComment(self)




    def comment(self):

        localctx = NOPEParser.CommentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_comment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self.match(NOPEParser.COM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Single_wsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SPACE(self):
            return self.getToken(NOPEParser.SPACE, 0)

        def ENDL(self):
            return self.getToken(NOPEParser.ENDL, 0)

        def getRuleIndex(self):
            return NOPEParser.RULE_single_ws

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSingle_ws" ):
                listener.enterSingle_ws(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSingle_ws" ):
                listener.exitSingle_ws(self)




    def single_ws(self):

        localctx = NOPEParser.Single_wsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_single_ws)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            _la = self._input.LA(1)
            if not(_la==12 or _la==13):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(NOPEParser.SPACE)
            else:
                return self.getToken(NOPEParser.SPACE, i)

        def ENDL(self, i:int=None):
            if i is None:
                return self.getTokens(NOPEParser.ENDL)
            else:
                return self.getToken(NOPEParser.ENDL, i)

        def getRuleIndex(self):
            return NOPEParser.RULE_ws

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWs" ):
                listener.enterWs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWs" ):
                listener.exitWs(self)




    def ws(self):

        localctx = NOPEParser.WsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_ws)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 85
                    _la = self._input.LA(1)
                    if not(_la==12 or _la==13):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()

                else:
                    raise NoViableAltException(self)
                self.state = 88 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





