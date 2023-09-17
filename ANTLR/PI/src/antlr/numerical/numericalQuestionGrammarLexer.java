package antlr.numerical;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\numericalQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class numericalQuestionGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ERROR=11, ARROW=12, INT=13, DECIMAL=14, STRING=15, WORD=16, WS=17, 
		NEWLINE=18, CORRECT=19, WRONG=20, MISSING_WORDSYMBOL=21, TRUE=22, FALSE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ERROR", "ARROW", "INT", "DECIMAL", "STRING", "WORD", "WS", "NEWLINE", 
			"CORRECT", "WRONG", "MISSING_WORDSYMBOL", "TRUE", "FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=====NUMERICAL_QUESTION====='", "'=====END_QUESTION====='", "'('", 
			"'-'", "'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", "'Answer:'", 
			"','", "'=====TRUE_OR_FALSE_QUESTION====='", "'ERROR '", "'->'", null, 
			null, null, null, null, null, "'correct'", "'wrong'", "'___'", "'True'", 
			"'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ERROR", 
			"ARROW", "INT", "DECIMAL", "STRING", "WORD", "WS", "NEWLINE", "CORRECT", 
			"WRONG", "MISSING_WORDSYMBOL", "TRUE", "FALSE"
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


	public numericalQuestionGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "numericalQuestionGrammar.g4"; }

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
		"\u0004\u0000\u0017\u0110\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u00c3\b"+
		"\f\u000b\f\f\f\u00c4\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001\r\u0004\r"+
		"\u00cc\b\r\u000b\r\f\r\u00cd\u0001\r\u0001\r\u0004\r\u00d2\b\r\u000b\r"+
		"\f\r\u00d3\u0001\r\u0001\r\u0003\r\u00d8\b\r\u0001\u000e\u0004\u000e\u00db"+
		"\b\u000e\u000b\u000e\f\u000e\u00dc\u0001\u000f\u0004\u000f\u00e0\b\u000f"+
		"\u000b\u000f\f\u000f\u00e1\u0001\u000f\u0003\u000f\u00e5\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00e9\b\u000f\u0001\u0010\u0004\u0010\u00ec"+
		"\b\u0010\u000b\u0010\f\u0010\u00ed\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017\u0001\u0000\u0006\u0001\u000009\u0003\u0000  ..??\u0003"+
		"\u000009AZaz\u0001\u0000--\u0003\u0000\t\t\r\r  \u0001\u0000\n\n\u0119"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u0003L\u0001\u0000\u0000\u0000\u0005c\u0001\u0000"+
		"\u0000\u0000\u0007e\u0001\u0000\u0000\u0000\tg\u0001\u0000\u0000\u0000"+
		"\u000bi\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000\u0000\u000f\u008c"+
		"\u0001\u0000\u0000\u0000\u0011\u0094\u0001\u0000\u0000\u0000\u0013\u0096"+
		"\u0001\u0000\u0000\u0000\u0015\u00b7\u0001\u0000\u0000\u0000\u0017\u00be"+
		"\u0001\u0000\u0000\u0000\u0019\u00c2\u0001\u0000\u0000\u0000\u001b\u00cb"+
		"\u0001\u0000\u0000\u0000\u001d\u00da\u0001\u0000\u0000\u0000\u001f\u00df"+
		"\u0001\u0000\u0000\u0000!\u00eb\u0001\u0000\u0000\u0000#\u00f1\u0001\u0000"+
		"\u0000\u0000%\u00f3\u0001\u0000\u0000\u0000\'\u00fb\u0001\u0000\u0000"+
		"\u0000)\u0101\u0001\u0000\u0000\u0000+\u0105\u0001\u0000\u0000\u0000-"+
		"\u010a\u0001\u0000\u0000\u0000/0\u0005=\u0000\u000001\u0005=\u0000\u0000"+
		"12\u0005=\u0000\u000023\u0005=\u0000\u000034\u0005=\u0000\u000045\u0005"+
		"N\u0000\u000056\u0005U\u0000\u000067\u0005M\u0000\u000078\u0005E\u0000"+
		"\u000089\u0005R\u0000\u00009:\u0005I\u0000\u0000:;\u0005C\u0000\u0000"+
		";<\u0005A\u0000\u0000<=\u0005L\u0000\u0000=>\u0005_\u0000\u0000>?\u0005"+
		"Q\u0000\u0000?@\u0005U\u0000\u0000@A\u0005E\u0000\u0000AB\u0005S\u0000"+
		"\u0000BC\u0005T\u0000\u0000CD\u0005I\u0000\u0000DE\u0005O\u0000\u0000"+
		"EF\u0005N\u0000\u0000FG\u0005=\u0000\u0000GH\u0005=\u0000\u0000HI\u0005"+
		"=\u0000\u0000IJ\u0005=\u0000\u0000JK\u0005=\u0000\u0000K\u0002\u0001\u0000"+
		"\u0000\u0000LM\u0005=\u0000\u0000MN\u0005=\u0000\u0000NO\u0005=\u0000"+
		"\u0000OP\u0005=\u0000\u0000PQ\u0005=\u0000\u0000QR\u0005E\u0000\u0000"+
		"RS\u0005N\u0000\u0000ST\u0005D\u0000\u0000TU\u0005_\u0000\u0000UV\u0005"+
		"Q\u0000\u0000VW\u0005U\u0000\u0000WX\u0005E\u0000\u0000XY\u0005S\u0000"+
		"\u0000YZ\u0005T\u0000\u0000Z[\u0005I\u0000\u0000[\\\u0005O\u0000\u0000"+
		"\\]\u0005N\u0000\u0000]^\u0005=\u0000\u0000^_\u0005=\u0000\u0000_`\u0005"+
		"=\u0000\u0000`a\u0005=\u0000\u0000ab\u0005=\u0000\u0000b\u0004\u0001\u0000"+
		"\u0000\u0000cd\u0005(\u0000\u0000d\u0006\u0001\u0000\u0000\u0000ef\u0005"+
		"-\u0000\u0000f\b\u0001\u0000\u0000\u0000gh\u0005+\u0000\u0000h\n\u0001"+
		"\u0000\u0000\u0000ij\u0005)\u0000\u0000j\f\u0001\u0000\u0000\u0000kl\u0005"+
		"=\u0000\u0000lm\u0005=\u0000\u0000mn\u0005=\u0000\u0000no\u0005=\u0000"+
		"\u0000op\u0005=\u0000\u0000pq\u0005M\u0000\u0000qr\u0005I\u0000\u0000"+
		"rs\u0005S\u0000\u0000st\u0005S\u0000\u0000tu\u0005I\u0000\u0000uv\u0005"+
		"N\u0000\u0000vw\u0005G\u0000\u0000wx\u0005_\u0000\u0000xy\u0005W\u0000"+
		"\u0000yz\u0005O\u0000\u0000z{\u0005R\u0000\u0000{|\u0005D\u0000\u0000"+
		"|}\u0005S\u0000\u0000}~\u0005_\u0000\u0000~\u007f\u0005Q\u0000\u0000\u007f"+
		"\u0080\u0005U\u0000\u0000\u0080\u0081\u0005E\u0000\u0000\u0081\u0082\u0005"+
		"S\u0000\u0000\u0082\u0083\u0005T\u0000\u0000\u0083\u0084\u0005I\u0000"+
		"\u0000\u0084\u0085\u0005O\u0000\u0000\u0085\u0086\u0005N\u0000\u0000\u0086"+
		"\u0087\u0005=\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088\u0089\u0005"+
		"=\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a\u008b\u0005=\u0000"+
		"\u0000\u008b\u000e\u0001\u0000\u0000\u0000\u008c\u008d\u0005A\u0000\u0000"+
		"\u008d\u008e\u0005n\u0000\u0000\u008e\u008f\u0005s\u0000\u0000\u008f\u0090"+
		"\u0005w\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005r"+
		"\u0000\u0000\u0092\u0093\u0005:\u0000\u0000\u0093\u0010\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005,\u0000\u0000\u0095\u0012\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005=\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u0098\u0099"+
		"\u0005=\u0000\u0000\u0099\u009a\u0005=\u0000\u0000\u009a\u009b\u0005="+
		"\u0000\u0000\u009b\u009c\u0005T\u0000\u0000\u009c\u009d\u0005R\u0000\u0000"+
		"\u009d\u009e\u0005U\u0000\u0000\u009e\u009f\u0005E\u0000\u0000\u009f\u00a0"+
		"\u0005_\u0000\u0000\u00a0\u00a1\u0005O\u0000\u0000\u00a1\u00a2\u0005R"+
		"\u0000\u0000\u00a2\u00a3\u0005_\u0000\u0000\u00a3\u00a4\u0005F\u0000\u0000"+
		"\u00a4\u00a5\u0005A\u0000\u0000\u00a5\u00a6\u0005L\u0000\u0000\u00a6\u00a7"+
		"\u0005S\u0000\u0000\u00a7\u00a8\u0005E\u0000\u0000\u00a8\u00a9\u0005_"+
		"\u0000\u0000\u00a9\u00aa\u0005Q\u0000\u0000\u00aa\u00ab\u0005U\u0000\u0000"+
		"\u00ab\u00ac\u0005E\u0000\u0000\u00ac\u00ad\u0005S\u0000\u0000\u00ad\u00ae"+
		"\u0005T\u0000\u0000\u00ae\u00af\u0005I\u0000\u0000\u00af\u00b0\u0005O"+
		"\u0000\u0000\u00b0\u00b1\u0005N\u0000\u0000\u00b1\u00b2\u0005=\u0000\u0000"+
		"\u00b2\u00b3\u0005=\u0000\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b4\u00b5"+
		"\u0005=\u0000\u0000\u00b5\u00b6\u0005=\u0000\u0000\u00b6\u0014\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005E\u0000\u0000\u00b8\u00b9\u0005R\u0000\u0000"+
		"\u00b9\u00ba\u0005R\u0000\u0000\u00ba\u00bb\u0005O\u0000\u0000\u00bb\u00bc"+
		"\u0005R\u0000\u0000\u00bc\u00bd\u0005 \u0000\u0000\u00bd\u0016\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005-\u0000\u0000\u00bf\u00c0\u0005>\u0000\u0000"+
		"\u00c0\u0018\u0001\u0000\u0000\u0000\u00c1\u00c3\u0007\u0000\u0000\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c9\u0007\u0001\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u001a\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cc\u0007\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0005.\u0000\u0000\u00d0\u00d2\u0007\u0000\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d8\u0007\u0001\u0000\u0000\u00d6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u001c\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0003\u001f\u000f\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u001e\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0007\u0002\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e5\u0007\u0003\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e9\u0007\u0001\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		" \u0001\u0000\u0000\u0000\u00ea\u00ec\u0007\u0004\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0006\u0010\u0000\u0000\u00f0\"\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0007\u0005\u0000\u0000\u00f2$\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005c\u0000\u0000\u00f4\u00f5\u0005o\u0000\u0000"+
		"\u00f5\u00f6\u0005r\u0000\u0000\u00f6\u00f7\u0005r\u0000\u0000\u00f7\u00f8"+
		"\u0005e\u0000\u0000\u00f8\u00f9\u0005c\u0000\u0000\u00f9\u00fa\u0005t"+
		"\u0000\u0000\u00fa&\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005w\u0000\u0000"+
		"\u00fc\u00fd\u0005r\u0000\u0000\u00fd\u00fe\u0005o\u0000\u0000\u00fe\u00ff"+
		"\u0005n\u0000\u0000\u00ff\u0100\u0005g\u0000\u0000\u0100(\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005_\u0000\u0000\u0102\u0103\u0005_\u0000\u0000"+
		"\u0103\u0104\u0005_\u0000\u0000\u0104*\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0005T\u0000\u0000\u0106\u0107\u0005r\u0000\u0000\u0107\u0108\u0005u"+
		"\u0000\u0000\u0108\u0109\u0005e\u0000\u0000\u0109,\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005F\u0000\u0000\u010b\u010c\u0005a\u0000\u0000\u010c\u010d"+
		"\u0005l\u0000\u0000\u010d\u010e\u0005s\u0000\u0000\u010e\u010f\u0005e"+
		"\u0000\u0000\u010f.\u0001\u0000\u0000\u0000\u000b\u0000\u00c4\u00c8\u00cd"+
		"\u00d3\u00d7\u00dc\u00e1\u00e4\u00e8\u00ed\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}