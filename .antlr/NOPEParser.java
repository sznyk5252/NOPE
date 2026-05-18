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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, COM=15, EXPL_SPACE=16, 
		EXPL_ENDL=17, SPACE=18, ENDL=19, SEP=20, LP=21, RP=22, LBRACE=23, RBRACE=24, 
		LIDXBR=25, RIDXBR=26, NUMB=27, ESCCHAR=28, ASSIGN=29, AND=30, OR=31, QUOTE=32, 
		EQ=33, NEQ=34, LS=35, GR=36, LSEQ=37, GREQ=38, NEGATION=39, MUL=40, DIV=41, 
		ADD=42, SUB=43, RETURN=44, RETURN_TYPING_ARROW=45, ID=46, STR=47;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_input_in_escape = 2, RULE_block = 3, 
		RULE_block_with_return = 4, RULE_if_stmt = 5, RULE_rep_loop = 6, RULE_def = 7, 
		RULE_rtype = 8, RULE_any_expr = 9, RULE_expr = 10, RULE_logic_expr = 11, 
		RULE_opt_type = 12, RULE_macro_call = 13, RULE_range_macro = 14, RULE_match_macro = 15, 
		RULE_anyof_macro = 16, RULE_var_macro = 17, RULE_check_macro = 18, RULE_custom_macro = 19, 
		RULE_ignore_ws = 20, RULE_input = 21, RULE_comment = 22, RULE_single_ws = 23, 
		RULE_ws = 24, RULE_expl_ws = 25, RULE_type = 26, RULE_comparator = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "input_in_escape", "block", "block_with_return", "if_stmt", 
			"rep_loop", "def", "rtype", "any_expr", "expr", "logic_expr", "opt_type", 
			"macro_call", "range_macro", "match_macro", "anyof_macro", "var_macro", 
			"check_macro", "custom_macro", "ignore_ws", "input", "comment", "single_ws", 
			"ws", "expl_ws", "type", "comparator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'ELSE'", "'REP'", "'DEF'", "'RANGE'", "'MATCH'", "'ANYOF'", 
			"'VAR'", "'CHECK'", "'IGNORE_WHITESPACE'", "'INT'", "'FLOAT'", "'STR'", 
			"'BOOL'", null, "'SPACE'", "'ENDL'", null, null, "','", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", null, "'\\'", "'<<'", "'AND'", "'OR'", "'''", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'NOT'", "'*'", "'/'", 
			"'+'", "'-'", "'RETURN'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "COM", "EXPL_SPACE", "EXPL_ENDL", "SPACE", "ENDL", 
			"SEP", "LP", "RP", "LBRACE", "RBRACE", "LIDXBR", "RIDXBR", "NUMB", "ESCCHAR", 
			"ASSIGN", "AND", "OR", "QUOTE", "EQ", "NEQ", "LS", "GR", "LSEQ", "GREQ", 
			"NEGATION", "MUL", "DIV", "ADD", "SUB", "RETURN", "RETURN_TYPING_ARROW", 
			"ID", "STR"
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
			setState(56);
			code();
			setState(57);
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
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 211106636204026L) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(59);
					input_in_escape();
					}
					break;
				case 2:
					{
					setState(60);
					macro_call();
					}
					break;
				case 3:
					{
					setState(61);
					if_stmt();
					}
					break;
				case 4:
					{
					setState(62);
					rep_loop();
					}
					break;
				case 5:
					{
					setState(63);
					def();
					}
					break;
				case 6:
					{
					setState(64);
					ignore_ws();
					}
					break;
				case 7:
					{
					setState(65);
					comment();
					}
					break;
				case 8:
					{
					setState(66);
					input();
					}
					break;
				case 9:
					{
					setState(67);
					ws();
					}
					break;
				}
				}
				setState(72);
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
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public TerminalNode RP() { return getToken(NOPEParser.RP, 0); }
		public TerminalNode LBRACE() { return getToken(NOPEParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NOPEParser.RBRACE, 0); }
		public TerminalNode ADD() { return getToken(NOPEParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(NOPEParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(NOPEParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(NOPEParser.MUL, 0); }
		public TerminalNode LS() { return getToken(NOPEParser.LS, 0); }
		public TerminalNode GR() { return getToken(NOPEParser.GR, 0); }
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
			setState(73);
			match(ESCCHAR);
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCCHAR:
				{
				setState(74);
				match(ESCCHAR);
				}
				break;
			case COM:
				{
				setState(75);
				match(COM);
				}
				break;
			case QUOTE:
				{
				setState(76);
				match(QUOTE);
				}
				break;
			case SPACE:
			case ENDL:
				{
				setState(77);
				ws();
				}
				break;
			case LP:
				{
				setState(78);
				match(LP);
				}
				break;
			case RP:
				{
				setState(79);
				match(RP);
				}
				break;
			case LBRACE:
				{
				setState(80);
				match(LBRACE);
				}
				break;
			case RBRACE:
				{
				setState(81);
				match(RBRACE);
				}
				break;
			case ADD:
				{
				setState(82);
				match(ADD);
				}
				break;
			case SUB:
				{
				setState(83);
				match(SUB);
				}
				break;
			case DIV:
				{
				setState(84);
				match(DIV);
				}
				break;
			case MUL:
				{
				setState(85);
				match(MUL);
				}
				break;
			case LS:
				{
				setState(86);
				match(LS);
				}
				break;
			case GR:
				{
				setState(87);
				match(GR);
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
			setState(90);
			match(LBRACE);
			setState(91);
			code();
			setState(92);
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
	public static class Block_with_returnContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NOPEParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(NOPEParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(NOPEParser.RBRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public Block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_with_return; }
	}

	public final Block_with_returnContext block_with_return() throws RecognitionException {
		Block_with_returnContext _localctx = new Block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LBRACE);
			setState(95);
			code();
			setState(96);
			match(RETURN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(97);
				ws();
				}
			}

			setState(100);
			expr(0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(101);
				ws();
				}
			}

			setState(104);
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
		enterRule(_localctx, 10, RULE_if_stmt);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(111);
					ws();
					}
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
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
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
					block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__0);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(134);
					ws();
					}
				}

				setState(137);
				match(LP);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(138);
					ws();
					}
				}

				setState(141);
				logic_expr(0);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(142);
					ws();
					}
				}

				setState(145);
				match(RP);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(146);
					ws();
					}
				}

				setState(149);
				block();
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(150);
						ws();
						}
					}

					setState(153);
					match(T__1);
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
		enterRule(_localctx, 12, RULE_rep_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__2);
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
			match(LP);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(167);
				ws();
				}
			}

			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(170);
				match(ID);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(171);
					ws();
					}
				}

				setState(174);
				match(SEP);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(175);
					ws();
					}
				}

				}
				break;
			}
			setState(180);
			expr(0);
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(181);
					ws();
					}
				}

				setState(184);
				match(SEP);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(185);
					ws();
					}
				}

				setState(188);
				expr(0);
				}
				break;
			}
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(191);
					ws();
					}
				}

				setState(194);
				match(SEP);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(195);
					ws();
					}
				}

				setState(198);
				expr(0);
				}
				break;
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(201);
				ws();
				}
			}

			setState(204);
			match(RP);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(205);
				ws();
				}
			}

			setState(208);
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
		public List<TerminalNode> ID() { return getTokens(NOPEParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NOPEParser.ID, i);
		}
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
		public List<TerminalNode> SEP() { return getTokens(NOPEParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(NOPEParser.SEP, i);
		}
		public RtypeContext rtype() {
			return getRuleContext(RtypeContext.class,0);
		}
		public Block_with_returnContext block_with_return() {
			return getRuleContext(Block_with_returnContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_def);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__3);
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(211);
					ws();
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE || _la==ENDL );
				setState(216);
				match(ID);
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
				match(LP);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(221);
					ws();
					}
				}

				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744208384L) != 0)) {
					{
					setState(224);
					opt_type();
					setState(225);
					match(ID);
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(226);
						ws();
						}
					}

					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEP) {
						{
						{
						setState(229);
						match(SEP);
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(230);
							ws();
							}
						}

						setState(233);
						opt_type();
						setState(234);
						match(ID);
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(235);
							ws();
							}
						}

						}
						}
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(245);
				match(RP);
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
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__3);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					ws();
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE || _la==ENDL );
				setState(257);
				match(ID);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(258);
					ws();
					}
				}

				setState(261);
				match(LP);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(262);
					ws();
					}
				}

				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368744208384L) != 0)) {
					{
					setState(265);
					opt_type();
					setState(266);
					match(ID);
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(267);
						ws();
						}
					}

					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEP) {
						{
						{
						setState(270);
						match(SEP);
						setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(271);
							ws();
							}
						}

						setState(274);
						opt_type();
						setState(275);
						match(ID);
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(276);
							ws();
							}
						}

						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(286);
				match(RP);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(287);
					ws();
					}
				}

				setState(290);
				rtype();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(291);
					ws();
					}
				}

				setState(294);
				block_with_return();
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
	public static class RtypeContext extends ParserRuleContext {
		public TerminalNode RETURN_TYPING_ARROW() { return getToken(NOPEParser.RETURN_TYPING_ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public RtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtype; }
	}

	public final RtypeContext rtype() throws RecognitionException {
		RtypeContext _localctx = new RtypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(RETURN_TYPING_ARROW);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(299);
				ws();
				}
			}

			setState(302);
			type(0);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(303);
				ws();
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
		enterRule(_localctx, 18, RULE_any_expr);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public List<TerminalNode> LIDXBR() { return getTokens(NOPEParser.LIDXBR); }
		public TerminalNode LIDXBR(int i) {
			return getToken(NOPEParser.LIDXBR, i);
		}
		public List<TerminalNode> RIDXBR() { return getTokens(NOPEParser.RIDXBR); }
		public TerminalNode RIDXBR(int i) {
			return getToken(NOPEParser.RIDXBR, i);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode MUL() { return getToken(NOPEParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(NOPEParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(NOPEParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(NOPEParser.SUB, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(311);
				match(LP);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(312);
					ws();
					}
				}

				setState(315);
				expr(0);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(316);
					ws();
					}
				}

				setState(319);
				match(RP);
				}
				break;
			case 2:
				{
				setState(321);
				macro_call();
				}
				break;
			case 3:
				{
				setState(322);
				match(ID);
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(323);
							ws();
							}
						}

						setState(326);
						match(LIDXBR);
						setState(328);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(327);
							ws();
							}
						}

						setState(330);
						expr(0);
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(331);
							ws();
							}
						}

						setState(334);
						match(RIDXBR);
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(341);
				input();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(362);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(346);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(345);
							ws();
							}
						}

						setState(348);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
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
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(354);
							ws();
							}
						}

						setState(357);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(358);
							ws();
							}
						}

						setState(361);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		public TerminalNode LP() { return getToken(NOPEParser.LP, 0); }
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
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
		public TerminalNode ID() { return getToken(NOPEParser.ID, 0); }
		public List<TerminalNode> LIDXBR() { return getTokens(NOPEParser.LIDXBR); }
		public TerminalNode LIDXBR(int i) {
			return getToken(NOPEParser.LIDXBR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RIDXBR() { return getTokens(NOPEParser.RIDXBR); }
		public TerminalNode RIDXBR(int i) {
			return getToken(NOPEParser.RIDXBR, i);
		}
		public TerminalNode NEGATION() { return getToken(NOPEParser.NEGATION, 0); }
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(368);
				match(LP);
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
				logic_expr(0);
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
				match(RP);
				}
				break;
			case 2:
				{
				setState(378);
				macro_call();
				}
				break;
			case 3:
				{
				setState(379);
				match(ID);
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
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
						match(LIDXBR);
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
						expr(0);
						setState(389);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(388);
							ws();
							}
						}

						setState(391);
						match(RIDXBR);
						}
						} 
					}
					setState(397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(398);
				match(NEGATION);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(399);
					ws();
					}
				}

				setState(402);
				logic_expr(4);
				}
				break;
			case 5:
				{
				setState(403);
				expr(0);
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
				comparator();
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
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new Logic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(415);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(417);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(416);
							ws();
							}
						}

						setState(419);
						match(AND);
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(420);
							ws();
							}
						}

						setState(423);
						logic_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Logic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(424);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(425);
							ws();
							}
						}

						setState(428);
						match(OR);
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE || _la==ENDL) {
							{
							setState(429);
							ws();
							}
						}

						setState(432);
						logic_expr(2);
						}
						break;
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 24, RULE_opt_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				setState(438);
				type(0);
				setState(439);
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
		public Var_macroContext var_macro() {
			return getRuleContext(Var_macroContext.class,0);
		}
		public Check_macroContext check_macro() {
			return getRuleContext(Check_macroContext.class,0);
		}
		public Custom_macroContext custom_macro() {
			return getRuleContext(Custom_macroContext.class,0);
		}
		public Macro_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call; }
	}

	public final Macro_callContext macro_call() throws RecognitionException {
		Macro_callContext _localctx = new Macro_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_macro_call);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				range_macro();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match_macro();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				anyof_macro();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				var_macro();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				check_macro();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				custom_macro();
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
		enterRule(_localctx, 28, RULE_range_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__4);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(452);
				ws();
				}
			}

			setState(455);
			match(LP);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(456);
				ws();
				}
			}

			setState(459);
			expr(0);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(460);
				ws();
				}
			}

			setState(463);
			match(SEP);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(464);
				ws();
				}
			}

			setState(467);
			expr(0);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(468);
				ws();
				}
			}

			setState(471);
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
		enterRule(_localctx, 30, RULE_match_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__5);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(474);
				ws();
				}
			}

			setState(477);
			match(LP);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(478);
				ws();
				}
			}

			setState(481);
			expr(0);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(482);
				ws();
				}
			}

			setState(485);
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
		enterRule(_localctx, 32, RULE_anyof_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__6);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(488);
				ws();
				}
			}

			setState(491);
			match(LP);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(492);
				ws();
				}
			}

			setState(495);
			expr(0);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(496);
						ws();
						}
					}

					setState(499);
					match(SEP);
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(500);
						ws();
						}
					}

					setState(503);
					expr(0);
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(509);
				ws();
				}
			}

			setState(512);
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
		public List<TerminalNode> LIDXBR() { return getTokens(NOPEParser.LIDXBR); }
		public TerminalNode LIDXBR(int i) {
			return getToken(NOPEParser.LIDXBR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RIDXBR() { return getTokens(NOPEParser.RIDXBR); }
		public TerminalNode RIDXBR(int i) {
			return getToken(NOPEParser.RIDXBR, i);
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
		enterRule(_localctx, 34, RULE_var_macro);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__7);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(515);
				ws();
				}
			}

			setState(518);
			match(LP);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(519);
				ws();
				}
			}

			setState(522);
			opt_type();
			setState(523);
			match(ID);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(524);
						ws();
						}
					}

					setState(527);
					match(LIDXBR);
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(528);
						ws();
						}
					}

					setState(531);
					expr(0);
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(532);
						ws();
						}
					}

					setState(535);
					match(RIDXBR);
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(542);
				ws();
				}
			}

			setState(545);
			match(RP);
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(546);
					ws();
					}
				}

				setState(549);
				match(ASSIGN);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==ENDL) {
					{
					setState(550);
					ws();
					}
				}

				setState(553);
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
		enterRule(_localctx, 36, RULE_check_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(T__8);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(557);
				ws();
				}
			}

			setState(560);
			match(LP);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(561);
				ws();
				}
			}

			setState(564);
			logic_expr(0);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(565);
				ws();
				}
			}

			setState(568);
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
			setState(570);
			match(ID);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(571);
				ws();
				}
			}

			setState(574);
			match(LP);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(575);
				ws();
				}
				break;
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 211106369045472L) != 0)) {
				{
				setState(578);
				expr(0);
				setState(580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(579);
					ws();
					}
					break;
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(582);
					match(SEP);
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE || _la==ENDL) {
						{
						setState(583);
						ws();
						}
					}

					setState(586);
					expr(0);
					setState(588);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(587);
						ws();
						}
						break;
					}
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE || _la==ENDL) {
				{
				setState(597);
				ws();
				}
			}

			setState(600);
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
			setState(602);
			match(T__9);
			setState(603);
			match(LP);
			setState(604);
			code();
			setState(605);
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
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMB:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(NUMB);
				}
				break;
			case EXPL_SPACE:
			case EXPL_ENDL:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				expl_ws();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(ID);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
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
			setState(613);
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
			setState(615);
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
			setState(618); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(617);
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
				setState(620); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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
			setState(622);
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
		public TerminalNode LIDXBR() { return getToken(NOPEParser.LIDXBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIDXBR() { return getToken(NOPEParser.RIDXBR, 0); }
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
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(625);
				match(T__10);
				}
				break;
			case T__11:
				{
				setState(626);
				match(T__11);
				}
				break;
			case T__12:
				{
				setState(627);
				match(T__12);
				}
				break;
			case T__13:
				{
				setState(628);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(631);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(632);
					match(LIDXBR);
					setState(633);
					expr(0);
					setState(634);
					match(RIDXBR);
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(NOPEParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(NOPEParser.NEQ, 0); }
		public TerminalNode LS() { return getToken(NOPEParser.LS, 0); }
		public TerminalNode GR() { return getToken(NOPEParser.GR, 0); }
		public TerminalNode LSEQ() { return getToken(NOPEParser.LSEQ, 0); }
		public TerminalNode GREQ() { return getToken(NOPEParser.GREQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		case 26:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0284\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001E\b\u0001\n\u0001\f\u0001H\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"c\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005q\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005u\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005y\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005}\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0081\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0084\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0088\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008c\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0090\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0094\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0098\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u009c\b\u0005\u0001\u0005\u0003\u0005"+
		"\u009f\b\u0005\u0003\u0005\u00a1\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00a5\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00ad\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b1\b\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b7\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bb"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00be\b\u0006\u0001\u0006\u0003\u0006"+
		"\u00c1\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c5\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00c8\b\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u00d5\b\u0007\u000b\u0007\f\u0007"+
		"\u00d6\u0001\u0007\u0001\u0007\u0003\u0007\u00db\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00df\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00e4\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e8\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ed\b\u0007\u0005\u0007"+
		"\u00ef\b\u0007\n\u0007\f\u0007\u00f2\t\u0007\u0003\u0007\u00f4\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00f8\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u00fe\b\u0007\u000b\u0007\f\u0007"+
		"\u00ff\u0001\u0007\u0001\u0007\u0003\u0007\u0104\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0108\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u010d\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0111\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0116\b\u0007\u0005\u0007"+
		"\u0118\b\u0007\n\u0007\f\u0007\u011b\t\u0007\u0003\u0007\u011d\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0121\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0125\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0129\b"+
		"\u0007\u0001\b\u0001\b\u0003\b\u012d\b\b\u0001\b\u0001\b\u0003\b\u0131"+
		"\b\b\u0001\t\u0001\t\u0003\t\u0135\b\t\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u013a\b\n\u0001\n\u0001\n\u0003\n\u013e\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0145\b\n\u0001\n\u0001\n\u0003\n\u0149\b\n\u0001\n"+
		"\u0001\n\u0003\n\u014d\b\n\u0001\n\u0001\n\u0005\n\u0151\b\n\n\n\f\n\u0154"+
		"\t\n\u0001\n\u0003\n\u0157\b\n\u0001\n\u0001\n\u0003\n\u015b\b\n\u0001"+
		"\n\u0001\n\u0003\n\u015f\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0164\b\n"+
		"\u0001\n\u0001\n\u0003\n\u0168\b\n\u0001\n\u0005\n\u016b\b\n\n\n\f\n\u016e"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0173\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0177\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u017e\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0182\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0186"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u018a\b\u000b\n\u000b\f\u000b"+
		"\u018d\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0191\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0196\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u019a\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u019e"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a2\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u01a6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01ab\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01af\b"+
		"\u000b\u0001\u000b\u0005\u000b\u01b2\b\u000b\n\u000b\f\u000b\u01b5\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u01ba\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u01c2\b\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u01c6\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01ca\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01ce\b\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u01d2\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01d6\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u01dc\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u01e0\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u01e4\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01ea\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01ee\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01f2\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01f6\b\u0010\u0001\u0010\u0005\u0010\u01f9\b\u0010"+
		"\n\u0010\f\u0010\u01fc\t\u0010\u0001\u0010\u0003\u0010\u01ff\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0205\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0209\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u020e\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0212"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0216\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u021a\b\u0011\n\u0011\f\u0011\u021d\t\u0011\u0001"+
		"\u0011\u0003\u0011\u0220\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0224"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0228\b\u0011\u0001\u0011"+
		"\u0003\u0011\u022b\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u022f\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0233\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0237\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u023d\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0241"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0245\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0249\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u024d\b\u0013\u0005\u0013\u024f\b\u0013\n\u0013\f\u0013\u0252\t\u0013"+
		"\u0003\u0013\u0254\b\u0013\u0001\u0013\u0003\u0013\u0257\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0264"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0004"+
		"\u0018\u026b\b\u0018\u000b\u0018\f\u0018\u026c\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0276\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u027d\b\u001a\n\u001a\f\u001a\u0280\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0000\u0003\u0014\u00164\u001c\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0246\u0000\u0005\u0001\u0000()\u0001\u0000*+\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u0010\u0011\u0001\u0000!&\u0305\u00008\u0001\u0000\u0000\u0000"+
		"\u0002F\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006Z"+
		"\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\n\u00a0\u0001\u0000"+
		"\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000\u000e\u0128\u0001\u0000\u0000"+
		"\u0000\u0010\u012a\u0001\u0000\u0000\u0000\u0012\u0134\u0001\u0000\u0000"+
		"\u0000\u0014\u0156\u0001\u0000\u0000\u0000\u0016\u019d\u0001\u0000\u0000"+
		"\u0000\u0018\u01b9\u0001\u0000\u0000\u0000\u001a\u01c1\u0001\u0000\u0000"+
		"\u0000\u001c\u01c3\u0001\u0000\u0000\u0000\u001e\u01d9\u0001\u0000\u0000"+
		"\u0000 \u01e7\u0001\u0000\u0000\u0000\"\u0202\u0001\u0000\u0000\u0000"+
		"$\u022c\u0001\u0000\u0000\u0000&\u023a\u0001\u0000\u0000\u0000(\u025a"+
		"\u0001\u0000\u0000\u0000*\u0263\u0001\u0000\u0000\u0000,\u0265\u0001\u0000"+
		"\u0000\u0000.\u0267\u0001\u0000\u0000\u00000\u026a\u0001\u0000\u0000\u0000"+
		"2\u026e\u0001\u0000\u0000\u00004\u0275\u0001\u0000\u0000\u00006\u0281"+
		"\u0001\u0000\u0000\u000089\u0003\u0002\u0001\u00009:\u0005\u0000\u0000"+
		"\u0001:\u0001\u0001\u0000\u0000\u0000;E\u0003\u0004\u0002\u0000<E\u0003"+
		"\u001a\r\u0000=E\u0003\n\u0005\u0000>E\u0003\f\u0006\u0000?E\u0003\u000e"+
		"\u0007\u0000@E\u0003(\u0014\u0000AE\u0003,\u0016\u0000BE\u0003*\u0015"+
		"\u0000CE\u00030\u0018\u0000D;\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000"+
		"\u0000D=\u0001\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000D?\u0001\u0000"+
		"\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0003\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IX\u0005\u001c\u0000\u0000JY\u0005"+
		"\u001c\u0000\u0000KY\u0005\u000f\u0000\u0000LY\u0005 \u0000\u0000MY\u0003"+
		"0\u0018\u0000NY\u0005\u0015\u0000\u0000OY\u0005\u0016\u0000\u0000PY\u0005"+
		"\u0017\u0000\u0000QY\u0005\u0018\u0000\u0000RY\u0005*\u0000\u0000SY\u0005"+
		"+\u0000\u0000TY\u0005)\u0000\u0000UY\u0005(\u0000\u0000VY\u0005#\u0000"+
		"\u0000WY\u0005$\u0000\u0000XJ\u0001\u0000\u0000\u0000XK\u0001\u0000\u0000"+
		"\u0000XL\u0001\u0000\u0000\u0000XM\u0001\u0000\u0000\u0000XN\u0001\u0000"+
		"\u0000\u0000XO\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000XQ\u0001"+
		"\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u0017\u0000\u0000[\\\u0003\u0002\u0001\u0000\\]\u0005\u0018\u0000\u0000"+
		"]\u0007\u0001\u0000\u0000\u0000^_\u0005\u0017\u0000\u0000_`\u0003\u0002"+
		"\u0001\u0000`b\u0005,\u0000\u0000ac\u00030\u0018\u0000ba\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0003\u0014"+
		"\n\u0000eg\u00030\u0018\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0018\u0000\u0000i\t\u0001"+
		"\u0000\u0000\u0000jl\u0005\u0001\u0000\u0000km\u00030\u0018\u0000lk\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0005\u0015\u0000\u0000oq\u00030\u0018\u0000po\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0003\u0016\u000b"+
		"\u0000su\u00030\u0018\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u0016\u0000\u0000wy\u00030\u0018"+
		"\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\u0083\u0003\u0006\u0003\u0000{}\u00030\u0018\u0000|{\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0005\u0002\u0000\u0000\u007f\u0081\u00030\u0018\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0006\u0003\u0000\u0083|\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u00a1\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0005\u0001\u0000\u0000\u0086\u0088\u0003"+
		"0\u0018\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0005\u0015"+
		"\u0000\u0000\u008a\u008c\u00030\u0018\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0003\u0016\u000b\u0000\u008e\u0090\u00030\u0018\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0016\u0000\u0000"+
		"\u0092\u0094\u00030\u0018\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u009e\u0003\u0006\u0003\u0000\u0096\u0098\u00030\u0018\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u0002\u0000\u0000\u009a\u009c"+
		"\u00030\u0018\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0003"+
		"\n\u0005\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0j\u0001\u0000\u0000"+
		"\u0000\u00a0\u0085\u0001\u0000\u0000\u0000\u00a1\u000b\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0005\u0003\u0000\u0000\u00a3\u00a5\u00030\u0018\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0015\u0000\u0000"+
		"\u00a7\u00a9\u00030\u0018\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b2\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0005.\u0000\u0000\u00ab\u00ad\u00030\u0018\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0005\u0014\u0000\u0000\u00af\u00b1\u0003"+
		"0\u0018\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00bd\u0003\u0014\n\u0000\u00b5\u00b7\u00030\u0018"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005\u0014\u0000"+
		"\u0000\u00b9\u00bb\u00030\u0018\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0003\u0014\n\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00c7\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u00030\u0018\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0005\u0014\u0000\u0000\u00c3\u00c5\u00030\u0018\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c8\u0003\u0014\n\u0000\u00c7\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u00030\u0018\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0005\u0016\u0000\u0000\u00cd\u00cf\u00030\u0018\u0000"+
		"\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u0006\u0003\u0000"+
		"\u00d1\r\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005\u0004\u0000\u0000\u00d3"+
		"\u00d5\u00030\u0018\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0005.\u0000\u0000\u00d9\u00db\u00030\u0018\u0000\u00da\u00d9\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0005\u0015\u0000\u0000\u00dd\u00df\u00030\u0018"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00f3\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u0018\f\u0000"+
		"\u00e1\u00e3\u0005.\u0000\u0000\u00e2\u00e4\u00030\u0018\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00f0"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\u0005\u0014\u0000\u0000\u00e6\u00e8"+
		"\u00030\u0018\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003"+
		"\u0018\f\u0000\u00ea\u00ec\u0005.\u0000\u0000\u00eb\u00ed\u00030\u0018"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00e0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0005\u0016\u0000\u0000\u00f6\u00f8\u00030\u0018\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\u0006\u0003\u0000"+
		"\u00fa\u0129\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u0004\u0000\u0000"+
		"\u00fc\u00fe\u00030\u0018\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u0103\u0005.\u0000\u0000\u0102\u0104\u00030\u0018\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0107\u0005\u0015\u0000\u0000\u0106\u0108\u0003"+
		"0\u0018\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u011c\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0018"+
		"\f\u0000\u010a\u010c\u0005.\u0000\u0000\u010b\u010d\u00030\u0018\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u0119\u0001\u0000\u0000\u0000\u010e\u0110\u0005\u0014\u0000\u0000"+
		"\u010f\u0111\u00030\u0018\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0003\u0018\f\u0000\u0113\u0115\u0005.\u0000\u0000\u0114\u0116"+
		"\u00030\u0018\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u010e\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0109\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0005\u0016\u0000\u0000\u011f\u0121\u0003"+
		"0\u0018\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0003\u0010"+
		"\b\u0000\u0123\u0125\u00030\u0018\u0000\u0124\u0123\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0003\b\u0004\u0000\u0127\u0129\u0001\u0000\u0000\u0000"+
		"\u0128\u00d2\u0001\u0000\u0000\u0000\u0128\u00fb\u0001\u0000\u0000\u0000"+
		"\u0129\u000f\u0001\u0000\u0000\u0000\u012a\u012c\u0005-\u0000\u0000\u012b"+
		"\u012d\u00030\u0018\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u00034\u001a\u0000\u012f\u0131\u00030\u0018\u0000\u0130\u012f\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0011\u0001\u0000"+
		"\u0000\u0000\u0132\u0135\u0003\u0014\n\u0000\u0133\u0135\u0003\u0016\u000b"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0013\u0001\u0000\u0000\u0000\u0136\u0137\u0006\n\uffff\uffff"+
		"\u0000\u0137\u0139\u0005\u0015\u0000\u0000\u0138\u013a\u00030\u0018\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0003\u0014\n\u0000\u013c"+
		"\u013e\u00030\u0018\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\u0016\u0000\u0000\u0140\u0157\u0001\u0000\u0000\u0000\u0141\u0157"+
		"\u0003\u001a\r\u0000\u0142\u0152\u0005.\u0000\u0000\u0143\u0145\u0003"+
		"0\u0018\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0005\u0019"+
		"\u0000\u0000\u0147\u0149\u00030\u0018\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0003\u0014\n\u0000\u014b\u014d\u00030\u0018\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u001a\u0000\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0144\u0001\u0000\u0000\u0000"+
		"\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0157\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0157\u0003*\u0015\u0000\u0156"+
		"\u0136\u0001\u0000\u0000\u0000\u0156\u0141\u0001\u0000\u0000\u0000\u0156"+
		"\u0142\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u016c\u0001\u0000\u0000\u0000\u0158\u015a\n\u0004\u0000\u0000\u0159\u015b"+
		"\u00030\u0018\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0007"+
		"\u0000\u0000\u0000\u015d\u015f\u00030\u0018\u0000\u015e\u015d\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u016b\u0003\u0014\n\u0005\u0161\u0163\n\u0003\u0000"+
		"\u0000\u0162\u0164\u00030\u0018\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0007\u0001\u0000\u0000\u0166\u0168\u00030\u0018\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0003\u0014\n\u0004\u016a\u0158"+
		"\u0001\u0000\u0000\u0000\u016a\u0161\u0001\u0000\u0000\u0000\u016b\u016e"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u0015\u0001\u0000\u0000\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0006\u000b\uffff\uffff\u0000\u0170"+
		"\u0172\u0005\u0015\u0000\u0000\u0171\u0173\u00030\u0018\u0000\u0172\u0171"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0176\u0003\u0016\u000b\u0000\u0175\u0177"+
		"\u00030\u0018\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005"+
		"\u0016\u0000\u0000\u0179\u019e\u0001\u0000\u0000\u0000\u017a\u019e\u0003"+
		"\u001a\r\u0000\u017b\u018b\u0005.\u0000\u0000\u017c\u017e\u00030\u0018"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0005\u0019\u0000"+
		"\u0000\u0180\u0182\u00030\u0018\u0000\u0181\u0180\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u0185\u0003\u0014\n\u0000\u0184\u0186\u00030\u0018\u0000\u0185"+
		"\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u001a\u0000\u0000\u0188"+
		"\u018a\u0001\u0000\u0000\u0000\u0189\u017d\u0001\u0000\u0000\u0000\u018a"+
		"\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u019e\u0001\u0000\u0000\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018e\u0190\u0005\'\u0000\u0000\u018f\u0191"+
		"\u00030\u0018\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u019e\u0003"+
		"\u0016\u000b\u0004\u0193\u0195\u0003\u0014\n\u0000\u0194\u0196\u00030"+
		"\u0018\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u00036\u001b"+
		"\u0000\u0198\u019a\u00030\u0018\u0000\u0199\u0198\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0003\u0014\n\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d"+
		"\u016f\u0001\u0000\u0000\u0000\u019d\u017a\u0001\u0000\u0000\u0000\u019d"+
		"\u017b\u0001\u0000\u0000\u0000\u019d\u018e\u0001\u0000\u0000\u0000\u019d"+
		"\u0193\u0001\u0000\u0000\u0000\u019e\u01b3\u0001\u0000\u0000\u0000\u019f"+
		"\u01a1\n\u0002\u0000\u0000\u01a0\u01a2\u00030\u0018\u0000\u01a1\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a5\u0005\u001e\u0000\u0000\u01a4\u01a6"+
		"\u00030\u0018\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01b2\u0003"+
		"\u0016\u000b\u0003\u01a8\u01aa\n\u0001\u0000\u0000\u01a9\u01ab\u00030"+
		"\u0018\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0005\u001f"+
		"\u0000\u0000\u01ad\u01af\u00030\u0018\u0000\u01ae\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b2\u0003\u0016\u000b\u0002\u01b1\u019f\u0001\u0000\u0000"+
		"\u0000\u01b1\u01a8\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u0017\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u00034\u001a\u0000\u01b7\u01b8\u00030\u0018\u0000\u01b8"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u0019\u0001\u0000\u0000\u0000\u01bb"+
		"\u01c2\u0003\u001c\u000e\u0000\u01bc\u01c2\u0003\u001e\u000f\u0000\u01bd"+
		"\u01c2\u0003 \u0010\u0000\u01be\u01c2\u0003\"\u0011\u0000\u01bf\u01c2"+
		"\u0003$\u0012\u0000\u01c0\u01c2\u0003&\u0013\u0000\u01c1\u01bb\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bc\u0001\u0000\u0000\u0000\u01c1\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u001b\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c5\u0005\u0005\u0000\u0000\u01c4\u01c6\u00030\u0018"+
		"\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005\u0015\u0000"+
		"\u0000\u01c8\u01ca\u00030\u0018\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cd\u0003\u0014\n\u0000\u01cc\u01ce\u00030\u0018\u0000\u01cd"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005\u0014\u0000\u0000\u01d0"+
		"\u01d2\u00030\u0018\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0003\u0014\n\u0000\u01d4\u01d6\u00030\u0018\u0000\u01d5\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0005\u0016\u0000\u0000\u01d8\u001d\u0001"+
		"\u0000\u0000\u0000\u01d9\u01db\u0005\u0006\u0000\u0000\u01da\u01dc\u0003"+
		"0\u0018\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0005\u0015"+
		"\u0000\u0000\u01de\u01e0\u00030\u0018\u0000\u01df\u01de\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e3\u0003\u0014\n\u0000\u01e2\u01e4\u00030\u0018\u0000"+
		"\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005\u0016\u0000\u0000"+
		"\u01e6\u001f\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005\u0007\u0000\u0000"+
		"\u01e8\u01ea\u00030\u0018\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ed\u0005\u0015\u0000\u0000\u01ec\u01ee\u00030\u0018\u0000\u01ed\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u01fa\u0003\u0014\n\u0000\u01f0\u01f2\u0003"+
		"0\u0018\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005\u0014"+
		"\u0000\u0000\u01f4\u01f6\u00030\u0018\u0000\u01f5\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f9\u0003\u0014\n\u0000\u01f8\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd\u01ff\u00030\u0018\u0000\u01fe"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u0016\u0000\u0000\u0201"+
		"!\u0001\u0000\u0000\u0000\u0202\u0204\u0005\b\u0000\u0000\u0203\u0205"+
		"\u00030\u0018\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0005"+
		"\u0015\u0000\u0000\u0207\u0209\u00030\u0018\u0000\u0208\u0207\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0003\u0018\f\u0000\u020b\u021b\u0005.\u0000"+
		"\u0000\u020c\u020e\u00030\u0018\u0000\u020d\u020c\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u0005\u0019\u0000\u0000\u0210\u0212\u00030\u0018\u0000\u0211"+
		"\u0210\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0001\u0000\u0000\u0000\u0213\u0215\u0003\u0014\n\u0000\u0214\u0216"+
		"\u00030\u0018\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0005"+
		"\u001a\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u020d\u0001"+
		"\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021f\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0220\u0003"+
		"0\u0018\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u022a\u0005\u0016"+
		"\u0000\u0000\u0222\u0224\u00030\u0018\u0000\u0223\u0222\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000"+
		"\u0000\u0225\u0227\u0005\u001d\u0000\u0000\u0226\u0228\u00030\u0018\u0000"+
		"\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022b\u0003\u0012\t\u0000\u022a"+
		"\u0223\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b"+
		"#\u0001\u0000\u0000\u0000\u022c\u022e\u0005\t\u0000\u0000\u022d\u022f"+
		"\u00030\u0018\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0005"+
		"\u0015\u0000\u0000\u0231\u0233\u00030\u0018\u0000\u0232\u0231\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0236\u0003\u0016\u000b\u0000\u0235\u0237\u00030\u0018"+
		"\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u0016\u0000"+
		"\u0000\u0239%\u0001\u0000\u0000\u0000\u023a\u023c\u0005.\u0000\u0000\u023b"+
		"\u023d\u00030\u0018\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0240"+
		"\u0005\u0015\u0000\u0000\u023f\u0241\u00030\u0018\u0000\u0240\u023f\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0253\u0001"+
		"\u0000\u0000\u0000\u0242\u0244\u0003\u0014\n\u0000\u0243\u0245\u00030"+
		"\u0018\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245\u0250\u0001\u0000\u0000\u0000\u0246\u0248\u0005\u0014"+
		"\u0000\u0000\u0247\u0249\u00030\u0018\u0000\u0248\u0247\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000"+
		"\u0000\u024a\u024c\u0003\u0014\n\u0000\u024b\u024d\u00030\u0018\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u0246\u0001\u0000\u0000\u0000"+
		"\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0242\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000"+
		"\u0255\u0257\u00030\u0018\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0005\u0016\u0000\u0000\u0259\'\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0005\n\u0000\u0000\u025b\u025c\u0005\u0015\u0000\u0000\u025c\u025d\u0003"+
		"\u0002\u0001\u0000\u025d\u025e\u0005\u0016\u0000\u0000\u025e)\u0001\u0000"+
		"\u0000\u0000\u025f\u0264\u0005\u001b\u0000\u0000\u0260\u0264\u00032\u0019"+
		"\u0000\u0261\u0264\u0005.\u0000\u0000\u0262\u0264\u0005/\u0000\u0000\u0263"+
		"\u025f\u0001\u0000\u0000\u0000\u0263\u0260\u0001\u0000\u0000\u0000\u0263"+
		"\u0261\u0001\u0000\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264"+
		"+\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u000f\u0000\u0000\u0266-\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0007\u0002\u0000\u0000\u0268/\u0001\u0000"+
		"\u0000\u0000\u0269\u026b\u0007\u0002\u0000\u0000\u026a\u0269\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d1\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0007\u0003\u0000\u0000\u026f3\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0006\u001a\uffff\uffff\u0000\u0271\u0276\u0005\u000b\u0000"+
		"\u0000\u0272\u0276\u0005\f\u0000\u0000\u0273\u0276\u0005\r\u0000\u0000"+
		"\u0274\u0276\u0005\u000e\u0000\u0000\u0275\u0270\u0001\u0000\u0000\u0000"+
		"\u0275\u0272\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000"+
		"\u0275\u0274\u0001\u0000\u0000\u0000\u0276\u027e\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\n\u0001\u0000\u0000\u0278\u0279\u0005\u0019\u0000\u0000\u0279"+
		"\u027a\u0003\u0014\n\u0000\u027a\u027b\u0005\u001a\u0000\u0000\u027b\u027d"+
		"\u0001\u0000\u0000\u0000\u027c\u0277\u0001\u0000\u0000\u0000\u027d\u0280"+
		"\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0001\u0000\u0000\u0000\u027f5\u0001\u0000\u0000\u0000\u0280\u027e\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u0007\u0004\u0000\u0000\u02827\u0001\u0000"+
		"\u0000\u0000~DFXbflptx|\u0080\u0083\u0087\u008b\u008f\u0093\u0097\u009b"+
		"\u009e\u00a0\u00a4\u00a8\u00ac\u00b0\u00b2\u00b6\u00ba\u00bd\u00c0\u00c4"+
		"\u00c7\u00ca\u00ce\u00d6\u00da\u00de\u00e3\u00e7\u00ec\u00f0\u00f3\u00f7"+
		"\u00ff\u0103\u0107\u010c\u0110\u0115\u0119\u011c\u0120\u0124\u0128\u012c"+
		"\u0130\u0134\u0139\u013d\u0144\u0148\u014c\u0152\u0156\u015a\u015e\u0163"+
		"\u0167\u016a\u016c\u0172\u0176\u017d\u0181\u0185\u018b\u0190\u0195\u0199"+
		"\u019d\u01a1\u01a5\u01aa\u01ae\u01b1\u01b3\u01b9\u01c1\u01c5\u01c9\u01cd"+
		"\u01d1\u01d5\u01db\u01df\u01e3\u01e9\u01ed\u01f1\u01f5\u01fa\u01fe\u0204"+
		"\u0208\u020d\u0211\u0215\u021b\u021f\u0223\u0227\u022a\u022e\u0232\u0236"+
		"\u023c\u0240\u0244\u0248\u024c\u0250\u0253\u0256\u0263\u026c\u0275\u027e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}