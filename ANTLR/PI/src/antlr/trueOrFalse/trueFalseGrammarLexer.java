package antlr.trueOrFalse;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\trueFalseGrammar.g4 by ANTLR 4.12.0
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
		T__0=1, T__1=2, TRUE=3, FALSE=4, STRING=5, WORD=6, WS=7, NEWLINE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TRUE", "FALSE", "STRING", "WORD", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=====TRUE_OR_FALSE_QUESTION====='", "'=====END_QUESTION====='", 
			"'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TRUE", "FALSE", "STRING", "WORD", "WS", "NEWLINE"
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
		"\u0004\u0000\bn\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004V\b\u0004\u000b\u0004"+
		"\f\u0004W\u0001\u0005\u0004\u0005[\b\u0005\u000b\u0005\f\u0005\\\u0001"+
		"\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005"+
		"\u0001\u0006\u0004\u0006g\b\u0006\u000b\u0006\f\u0006h\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0005"+
		"\u0003\u000009AZaz\u0001\u0000--\u0003\u0000  ..??\u0003\u0000\t\t\r\r"+
		"  \u0001\u0000\n\nr\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000"+
		"\u0005I\u0001\u0000\u0000\u0000\u0007N\u0001\u0000\u0000\u0000\tU\u0001"+
		"\u0000\u0000\u0000\u000bZ\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000"+
		"\u0000\u000fl\u0001\u0000\u0000\u0000\u0011\u0012\u0005=\u0000\u0000\u0012"+
		"\u0013\u0005=\u0000\u0000\u0013\u0014\u0005=\u0000\u0000\u0014\u0015\u0005"+
		"=\u0000\u0000\u0015\u0016\u0005=\u0000\u0000\u0016\u0017\u0005T\u0000"+
		"\u0000\u0017\u0018\u0005R\u0000\u0000\u0018\u0019\u0005U\u0000\u0000\u0019"+
		"\u001a\u0005E\u0000\u0000\u001a\u001b\u0005_\u0000\u0000\u001b\u001c\u0005"+
		"O\u0000\u0000\u001c\u001d\u0005R\u0000\u0000\u001d\u001e\u0005_\u0000"+
		"\u0000\u001e\u001f\u0005F\u0000\u0000\u001f \u0005A\u0000\u0000 !\u0005"+
		"L\u0000\u0000!\"\u0005S\u0000\u0000\"#\u0005E\u0000\u0000#$\u0005_\u0000"+
		"\u0000$%\u0005Q\u0000\u0000%&\u0005U\u0000\u0000&\'\u0005E\u0000\u0000"+
		"\'(\u0005S\u0000\u0000()\u0005T\u0000\u0000)*\u0005I\u0000\u0000*+\u0005"+
		"O\u0000\u0000+,\u0005N\u0000\u0000,-\u0005=\u0000\u0000-.\u0005=\u0000"+
		"\u0000./\u0005=\u0000\u0000/0\u0005=\u0000\u000001\u0005=\u0000\u0000"+
		"1\u0002\u0001\u0000\u0000\u000023\u0005=\u0000\u000034\u0005=\u0000\u0000"+
		"45\u0005=\u0000\u000056\u0005=\u0000\u000067\u0005=\u0000\u000078\u0005"+
		"E\u0000\u000089\u0005N\u0000\u00009:\u0005D\u0000\u0000:;\u0005_\u0000"+
		"\u0000;<\u0005Q\u0000\u0000<=\u0005U\u0000\u0000=>\u0005E\u0000\u0000"+
		">?\u0005S\u0000\u0000?@\u0005T\u0000\u0000@A\u0005I\u0000\u0000AB\u0005"+
		"O\u0000\u0000BC\u0005N\u0000\u0000CD\u0005=\u0000\u0000DE\u0005=\u0000"+
		"\u0000EF\u0005=\u0000\u0000FG\u0005=\u0000\u0000GH\u0005=\u0000\u0000"+
		"H\u0004\u0001\u0000\u0000\u0000IJ\u0005T\u0000\u0000JK\u0005r\u0000\u0000"+
		"KL\u0005u\u0000\u0000LM\u0005e\u0000\u0000M\u0006\u0001\u0000\u0000\u0000"+
		"NO\u0005F\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005"+
		"s\u0000\u0000RS\u0005e\u0000\u0000S\b\u0001\u0000\u0000\u0000TV\u0003"+
		"\u000b\u0005\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\n\u0001\u0000\u0000"+
		"\u0000Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001"+
		"\u0000\u0000\u0000^`\u0007\u0001\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000ad\u0007\u0002\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000d\f\u0001\u0000\u0000\u0000eg\u0007\u0003\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0006\u0006\u0000"+
		"\u0000k\u000e\u0001\u0000\u0000\u0000lm\u0007\u0004\u0000\u0000m\u0010"+
		"\u0001\u0000\u0000\u0000\u0006\u0000W\\_ch\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}