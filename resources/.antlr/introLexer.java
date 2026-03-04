// Generated from /mnt/Abanoub/Programming/Comp407-Compiler/resources/intro.g by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class introLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Int_type=18, Double_type=19, ID=20, INT=21, DOUBLE=22, OPR=23, BOPR=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"Int_type", "Double_type", "ID", "INT", "DOUBLE", "OPR", "BOPR", "WS"
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


	public introLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "intro.g"; }

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
		case 24:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0005\u0013n\b\u0013\n\u0013\f\u0013q\t\u0013"+
		"\u0001\u0014\u0004\u0014t\b\u0014\u000b\u0014\f\u0014u\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0080\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u008d\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0092\b\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u0019\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__a"+
		"z\u0004\u0000%%*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u009e\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000"+
		"\u00079\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001"+
		"\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000"+
		"\u0000\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015"+
		"H\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019N\u0001"+
		"\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000"+
		"\u0000\u001fW\u0001\u0000\u0000\u0000!]\u0001\u0000\u0000\u0000#`\u0001"+
		"\u0000\u0000\u0000%d\u0001\u0000\u0000\u0000\'k\u0001\u0000\u0000\u0000"+
		")s\u0001\u0000\u0000\u0000+w\u0001\u0000\u0000\u0000-\u007f\u0001\u0000"+
		"\u0000\u0000/\u008c\u0001\u0000\u0000\u00001\u0091\u0001\u0000\u0000\u0000"+
		"34\u0005=\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005;\u0000\u0000"+
		"6\u0004\u0001\u0000\u0000\u000078\u0005,\u0000\u00008\u0006\u0001\u0000"+
		"\u0000\u00009:\u0005+\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005-"+
		"\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005*\u0000\u0000>\f\u0001"+
		"\u0000\u0000\u0000?@\u0005/\u0000\u0000@\u000e\u0001\u0000\u0000\u0000"+
		"AB\u0005(\u0000\u0000B\u0010\u0001\u0000\u0000\u0000CD\u0005)\u0000\u0000"+
		"D\u0012\u0001\u0000\u0000\u0000EF\u0005|\u0000\u0000FG\u0005|\u0000\u0000"+
		"G\u0014\u0001\u0000\u0000\u0000HI\u0005&\u0000\u0000IJ\u0005&\u0000\u0000"+
		"J\u0016\u0001\u0000\u0000\u0000KL\u0005i\u0000\u0000LM\u0005f\u0000\u0000"+
		"M\u0018\u0001\u0000\u0000\u0000NO\u0005{\u0000\u0000O\u001a\u0001\u0000"+
		"\u0000\u0000PQ\u0005}\u0000\u0000Q\u001c\u0001\u0000\u0000\u0000RS\u0005"+
		"e\u0000\u0000ST\u0005l\u0000\u0000TU\u0005s\u0000\u0000UV\u0005e\u0000"+
		"\u0000V\u001e\u0001\u0000\u0000\u0000WX\u0005w\u0000\u0000XY\u0005h\u0000"+
		"\u0000YZ\u0005i\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005e\u0000\u0000"+
		"\\ \u0001\u0000\u0000\u0000]^\u0005d\u0000\u0000^_\u0005o\u0000\u0000"+
		"_\"\u0001\u0000\u0000\u0000`a\u0005i\u0000\u0000ab\u0005n\u0000\u0000"+
		"bc\u0005t\u0000\u0000c$\u0001\u0000\u0000\u0000de\u0005d\u0000\u0000e"+
		"f\u0005o\u0000\u0000fg\u0005u\u0000\u0000gh\u0005b\u0000\u0000hi\u0005"+
		"l\u0000\u0000ij\u0005e\u0000\u0000j&\u0001\u0000\u0000\u0000ko\u0007\u0000"+
		"\u0000\u0000ln\u0007\u0001\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p(\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u000209\u0000s"+
		"r\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v*\u0001\u0000\u0000\u0000wx\u0003)\u0014"+
		"\u0000xy\u0005.\u0000\u0000yz\u0003)\u0014\u0000z,\u0001\u0000\u0000\u0000"+
		"{\u0080\u0007\u0002\u0000\u0000|}\u0005*\u0000\u0000}\u0080\u0005*\u0000"+
		"\u0000~\u0080\u0005^\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f"+
		"|\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080.\u0001"+
		"\u0000\u0000\u0000\u0081\u008d\u0007\u0003\u0000\u0000\u0082\u0083\u0005"+
		"<\u0000\u0000\u0083\u008d\u0005=\u0000\u0000\u0084\u0085\u0005>\u0000"+
		"\u0000\u0085\u008d\u0005=\u0000\u0000\u0086\u0087\u0005=\u0000\u0000\u0087"+
		"\u008d\u0005=\u0000\u0000\u0088\u0089\u0005!\u0000\u0000\u0089\u008d\u0005"+
		"=\u0000\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u008d\u0005>\u0000"+
		"\u0000\u008c\u0081\u0001\u0000\u0000\u0000\u008c\u0082\u0001\u0000\u0000"+
		"\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000"+
		"\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d0\u0001\u0000\u0000\u0000\u008e\u0092\u0007\u0004\u0000\u0000"+
		"\u008f\u0090\u0005\r\u0000\u0000\u0090\u0092\u0005\n\u0000\u0000\u0091"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0006\u0018\u0000\u0000\u0094"+
		"2\u0001\u0000\u0000\u0000\u0006\u0000ou\u007f\u008c\u0091\u0001\u0001"+
		"\u0018\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}