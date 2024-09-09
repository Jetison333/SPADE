// Generated from /home/jan-Sopi/Documents/mathSyntax/mathSyntax/grammar/math.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DEFINITION=7, BIN_OP=8, 
		BUILT_IN=9, TERM=10, WS=11, CM=12;
	public static final int
		RULE_start = 0, RULE_format = 1, RULE_constraint = 2, RULE_object = 3, 
		RULE_set = 4, RULE_list = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "format", "constraint", "object", "set", "list"
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

	@Override
	public String getGrammarFileName() { return "math.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mathParser.EOF, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(mathParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(mathParser.CM, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			format();
			setState(13);
			match(T__0);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERM) {
				{
				setState(14);
				constraint();
				}
			}

			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(17);
				match(CM);
				setState(18);
				constraint();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
	public static class FormatContext extends ParserRuleContext {
		public List<FormatContext> format() {
			return getRuleContexts(FormatContext.class);
		}
		public FormatContext format(int i) {
			return getRuleContext(FormatContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(mathParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(mathParser.CM, i);
		}
		public List<TerminalNode> TERM() { return getTokens(mathParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(mathParser.TERM, i);
		}
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_format);
		int _la;
		try {
			int _alt;
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__1);
				setState(27);
				format();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CM) {
					{
					{
					setState(28);
					match(CM);
					setState(29);
					format();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__3);
				setState(38);
				format();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CM) {
					{
					{
					setState(39);
					match(CM);
					setState(40);
					format();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__4);
				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(TERM);
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(49);
						match(CM);
						setState(50);
						match(TERM);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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
	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(mathParser.TERM, 0); }
		public TerminalNode DEFINITION() { return getToken(mathParser.DEFINITION, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(TERM);
			setState(59);
			match(DEFINITION);
			setState(60);
			object(0);
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
	public static class ObjectContext extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode TERM() { return getToken(mathParser.TERM, 0); }
		public TerminalNode BUILT_IN() { return getToken(mathParser.BUILT_IN, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode BIN_OP() { return getToken(mathParser.BIN_OP, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		return object(0);
	}

	private ObjectContext object(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjectContext _localctx = new ObjectContext(_ctx, _parentState);
		ObjectContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_object, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(63);
				set();
				}
				break;
			case T__3:
				{
				setState(64);
				list();
				}
				break;
			case TERM:
				{
				setState(65);
				match(TERM);
				}
				break;
			case BUILT_IN:
				{
				setState(66);
				match(BUILT_IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjectContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_object);
					setState(69);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(70);
					match(BIN_OP);
					setState(71);
					object(6);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class SetContext extends ParserRuleContext {
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(mathParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(mathParser.CM, i);
		}
		public List<TerminalNode> TERM() { return getTokens(mathParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(mathParser.TERM, i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__1);
				setState(78);
				format();
				setState(79);
				match(T__5);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERM) {
					{
					setState(80);
					constraint();
					}
				}

				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CM) {
					{
					{
					setState(83);
					match(CM);
					setState(84);
					constraint();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__1);
				setState(93);
				match(TERM);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CM) {
					{
					{
					setState(94);
					match(CM);
					setState(95);
					match(TERM);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__2);
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
	public static class ListContext extends ParserRuleContext {
		public List<TerminalNode> TERM() { return getTokens(mathParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(mathParser.TERM, i);
		}
		public List<TerminalNode> CM() { return getTokens(mathParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(mathParser.CM, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__3);
			setState(105);
			match(TERM);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(106);
				match(CM);
				setState(107);
				match(TERM);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__4);
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
		case 3:
			return object_sempred((ObjectContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean object_sempred(ObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\ft\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t"+
		"\u0001\u0003\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003D\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003"+
		"\n\u0003\f\u0003L\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004"+
		"\f\u0004Y\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004\u0001"+
		"\u0004\u0003\u0004g\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0000\u0001\u0006\u0006\u0000\u0002\u0004\u0006\b\n"+
		"\u0000\u0000}\u0000\f\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000"+
		"\u0000\u0004:\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\b"+
		"f\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001"+
		"\u0000\r\u000f\u0005\u0001\u0000\u0000\u000e\u0010\u0003\u0004\u0002\u0000"+
		"\u000f\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0015\u0001\u0000\u0000\u0000\u0011\u0012\u0005\f\u0000\u0000\u0012"+
		"\u0014\u0003\u0004\u0002\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014"+
		"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b"+
		" \u0003\u0002\u0001\u0000\u001c\u001d\u0005\f\u0000\u0000\u001d\u001f"+
		"\u0003\u0002\u0001\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0003"+
		"\u0000\u0000$9\u0001\u0000\u0000\u0000%&\u0005\u0004\u0000\u0000&+\u0003"+
		"\u0002\u0001\u0000\'(\u0005\f\u0000\u0000(*\u0003\u0002\u0001\u0000)\'"+
		"\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000./\u0005\u0005\u0000\u0000/9\u0001\u0000\u0000\u000005\u0005"+
		"\n\u0000\u000012\u0005\f\u0000\u000024\u0005\n\u0000\u000031\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"8\u001a\u0001\u0000\u0000\u00008%\u0001\u0000\u0000\u000080\u0001\u0000"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000;<\u0005"+
		"\u0007\u0000\u0000<=\u0003\u0006\u0003\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>?\u0006\u0003\uffff\uffff\u0000?D\u0003\b\u0004\u0000@D\u0003\n"+
		"\u0005\u0000AD\u0005\n\u0000\u0000BD\u0005\t\u0000\u0000C>\u0001\u0000"+
		"\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000DJ\u0001\u0000\u0000\u0000EF\n\u0005\u0000\u0000FG\u0005"+
		"\b\u0000\u0000GI\u0003\u0006\u0003\u0006HE\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u0007\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0002"+
		"\u0000\u0000NO\u0003\u0002\u0001\u0000OQ\u0005\u0006\u0000\u0000PR\u0003"+
		"\u0004\u0002\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RW\u0001\u0000\u0000\u0000ST\u0005\f\u0000\u0000TV\u0003\u0004\u0002\u0000"+
		"US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0003\u0000\u0000[g\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0002\u0000\u0000]b\u0005\n\u0000\u0000^_\u0005\f\u0000\u0000_a\u0005"+
		"\n\u0000\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000eg\u0005\u0003\u0000\u0000fM\u0001\u0000\u0000"+
		"\u0000f\\\u0001\u0000\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\u0004"+
		"\u0000\u0000in\u0005\n\u0000\u0000jk\u0005\f\u0000\u0000km\u0005\n\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qr\u0005\u0005\u0000\u0000r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000f\u0015 +58CJQWbfn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}