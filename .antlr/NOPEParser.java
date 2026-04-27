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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, COM=23, EXPL_SPACE=24, 
		EXPL_ENDL=25, SPACE=26, ENDL=27, SEP=28, LP=29, RP=30, LBRACE=31, RBRACE=32, 
		NUMB=33, ESCCHAR=34, ASSIGN=35, TYPE=36, AND=37, OR=38, STR=39;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_input_in_escape = 2, RULE_block = 3, 
		RULE_if_stmt = 4, RULE_rep_loop = 5, RULE_def = 6, RULE_any_expr = 7, 
		RULE_expr = 8, RULE_logic_expr = 9, RULE_opt_type = 10, RULE_macro_call = 11, 
		RULE_range_macro = 12, RULE_match_macro = 13, RULE_anyof_macro = 14, RULE_throws_macro = 15, 
		RULE_var_macro = 16, RULE_check_macro = 17, RULE_header_macro = 18, RULE_custom_macro = 19, 
		RULE_ignore_ws = 20, RULE_input = 21, RULE_comment = 22, RULE_single_ws = 23, 
		RULE_ws = 24, RULE_expl_ws = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "input_in_escape", "block", "if_stmt", "rep_loop", 
			"def", "any_expr", "expr", "logic_expr", "opt_type", "macro_call", "range_macro", 
			"match_macro", "anyof_macro", "throws_macro", "var_macro", "check_macro", 
			"header_macro", "custom_macro", "ignore_ws", "input", "comment", "single_ws", 
			"ws", "expl_ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'ELSE'", "'REP'", "'DEF'", "'*'", "'/'", "'+'", "'-'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'RANGE'", "'MATCH'", "'ANYOF'", 
			"'THROWS'", "'VAR'", "'CHECK'", "'C_HEADER'", "'IGNORE_WHITESPACE'", 
			null, "'SPACE'", "'ENDL'", null, null, "','", "'('", "')'", "'{'", "'}'", 
			null, "'\\'", "'<<'", null, "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "COM", 
			"EXPL_SPACE", "EXPL_ENDL", "SPACE", "ENDL", "SEP", "LP", "RP", "LBRACE", 
			"RBRACE", "NUMB", "ESCCHAR", "ASSIGN", "TYPE", "AND", "OR", "STR"
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
			setState(52);
			code();
			setState(53);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 575794020378L) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ESCCHAR:
					{
					setState(55);
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
					setState(56);
					macro_call();
					}
					break;
				case T__0:
					{
					setState(57);
					if_stmt();
					}
					break;
				case T__2:
					{
					setState(58);
					rep_loop();
					}
					break;
				case T__3:
					{
					setState(59);
					def();
					}
					break;
				case T__21:
					{
					setState(60);
					ignore_ws();
					}
					break;
				case COM:
					{
					setState(61);
					comment();
					}
					break;
				case EXPL_SPACE:
				case EXPL_ENDL:
				case NUMB:
				case STR:
					{
					setState(62);
					input();
					}
					break;
				case SPACE:
				case ENDL:
					{
					setState(63);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Single_wsContext single_ws() {
			return getRuleContext(Single_wsContext.class,0);
		}
		public Input_in_escapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_in_escape; }
	}

	public final Input_in_escapeContext input_in_escape() throws RecognitionException {
		Input_in_escapeContext _localctx = new Input_in_escapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input_in_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ESCCHAR);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCCHAR:
				{
				setState(70);
				match(ESCCHAR);
				}
				break;
			case EXPL_SPACE:
			case EXPL_ENDL:
			case NUMB:
			case STR:
				{
				setState(71);
				input();
				}
				break;
			case SPACE:
			case ENDL:
				{
				setState(72);
				single_ws();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(75);
			match(LBRACE);
			setState(76);
			code();
			setState(77);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__0);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(80);
					ws();
					}
				}

				setState(83);
				match(LP);
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					ws();
					}
					break;
				}
				setState(87);
				logic_expr(0);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(88);
					ws();
					}
				}

				setState(91);
				match(RP);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(92);
					ws();
					}
				}

				setState(95);
				block();
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(96);
						ws();
						}
					}

					setState(99);
					match(T__1);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(100);
						ws();
						}
					}

					setState(103);
					block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(107);
					ws();
					}
				}

				setState(110);
				match(LP);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(111);
					ws();
					}
					break;
				}
				setState(114);
				logic_expr(0);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(115);
					ws();
					}
				}

				setState(118);
				match(RP);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(119);
					ws();
					}
				}

				setState(122);
				block();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(123);
						ws();
						}
					}

					setState(126);
					match(T__1);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(127);
						ws();
						}
					}

					setState(130);
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
		public TerminalNode SEP() { return getToken(NOPEParser.SEP, 0); }
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
			setState(135);
			match(T__2);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(136);
				ws();
				}
			}

			setState(139);
			match(LP);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(140);
				ws();
				}
			}

			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(143);
				expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(144);
					ws();
					}
				}

				setState(147);
				match(SEP);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(148);
					ws();
					}
				}

				}
				break;
			}
			setState(153);
			expr(0);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(154);
				ws();
				}
			}

			setState(157);
			match(RP);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(158);
				ws();
				}
			}

			setState(161);
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
		public List<TerminalNode> STR() { return getTokens(NOPEParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(NOPEParser.STR, i);
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
			setState(163);
			match(T__3);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(164);
				ws();
				}
			}

			setState(167);
			match(LP);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(168);
				ws();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE || _la==STR) {
				{
				setState(171);
				opt_type();
				setState(172);
				match(STR);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(173);
					ws();
					}
				}

				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(176);
					match(SEP);
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(177);
						ws();
						}
					}

					setState(180);
					opt_type();
					setState(181);
					match(STR);
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(182);
						ws();
						}
					}

					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(192);
			match(RP);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(193);
				ws();
				}
			}

			setState(196);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
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
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				setState(203);
				match(LP);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(204);
					ws();
					}
				}

				setState(207);
				expr(0);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(208);
					ws();
					}
				}

				setState(211);
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
				setState(213);
				macro_call();
				}
				break;
			case EXPL_SPACE:
			case EXPL_ENDL:
			case NUMB:
			case STR:
				{
				setState(214);
				input();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(218);
							ws();
							}
						}

						setState(221);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(222);
							ws();
							}
						}

						setState(225);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
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
						if ( !(_la==T__6 || _la==T__7) ) {
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
						expr(5);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(241);
				expr(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(242);
					ws();
					}
				}

				setState(245);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(246);
					ws();
					}
				}

				setState(249);
				expr(0);
				}
				break;
			case 3:
				{
				setState(251);
				match(LP);
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(252);
					ws();
					}
					break;
				}
				setState(255);
				logic_expr(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(256);
					ws();
					}
				}

				setState(259);
				match(RP);
				}
				break;
			case 4:
				{
				setState(261);
				macro_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
					setState(264);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(269);
						ws();
						}
						break;
					}
					setState(272);
					logic_expr(4);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		public TerminalNode TYPE() { return getToken(NOPEParser.TYPE, 0); }
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
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(278);
				match(TYPE);
				setState(279);
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
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				range_macro();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match_macro();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				anyof_macro();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				throws_macro();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				var_macro();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				check_macro();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
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
			setState(291);
			match(T__14);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(292);
				ws();
				}
			}

			setState(295);
			match(LP);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(296);
				ws();
				}
			}

			setState(299);
			expr(0);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(300);
				ws();
				}
			}

			setState(303);
			match(SEP);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(304);
				ws();
				}
			}

			setState(307);
			expr(0);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(308);
				ws();
				}
			}

			setState(311);
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
			setState(313);
			match(T__15);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(314);
				ws();
				}
			}

			setState(317);
			match(LP);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(318);
				ws();
				}
			}

			setState(321);
			expr(0);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(322);
				ws();
				}
			}

			setState(325);
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
			setState(327);
			match(T__16);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(328);
				ws();
				}
			}

			setState(331);
			match(LP);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(332);
				ws();
				}
			}

			setState(335);
			expr(0);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(336);
						ws();
						}
					}

					setState(339);
					match(SEP);
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(340);
						ws();
						}
					}

					setState(343);
					expr(0);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(349);
				ws();
				}
			}

			setState(352);
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
			setState(354);
			match(T__17);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(355);
				ws();
				}
			}

			setState(358);
			match(LP);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(359);
				ws();
				}
			}

			setState(362);
			match(STR);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(363);
				ws();
				}
			}

			setState(366);
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
		public TerminalNode STR() { return getToken(NOPEParser.STR, 0); }
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
			setState(368);
			match(T__18);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(369);
				ws();
				}
			}

			setState(372);
			match(LP);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(373);
				ws();
				}
			}

			setState(376);
			opt_type();
			setState(377);
			match(STR);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(378);
				ws();
				}
			}

			setState(381);
			match(RP);
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(382);
					ws();
					}
				}

				setState(385);
				match(ASSIGN);
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(386);
					ws();
					}
					break;
				}
				setState(389);
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
			setState(392);
			match(T__19);
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
			match(LP);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(397);
				ws();
				}
				break;
			}
			setState(400);
			logic_expr(0);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(401);
				ws();
				}
			}

			setState(404);
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
			setState(406);
			match(T__20);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(407);
				ws();
				}
			}

			setState(410);
			match(LP);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(411);
				ws();
				}
			}

			setState(414);
			match(STR);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(415);
				ws();
				}
			}

			setState(418);
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
		public TerminalNode STR() { return getToken(NOPEParser.STR, 0); }
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
			setState(420);
			match(STR);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(421);
				ws();
				}
			}

			setState(424);
			match(LP);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(425);
				ws();
				}
				break;
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558937112576L) != 0)) {
				{
				setState(428);
				expr(0);
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(429);
					ws();
					}
					break;
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(432);
					match(SEP);
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(433);
						ws();
						}
					}

					setState(436);
					expr(0);
					setState(438);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(437);
						ws();
						}
						break;
					}
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(447);
				ws();
				}
			}

			setState(450);
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
			setState(452);
			match(T__21);
			setState(453);
			match(LP);
			setState(454);
			code();
			setState(455);
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
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMB:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(NUMB);
				}
				break;
			case EXPL_SPACE:
			case EXPL_ENDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				expl_ws();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
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
			setState(462);
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
			setState(464);
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
			setState(467); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(466);
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
				setState(469); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
			setState(471);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
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
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u01da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004q\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004y\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"}\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0081\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0084\b\u0004\u0003\u0004\u0086\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008e"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0092\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0096\b\u0005\u0003\u0005\u0098\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u009c\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00a6\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00aa\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00af\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b8\b\u0006\u0005\u0006\u00ba\b\u0006\n\u0006\f\u0006\u00bd"+
		"\t\u0006\u0003\u0006\u00bf\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00c3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00c9\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00ce\b\b\u0001\b\u0001"+
		"\b\u0003\b\u00d2\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d8\b\b"+
		"\u0001\b\u0001\b\u0003\b\u00dc\b\b\u0001\b\u0001\b\u0003\b\u00e0\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00e5\b\b\u0001\b\u0001\b\u0003\b\u00e9\b\b"+
		"\u0001\b\u0005\b\u00ec\b\b\n\b\f\b\u00ef\t\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00f4\b\t\u0001\t\u0001\t\u0003\t\u00f8\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00fe\b\t\u0001\t\u0001\t\u0003\t\u0102\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0107\b\t\u0001\t\u0001\t\u0003\t\u010b\b\t\u0001\t"+
		"\u0001\t\u0003\t\u010f\b\t\u0001\t\u0005\t\u0112\b\t\n\t\f\t\u0115\t\t"+
		"\u0001\n\u0001\n\u0003\n\u0119\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0122\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u0126\b\f\u0001\f\u0001\f\u0003\f\u012a\b\f\u0001"+
		"\f\u0001\f\u0003\f\u012e\b\f\u0001\f\u0001\f\u0003\f\u0132\b\f\u0001\f"+
		"\u0001\f\u0003\f\u0136\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u013c"+
		"\b\r\u0001\r\u0001\r\u0003\r\u0140\b\r\u0001\r\u0001\r\u0003\r\u0144\b"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u014a\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u014e\b\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0152\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0156\b\u000e"+
		"\u0001\u000e\u0005\u000e\u0159\b\u000e\n\u000e\f\u000e\u015c\t\u000e\u0001"+
		"\u000e\u0003\u000e\u015f\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0165\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0169"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u016d\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0173\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0177\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u017c\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0180\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0184\b\u0010\u0001\u0010\u0003"+
		"\u0010\u0187\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u018b\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u018f\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0193\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0199\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u019d\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01a1\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u01a7\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01ab\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01af"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01b3\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01b7\b\u0013\u0005\u0013\u01b9\b\u0013\n\u0013"+
		"\f\u0013\u01bc\t\u0013\u0003\u0013\u01be\b\u0013\u0001\u0013\u0003\u0013"+
		"\u01c1\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01cd\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0004\u0018\u01d4\b\u0018\u000b\u0018\f\u0018\u01d5\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0000\u0002\u0010\u0012\u001a\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02\u0000\u0006\u0001\u0000\u0005\u0006\u0001\u0000\u0007\b\u0001\u0000"+
		"\t\u000e\u0001\u0000%&\u0001\u0000\u001a\u001b\u0001\u0000\u0018\u0019"+
		"\u022c\u00004\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004"+
		"E\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\b\u0085\u0001"+
		"\u0000\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u00a3\u0001\u0000"+
		"\u0000\u0000\u000e\u00c8\u0001\u0000\u0000\u0000\u0010\u00d7\u0001\u0000"+
		"\u0000\u0000\u0012\u0106\u0001\u0000\u0000\u0000\u0014\u0118\u0001\u0000"+
		"\u0000\u0000\u0016\u0121\u0001\u0000\u0000\u0000\u0018\u0123\u0001\u0000"+
		"\u0000\u0000\u001a\u0139\u0001\u0000\u0000\u0000\u001c\u0147\u0001\u0000"+
		"\u0000\u0000\u001e\u0162\u0001\u0000\u0000\u0000 \u0170\u0001\u0000\u0000"+
		"\u0000\"\u0188\u0001\u0000\u0000\u0000$\u0196\u0001\u0000\u0000\u0000"+
		"&\u01a4\u0001\u0000\u0000\u0000(\u01c4\u0001\u0000\u0000\u0000*\u01cc"+
		"\u0001\u0000\u0000\u0000,\u01ce\u0001\u0000\u0000\u0000.\u01d0\u0001\u0000"+
		"\u0000\u00000\u01d3\u0001\u0000\u0000\u00002\u01d7\u0001\u0000\u0000\u0000"+
		"45\u0003\u0002\u0001\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000"+
		"\u0000\u00007A\u0003\u0004\u0002\u00008A\u0003\u0016\u000b\u00009A\u0003"+
		"\b\u0004\u0000:A\u0003\n\u0005\u0000;A\u0003\f\u0006\u0000<A\u0003(\u0014"+
		"\u0000=A\u0003,\u0016\u0000>A\u0003*\u0015\u0000?A\u00030\u0018\u0000"+
		"@7\u0001\u0000\u0000\u0000@8\u0001\u0000\u0000\u0000@9\u0001\u0000\u0000"+
		"\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@<\u0001\u0000"+
		"\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000EI\u0005\"\u0000\u0000FJ\u0005\"\u0000\u0000GJ\u0003*\u0015"+
		"\u0000HJ\u0003.\u0017\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005"+
		"\u001f\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0005 \u0000\u0000N\u0007"+
		"\u0001\u0000\u0000\u0000OQ\u0005\u0001\u0000\u0000PR\u00030\u0018\u0000"+
		"QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SU\u0005\u001d\u0000\u0000TV\u00030\u0018\u0000UT\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0003\u0012"+
		"\t\u0000XZ\u00030\u0018\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0005\u001e\u0000\u0000\\^\u0003"+
		"0\u0018\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_h\u0003\u0006\u0003\u0000`b\u00030\u0018\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ce\u0005\u0002\u0000\u0000df\u00030\u0018\u0000ed\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0003\u0006\u0003"+
		"\u0000ha\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0086\u0001"+
		"\u0000\u0000\u0000jl\u0005\u0001\u0000\u0000km\u00030\u0018\u0000lk\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0005\u001d\u0000\u0000oq\u00030\u0018\u0000po\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0003\u0012\t\u0000"+
		"su\u00030\u0018\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vx\u0005\u001e\u0000\u0000wy\u00030\u0018\u0000"+
		"xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u0083\u0003\u0006\u0003\u0000{}\u00030\u0018\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0005\u0002\u0000\u0000\u007f\u0081\u00030\u0018\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0003\b\u0004\u0000\u0083|\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085O\u0001\u0000\u0000\u0000\u0085j\u0001\u0000\u0000\u0000"+
		"\u0086\t\u0001\u0000\u0000\u0000\u0087\u0089\u0005\u0003\u0000\u0000\u0088"+
		"\u008a\u00030\u0018\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0005\u001d\u0000\u0000\u008c\u008e\u00030\u0018\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0097\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0003\u0010\b\u0000\u0090\u0092\u00030"+
		"\u0018\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u001c"+
		"\u0000\u0000\u0094\u0096\u00030\u0018\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0010\b\u0000"+
		"\u009a\u009c\u00030\u0018\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009f\u0005\u001e\u0000\u0000\u009e\u00a0\u00030\u0018\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u0006\u0003\u0000\u00a2\u000b"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0004\u0000\u0000\u00a4\u00a6"+
		"\u00030\u0018\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005"+
		"\u001d\u0000\u0000\u00a8\u00aa\u00030\u0018\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00be\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0003\u0014\n\u0000\u00ac\u00ae\u0005\'\u0000"+
		"\u0000\u00ad\u00af\u00030\u0018\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0005\u001c\u0000\u0000\u00b1\u00b3\u00030\u0018\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u0014\n\u0000\u00b5\u00b7"+
		"\u0005\'\u0000\u0000\u00b6\u00b8\u00030\u0018\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00ab\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005"+
		"\u001e\u0000\u0000\u00c1\u00c3\u00030\u0018\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0003\u0006\u0003\u0000\u00c5\r\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0003\u0010\b\u0000\u00c7\u00c9\u0003\u0012\t\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u000f\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\b\uffff\uffff\u0000"+
		"\u00cb\u00cd\u0005\u001d\u0000\u0000\u00cc\u00ce\u00030\u0018\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\u0010\b\u0000\u00d0\u00d2"+
		"\u00030\u0018\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u001e\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000\u00d5\u00d8\u0003"+
		"\u0016\u000b\u0000\u00d6\u00d8\u0003*\u0015\u0000\u00d7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00ed\u0001\u0000\u0000\u0000\u00d9\u00db\n\u0005\u0000"+
		"\u0000\u00da\u00dc\u00030\u0018\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0007\u0000\u0000\u0000\u00de\u00e0\u00030\u0018\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00ec\u0003\u0010\b\u0006\u00e2\u00e4"+
		"\n\u0004\u0000\u0000\u00e3\u00e5\u00030\u0018\u0000\u00e4\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0007\u0001\u0000\u0000\u00e7\u00e9\u0003"+
		"0\u0018\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\u0010"+
		"\b\u0005\u00eb\u00d9\u0001\u0000\u0000\u0000\u00eb\u00e2\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0011\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u0107\u0006\t\uffff\uffff"+
		"\u0000\u00f1\u00f3\u0003\u0010\b\u0000\u00f2\u00f4\u00030\u0018\u0000"+
		"\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0007\u0002\u0000\u0000"+
		"\u00f6\u00f8\u00030\u0018\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0003\u0010\b\u0000\u00fa\u0107\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0005\u001d\u0000\u0000\u00fc\u00fe\u00030\u0018\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0003\u0012\t\u0000\u0100\u0102\u00030"+
		"\u0018\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u001e"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0107\u0003\u0016"+
		"\u000b\u0000\u0106\u00f0\u0001\u0000\u0000\u0000\u0106\u00f1\u0001\u0000"+
		"\u0000\u0000\u0106\u00fb\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0113\u0001\u0000\u0000\u0000\u0108\u010a\n\u0003\u0000"+
		"\u0000\u0109\u010b\u00030\u0018\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0007\u0003\u0000\u0000\u010d\u010f\u00030\u0018\u0000\u010e"+
		"\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0003\u0012\t\u0004\u0111\u0108"+
		"\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0013"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005$\u0000\u0000\u0117\u0119\u00030\u0018\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0015\u0001\u0000"+
		"\u0000\u0000\u011a\u0122\u0003\u0018\f\u0000\u011b\u0122\u0003\u001a\r"+
		"\u0000\u011c\u0122\u0003\u001c\u000e\u0000\u011d\u0122\u0003\u001e\u000f"+
		"\u0000\u011e\u0122\u0003 \u0010\u0000\u011f\u0122\u0003\"\u0011\u0000"+
		"\u0120\u0122\u0003$\u0012\u0000\u0121\u011a\u0001\u0000\u0000\u0000\u0121"+
		"\u011b\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0121"+
		"\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0017\u0001\u0000\u0000\u0000\u0123\u0125\u0005\u000f\u0000\u0000\u0124"+
		"\u0126\u00030\u0018\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129"+
		"\u0005\u001d\u0000\u0000\u0128\u012a\u00030\u0018\u0000\u0129\u0128\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0003\u0010\b\u0000\u012c\u012e\u00030"+
		"\u0018\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0005\u001c"+
		"\u0000\u0000\u0130\u0132\u00030\u0018\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0003\u0010\b\u0000\u0134\u0136\u00030\u0018\u0000"+
		"\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u001e\u0000\u0000"+
		"\u0138\u0019\u0001\u0000\u0000\u0000\u0139\u013b\u0005\u0010\u0000\u0000"+
		"\u013a\u013c\u00030\u0018\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013f\u0005\u001d\u0000\u0000\u013e\u0140\u00030\u0018\u0000\u013f\u013e"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0143\u0003\u0010\b\u0000\u0142\u0144\u0003"+
		"0\u0018\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u001e"+
		"\u0000\u0000\u0146\u001b\u0001\u0000\u0000\u0000\u0147\u0149\u0005\u0011"+
		"\u0000\u0000\u0148\u014a\u00030\u0018\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u014d\u0005\u001d\u0000\u0000\u014c\u014e\u00030\u0018\u0000"+
		"\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u015a\u0003\u0010\b\u0000\u0150"+
		"\u0152\u00030\u0018\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155"+
		"\u0005\u001c\u0000\u0000\u0154\u0156\u00030\u0018\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0003\u0010\b\u0000\u0158\u0151\u0001\u0000"+
		"\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015f\u00030\u0018"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u001e\u0000"+
		"\u0000\u0161\u001d\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u0012\u0000"+
		"\u0000\u0163\u0165\u00030\u0018\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000"+
		"\u0166\u0168\u0005\u001d\u0000\u0000\u0167\u0169\u00030\u0018\u0000\u0168"+
		"\u0167\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0005\'\u0000\u0000\u016b\u016d"+
		"\u00030\u0018\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u001e\u0000\u0000\u016f\u001f\u0001\u0000\u0000\u0000\u0170\u0172\u0005"+
		"\u0013\u0000\u0000\u0171\u0173\u00030\u0018\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0005\u001d\u0000\u0000\u0175\u0177\u00030\u0018"+
		"\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0003\u0014\n\u0000"+
		"\u0179\u017b\u0005\'\u0000\u0000\u017a\u017c\u00030\u0018\u0000\u017b"+
		"\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u0186\u0005\u001e\u0000\u0000\u017e"+
		"\u0180\u00030\u0018\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183"+
		"\u0005#\u0000\u0000\u0182\u0184\u00030\u0018\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0003\u000e\u0007\u0000\u0186\u017f\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187!\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0005\u0014\u0000\u0000\u0189\u018b\u00030\u0018\u0000"+
		"\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0005\u001d\u0000\u0000"+
		"\u018d\u018f\u00030\u0018\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0192\u0003\u0012\t\u0000\u0191\u0193\u00030\u0018\u0000\u0192\u0191"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u001e\u0000\u0000\u0195#\u0001"+
		"\u0000\u0000\u0000\u0196\u0198\u0005\u0015\u0000\u0000\u0197\u0199\u0003"+
		"0\u0018\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0005\u001d"+
		"\u0000\u0000\u019b\u019d\u00030\u0018\u0000\u019c\u019b\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u01a0\u0005\'\u0000\u0000\u019f\u01a1\u00030\u0018\u0000"+
		"\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u001e\u0000\u0000"+
		"\u01a3%\u0001\u0000\u0000\u0000\u01a4\u01a6\u0005\'\u0000\u0000\u01a5"+
		"\u01a7\u00030\u0018\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa"+
		"\u0005\u001d\u0000\u0000\u01a9\u01ab\u00030\u0018\u0000\u01aa\u01a9\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01bd\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ae\u0003\u0010\b\u0000\u01ad\u01af\u00030"+
		"\u0018\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01ba\u0001\u0000\u0000\u0000\u01b0\u01b2\u0005\u001c"+
		"\u0000\u0000\u01b1\u01b3\u00030\u0018\u0000\u01b2\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0003\u0010\b\u0000\u01b5\u01b7\u00030\u0018\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01ac\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c1\u00030\u0018\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0005\u001e\u0000\u0000\u01c3\'\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005\u0016\u0000\u0000\u01c5\u01c6\u0005\u001d\u0000\u0000\u01c6\u01c7"+
		"\u0003\u0002\u0001\u0000\u01c7\u01c8\u0005\u001e\u0000\u0000\u01c8)\u0001"+
		"\u0000\u0000\u0000\u01c9\u01cd\u0005!\u0000\u0000\u01ca\u01cd\u00032\u0019"+
		"\u0000\u01cb\u01cd\u0005\'\u0000\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cd+\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u0017\u0000\u0000\u01cf"+
		"-\u0001\u0000\u0000\u0000\u01d0\u01d1\u0007\u0004\u0000\u0000\u01d1/\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d4\u0007\u0004\u0000\u0000\u01d3\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d61\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0007\u0005\u0000\u0000\u01d83\u0001\u0000\u0000"+
		"\u0000\\@BIQUY]aehlptx|\u0080\u0083\u0085\u0089\u008d\u0091\u0095\u0097"+
		"\u009b\u009f\u00a5\u00a9\u00ae\u00b2\u00b7\u00bb\u00be\u00c2\u00c8\u00cd"+
		"\u00d1\u00d7\u00db\u00df\u00e4\u00e8\u00eb\u00ed\u00f3\u00f7\u00fd\u0101"+
		"\u0106\u010a\u010e\u0113\u0118\u0121\u0125\u0129\u012d\u0131\u0135\u013b"+
		"\u013f\u0143\u0149\u014d\u0151\u0155\u015a\u015e\u0164\u0168\u016c\u0172"+
		"\u0176\u017b\u017f\u0183\u0186\u018a\u018e\u0192\u0198\u019c\u01a0\u01a6"+
		"\u01aa\u01ae\u01b2\u01b6\u01ba\u01bd\u01c0\u01cc\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}