// Generated from /mnt/Abanoub/Programming/Comp407-Compiler/labs/lab02/grammar/lab02.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lab02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SingleLineComment=10, Int_type=11, Double_type=12, ID=13, INT=14, DOUBLE=15, 
		OPR=16, BOPR=17, WS=18;
	public static final int
		RULE_dec = 0, RULE_dec1 = 1, RULE_dec2 = 2, RULE_dec3 = 3, RULE_dec4 = 4, 
		RULE_if_ = 5, RULE_cond = 6, RULE_else_ = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"dec", "dec1", "dec2", "dec3", "dec4", "if_", "cond", "else_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "','", "'if'", "'('", "')'", "'{'", "'}'", "'else'", 
			null, "'int'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SingleLineComment", 
			"Int_type", "Double_type", "ID", "INT", "DOUBLE", "OPR", "BOPR", "WS"
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
	public String getGrammarFileName() { return "lab02.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lab02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public Dec1Context dec1() {
			return getRuleContext(Dec1Context.class,0);
		}
		public Dec2Context dec2() {
			return getRuleContext(Dec2Context.class,0);
		}
		public Dec3Context dec3() {
			return getRuleContext(Dec3Context.class,0);
		}
		public Dec4Context dec4() {
			return getRuleContext(Dec4Context.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dec);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				dec1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				dec2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				dec3();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				dec4();
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
	public static class Dec1Context extends ParserRuleContext {
		public TerminalNode Int_type() { return getToken(lab02Parser.Int_type, 0); }
		public TerminalNode ID() { return getToken(lab02Parser.ID, 0); }
		public TerminalNode INT() { return getToken(lab02Parser.INT, 0); }
		public Dec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec1; }
	}

	public final Dec1Context dec1() throws RecognitionException {
		Dec1Context _localctx = new Dec1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(Int_type);
			setState(23);
			match(ID);
			setState(24);
			match(T__0);
			setState(25);
			match(INT);
			setState(26);
			match(T__1);
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
	public static class Dec2Context extends ParserRuleContext {
		public TerminalNode Double_type() { return getToken(lab02Parser.Double_type, 0); }
		public TerminalNode ID() { return getToken(lab02Parser.ID, 0); }
		public TerminalNode DOUBLE() { return getToken(lab02Parser.DOUBLE, 0); }
		public Dec2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec2; }
	}

	public final Dec2Context dec2() throws RecognitionException {
		Dec2Context _localctx = new Dec2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(Double_type);
			setState(29);
			match(ID);
			setState(30);
			match(T__0);
			setState(31);
			match(DOUBLE);
			setState(32);
			match(T__1);
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
	public static class Dec3Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lab02Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lab02Parser.ID, i);
		}
		public TerminalNode Int_type() { return getToken(lab02Parser.Int_type, 0); }
		public TerminalNode Double_type() { return getToken(lab02Parser.Double_type, 0); }
		public Dec3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec3; }
	}

	public final Dec3Context dec3() throws RecognitionException {
		Dec3Context _localctx = new Dec3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==Int_type || _la==Double_type) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(36);
				match(T__2);
				setState(37);
				match(ID);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__1);
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
	public static class Dec4Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lab02Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lab02Parser.ID, i);
		}
		public TerminalNode Int_type() { return getToken(lab02Parser.Int_type, 0); }
		public TerminalNode Double_type() { return getToken(lab02Parser.Double_type, 0); }
		public List<TerminalNode> OPR() { return getTokens(lab02Parser.OPR); }
		public TerminalNode OPR(int i) {
			return getToken(lab02Parser.OPR, i);
		}
		public Dec4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec4; }
	}

	public final Dec4Context dec4() throws RecognitionException {
		Dec4Context _localctx = new Dec4Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==Int_type || _la==Double_type) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(46);
			match(ID);
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPR) {
				{
				{
				setState(49);
				match(OPR);
				setState(50);
				match(ID);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__1);
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
	public static class If_Context extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__3);
			setState(59);
			match(T__4);
			setState(60);
			cond();
			setState(61);
			match(T__5);
			setState(62);
			match(T__6);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Int_type || _la==Double_type) {
				{
				{
				setState(63);
				dec();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__7);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(70);
				else_();
				}
			}

			System.out.print((((If_Context)_localctx).cond!=null?_input.getText(((If_Context)_localctx).cond.start,((If_Context)_localctx).cond.stop):null));
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode BOPR() { return getToken(lab02Parser.BOPR, 0); }
		public List<TerminalNode> ID() { return getTokens(lab02Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lab02Parser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(lab02Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(lab02Parser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(lab02Parser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(lab02Parser.DOUBLE, i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			match(BOPR);
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
	public static class Else_Context extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__8);
			setState(80);
			match(T__6);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Int_type || _la==Double_type) {
				{
				{
				setState(81);
				dec();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__7);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\'\b\u0003\n\u0003"+
		"\f\u0003*\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00044\b\u0004\n\u0004"+
		"\f\u00047\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005A\b\u0005\n\u0005"+
		"\f\u0005D\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007S\b\u0007\n\u0007\f\u0007V\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0002\u0001\u0000\u000b\f\u0001\u0000\r\u000fY\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004"+
		"\u001c\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b-\u0001"+
		"\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000"+
		"\u000eO\u0001\u0000\u0000\u0000\u0010\u0015\u0003\u0002\u0001\u0000\u0011"+
		"\u0015\u0003\u0004\u0002\u0000\u0012\u0015\u0003\u0006\u0003\u0000\u0013"+
		"\u0015\u0003\b\u0004\u0000\u0014\u0010\u0001\u0000\u0000\u0000\u0014\u0011"+
		"\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0005\u000b\u0000\u0000\u0017\u0018\u0005\r\u0000\u0000\u0018\u0019\u0005"+
		"\u0001\u0000\u0000\u0019\u001a\u0005\u000e\u0000\u0000\u001a\u001b\u0005"+
		"\u0002\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\f\u0000\u0000\u001d\u001e\u0005\r\u0000\u0000\u001e\u001f\u0005\u0001"+
		"\u0000\u0000\u001f \u0005\u000f\u0000\u0000 !\u0005\u0002\u0000\u0000"+
		"!\u0005\u0001\u0000\u0000\u0000\"#\u0007\u0000\u0000\u0000#(\u0005\r\u0000"+
		"\u0000$%\u0005\u0003\u0000\u0000%\'\u0005\r\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0002\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-.\u0007\u0000"+
		"\u0000\u0000./\u0005\r\u0000\u0000/0\u0005\u0001\u0000\u000005\u0005\r"+
		"\u0000\u000012\u0005\u0010\u0000\u000024\u0005\r\u0000\u000031\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0005\u0002\u0000\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000"+
		"\u0000;<\u0005\u0005\u0000\u0000<=\u0003\f\u0006\u0000=>\u0005\u0006\u0000"+
		"\u0000>B\u0005\u0007\u0000\u0000?A\u0003\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EG\u0005\b\u0000\u0000FH\u0003\u000e\u0007\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0005\uffff"+
		"\uffff\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0007\u0001\u0000\u0000"+
		"LM\u0005\u0011\u0000\u0000MN\u0007\u0001\u0000\u0000N\r\u0001\u0000\u0000"+
		"\u0000OP\u0005\t\u0000\u0000PT\u0005\u0007\u0000\u0000QS\u0003\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000WX\u0005\b\u0000\u0000X\u000f\u0001\u0000\u0000\u0000"+
		"\u0006\u0014(5BGT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}