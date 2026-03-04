// Generated from /mnt/Abanoub/Programming/Comp407-Compiler/labs/lab02/grammar/lab02.g by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class lab2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Linecomment=10, Int_type=11, Double_type=12, ID=13, INT=14, DOUBLE=15, 
		OPR=16, BOPR=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Linecomment", "Int_type", "Double_type", "ID", "INT", "DOUBLE", "OPR", 
			"BOPR", "WS"
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
			null, null, null, null, null, null, null, null, null, null, "Linecomment", 
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


	public lab2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lab02.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9:
			Linecomment_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Linecomment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0012z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t@\b\t"+
		"\n\t\f\tC\t\t\u0001\t\u0001\t\u0001\t\u0003\tH\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fY\b\f\n\f"+
		"\f\f\\\t\f\u0001\r\u0004\r_\b\r\u000b\r\f\r`\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010r\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011w\b\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0006\u0002\u0000\n\n\r\r\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000*+--//\u0002\u0000<<>>\u0003"+
		"\u0000\t\n\r\r  \u0082\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005"+
		")\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t.\u0001\u0000"+
		"\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r2\u0001\u0000\u0000\u0000"+
		"\u000f4\u0001\u0000\u0000\u0000\u00116\u0001\u0000\u0000\u0000\u0013;"+
		"\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017O\u0001\u0000"+
		"\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000"+
		"\u001db\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000!q\u0001"+
		"\u0000\u0000\u0000#v\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&\u0002"+
		"\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0004\u0001\u0000\u0000"+
		"\u0000)*\u0005,\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005f\u0000\u0000-\b\u0001\u0000\u0000\u0000./\u0005(\u0000"+
		"\u0000/\n\u0001\u0000\u0000\u000001\u0005)\u0000\u00001\f\u0001\u0000"+
		"\u0000\u000023\u0005{\u0000\u00003\u000e\u0001\u0000\u0000\u000045\u0005"+
		"}\u0000\u00005\u0010\u0001\u0000\u0000\u000067\u0005e\u0000\u000078\u0005"+
		"l\u0000\u000089\u0005s\u0000\u00009:\u0005e\u0000\u0000:\u0012\u0001\u0000"+
		"\u0000\u0000;<\u0005/\u0000\u0000<=\u0005/\u0000\u0000=A\u0001\u0000\u0000"+
		"\u0000>@\t\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BG\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DH\u0007\u0000\u0000\u0000EF\u0005"+
		"\r\u0000\u0000FH\u0005\n\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\t\u0000\u0000J\u0014"+
		"\u0001\u0000\u0000\u0000KL\u0005i\u0000\u0000LM\u0005n\u0000\u0000MN\u0005"+
		"t\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005d\u0000\u0000PQ\u0005"+
		"o\u0000\u0000QR\u0005u\u0000\u0000RS\u0005b\u0000\u0000ST\u0005l\u0000"+
		"\u0000TU\u0005e\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VZ\u0007\u0001"+
		"\u0000\u0000WY\u0007\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\u001a\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u000209\u0000"+
		"^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a\u001c\u0001\u0000\u0000\u0000bc\u0003"+
		"\u001b\r\u0000cd\u0005.\u0000\u0000de\u0003\u001b\r\u0000e\u001e\u0001"+
		"\u0000\u0000\u0000fg\u0007\u0003\u0000\u0000g \u0001\u0000\u0000\u0000"+
		"hi\u0005<\u0000\u0000ir\u0005=\u0000\u0000jr\u0007\u0004\u0000\u0000k"+
		"l\u0005>\u0000\u0000lr\u0005=\u0000\u0000mn\u0005=\u0000\u0000nr\u0005"+
		"=\u0000\u0000op\u0005!\u0000\u0000pr\u0005=\u0000\u0000qh\u0001\u0000"+
		"\u0000\u0000qj\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000qm\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000r\"\u0001\u0000\u0000\u0000"+
		"sw\u0007\u0005\u0000\u0000tu\u0005\r\u0000\u0000uw\u0005\n\u0000\u0000"+
		"vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0006\u0011\u0001\u0000y$\u0001\u0000\u0000\u0000\u0007\u0000"+
		"AGZ`qv\u0002\u0001\t\u0000\u0001\u0011\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}