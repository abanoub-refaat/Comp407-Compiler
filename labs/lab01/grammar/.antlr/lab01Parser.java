// Generated from /mnt/Abanoub/Programming/Comp407-Compiler/labs/lab01/grammar/lab01.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lab01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Double_type=2, Int_type=3, ID=4, INT=5, DOUBLE=6;
	public static final int
		RULE_dec1 = 0, RULE_dec2 = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"dec1", "dec2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'double'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Double_type", "Int_type", "ID", "INT", "DOUBLE"
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
	public String getGrammarFileName() { return "lab01.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lab01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec1Context extends ParserRuleContext {
		public List<TerminalNode> Int_type() { return getTokens(lab01Parser.Int_type); }
		public TerminalNode Int_type(int i) {
			return getToken(lab01Parser.Int_type, i);
		}
		public TerminalNode ID() { return getToken(lab01Parser.ID, 0); }
		public Dec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec1; }
	}

	public final Dec1Context dec1() throws RecognitionException {
		Dec1Context _localctx = new Dec1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_dec1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(Int_type);
			setState(5);
			match(ID);
			setState(6);
			match(T__0);
			setState(7);
			match(Int_type);
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
		public List<TerminalNode> Double_type() { return getTokens(lab01Parser.Double_type); }
		public TerminalNode Double_type(int i) {
			return getToken(lab01Parser.Double_type, i);
		}
		public TerminalNode ID() { return getToken(lab01Parser.ID, 0); }
		public Dec2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec2; }
	}

	public final Dec2Context dec2() throws RecognitionException {
		Dec2Context _localctx = new Dec2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(Double_type);
			setState(10);
			match(ID);
			setState(11);
			match(T__0);
			setState(12);
			match(Double_type);
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
		"\u0004\u0001\u0006\u000f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000"+
		"\u0002\u0000\u0002\u0000\u0000\f\u0000\u0004\u0001\u0000\u0000\u0000\u0002"+
		"\t\u0001\u0000\u0000\u0000\u0004\u0005\u0005\u0003\u0000\u0000\u0005\u0006"+
		"\u0005\u0004\u0000\u0000\u0006\u0007\u0005\u0001\u0000\u0000\u0007\b\u0005"+
		"\u0003\u0000\u0000\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005\u0002\u0000"+
		"\u0000\n\u000b\u0005\u0004\u0000\u0000\u000b\f\u0005\u0001\u0000\u0000"+
		"\f\r\u0005\u0002\u0000\u0000\r\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}