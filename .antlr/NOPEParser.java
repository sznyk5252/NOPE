// Generated from /mnt/D/teoria_kompilacji/nope/NOPE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NOPEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, COM=29, EXPL_SPACE=30, EXPL_ENDL=31, 
		SPACE=32, ENDL=33, SEP=34, LP=35, RP=36, LBRACE=37, RBRACE=38, NUMB=39, 
		ESCCHAR=40, ASSIGN=41, ID=42, AND=43, OR=44, QUOTE=45, STR=46, ANY_SINGLE_CHAR=47;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_input_in_escape = 2, RULE_block = 3, 
		RULE_if_stmt = 4, RULE_rep_loop = 5, RULE_def = 6, RULE_any_expr = 7, 
		RULE_expr = 8, RULE_logic_expr = 9, RULE_opt_type = 10, RULE_macro_call = 11, 
		RULE_range_macro = 12, RULE_match_macro = 13, RULE_anyof_macro = 14, RULE_throws_macro = 15, 
		RULE_var_macro = 16, RULE_check_macro = 17, RULE_header_macro = 18, RULE_custom_macro = 19, 
		RULE_ignore_ws = 20, RULE_input = 21, RULE_comment = 22, RULE_single_ws = 23, 
		RULE_ws = 24, RULE_expl_ws = 25, RULE_type = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "input_in_escape", "block", "if_stmt", "rep_loop", 
			"def", "any_expr", "expr", "logic_expr", "opt_type", "macro_call", "range_macro", 
			"match_macro", "anyof_macro", "throws_macro", "var_macro", "check_macro", 
			"header_macro", "custom_macro", "ignore_ws", "input", "comment", "single_ws", 
			"ws", "expl_ws", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'ELSE'", "'REP'", "'DEF'", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'RANGE'", "'MATCH'", "'ANYOF'", 
			"'THROWS'", "'VAR'", "'CHECK'", "'C_HEADER'", "'IGNORE_WHITESPACE'", 
			"'INT'", "'FLOAT'", "'STR'", "'BOOL'", "'['", "']'", null, "'SPACE'", 
			"'ENDL'", null, null, "','", "'('", "')'", "'{'", "'}'", null, "'\\'", 
			"'<<'", null, "'AND'", "'OR'", "'''", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COM", "EXPL_SPACE", "EXPL_ENDL", "SPACE", 
			"ENDL", "SEP", "LP", "RP", "LBRACE", "RBRACE", "NUMB", "ESCCHAR", "ASSIGN", 
			"ID", "AND", "OR", "QUOTE", "STR", "ANY_SINGLE_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NOPE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NOPEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NOPEParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			code();
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public List<Input_in_escapeContext> input_in_escape() {
			return getRuleContexts(Input_in_escapeContext.class);
		}
		public Input_in_escapeContext input_in_escape(int i) {
			return getRuleContext(Input_in_escapeContext.class,i);
		}
		public List<Macro_callContext> macro_call() {
			return getRuleContexts(Macro_callContext.class);
		}
		public Macro_callContext macro_call(int i) {
			return getRuleContext(Macro_callContext.class,i);
		}
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public List<Rep_loopContext> rep_loop() {
			return getRuleContexts(Rep_loopContext.class);
		}
		public Rep_loopContext rep_loop(int i) {
			return getRuleContext(Rep_loopContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public List<Ignore_wsContext> ignore_ws() {
			return getRuleContexts(Ignore_wsContext.class);
		}
		public Ignore_wsContext ignore_ws(int i) {
			return getRuleContext(Ignore_wsContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 76432709484570L) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESCCHAR:
					{
					setState(57);
					input_in_escape();
					}
					break;
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
					{
					setState(58);
					macro_call();
					}
					break;
				case T__0:
					{
					setState(59);
					if_stmt();
					}
					break;
				case T__2:
					{
					setState(60);
					rep_loop();
					}
					break;
				case T__3:
					{
					setState(61);
					def();
					}
					break;
				case T__21:
					{
					setState(62);
					ignore_ws();
					}
					break;
				case COM:
					{
					setState(63);
					comment();
					}
					break;
				case EXPL_SPACE:
				case EXPL_ENDL:
				case NUMB:
				case ID:
				case STR:
					{
					setState(64);
					input();
					}
					break;
				case SPACE:
				case ENDL:
					{
					setState(65);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_in_escapeContext extends ParserRuleContext {
		public List<TerminalNode> ESCCHAR() { return getTokens(NOPEParser.ESCCHAR); }
		public TerminalNode ESCCHAR(int i) {
			return getToken(NOPEParser.ESCCHAR, i);
		}
		public TerminalNode COM() { return getToken(NOPEParser.COM, 0); }
		public TerminalNode QUOTE() { return getToken(NOPEParser.QUOTE, 0); }
		public TerminalNode ANY_SINGLE_CHAR() { return getToken(NOPEParser.ANY_SINGLE_CHAR, 0); }
		public Input_in_escapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_in_escape; }
	}

	public final Input_in_escapeContext input_in_escape() throws RecognitionException {
		Input_in_escapeContext _localctx = new Input_in_escapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input_in_escape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ESCCHAR);
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 177021908942848L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NOPEParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(NOPEParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LBRACE);
			setState(75);
			code();
			setState(76);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_stmt);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__0);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(79);
					ws();
					}
				}

				setState(82);
				match(LP);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(83);
					ws();
					}
				}

				setState(86);
				logic_expr(0);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(87);
					ws();
					}
				}

				setState(90);
				match(RP);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(91);
					ws();
					}
				}

				setState(94);
				block();
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(95);
						ws();
						}
					}

					setState(98);
					match(T__1);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(99);
						ws();
						}
					}

					setState(102);
					block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__0);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(106);
					ws();
					}
				}

				setState(109);
				match(LP);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(110);
					ws();
					}
				}

				setState(113);
				logic_expr(0);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(114);
					ws();
					}
				}

				setState(117);
				match(RP);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(118);
					ws();
					}
				}

				setState(121);
				block();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(122);
						ws();
						}
					}

					setState(125);
					match(T__1);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(126);
						ws();
						}
					}

					setState(129);
					if_stmt();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rep_loopContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public List<TerminalNode> SEP() { return getTokens(NOPEParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(NOPEParser.SEP, i);
		}
		public Rep_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep_loop; }
	}

	public final Rep_loopContext rep_loop() throws RecognitionException {
		Rep_loopContext _localctx = new Rep_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rep_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__2);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(135);
				ws();
				}
			}

			setState(138);
			match(LP);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(139);
				ws();
				}
			}

			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(142);
				match(ID);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(143);
					ws();
					}
				}

				setState(146);
				match(SEP);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(147);
					ws();
					}
				}

				}
				break;
			}
			setState(152);
			expr(0);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(153);
					ws();
					}
				}

				setState(156);
				match(SEP);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(157);
					ws();
					}
				}

				setState(160);
				expr(0);
				}
				break;
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(163);
				ws();
				}
			}

			setState(166);
			match(RP);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(167);
				ws();
				}
			}

			setState(170);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<Opt_typeContext> opt_type() {
			return getRuleContexts(Opt_typeContext.class);
		}
		public Opt_typeContext opt_type(int i) {
			return getRuleContext(Opt_typeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(NOPEParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NOPEParser.ID, i);
		}
		public List<TerminalNode> SEP() { return getTokens(NOPEParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(NOPEParser.SEP, i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__3);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(173);
				ws();
				}
			}

			setState(176);
			match(LP);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(177);
				ws();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398172340224L) != 0)) {
				{
				setState(180);
				opt_type();
				setState(181);
				match(ID);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(182);
					ws();
					}
				}

				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(185);
					match(SEP);
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(186);
						ws();
						}
					}

					setState(189);
					opt_type();
					setState(190);
					match(ID);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(191);
						ws();
						}
					}

					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201);
			match(RP);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(202);
				ws();
				}
			}

			setState(205);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Any_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_expr; }
	}

	public final Any_exprContext any_expr() throws RecognitionException {
		Any_exprContext _localctx = new Any_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_any_expr);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				logic_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Macro_callContext macro_call() {
			return getRuleContext(Macro_callContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				setState(212);
				match(LP);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(213);
					ws();
					}
				}

				setState(216);
				expr(0);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(217);
					ws();
					}
				}

				setState(220);
				match(RP);
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				setState(222);
				macro_call();
				}
				break;
			case EXPL_SPACE:
			case EXPL_ENDL:
			case NUMB:
			case ID:
			case STR:
				{
				setState(223);
				input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(227);
							ws();
							}
						}

						setState(230);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(231);
							ws();
							}
						}

						setState(234);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(236);
							ws();
							}
						}

						setState(239);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(240);
							ws();
							}
						}

						setState(243);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public Macro_callContext macro_call() {
			return getRuleContext(Macro_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public TerminalNode AND() { return getToken(NOPEParser.AND, 0); }
		public TerminalNode OR() { return getToken(NOPEParser.OR, 0); }
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(250);
				expr(0);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(251);
					ws();
					}
				}

				setState(254);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(255);
					ws();
					}
				}

				setState(258);
				expr(0);
				}
				break;
			case 2:
				{
				setState(260);
				match(LP);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(261);
					ws();
					}
				}

				setState(264);
				logic_expr(0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(265);
					ws();
					}
				}

				setState(268);
				match(RP);
				}
				break;
			case 3:
				{
				setState(270);
				macro_call();
				}
				break;
			case 4:
				{
				setState(271);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
					setState(274);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(275);
						ws();
						}
					}

					setState(278);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(279);
						ws();
						}
					}

					setState(282);
					logic_expr(5);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opt_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Opt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_type; }
	}

	public final Opt_typeContext opt_type() throws RecognitionException {
		Opt_typeContext _localctx = new Opt_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opt_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) {
				{
				setState(288);
				type(0);
				setState(289);
				ws();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Macro_callContext extends ParserRuleContext {
		public Range_macroContext range_macro() {
			return getRuleContext(Range_macroContext.class,0);
		}
		public Match_macroContext match_macro() {
			return getRuleContext(Match_macroContext.class,0);
		}
		public Anyof_macroContext anyof_macro() {
			return getRuleContext(Anyof_macroContext.class,0);
		}
		public Throws_macroContext throws_macro() {
			return getRuleContext(Throws_macroContext.class,0);
		}
		public Var_macroContext var_macro() {
			return getRuleContext(Var_macroContext.class,0);
		}
		public Check_macroContext check_macro() {
			return getRuleContext(Check_macroContext.class,0);
		}
		public Header_macroContext header_macro() {
			return getRuleContext(Header_macroContext.class,0);
		}
		public Macro_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call; }
	}

	public final Macro_callContext macro_call() throws RecognitionException {
		Macro_callContext _localctx = new Macro_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_macro_call);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				range_macro();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match_macro();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				anyof_macro();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				throws_macro();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				var_macro();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				check_macro();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				header_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEP() { return getToken(NOPEParser.SEP, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Range_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_macro; }
	}

	public final Range_macroContext range_macro() throws RecognitionException {
		Range_macroContext _localctx = new Range_macroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_range_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__14);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(303);
				ws();
				}
			}

			setState(306);
			match(LP);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(307);
				ws();
				}
			}

			setState(310);
			expr(0);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(311);
				ws();
				}
			}

			setState(314);
			match(SEP);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(315);
				ws();
				}
			}

			setState(318);
			expr(0);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(319);
				ws();
				}
			}

			setState(322);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Match_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_macro; }
	}

	public final Match_macroContext match_macro() throws RecognitionException {
		Match_macroContext _localctx = new Match_macroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_match_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__15);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(325);
				ws();
				}
			}

			setState(328);
			match(LP);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(329);
				ws();
				}
			}

			setState(332);
			expr(0);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(333);
				ws();
				}
			}

			setState(336);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Anyof_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(NOPEParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(NOPEParser.SEP, i);
		}
		public Anyof_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyof_macro; }
	}

	public final Anyof_macroContext anyof_macro() throws RecognitionException {
		Anyof_macroContext _localctx = new Anyof_macroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_anyof_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__16);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(339);
				ws();
				}
			}

			setState(342);
			match(LP);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(343);
				ws();
				}
			}

			setState(346);
			expr(0);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(347);
						ws();
						}
					}

					setState(350);
					match(SEP);
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(351);
						ws();
						}
					}

					setState(354);
					expr(0);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(360);
				ws();
				}
			}

			setState(363);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Throws_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public TerminalNode STR() { return getToken(NOPEParser.STR, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Throws_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_macro; }
	}

	public final Throws_macroContext throws_macro() throws RecognitionException {
		Throws_macroContext _localctx = new Throws_macroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_throws_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__17);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(366);
				ws();
				}
			}

			setState(369);
			match(LP);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(370);
				ws();
				}
			}

			setState(373);
			match(STR);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(374);
				ws();
				}
			}

			setState(377);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public Opt_typeContext opt_type() {
			return getRuleContext(Opt_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(NOPEParser.ASSIGN, 0); }
		public Any_exprContext any_expr() {
			return getRuleContext(Any_exprContext.class,0);
		}
		public Var_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_macro; }
	}

	public final Var_macroContext var_macro() throws RecognitionException {
		Var_macroContext _localctx = new Var_macroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__18);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(380);
				ws();
				}
			}

			setState(383);
			match(LP);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(384);
				ws();
				}
			}

			setState(387);
			opt_type();
			setState(388);
			match(ID);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(389);
				ws();
				}
			}

			setState(392);
			match(RP);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(393);
					ws();
					}
				}

				setState(396);
				match(ASSIGN);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(397);
					ws();
					}
				}

				setState(400);
				any_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Check_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Check_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_macro; }
	}

	public final Check_macroContext check_macro() throws RecognitionException {
		Check_macroContext _localctx = new Check_macroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_check_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__19);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(404);
				ws();
				}
			}

			setState(407);
			match(LP);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(408);
				ws();
				}
			}

			setState(411);
			logic_expr(0);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(412);
				ws();
				}
			}

			setState(415);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Header_macroContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public TerminalNode STR() { return getToken(NOPEParser.STR, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Header_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_macro; }
	}

	public final Header_macroContext header_macro() throws RecognitionException {
		Header_macroContext _localctx = new Header_macroContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_header_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__20);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(418);
				ws();
				}
			}

			setState(421);
			match(LP);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(422);
				ws();
				}
			}

			setState(425);
			match(STR);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(426);
				ws();
				}
			}

			setState(429);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_macroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(NOPEParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(NOPEParser.SEP, i);
		}
		public Custom_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_macro; }
	}

	public final Custom_macroContext custom_macro() throws RecognitionException {
		Custom_macroContext _localctx = new Custom_macroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_custom_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(ID);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(432);
				ws();
				}
			}

			setState(435);
			match(LP);
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(436);
				ws();
				}
				break;
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 75354131628032L) != 0)) {
				{
				setState(439);
				expr(0);
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(440);
					ws();
					}
					break;
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(443);
					match(SEP);
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(444);
						ws();
						}
					}

					setState(447);
					expr(0);
					setState(449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(448);
						ws();
						}
						break;
					}
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(458);
				ws();
				}
			}

			setState(461);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ignore_wsContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public Ignore_wsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore_ws; }
	}

	public final Ignore_wsContext ignore_ws() throws RecognitionException {
		Ignore_wsContext _localctx = new Ignore_wsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ignore_ws);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__21);
			setState(464);
			match(LP);
			setState(465);
			code();
			setState(466);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public TerminalNode NUMB() { return getToken(NOPEParser.NUMB, 0); }
		public Expl_wsContext expl_ws() {
			return getRuleContext(Expl_wsContext.class,0);
		}
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public TerminalNode STR() { return getToken(NOPEParser.STR, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_input);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMB:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(NUMB);
				}
				break;
			case EXPL_SPACE:
			case EXPL_ENDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				expl_ws();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(ID);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COM() { return getToken(NOPEParser.COM, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(COM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_wsContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(NOPEParser.SPACE, 0); }
		public TerminalNode ENDL() { return getToken(NOPEParser.ENDL, 0); }
		public Single_wsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_ws; }
	}

	public final Single_wsContext single_ws() throws RecognitionException {
		Single_wsContext _localctx = new Single_wsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_single_ws);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(_la==SPACE || _la==ENDL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(NOPEParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(NOPEParser.SPACE, i);
		}
		public List<TerminalNode> ENDL() { return getTokens(NOPEParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(NOPEParser.ENDL, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(478);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==ENDL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(481); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expl_wsContext extends ParserRuleContext {
		public TerminalNode EXPL_SPACE() { return getToken(NOPEParser.EXPL_SPACE, 0); }
		public TerminalNode EXPL_ENDL() { return getToken(NOPEParser.EXPL_ENDL, 0); }
		public Expl_wsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expl_ws; }
	}

	public final Expl_wsContext expl_ws() throws RecognitionException {
		Expl_wsContext _localctx = new Expl_wsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expl_ws);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==EXPL_SPACE || _la==EXPL_ENDL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(486);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(487);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(488);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(489);
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(492);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(493);
					match(T__26);
					setState(494);
					expr(0);
					setState(495);
					match(T__27);
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		case 26:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u01f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001C\b\u0001"+
		"\n\u0001\f\u0001F\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"Q\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004e\b\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004l\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004p\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004x\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004|\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0080\b\u0004\u0001\u0004\u0003\u0004\u0083"+
		"\b\u0004\u0003\u0004\u0085\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0089\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0091\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0095\b\u0005\u0003\u0005\u0097\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u009b\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009f\b"+
		"\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0005\u0003\u0005\u00a5"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a9\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00af\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b8\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bc\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c1\b\u0006\u0005"+
		"\u0006\u00c3\b\u0006\n\u0006\f\u0006\u00c6\t\u0006\u0003\u0006\u00c8\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cc\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00d2\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00d7\b\b\u0001\b\u0001\b\u0003\b\u00db\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00e1\b\b\u0001\b\u0001\b\u0003\b\u00e5"+
		"\b\b\u0001\b\u0001\b\u0003\b\u00e9\b\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00ee\b\b\u0001\b\u0001\b\u0003\b\u00f2\b\b\u0001\b\u0005\b\u00f5\b\b"+
		"\n\b\f\b\u00f8\t\b\u0001\t\u0001\t\u0001\t\u0003\t\u00fd\b\t\u0001\t\u0001"+
		"\t\u0003\t\u0101\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0107\b\t"+
		"\u0001\t\u0001\t\u0003\t\u010b\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0111\b\t\u0001\t\u0001\t\u0003\t\u0115\b\t\u0001\t\u0001\t\u0003\t"+
		"\u0119\b\t\u0001\t\u0005\t\u011c\b\t\n\t\f\t\u011f\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0124\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u012d\b\u000b\u0001\f"+
		"\u0001\f\u0003\f\u0131\b\f\u0001\f\u0001\f\u0003\f\u0135\b\f\u0001\f\u0001"+
		"\f\u0003\f\u0139\b\f\u0001\f\u0001\f\u0003\f\u013d\b\f\u0001\f\u0001\f"+
		"\u0003\f\u0141\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u0147\b\r\u0001"+
		"\r\u0001\r\u0003\r\u014b\b\r\u0001\r\u0001\r\u0003\r\u014f\b\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u0155\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0159\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u015d\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0161\b\u000e\u0001"+
		"\u000e\u0005\u000e\u0164\b\u000e\n\u000e\f\u000e\u0167\t\u000e\u0001\u000e"+
		"\u0003\u000e\u016a\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0170\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0174\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0178\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u017e\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0182\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0187\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u018b\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u018f\b\u0010\u0001\u0010\u0003\u0010"+
		"\u0192\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0196\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u019a\b\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u019e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01a4\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01a8\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01ac\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01b2\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01b6\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01ba\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01be\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01c2\b\u0013\u0005\u0013\u01c4\b\u0013\n\u0013\f\u0013"+
		"\u01c7\t\u0013\u0003\u0013\u01c9\b\u0013\u0001\u0013\u0003\u0013\u01cc"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01d9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0004\u0018\u01e0\b\u0018\u000b\u0018\f\u0018\u01e1\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01eb\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u01f2\b\u001a\n\u001a\f\u001a\u01f5\t\u001a\u0001"+
		"\u001a\u0000\u0003\u0010\u00124\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0007"+
		"\u0004\u0000\u001d\u001d((--//\u0001\u0000\u0005\u0006\u0001\u0000\u0007"+
		"\b\u0001\u0000\t\u000e\u0001\u0000+,\u0001\u0000 !\u0001\u0000\u001e\u001f"+
		"\u024e\u00006\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004"+
		"G\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\b\u0084\u0001"+
		"\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000"+
		"\u0000\u0000\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00e0\u0001\u0000"+
		"\u0000\u0000\u0012\u0110\u0001\u0000\u0000\u0000\u0014\u0123\u0001\u0000"+
		"\u0000\u0000\u0016\u012c\u0001\u0000\u0000\u0000\u0018\u012e\u0001\u0000"+
		"\u0000\u0000\u001a\u0144\u0001\u0000\u0000\u0000\u001c\u0152\u0001\u0000"+
		"\u0000\u0000\u001e\u016d\u0001\u0000\u0000\u0000 \u017b\u0001\u0000\u0000"+
		"\u0000\"\u0193\u0001\u0000\u0000\u0000$\u01a1\u0001\u0000\u0000\u0000"+
		"&\u01af\u0001\u0000\u0000\u0000(\u01cf\u0001\u0000\u0000\u0000*\u01d8"+
		"\u0001\u0000\u0000\u0000,\u01da\u0001\u0000\u0000\u0000.\u01dc\u0001\u0000"+
		"\u0000\u00000\u01df\u0001\u0000\u0000\u00002\u01e3\u0001\u0000\u0000\u0000"+
		"4\u01ea\u0001\u0000\u0000\u000067\u0003\u0002\u0001\u000078\u0005\u0000"+
		"\u0000\u00018\u0001\u0001\u0000\u0000\u00009C\u0003\u0004\u0002\u0000"+
		":C\u0003\u0016\u000b\u0000;C\u0003\b\u0004\u0000<C\u0003\n\u0005\u0000"+
		"=C\u0003\f\u0006\u0000>C\u0003(\u0014\u0000?C\u0003,\u0016\u0000@C\u0003"+
		"*\u0015\u0000AC\u00030\u0018\u0000B9\u0001\u0000\u0000\u0000B:\u0001\u0000"+
		"\u0000\u0000B;\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000B=\u0001"+
		"\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0003\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000HI\u0007"+
		"\u0000\u0000\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0005%\u0000\u0000"+
		"KL\u0003\u0002\u0001\u0000LM\u0005&\u0000\u0000M\u0007\u0001\u0000\u0000"+
		"\u0000NP\u0005\u0001\u0000\u0000OQ\u00030\u0018\u0000PO\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0005#\u0000"+
		"\u0000SU\u00030\u0018\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0003\u0012\t\u0000WY\u00030\u0018"+
		"\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z\\\u0005$\u0000\u0000[]\u00030\u0018\u0000\\[\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^g\u0003"+
		"\u0006\u0003\u0000_a\u00030\u0018\u0000`_\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0005\u0002\u0000\u0000"+
		"ce\u00030\u0018\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0003\u0006\u0003\u0000g`\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h\u0085\u0001\u0000\u0000\u0000ik\u0005"+
		"\u0001\u0000\u0000jl\u00030\u0018\u0000kj\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0005#\u0000\u0000np\u0003"+
		"0\u0018\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qs\u0003\u0012\t\u0000rt\u00030\u0018\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uw\u0005$\u0000\u0000vx\u00030\u0018\u0000wv\u0001\u0000\u0000\u0000w"+
		"x\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0082\u0003\u0006"+
		"\u0003\u0000z|\u00030\u0018\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0005\u0002\u0000\u0000"+
		"~\u0080\u00030\u0018\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0003\b\u0004\u0000\u0082{\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084N\u0001\u0000"+
		"\u0000\u0000\u0084i\u0001\u0000\u0000\u0000\u0085\t\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0005\u0003\u0000\u0000\u0087\u0089\u00030\u0018\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0005#\u0000\u0000\u008b"+
		"\u008d\u00030\u0018\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u0096\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0005*\u0000\u0000\u008f\u0091\u00030\u0018\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0005\"\u0000\u0000\u0093\u0095\u00030\u0018"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u008e\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u00a1\u0003\u0010\b\u0000\u0099\u009b\u00030\u0018\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0005\"\u0000\u0000\u009d"+
		"\u009f\u00030\u0018\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0003\u0010\b\u0000\u00a1\u009a\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003"+
		"0\u0018\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005$\u0000"+
		"\u0000\u00a7\u00a9\u00030\u0018\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0003\u0006\u0003\u0000\u00ab\u000b\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0005\u0004\u0000\u0000\u00ad\u00af\u00030\u0018\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005#\u0000\u0000\u00b1\u00b3"+
		"\u00030\u0018\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00c7\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003"+
		"\u0014\n\u0000\u00b5\u00b7\u0005*\u0000\u0000\u00b6\u00b8\u00030\u0018"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00c4\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\"\u0000\u0000"+
		"\u00ba\u00bc\u00030\u0018\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0003\u0014\n\u0000\u00be\u00c0\u0005*\u0000\u0000\u00bf\u00c1"+
		"\u00030\u0018\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0005$\u0000\u0000\u00ca\u00cc\u00030\u0018"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003\u0006\u0003"+
		"\u0000\u00ce\r\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003\u0010\b\u0000"+
		"\u00d0\u00d2\u0003\u0012\t\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0006\b\uffff\uffff\u0000\u00d4\u00d6\u0005#\u0000\u0000\u00d5"+
		"\u00d7\u00030\u0018\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0003\u0010\b\u0000\u00d9\u00db\u00030\u0018\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005$\u0000\u0000\u00dd\u00e1\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0003\u0016\u000b\u0000\u00df\u00e1\u0003*\u0015"+
		"\u0000\u00e0\u00d3\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00f6\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e4\n\u0005\u0000\u0000\u00e3\u00e5\u00030\u0018\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007\u0001\u0000\u0000"+
		"\u00e7\u00e9\u00030\u0018\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00f5\u0003\u0010\b\u0006\u00eb\u00ed\n\u0004\u0000\u0000\u00ec\u00ee"+
		"\u00030\u0018\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0007"+
		"\u0002\u0000\u0000\u00f0\u00f2\u00030\u0018\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0003\u0010\b\u0005\u00f4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00eb\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u0011\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0006\t\uffff\uffff\u0000\u00fa\u00fc\u0003\u0010\b"+
		"\u0000\u00fb\u00fd\u00030\u0018\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0100\u0007\u0003\u0000\u0000\u00ff\u0101\u00030\u0018\u0000\u0100"+
		"\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u0010\b\u0000\u0103\u0111"+
		"\u0001\u0000\u0000\u0000\u0104\u0106\u0005#\u0000\u0000\u0105\u0107\u0003"+
		"0\u0018\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0003\u0012"+
		"\t\u0000\u0109\u010b\u00030\u0018\u0000\u010a\u0109\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005$\u0000\u0000\u010d\u0111\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0003\u0016\u000b\u0000\u010f\u0111\u0005*\u0000\u0000\u0110"+
		"\u00f9\u0001\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u011d\u0001\u0000\u0000\u0000\u0112\u0114\n\u0004\u0000\u0000\u0113\u0115"+
		"\u00030\u0018\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0007"+
		"\u0004\u0000\u0000\u0117\u0119\u00030\u0018\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011c\u0003\u0012\t\u0005\u011b\u0112\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0013\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u00034\u001a\u0000"+
		"\u0121\u0122\u00030\u0018\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123"+
		"\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0015\u0001\u0000\u0000\u0000\u0125\u012d\u0003\u0018\f\u0000\u0126\u012d"+
		"\u0003\u001a\r\u0000\u0127\u012d\u0003\u001c\u000e\u0000\u0128\u012d\u0003"+
		"\u001e\u000f\u0000\u0129\u012d\u0003 \u0010\u0000\u012a\u012d\u0003\""+
		"\u0011\u0000\u012b\u012d\u0003$\u0012\u0000\u012c\u0125\u0001\u0000\u0000"+
		"\u0000\u012c\u0126\u0001\u0000\u0000\u0000\u012c\u0127\u0001\u0000\u0000"+
		"\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012c\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u0017\u0001\u0000\u0000\u0000\u012e\u0130\u0005\u000f\u0000"+
		"\u0000\u012f\u0131\u00030\u0018\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0134\u0005#\u0000\u0000\u0133\u0135\u00030\u0018\u0000\u0134\u0133"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0138\u0003\u0010\b\u0000\u0137\u0139\u0003"+
		"0\u0018\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0005\"\u0000"+
		"\u0000\u013b\u013d\u00030\u0018\u0000\u013c\u013b\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0140\u0003\u0010\b\u0000\u013f\u0141\u00030\u0018\u0000\u0140"+
		"\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005$\u0000\u0000\u0143\u0019"+
		"\u0001\u0000\u0000\u0000\u0144\u0146\u0005\u0010\u0000\u0000\u0145\u0147"+
		"\u00030\u0018\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0005"+
		"#\u0000\u0000\u0149\u014b\u00030\u0018\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0003\u0010\b\u0000\u014d\u014f\u00030\u0018\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0005$\u0000\u0000\u0151"+
		"\u001b\u0001\u0000\u0000\u0000\u0152\u0154\u0005\u0011\u0000\u0000\u0153"+
		"\u0155\u00030\u0018\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0005#\u0000\u0000\u0157\u0159\u00030\u0018\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u0165\u0003\u0010\b\u0000\u015b\u015d\u00030\u0018"+
		"\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0005\"\u0000\u0000"+
		"\u015f\u0161\u00030\u0018\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0164\u0003\u0010\b\u0000\u0163\u015c\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u016a\u00030\u0018\u0000\u0169\u0168\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005$\u0000\u0000\u016c\u001d\u0001\u0000"+
		"\u0000\u0000\u016d\u016f\u0005\u0012\u0000\u0000\u016e\u0170\u00030\u0018"+
		"\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0005#\u0000\u0000"+
		"\u0172\u0174\u00030\u0018\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0177\u0005.\u0000\u0000\u0176\u0178\u00030\u0018\u0000\u0177\u0176\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005$\u0000\u0000\u017a\u001f\u0001\u0000"+
		"\u0000\u0000\u017b\u017d\u0005\u0013\u0000\u0000\u017c\u017e\u00030\u0018"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0005#\u0000\u0000"+
		"\u0180\u0182\u00030\u0018\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0003\u0014\n\u0000\u0184\u0186\u0005*\u0000\u0000\u0185\u0187"+
		"\u00030\u0018\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0191\u0005"+
		"$\u0000\u0000\u0189\u018b\u00030\u0018\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0005)\u0000\u0000\u018d\u018f\u00030\u0018\u0000\u018e"+
		"\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0003\u000e\u0007\u0000\u0191"+
		"\u018a\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"!\u0001\u0000\u0000\u0000\u0193\u0195\u0005\u0014\u0000\u0000\u0194\u0196"+
		"\u00030\u0018\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0005"+
		"#\u0000\u0000\u0198\u019a\u00030\u0018\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\u0003\u0012\t\u0000\u019c\u019e\u00030\u0018\u0000"+
		"\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005$\u0000\u0000\u01a0"+
		"#\u0001\u0000\u0000\u0000\u01a1\u01a3\u0005\u0015\u0000\u0000\u01a2\u01a4"+
		"\u00030\u0018\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u0005"+
		"#\u0000\u0000\u01a6\u01a8\u00030\u0018\u0000\u01a7\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\u0005.\u0000\u0000\u01aa\u01ac\u00030\u0018\u0000\u01ab"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005$\u0000\u0000\u01ae%\u0001"+
		"\u0000\u0000\u0000\u01af\u01b1\u0005*\u0000\u0000\u01b0\u01b2\u00030\u0018"+
		"\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0005#\u0000\u0000"+
		"\u01b4\u01b6\u00030\u0018\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01c8\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b9\u0003\u0010\b\u0000\u01b8\u01ba\u00030\u0018\u0000\u01b9\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01c5"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bd\u0005\"\u0000\u0000\u01bc\u01be\u0003"+
		"0\u0018\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003\u0010"+
		"\b\u0000\u01c0\u01c2\u00030\u0018\u0000\u01c1\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01bb\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c8\u01b7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u00030\u0018\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005$\u0000\u0000\u01ce"+
		"\'\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0016\u0000\u0000\u01d0\u01d1"+
		"\u0005#\u0000\u0000\u01d1\u01d2\u0003\u0002\u0001\u0000\u01d2\u01d3\u0005"+
		"$\u0000\u0000\u01d3)\u0001\u0000\u0000\u0000\u01d4\u01d9\u0005\'\u0000"+
		"\u0000\u01d5\u01d9\u00032\u0019\u0000\u01d6\u01d9\u0005*\u0000\u0000\u01d7"+
		"\u01d9\u0005.\u0000\u0000\u01d8\u01d4\u0001\u0000\u0000\u0000\u01d8\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d9+\u0001\u0000\u0000\u0000\u01da\u01db\u0005"+
		"\u001d\u0000\u0000\u01db-\u0001\u0000\u0000\u0000\u01dc\u01dd\u0007\u0005"+
		"\u0000\u0000\u01dd/\u0001\u0000\u0000\u0000\u01de\u01e0\u0007\u0005\u0000"+
		"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e21\u0001\u0000\u0000\u0000\u01e3\u01e4\u0007\u0006\u0000\u0000"+
		"\u01e43\u0001\u0000\u0000\u0000\u01e5\u01e6\u0006\u001a\uffff\uffff\u0000"+
		"\u01e6\u01eb\u0005\u0017\u0000\u0000\u01e7\u01eb\u0005\u0018\u0000\u0000"+
		"\u01e8\u01eb\u0005\u0019\u0000\u0000\u01e9\u01eb\u0005\u001a\u0000\u0000"+
		"\u01ea\u01e5\u0001\u0000\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000"+
		"\u01eb\u01f3\u0001\u0000\u0000\u0000\u01ec\u01ed\n\u0001\u0000\u0000\u01ed"+
		"\u01ee\u0005\u001b\u0000\u0000\u01ee\u01ef\u0003\u0010\b\u0000\u01ef\u01f0"+
		"\u0005\u001c\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01ec"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f45\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000`BDPTX\\`dgkosw"+
		"{\u007f\u0082\u0084\u0088\u008c\u0090\u0094\u0096\u009a\u009e\u00a1\u00a4"+
		"\u00a8\u00ae\u00b2\u00b7\u00bb\u00c0\u00c4\u00c7\u00cb\u00d1\u00d6\u00da"+
		"\u00e0\u00e4\u00e8\u00ed\u00f1\u00f4\u00f6\u00fc\u0100\u0106\u010a\u0110"+
		"\u0114\u0118\u011d\u0123\u012c\u0130\u0134\u0138\u013c\u0140\u0146\u014a"+
		"\u014e\u0154\u0158\u015c\u0160\u0165\u0169\u016f\u0173\u0177\u017d\u0181"+
		"\u0186\u018a\u018e\u0191\u0195\u0199\u019d\u01a3\u01a7\u01ab\u01b1\u01b5"+
		"\u01b9\u01bd\u01c1\u01c5\u01c8\u01cb\u01d8\u01e1\u01ea\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}