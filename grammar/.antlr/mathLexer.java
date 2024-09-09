// Generated from /home/jan-Sopi/Documents/mathSyntax/mathSyntax/grammar/math.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DEFINITION=7, BIN_OP=8, 
		BUILT_IN=9, TERM=10, WS=11, CM=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "DEFINITION", "BIN_OP", 
			"BUILT_IN", "TERM", "WS", "CM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'where'", "'{'", "'}'", "'('", "')'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DEFINITION", "BIN_OP", "BUILT_IN", 
			"TERM", "WS", "CM"
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


	public mathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "math.g4"; }

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
		"\u0004\u0000\fz\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u00065\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007M\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bk\b\b\u0001\t\u0004\tn\b\t\u000b\t\f\to\u0001\n\u0004"+
		"\ns\b\n\u000b\n\f\nt\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001\u0000\u0003"+
		"\u0004\u0000..09AZaz\u0003\u0000\t\n\r\r  \u0001\u0000,,\u0084\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000"+
		"\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b"+
		"\'\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000fL\u0001\u0000"+
		"\u0000\u0000\u0011j\u0001\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000"+
		"\u0015r\u0001\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005w\u0000\u0000\u001a\u001b\u0005h\u0000\u0000\u001b\u001c\u0005e"+
		"\u0000\u0000\u001c\u001d\u0005r\u0000\u0000\u001d\u001e\u0005e\u0000\u0000"+
		"\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005{\u0000\u0000 \u0004"+
		"\u0001\u0000\u0000\u0000!\"\u0005}\u0000\u0000\"\u0006\u0001\u0000\u0000"+
		"\u0000#$\u0005(\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005)\u0000"+
		"\u0000&\n\u0001\u0000\u0000\u0000\'(\u0005|\u0000\u0000(\f\u0001\u0000"+
		"\u0000\u0000)*\u0005i\u0000\u0000*5\u0005s\u0000\u0000+,\u0005i\u0000"+
		"\u0000,5\u0005n\u0000\u0000-5\u0005=\u0000\u0000./\u0005s\u0000\u0000"+
		"/0\u0005u\u0000\u000001\u0005b\u0000\u000012\u0005s\u0000\u000023\u0005"+
		"e\u0000\u000035\u0005t\u0000\u00004)\u0001\u0000\u0000\u00004+\u0001\u0000"+
		"\u0000\u00004-\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u00005\u000e"+
		"\u0001\u0000\u0000\u000067\u0005u\u0000\u000078\u0005n\u0000\u000089\u0005"+
		"i\u0000\u00009:\u0005o\u0000\u0000:M\u0005n\u0000\u0000;<\u0005i\u0000"+
		"\u0000<=\u0005n\u0000\u0000=>\u0005t\u0000\u0000>?\u0005e\u0000\u0000"+
		"?@\u0005r\u0000\u0000@A\u0005s\u0000\u0000AB\u0005e\u0000\u0000BC\u0005"+
		"c\u0000\u0000CD\u0005t\u0000\u0000DE\u0005i\u0000\u0000EF\u0005o\u0000"+
		"\u0000FM\u0005n\u0000\u0000GH\u0005c\u0000\u0000HI\u0005r\u0000\u0000"+
		"IJ\u0005o\u0000\u0000JK\u0005s\u0000\u0000KM\u0005s\u0000\u0000L6\u0001"+
		"\u0000\u0000\u0000L;\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000"+
		"M\u0010\u0001\u0000\u0000\u0000NO\u0005s\u0000\u0000OP\u0005e\u0000\u0000"+
		"Pk\u0005t\u0000\u0000QR\u0005l\u0000\u0000RS\u0005i\u0000\u0000ST\u0005"+
		"s\u0000\u0000Tk\u0005t\u0000\u0000UV\u0005g\u0000\u0000VW\u0005r\u0000"+
		"\u0000WX\u0005a\u0000\u0000XY\u0005p\u0000\u0000Yk\u0005h\u0000\u0000"+
		"Z[\u0005w\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005"+
		"g\u0000\u0000^_\u0005h\u0000\u0000_`\u0005t\u0000\u0000`a\u0005e\u0000"+
		"\u0000ab\u0005d\u0000\u0000bc\u0005G\u0000\u0000cd\u0005r\u0000\u0000"+
		"de\u0005a\u0000\u0000ef\u0005p\u0000\u0000fk\u0005h\u0000\u0000gh\u0005"+
		"i\u0000\u0000hi\u0005n\u0000\u0000ik\u0005t\u0000\u0000jN\u0001\u0000"+
		"\u0000\u0000jQ\u0001\u0000\u0000\u0000jU\u0001\u0000\u0000\u0000jZ\u0001"+
		"\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000k\u0012\u0001\u0000\u0000"+
		"\u0000ln\u0007\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0014"+
		"\u0001\u0000\u0000\u0000qs\u0007\u0001\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0006\n\u0000\u0000w\u0016\u0001"+
		"\u0000\u0000\u0000xy\u0007\u0002\u0000\u0000y\u0018\u0001\u0000\u0000"+
		"\u0000\u0006\u00004Ljot\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}