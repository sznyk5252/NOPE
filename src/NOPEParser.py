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
        4,1,17,72,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,0,1,0,5,0,23,8,0,10,0,12,0,26,9,0,1,
        0,1,0,1,1,1,1,1,1,1,1,3,1,34,8,1,1,1,1,1,1,2,1,2,1,2,5,2,41,8,2,
        10,2,12,2,44,9,2,1,3,4,3,47,8,3,11,3,12,3,48,1,4,1,4,1,4,1,4,3,4,
        55,8,4,1,4,1,4,3,4,59,8,4,1,5,1,5,1,6,1,6,1,7,1,7,1,8,4,8,68,8,8,
        11,8,12,8,69,1,8,0,0,9,0,2,4,6,8,10,12,14,16,0,3,1,0,1,9,1,0,16,
        17,1,0,11,12,75,0,24,1,0,0,0,2,29,1,0,0,0,4,37,1,0,0,0,6,46,1,0,
        0,0,8,58,1,0,0,0,10,60,1,0,0,0,12,62,1,0,0,0,14,64,1,0,0,0,16,67,
        1,0,0,0,18,23,3,2,1,0,19,23,3,14,7,0,20,23,3,12,6,0,21,23,3,16,8,
        0,22,18,1,0,0,0,22,19,1,0,0,0,22,20,1,0,0,0,22,21,1,0,0,0,23,26,
        1,0,0,0,24,22,1,0,0,0,24,25,1,0,0,0,25,27,1,0,0,0,26,24,1,0,0,0,
        27,28,5,0,0,1,28,1,1,0,0,0,29,30,3,10,5,0,30,33,5,14,0,0,31,34,3,
        6,3,0,32,34,3,4,2,0,33,31,1,0,0,0,33,32,1,0,0,0,33,34,1,0,0,0,34,
        35,1,0,0,0,35,36,5,15,0,0,36,3,1,0,0,0,37,42,3,6,3,0,38,39,5,13,
        0,0,39,41,3,6,3,0,40,38,1,0,0,0,41,44,1,0,0,0,42,40,1,0,0,0,42,43,
        1,0,0,0,43,5,1,0,0,0,44,42,1,0,0,0,45,47,3,8,4,0,46,45,1,0,0,0,47,
        48,1,0,0,0,48,46,1,0,0,0,48,49,1,0,0,0,49,7,1,0,0,0,50,59,3,12,6,
        0,51,59,3,2,1,0,52,54,5,14,0,0,53,55,3,4,2,0,54,53,1,0,0,0,54,55,
        1,0,0,0,55,56,1,0,0,0,56,59,5,15,0,0,57,59,3,16,8,0,58,50,1,0,0,
        0,58,51,1,0,0,0,58,52,1,0,0,0,58,57,1,0,0,0,59,9,1,0,0,0,60,61,7,
        0,0,0,61,11,1,0,0,0,62,63,7,1,0,0,63,13,1,0,0,0,64,65,5,10,0,0,65,
        15,1,0,0,0,66,68,7,2,0,0,67,66,1,0,0,0,68,69,1,0,0,0,69,67,1,0,0,
        0,69,70,1,0,0,0,70,17,1,0,0,0,8,22,24,33,42,48,54,58,69
    ]

class NOPEParser ( Parser ):

    grammarFileName = "NOPE.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'RANGE'", "'MATCH'", "'ANYOF'", "'THROWS'", 
                     "'VAR'", "'CHECK'", "'DEF'", "'REP'", "'C_HEADER'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "','", "'('", 
                     "')'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "COM", "SPACE", "ENDL", 
                      "SEP", "LP", "RP", "NUMB", "STR" ]

    RULE_program = 0
    RULE_tag = 1
    RULE_args = 2
    RULE_arg = 3
    RULE_arg_part = 4
    RULE_tagname = 5
    RULE_input = 6
    RULE_comment = 7
    RULE_ws = 8

    ruleNames =  [ "program", "tag", "args", "arg", "arg_part", "tagname", 
                   "input", "comment", "ws" ]

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
    COM=10
    SPACE=11
    ENDL=12
    SEP=13
    LP=14
    RP=15
    NUMB=16
    STR=17

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

        def EOF(self):
            return self.getToken(NOPEParser.EOF, 0)

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
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 204798) != 0):
                self.state = 22
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1, 2, 3, 4, 5, 6, 7, 8, 9]:
                    self.state = 18
                    self.tag()
                    pass
                elif token in [10]:
                    self.state = 19
                    self.comment()
                    pass
                elif token in [16, 17]:
                    self.state = 20
                    self.input_()
                    pass
                elif token in [11, 12]:
                    self.state = 21
                    self.ws()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 26
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 27
            self.match(NOPEParser.EOF)
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
        self.enterRule(localctx, 2, self.RULE_tag)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.tagname()
            self.state = 30
            self.match(NOPEParser.LP)
            self.state = 33
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 31
                self.arg()

            elif la_ == 2:
                self.state = 32
                self.args()


            self.state = 35
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
        self.enterRule(localctx, 4, self.RULE_args)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self.arg()
            self.state = 42
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==13:
                self.state = 38
                self.match(NOPEParser.SEP)
                self.state = 39
                self.arg()
                self.state = 44
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
        self.enterRule(localctx, 6, self.RULE_arg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 45
                self.arg_part()
                self.state = 48 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 220158) != 0)):
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
        self.enterRule(localctx, 8, self.RULE_arg_part)
        self._la = 0 # Token type
        try:
            self.state = 58
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16, 17]:
                self.enterOuterAlt(localctx, 1)
                self.state = 50
                self.input_()
                pass
            elif token in [1, 2, 3, 4, 5, 6, 7, 8, 9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 51
                self.tag()
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 3)
                self.state = 52
                self.match(NOPEParser.LP)
                self.state = 54
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 220158) != 0):
                    self.state = 53
                    self.args()


                self.state = 56
                self.match(NOPEParser.RP)
                pass
            elif token in [11, 12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 57
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
        self.enterRule(localctx, 10, self.RULE_tagname)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
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
        self.enterRule(localctx, 12, self.RULE_input)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            _la = self._input.LA(1)
            if not(_la==16 or _la==17):
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
        self.enterRule(localctx, 14, self.RULE_comment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(NOPEParser.COM)
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
        self.enterRule(localctx, 16, self.RULE_ws)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 66
                    _la = self._input.LA(1)
                    if not(_la==11 or _la==12):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()

                else:
                    raise NoViableAltException(self)
                self.state = 69 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





