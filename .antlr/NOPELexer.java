// Generated from /mnt/D/teoria_kompilacji/nope/NOPE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NOPELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		COM=10, SPACE=11, ENDL=12, SEP=13, LP=14, RP=15, NUMB=16, STR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"COM", "SPACE", "ENDL", "SEP", "LP", "RP", "NUMB", "STR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'RANGE'", "'MATCH'", "'ANYOF'", "'THROWS'", "'VAR'", "'CHECK'", 
			"'DEF'", "'REP'", "'C_HEADER'", null, null, null, "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "COM", "SPACE", 
			"ENDL", "SEP", "LP", "RP", "NUMB", "STR"
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


	public NOPELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NOPE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\n\u0004\n`\b\n\u000b\n\f\na\u0001\u000b"+
		"\u0004\u000be\b\u000b\u000b\u000b\f\u000bf\u0001\u000b\u0004\u000bj\b"+
		"\u000b\u000b\u000b\f\u000bk\u0003\u000bn\b\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000fw\b\u000f\u0001"+
		"\u000f\u0004\u000fz\b\u000f\u000b\u000f\f\u000f{\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0080\b\u000f\n\u000f\f\u000f\u0083\t\u000f\u0003\u000f\u0085"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0089\b\u0010\n\u0010\f\u0010"+
		"\u008c\t\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0090\b\u0010\u000b"+
		"\u0010\f\u0010\u0091\u0003\u0010\u0094\b\u0010\u0001\u008a\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0002\u0000\n\n\r\r"+
		"\u0002\u0000\t\t  \u0001\u000009\u0006\u0000\t\n\r\r  ##(),,\u00a0\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t"+
		"<\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rF\u0001\u0000"+
		"\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000"+
		"\u0013W\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017m"+
		"\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000"+
		"\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000"+
		"!\u0093\u0001\u0000\u0000\u0000#$\u0005R\u0000\u0000$%\u0005A\u0000\u0000"+
		"%&\u0005N\u0000\u0000&\'\u0005G\u0000\u0000\'(\u0005E\u0000\u0000(\u0002"+
		"\u0001\u0000\u0000\u0000)*\u0005M\u0000\u0000*+\u0005A\u0000\u0000+,\u0005"+
		"T\u0000\u0000,-\u0005C\u0000\u0000-.\u0005H\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/0\u0005A\u0000\u000001\u0005N\u0000\u000012\u0005Y\u0000"+
		"\u000023\u0005O\u0000\u000034\u0005F\u0000\u00004\u0006\u0001\u0000\u0000"+
		"\u000056\u0005T\u0000\u000067\u0005H\u0000\u000078\u0005R\u0000\u0000"+
		"89\u0005O\u0000\u00009:\u0005W\u0000\u0000:;\u0005S\u0000\u0000;\b\u0001"+
		"\u0000\u0000\u0000<=\u0005V\u0000\u0000=>\u0005A\u0000\u0000>?\u0005R"+
		"\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005C\u0000\u0000AB\u0005H"+
		"\u0000\u0000BC\u0005E\u0000\u0000CD\u0005C\u0000\u0000DE\u0005K\u0000"+
		"\u0000E\f\u0001\u0000\u0000\u0000FG\u0005D\u0000\u0000GH\u0005E\u0000"+
		"\u0000HI\u0005F\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005R\u0000"+
		"\u0000KL\u0005E\u0000\u0000LM\u0005P\u0000\u0000M\u0010\u0001\u0000\u0000"+
		"\u0000NO\u0005C\u0000\u0000OP\u0005_\u0000\u0000PQ\u0005H\u0000\u0000"+
		"QR\u0005E\u0000\u0000RS\u0005A\u0000\u0000ST\u0005D\u0000\u0000TU\u0005"+
		"E\u0000\u0000UV\u0005R\u0000\u0000V\u0012\u0001\u0000\u0000\u0000W[\u0005"+
		"#\u0000\u0000XZ\b\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\\u0014\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0007\u0001"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0016\u0001\u0000\u0000"+
		"\u0000ce\u0007\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gn\u0001"+
		"\u0000\u0000\u0000hj\u0005\n\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000md\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000"+
		"\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005,\u0000\u0000p\u001a\u0001"+
		"\u0000\u0000\u0000qr\u0005(\u0000\u0000r\u001c\u0001\u0000\u0000\u0000"+
		"st\u0005)\u0000\u0000t\u001e\u0001\u0000\u0000\u0000uw\u0005-\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xz\u0007\u0002\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0084"+
		"\u0001\u0000\u0000\u0000}\u0081\u0005.\u0000\u0000~\u0080\u0007\u0002"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0084}\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085 \u0001\u0000\u0000\u0000\u0086\u008a\u0005\'\u0000\u0000\u0087"+
		"\u0089\t\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0094\u0005\'\u0000\u0000\u008e\u0090\b"+
		"\u0003\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0086\u0001"+
		"\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094\"\u0001\u0000"+
		"\u0000\u0000\r\u0000[afkmv{\u0081\u0084\u008a\u0091\u0093\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}