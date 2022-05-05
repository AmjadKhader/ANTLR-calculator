// Generated from /Users/amjad/IdeaProjects/ANTLR-demo/src/main/java/antlr/CalculatorLexer.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, ONE=2, TWO=3, THREE=4, FOUR=5, FIVE=6, SIX=7, SEVEN=8, EIGHT=9, 
		NINE=10, PLUS=11, MINUS=12, MULTIPLY=13, DIVIDE=14, DOT=15, WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
			"NINE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "DOT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", 
			"EIGHT", "NINE", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "DOT", "WHITESPACE"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorLexer.g4"; }

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
		"\u0004\u0000\u0010\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\'\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"I\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"O\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007W\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b_\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tf\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nm\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"u\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u008b\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009e\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a9\b\u000e\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0000\u00bd\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001&\u0001\u0000\u0000\u0000"+
		"\u0003,\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u0007:"+
		"\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bH\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000"+
		"\u0011^\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000\u0015l"+
		"\u0001\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019\u008a\u0001"+
		"\u0000\u0000\u0000\u001b\u009d\u0001\u0000\u0000\u0000\u001d\u00a8\u0001"+
		"\u0000\u0000\u0000\u001f\u00aa\u0001\u0000\u0000\u0000!\'\u00050\u0000"+
		"\u0000\"#\u0005z\u0000\u0000#$\u0005e\u0000\u0000$%\u0005r\u0000\u0000"+
		"%\'\u0005o\u0000\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000"+
		"\u0000\'\u0002\u0001\u0000\u0000\u0000(-\u00051\u0000\u0000)*\u0005o\u0000"+
		"\u0000*+\u0005n\u0000\u0000+-\u0005e\u0000\u0000,(\u0001\u0000\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000-\u0004\u0001\u0000\u0000\u0000.3\u00052\u0000"+
		"\u0000/0\u0005t\u0000\u000001\u0005w\u0000\u000013\u0005o\u0000\u0000"+
		"2.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u00003\u0006\u0001\u0000"+
		"\u0000\u00004;\u00053\u0000\u000056\u0005t\u0000\u000067\u0005h\u0000"+
		"\u000078\u0005r\u0000\u000089\u0005e\u0000\u00009;\u0005e\u0000\u0000"+
		":4\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000;\b\u0001\u0000\u0000"+
		"\u0000<B\u00054\u0000\u0000=>\u0005f\u0000\u0000>?\u0005o\u0000\u0000"+
		"?@\u0005u\u0000\u0000@B\u0005r\u0000\u0000A<\u0001\u0000\u0000\u0000A"+
		"=\u0001\u0000\u0000\u0000B\n\u0001\u0000\u0000\u0000CI\u00055\u0000\u0000"+
		"DE\u0005f\u0000\u0000EF\u0005i\u0000\u0000FG\u0005v\u0000\u0000GI\u0005"+
		"e\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000I\f\u0001"+
		"\u0000\u0000\u0000JO\u00056\u0000\u0000KL\u0005s\u0000\u0000LM\u0005i"+
		"\u0000\u0000MO\u0005x\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000"+
		"\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PW\u00057\u0000\u0000QR\u0005"+
		"s\u0000\u0000RS\u0005e\u0000\u0000ST\u0005v\u0000\u0000TU\u0005e\u0000"+
		"\u0000UW\u0005n\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000"+
		"\u0000W\u0010\u0001\u0000\u0000\u0000X_\u00058\u0000\u0000YZ\u0005e\u0000"+
		"\u0000Z[\u0005i\u0000\u0000[\\\u0005g\u0000\u0000\\]\u0005h\u0000\u0000"+
		"]_\u0005t\u0000\u0000^X\u0001\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000"+
		"_\u0012\u0001\u0000\u0000\u0000`f\u00059\u0000\u0000ab\u0005n\u0000\u0000"+
		"bc\u0005i\u0000\u0000cd\u0005n\u0000\u0000df\u0005e\u0000\u0000e`\u0001"+
		"\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000f\u0014\u0001\u0000\u0000"+
		"\u0000gm\u0005+\u0000\u0000hi\u0005p\u0000\u0000ij\u0005l\u0000\u0000"+
		"jk\u0005u\u0000\u0000km\u0005s\u0000\u0000lg\u0001\u0000\u0000\u0000l"+
		"h\u0001\u0000\u0000\u0000m\u0016\u0001\u0000\u0000\u0000nu\u0005-\u0000"+
		"\u0000op\u0005m\u0000\u0000pq\u0005i\u0000\u0000qr\u0005n\u0000\u0000"+
		"rs\u0005u\u0000\u0000su\u0005s\u0000\u0000tn\u0001\u0000\u0000\u0000t"+
		"o\u0001\u0000\u0000\u0000u\u0018\u0001\u0000\u0000\u0000v\u008b\u0005"+
		"*\u0000\u0000wx\u0005m\u0000\u0000xy\u0005u\u0000\u0000yz\u0005l\u0000"+
		"\u0000z{\u0005t\u0000\u0000{|\u0005i\u0000\u0000|}\u0005p\u0000\u0000"+
		"}~\u0005l\u0000\u0000~\u008b\u0005y\u0000\u0000\u007f\u0080\u0005m\u0000"+
		"\u0000\u0080\u0081\u0005u\u0000\u0000\u0081\u0082\u0005l\u0000\u0000\u0082"+
		"\u0083\u0005t\u0000\u0000\u0083\u0084\u0005i\u0000\u0000\u0084\u0085\u0005"+
		"p\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086\u0087\u0005y\u0000"+
		"\u0000\u0087\u0088\u0005 \u0000\u0000\u0088\u0089\u0005b\u0000\u0000\u0089"+
		"\u008b\u0005y\u0000\u0000\u008av\u0001\u0000\u0000\u0000\u008aw\u0001"+
		"\u0000\u0000\u0000\u008a\u007f\u0001\u0000\u0000\u0000\u008b\u001a\u0001"+
		"\u0000\u0000\u0000\u008c\u009e\u0005/\u0000\u0000\u008d\u008e\u0005d\u0000"+
		"\u0000\u008e\u008f\u0005i\u0000\u0000\u008f\u0090\u0005v\u0000\u0000\u0090"+
		"\u0091\u0005i\u0000\u0000\u0091\u0092\u0005d\u0000\u0000\u0092\u009e\u0005"+
		"e\u0000\u0000\u0093\u0094\u0005d\u0000\u0000\u0094\u0095\u0005i\u0000"+
		"\u0000\u0095\u0096\u0005v\u0000\u0000\u0096\u0097\u0005i\u0000\u0000\u0097"+
		"\u0098\u0005d\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u009a\u0005"+
		"d\u0000\u0000\u009a\u009b\u0005 \u0000\u0000\u009b\u009c\u0005b\u0000"+
		"\u0000\u009c\u009e\u0005y\u0000\u0000\u009d\u008c\u0001\u0000\u0000\u0000"+
		"\u009d\u008d\u0001\u0000\u0000\u0000\u009d\u0093\u0001\u0000\u0000\u0000"+
		"\u009e\u001c\u0001\u0000\u0000\u0000\u009f\u00a9\u0005.\u0000\u0000\u00a0"+
		"\u00a1\u0005d\u0000\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2\u00a9\u0005"+
		"t\u0000\u0000\u00a3\u00a4\u0005p\u0000\u0000\u00a4\u00a5\u0005o\u0000"+
		"\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6\u00a7\u0005n\u0000\u0000\u00a7"+
		"\u00a9\u0005t\u0000\u0000\u00a8\u009f\u0001\u0000\u0000\u0000\u00a8\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a9\u001e"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005 \u0000\u0000\u00ab \u0001\u0000"+
		"\u0000\u0000\u0010\u0000&,2:AHNV^elt\u008a\u009d\u00a8\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}