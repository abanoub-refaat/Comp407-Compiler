// Generated from /mnt/Abanoub/Programming/Comp407-Compiler/resources/intro.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class introParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Int_type=18, Double_type=19, ID=20, INT=21, DOUBLE=22, OPR=23, BOPR=24, 
		WS=25;
	public static final int
		RULE_dec = 0, RULE_dec2 = 1, RULE_dec3 = 2, RULE_dec4 = 3, RULE_expr = 4, 
		RULE_term = 5, RULE_factor = 6, RULE_dec5 = 7, RULE_boolExpr = 8, RULE_boolTerm = 9, 
		RULE_boolFactor = 10, RULE_if_ = 11, RULE_while_ = 12, RULE_do_ = 13, 
		RULE_stmt = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"dec", "dec2", "dec3", "dec4", "expr", "term", "factor", "dec5", "boolExpr", 
			"boolTerm", "boolFactor", "if_", "while_", "do_", "stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"'||'", "'&&'", "'if'", "'{'", "'}'", "'else'", "'while'", "'do'", "'int'", 
			"'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Int_type", "Double_type", "ID", 
			"INT", "DOUBLE", "OPR", "BOPR", "WS"
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
	public String getGrammarFileName() { return "intro.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public introParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public TerminalNode Int_type() { return getToken(introParser.Int_type, 0); }
		public TerminalNode ID() { return getToken(introParser.ID, 0); }
		public TerminalNode INT() { return getToken(introParser.INT, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(Int_type);
			setState(31);
			match(ID);
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(32);
				match(T__0);
				setState(33);
				match(INT);
				setState(34);
				match(T__1);
				}
				break;
			case T__1:
				{
				setState(35);
				match(T__1);
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
	public static class Dec2Context extends ParserRuleContext {
		public TerminalNode Int_type() { return getToken(introParser.Int_type, 0); }
		public List<TerminalNode> ID() { return getTokens(introParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(introParser.ID, i);
		}
		public Dec2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec2; }
	}

	public final Dec2Context dec2() throws RecognitionException {
		Dec2Context _localctx = new Dec2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Int_type);
			setState(39);
			match(ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(40);
				match(T__2);
				setState(41);
				match(ID);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
		public TerminalNode Int_type() { return getToken(introParser.Int_type, 0); }
		public List<TerminalNode> ID() { return getTokens(introParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(introParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(introParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(introParser.INT, i);
		}
		public Dec3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec3; }
	}

	public final Dec3Context dec3() throws RecognitionException {
		Dec3Context _localctx = new Dec3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Int_type);
			setState(50);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(51);
				match(T__0);
				setState(52);
				match(INT);
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(55);
				match(T__2);
				setState(56);
				match(ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(57);
					match(T__0);
					setState(58);
					match(INT);
					}
				}

				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
		public TerminalNode ID() { return getToken(introParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dec4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec4; }
	}

	public final Dec4Context dec4() throws RecognitionException {
		Dec4Context _localctx = new Dec4Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__0);
			setState(70);
			expr();
			setState(71);
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
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			term();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				term();
				}
				}
				setState(80);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			factor();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(83);
				factor();
				}
				}
				setState(88);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(introParser.INT, 0); }
		public TerminalNode ID() { return getToken(introParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__7);
				setState(92);
				expr();
				setState(93);
				match(T__8);
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
	public static class Dec5Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(introParser.ID, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public Dec5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec5; }
	}

	public final Dec5Context dec5() throws RecognitionException {
		Dec5Context _localctx = new Dec5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(T__0);
			setState(99);
			boolExpr();
			setState(100);
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
	public static class BoolExprContext extends ParserRuleContext {
		public List<BoolTermContext> boolTerm() {
			return getRuleContexts(BoolTermContext.class);
		}
		public BoolTermContext boolTerm(int i) {
			return getRuleContext(BoolTermContext.class,i);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			boolTerm();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(103);
				match(T__9);
				setState(104);
				boolTerm();
				}
				}
				setState(109);
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
	public static class BoolTermContext extends ParserRuleContext {
		public List<BoolFactorContext> boolFactor() {
			return getRuleContexts(BoolFactorContext.class);
		}
		public BoolFactorContext boolFactor(int i) {
			return getRuleContext(BoolFactorContext.class,i);
		}
		public BoolTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolTerm; }
	}

	public final BoolTermContext boolTerm() throws RecognitionException {
		BoolTermContext _localctx = new BoolTermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			boolFactor();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(111);
				match(T__10);
				setState(112);
				boolFactor();
				}
				}
				setState(117);
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
	public static class BoolFactorContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BOPR() { return getToken(introParser.BOPR, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolFactor; }
	}

	public final BoolFactorContext boolFactor() throws RecognitionException {
		BoolFactorContext _localctx = new BoolFactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolFactor);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				expr();
				setState(119);
				match(BOPR);
				setState(120);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__7);
				setState(123);
				boolExpr();
				setState(124);
				match(T__8);
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
	public static class If_Context extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__11);
			setState(129);
			match(T__7);
			setState(130);
			boolExpr();
			setState(131);
			match(T__8);
			setState(132);
			match(T__12);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1511424L) != 0)) {
				{
				{
				setState(133);
				stmt();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__13);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					match(T__14);
					setState(141);
					match(T__11);
					setState(142);
					match(T__7);
					setState(143);
					boolExpr();
					setState(144);
					match(T__8);
					setState(145);
					match(T__12);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1511424L) != 0)) {
						{
						{
						setState(146);
						stmt();
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(152);
					match(T__13);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(159);
				match(T__14);
				setState(160);
				match(T__12);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1511424L) != 0)) {
					{
					{
					setState(161);
					stmt();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__13);
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
	public static class While_Context extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__15);
			setState(171);
			match(T__7);
			setState(172);
			boolExpr();
			setState(173);
			match(T__8);
			setState(174);
			match(T__12);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1511424L) != 0)) {
				{
				{
				setState(175);
				stmt();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__13);
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
	public static class Do_Context extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Do_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_; }
	}

	public final Do_Context do_() throws RecognitionException {
		Do_Context _localctx = new Do_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__16);
			setState(184);
			match(T__12);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1511424L) != 0)) {
				{
				{
				setState(185);
				stmt();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__13);
			setState(192);
			match(T__15);
			setState(193);
			match(T__7);
			setState(194);
			boolExpr();
			setState(195);
			match(T__8);
			setState(196);
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
	public static class StmtContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
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
		public Dec5Context dec5() {
			return getRuleContext(Dec5Context.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Do_Context do_() {
			return getRuleContext(Do_Context.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				dec2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				dec3();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				dec4();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				dec5();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				if_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				do_();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b"+
		"\u0001\n\u0001\f\u0001.\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0005\u0002>\b\u0002"+
		"\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"`\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\bj\b\b\n\b\f\bm\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\tr\b\t\n\t\f\tu\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u007f\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0087\b\u000b\n\u000b"+
		"\f\u000b\u008a\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0094\b\u000b"+
		"\n\u000b\f\u000b\u0097\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009b"+
		"\b\u000b\n\u000b\f\u000b\u009e\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00a3\b\u000b\n\u000b\f\u000b\u00a6\t\u000b\u0001\u000b\u0003"+
		"\u000b\u00a9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00b1\b\f\n\f\f\f\u00b4\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00bb\b\r\n\r\f\r\u00be\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cf\b\u000e\u0001"+
		"\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001\u0000\u0004\u0005\u0001"+
		"\u0000\u0006\u0007\u00db\u0000\u001e\u0001\u0000\u0000\u0000\u0002&\u0001"+
		"\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000"+
		"\u0000\bI\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\f_\u0001"+
		"\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000"+
		"\u0000\u0012n\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016"+
		"\u0080\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a"+
		"\u00b7\u0001\u0000\u0000\u0000\u001c\u00ce\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005\u0012\u0000\u0000\u001f$\u0005\u0014\u0000\u0000 !\u0005"+
		"\u0001\u0000\u0000!\"\u0005\u0015\u0000\u0000\"%\u0005\u0002\u0000\u0000"+
		"#%\u0005\u0002\u0000\u0000$ \u0001\u0000\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u0012\u0000\u0000\',\u0005"+
		"\u0014\u0000\u0000()\u0005\u0003\u0000\u0000)+\u0005\u0014\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000/0\u0005\u0002\u0000\u00000\u0003\u0001\u0000\u0000\u0000"+
		"12\u0005\u0012\u0000\u000025\u0005\u0014\u0000\u000034\u0005\u0001\u0000"+
		"\u000046\u0005\u0015\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006?\u0001\u0000\u0000\u000078\u0005\u0003\u0000\u00008;\u0005"+
		"\u0014\u0000\u00009:\u0005\u0001\u0000\u0000:<\u0005\u0015\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=7\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0002\u0000\u0000C\u0005\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0014\u0000\u0000EF\u0005\u0001\u0000\u0000FG\u0003\b\u0004"+
		"\u0000GH\u0005\u0002\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IN\u0003"+
		"\n\u0005\u0000JK\u0007\u0000\u0000\u0000KM\u0003\n\u0005\u0000LJ\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QV\u0003\f\u0006\u0000RS\u0007\u0001\u0000\u0000SU\u0003\f\u0006"+
		"\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y`\u0005\u0015\u0000\u0000Z`\u0005\u0014\u0000"+
		"\u0000[\\\u0005\b\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0005\t\u0000\u0000"+
		"^`\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000"+
		"\u0000_[\u0001\u0000\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\u0014"+
		"\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0003\u0010\b\u0000de\u0005\u0002"+
		"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fk\u0003\u0012\t\u0000gh\u0005"+
		"\n\u0000\u0000hj\u0003\u0012\t\u0000ig\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u0011\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ns\u0003\u0014"+
		"\n\u0000op\u0005\u000b\u0000\u0000pr\u0003\u0014\n\u0000qo\u0001\u0000"+
		"\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000t\u0013\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0003\b\u0004\u0000wx\u0005\u0018\u0000\u0000xy\u0003\b\u0004"+
		"\u0000y\u007f\u0001\u0000\u0000\u0000z{\u0005\b\u0000\u0000{|\u0003\u0010"+
		"\b\u0000|}\u0005\t\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~v\u0001"+
		"\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0015\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0082\u0005\b\u0000\u0000"+
		"\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084"+
		"\u0088\u0005\r\u0000\u0000\u0085\u0087\u0003\u001c\u000e\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u009c"+
		"\u0005\u000e\u0000\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d\u008e"+
		"\u0005\f\u0000\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090\u0003"+
		"\u0010\b\u0000\u0090\u0091\u0005\t\u0000\u0000\u0091\u0095\u0005\r\u0000"+
		"\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u000e\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u008c\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a8\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000f\u0000"+
		"\u0000\u00a0\u00a4\u0005\r\u0000\u0000\u00a1\u00a3\u0003\u001c\u000e\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0005\u000e\u0000\u0000\u00a8\u009f\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0017\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0010\b\u0000\u00ad\u00ae\u0005\t\u0000\u0000\u00ae\u00b2"+
		"\u0005\r\u0000\u0000\u00af\u00b1\u0003\u001c\u000e\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u000e\u0000\u0000\u00b6\u0019\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0011\u0000\u0000\u00b8\u00bc\u0005\r\u0000\u0000\u00b9\u00bb\u0003\u001c"+
		"\u000e\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0\u00c1\u0005\u0010"+
		"\u0000\u0000\u00c1\u00c2\u0005\b\u0000\u0000\u00c2\u00c3\u0003\u0010\b"+
		"\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c5\u0005\u0002\u0000\u0000"+
		"\u00c5\u001b\u0001\u0000\u0000\u0000\u00c6\u00cf\u0003\u0000\u0000\u0000"+
		"\u00c7\u00cf\u0003\u0002\u0001\u0000\u00c8\u00cf\u0003\u0004\u0002\u0000"+
		"\u00c9\u00cf\u0003\u0006\u0003\u0000\u00ca\u00cf\u0003\u000e\u0007\u0000"+
		"\u00cb\u00cf\u0003\u0016\u000b\u0000\u00cc\u00cf\u0003\u0018\f\u0000\u00cd"+
		"\u00cf\u0003\u001a\r\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00ce\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00c9"+
		"\u0001\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u0013$,5"+
		";?NV_ks~\u0088\u0095\u009c\u00a4\u00a8\u00b2\u00bc\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}