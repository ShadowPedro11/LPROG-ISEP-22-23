// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\trueFalseGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class trueFalseGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TRUE=5, FALSE=6, INT=7, SPACE=8, HIFEN=9, 
		VIRGULA=10, END_STRING=11, STRING=12, WORD=13, WS=14, NEWLINE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TRUE", "FALSE", "INT", "SPACE", "HIFEN", 
			"VIRGULA", "END_STRING", "STRING", "WORD", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=====TRUE_OR_FALSE_QUESTION====='", "'=====END_QUESTION====='", 
			"'Value: '", "'Feedback: '", "'True'", "'False'", null, "' '", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TRUE", "FALSE", "INT", "SPACE", "HIFEN", 
			"VIRGULA", "END_STRING", "STRING", "WORD", "WS", "NEWLINE"
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


	public trueFalseGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "trueFalseGrammar.g4"; }

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
		"\u0004\u0000\u000f\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006w\b\u0006\u000b\u0006"+
		"\f\u0006x\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0088\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008c\b\u000b"+
		"\n\u000b\f\u000b\u008f\t\u000b\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001"+
		"\f\u0004\f\u0095\b\f\u000b\f\f\f\u0096\u0001\r\u0004\r\u009a\b\r\u000b"+
		"\r\f\r\u009b\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0005\u0001\u000009\u0002\u0000..??\u0003\u0000"+
		"09AZaz\u0003\u0000\t\t\r\r  \u0001\u0000\n\n\u00a7\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0001\u001f\u0001\u0000\u0000\u0000\u0003@\u0001\u0000\u0000\u0000\u0005"+
		"W\u0001\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\tj\u0001\u0000"+
		"\u0000\u0000\u000bo\u0001\u0000\u0000\u0000\rv\u0001\u0000\u0000\u0000"+
		"\u000fz\u0001\u0000\u0000\u0000\u0011|\u0001\u0000\u0000\u0000\u0013~"+
		"\u0001\u0000\u0000\u0000\u0015\u0081\u0001\u0000\u0000\u0000\u0017\u0083"+
		"\u0001\u0000\u0000\u0000\u0019\u0094\u0001\u0000\u0000\u0000\u001b\u0099"+
		"\u0001\u0000\u0000\u0000\u001d\u009f\u0001\u0000\u0000\u0000\u001f \u0005"+
		"=\u0000\u0000 !\u0005=\u0000\u0000!\"\u0005=\u0000\u0000\"#\u0005=\u0000"+
		"\u0000#$\u0005=\u0000\u0000$%\u0005T\u0000\u0000%&\u0005R\u0000\u0000"+
		"&\'\u0005U\u0000\u0000\'(\u0005E\u0000\u0000()\u0005_\u0000\u0000)*\u0005"+
		"O\u0000\u0000*+\u0005R\u0000\u0000+,\u0005_\u0000\u0000,-\u0005F\u0000"+
		"\u0000-.\u0005A\u0000\u0000./\u0005L\u0000\u0000/0\u0005S\u0000\u0000"+
		"01\u0005E\u0000\u000012\u0005_\u0000\u000023\u0005Q\u0000\u000034\u0005"+
		"U\u0000\u000045\u0005E\u0000\u000056\u0005S\u0000\u000067\u0005T\u0000"+
		"\u000078\u0005I\u0000\u000089\u0005O\u0000\u00009:\u0005N\u0000\u0000"+
		":;\u0005=\u0000\u0000;<\u0005=\u0000\u0000<=\u0005=\u0000\u0000=>\u0005"+
		"=\u0000\u0000>?\u0005=\u0000\u0000?\u0002\u0001\u0000\u0000\u0000@A\u0005"+
		"=\u0000\u0000AB\u0005=\u0000\u0000BC\u0005=\u0000\u0000CD\u0005=\u0000"+
		"\u0000DE\u0005=\u0000\u0000EF\u0005E\u0000\u0000FG\u0005N\u0000\u0000"+
		"GH\u0005D\u0000\u0000HI\u0005_\u0000\u0000IJ\u0005Q\u0000\u0000JK\u0005"+
		"U\u0000\u0000KL\u0005E\u0000\u0000LM\u0005S\u0000\u0000MN\u0005T\u0000"+
		"\u0000NO\u0005I\u0000\u0000OP\u0005O\u0000\u0000PQ\u0005N\u0000\u0000"+
		"QR\u0005=\u0000\u0000RS\u0005=\u0000\u0000ST\u0005=\u0000\u0000TU\u0005"+
		"=\u0000\u0000UV\u0005=\u0000\u0000V\u0004\u0001\u0000\u0000\u0000WX\u0005"+
		"V\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005u\u0000"+
		"\u0000[\\\u0005e\u0000\u0000\\]\u0005:\u0000\u0000]^\u0005 \u0000\u0000"+
		"^\u0006\u0001\u0000\u0000\u0000_`\u0005F\u0000\u0000`a\u0005e\u0000\u0000"+
		"ab\u0005e\u0000\u0000bc\u0005d\u0000\u0000cd\u0005b\u0000\u0000de\u0005"+
		"a\u0000\u0000ef\u0005c\u0000\u0000fg\u0005k\u0000\u0000gh\u0005:\u0000"+
		"\u0000hi\u0005 \u0000\u0000i\b\u0001\u0000\u0000\u0000jk\u0005T\u0000"+
		"\u0000kl\u0005r\u0000\u0000lm\u0005u\u0000\u0000mn\u0005e\u0000\u0000"+
		"n\n\u0001\u0000\u0000\u0000op\u0005F\u0000\u0000pq\u0005a\u0000\u0000"+
		"qr\u0005l\u0000\u0000rs\u0005s\u0000\u0000st\u0005e\u0000\u0000t\f\u0001"+
		"\u0000\u0000\u0000uw\u0007\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y\u000e\u0001\u0000\u0000\u0000z{\u0005 \u0000\u0000{\u0010\u0001"+
		"\u0000\u0000\u0000|}\u0005-\u0000\u0000}\u0012\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005,\u0000\u0000\u007f\u0080\u0003\u000f\u0007\u0000\u0080\u0014"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0016"+
		"\u0001\u0000\u0000\u0000\u0083\u008d\u0003\u0019\f\u0000\u0084\u0088\u0003"+
		"\u000f\u0007\u0000\u0085\u0088\u0003\u0011\b\u0000\u0086\u0088\u0003\u0013"+
		"\t\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0003\u0019\f\u0000\u008a\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u0087\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0003\u0015\n\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0018\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0007\u0002\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u001a\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0007\u0003\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0006\r\u0000\u0000\u009e\u001c\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0007\u0004\u0000\u0000\u00a0\u001e\u0001\u0000\u0000\u0000\u0007\u0000"+
		"x\u0087\u008d\u0091\u0096\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}