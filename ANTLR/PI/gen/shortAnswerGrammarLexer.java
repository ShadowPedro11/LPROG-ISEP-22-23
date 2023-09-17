// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\shortAnswerGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class shortAnswerGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INT=12, ARROW=13, STRING=14, WORD=15, WS=16, NEWLINE=17, 
		ERROR=18, DECIMAL=19, CORRECT=20, WRONG=21, MISSING_WORDSYMBOL=22, TRUE=23, 
		FALSE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "INT", "ARROW", "STRING", "WORD", "WS", "NEWLINE", "ERROR", 
			"DECIMAL", "CORRECT", "WRONG", "MISSING_WORDSYMBOL", "TRUE", "FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=====SHORT_ANSWER_QUESTION====='", "'=====END_QUESTION====='", 
			"'=====NUMERICAL_QUESTION====='", "'('", "'-'", "'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", 
			"'Answer:'", "','", "'=====TRUE_OR_FALSE_QUESTION====='", null, "'->'", 
			null, null, null, null, "'ERROR '", null, "'correct'", "'wrong'", "'___'", 
			"'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "ARROW", "STRING", "WORD", "WS", "NEWLINE", "ERROR", "DECIMAL", 
			"CORRECT", "WRONG", "MISSING_WORDSYMBOL", "TRUE", "FALSE"
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


	public shortAnswerGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "shortAnswerGrammar.g4"; }

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
		"\u0004\u0000\u0018\u0132\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u00db"+
		"\b\u000b\u000b\u000b\f\u000b\u00dc\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00e1\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0004\r\u00e7\b\r\u000b"+
		"\r\f\r\u00e8\u0001\u000e\u0004\u000e\u00ec\b\u000e\u000b\u000e\f\u000e"+
		"\u00ed\u0001\u000e\u0003\u000e\u00f1\b\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00f5\b\u000e\u0001\u000f\u0004\u000f\u00f8\b\u000f\u000b\u000f"+
		"\f\u000f\u00f9\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0004\u0012\u0108\b\u0012\u000b\u0012\f\u0012\u0109\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u010e\b\u0012\u000b\u0012\f\u0012\u010f"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0114\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000"+
		"\u0006\u0001\u000009\u0003\u0000  ..??\u0003\u000009AZaz\u0001\u0000-"+
		"-\u0003\u0000\t\t\r\r  \u0001\u0000\n\n\u013b\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0001"+
		"1\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000\u0005h\u0001"+
		"\u0000\u0000\u0000\u0007\u0085\u0001\u0000\u0000\u0000\t\u0087\u0001\u0000"+
		"\u0000\u0000\u000b\u0089\u0001\u0000\u0000\u0000\r\u008b\u0001\u0000\u0000"+
		"\u0000\u000f\u008d\u0001\u0000\u0000\u0000\u0011\u00ae\u0001\u0000\u0000"+
		"\u0000\u0013\u00b6\u0001\u0000\u0000\u0000\u0015\u00b8\u0001\u0000\u0000"+
		"\u0000\u0017\u00da\u0001\u0000\u0000\u0000\u0019\u00e2\u0001\u0000\u0000"+
		"\u0000\u001b\u00e6\u0001\u0000\u0000\u0000\u001d\u00eb\u0001\u0000\u0000"+
		"\u0000\u001f\u00f7\u0001\u0000\u0000\u0000!\u00fd\u0001\u0000\u0000\u0000"+
		"#\u00ff\u0001\u0000\u0000\u0000%\u0107\u0001\u0000\u0000\u0000\'\u0115"+
		"\u0001\u0000\u0000\u0000)\u011d\u0001\u0000\u0000\u0000+\u0123\u0001\u0000"+
		"\u0000\u0000-\u0127\u0001\u0000\u0000\u0000/\u012c\u0001\u0000\u0000\u0000"+
		"12\u0005=\u0000\u000023\u0005=\u0000\u000034\u0005=\u0000\u000045\u0005"+
		"=\u0000\u000056\u0005=\u0000\u000067\u0005S\u0000\u000078\u0005H\u0000"+
		"\u000089\u0005O\u0000\u00009:\u0005R\u0000\u0000:;\u0005T\u0000\u0000"+
		";<\u0005_\u0000\u0000<=\u0005A\u0000\u0000=>\u0005N\u0000\u0000>?\u0005"+
		"S\u0000\u0000?@\u0005W\u0000\u0000@A\u0005E\u0000\u0000AB\u0005R\u0000"+
		"\u0000BC\u0005_\u0000\u0000CD\u0005Q\u0000\u0000DE\u0005U\u0000\u0000"+
		"EF\u0005E\u0000\u0000FG\u0005S\u0000\u0000GH\u0005T\u0000\u0000HI\u0005"+
		"I\u0000\u0000IJ\u0005O\u0000\u0000JK\u0005N\u0000\u0000KL\u0005=\u0000"+
		"\u0000LM\u0005=\u0000\u0000MN\u0005=\u0000\u0000NO\u0005=\u0000\u0000"+
		"OP\u0005=\u0000\u0000P\u0002\u0001\u0000\u0000\u0000QR\u0005=\u0000\u0000"+
		"RS\u0005=\u0000\u0000ST\u0005=\u0000\u0000TU\u0005=\u0000\u0000UV\u0005"+
		"=\u0000\u0000VW\u0005E\u0000\u0000WX\u0005N\u0000\u0000XY\u0005D\u0000"+
		"\u0000YZ\u0005_\u0000\u0000Z[\u0005Q\u0000\u0000[\\\u0005U\u0000\u0000"+
		"\\]\u0005E\u0000\u0000]^\u0005S\u0000\u0000^_\u0005T\u0000\u0000_`\u0005"+
		"I\u0000\u0000`a\u0005O\u0000\u0000ab\u0005N\u0000\u0000bc\u0005=\u0000"+
		"\u0000cd\u0005=\u0000\u0000de\u0005=\u0000\u0000ef\u0005=\u0000\u0000"+
		"fg\u0005=\u0000\u0000g\u0004\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000"+
		"ij\u0005=\u0000\u0000jk\u0005=\u0000\u0000kl\u0005=\u0000\u0000lm\u0005"+
		"=\u0000\u0000mn\u0005N\u0000\u0000no\u0005U\u0000\u0000op\u0005M\u0000"+
		"\u0000pq\u0005E\u0000\u0000qr\u0005R\u0000\u0000rs\u0005I\u0000\u0000"+
		"st\u0005C\u0000\u0000tu\u0005A\u0000\u0000uv\u0005L\u0000\u0000vw\u0005"+
		"_\u0000\u0000wx\u0005Q\u0000\u0000xy\u0005U\u0000\u0000yz\u0005E\u0000"+
		"\u0000z{\u0005S\u0000\u0000{|\u0005T\u0000\u0000|}\u0005I\u0000\u0000"+
		"}~\u0005O\u0000\u0000~\u007f\u0005N\u0000\u0000\u007f\u0080\u0005=\u0000"+
		"\u0000\u0080\u0081\u0005=\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082"+
		"\u0083\u0005=\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084\u0006\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086\b\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005-\u0000\u0000\u0088\n\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005+\u0000\u0000\u008a\f\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005)\u0000\u0000\u008c\u000e\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005=\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f\u0090\u0005"+
		"=\u0000\u0000\u0090\u0091\u0005=\u0000\u0000\u0091\u0092\u0005=\u0000"+
		"\u0000\u0092\u0093\u0005M\u0000\u0000\u0093\u0094\u0005I\u0000\u0000\u0094"+
		"\u0095\u0005S\u0000\u0000\u0095\u0096\u0005S\u0000\u0000\u0096\u0097\u0005"+
		"I\u0000\u0000\u0097\u0098\u0005N\u0000\u0000\u0098\u0099\u0005G\u0000"+
		"\u0000\u0099\u009a\u0005_\u0000\u0000\u009a\u009b\u0005W\u0000\u0000\u009b"+
		"\u009c\u0005O\u0000\u0000\u009c\u009d\u0005R\u0000\u0000\u009d\u009e\u0005"+
		"D\u0000\u0000\u009e\u009f\u0005S\u0000\u0000\u009f\u00a0\u0005_\u0000"+
		"\u0000\u00a0\u00a1\u0005Q\u0000\u0000\u00a1\u00a2\u0005U\u0000\u0000\u00a2"+
		"\u00a3\u0005E\u0000\u0000\u00a3\u00a4\u0005S\u0000\u0000\u00a4\u00a5\u0005"+
		"T\u0000\u0000\u00a5\u00a6\u0005I\u0000\u0000\u00a6\u00a7\u0005O\u0000"+
		"\u0000\u00a7\u00a8\u0005N\u0000\u0000\u00a8\u00a9\u0005=\u0000\u0000\u00a9"+
		"\u00aa\u0005=\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab\u00ac\u0005"+
		"=\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad\u0010\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005A\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0"+
		"\u00b1\u0005s\u0000\u0000\u00b1\u00b2\u0005w\u0000\u0000\u00b2\u00b3\u0005"+
		"e\u0000\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b4\u00b5\u0005:\u0000"+
		"\u0000\u00b5\u0012\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005,\u0000\u0000"+
		"\u00b7\u0014\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005=\u0000\u0000\u00b9"+
		"\u00ba\u0005=\u0000\u0000\u00ba\u00bb\u0005=\u0000\u0000\u00bb\u00bc\u0005"+
		"=\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000\u00bd\u00be\u0005T\u0000"+
		"\u0000\u00be\u00bf\u0005R\u0000\u0000\u00bf\u00c0\u0005U\u0000\u0000\u00c0"+
		"\u00c1\u0005E\u0000\u0000\u00c1\u00c2\u0005_\u0000\u0000\u00c2\u00c3\u0005"+
		"O\u0000\u0000\u00c3\u00c4\u0005R\u0000\u0000\u00c4\u00c5\u0005_\u0000"+
		"\u0000\u00c5\u00c6\u0005F\u0000\u0000\u00c6\u00c7\u0005A\u0000\u0000\u00c7"+
		"\u00c8\u0005L\u0000\u0000\u00c8\u00c9\u0005S\u0000\u0000\u00c9\u00ca\u0005"+
		"E\u0000\u0000\u00ca\u00cb\u0005_\u0000\u0000\u00cb\u00cc\u0005Q\u0000"+
		"\u0000\u00cc\u00cd\u0005U\u0000\u0000\u00cd\u00ce\u0005E\u0000\u0000\u00ce"+
		"\u00cf\u0005S\u0000\u0000\u00cf\u00d0\u0005T\u0000\u0000\u00d0\u00d1\u0005"+
		"I\u0000\u0000\u00d1\u00d2\u0005O\u0000\u0000\u00d2\u00d3\u0005N\u0000"+
		"\u0000\u00d3\u00d4\u0005=\u0000\u0000\u00d4\u00d5\u0005=\u0000\u0000\u00d5"+
		"\u00d6\u0005=\u0000\u0000\u00d6\u00d7\u0005=\u0000\u0000\u00d7\u00d8\u0005"+
		"=\u0000\u0000\u00d8\u0016\u0001\u0000\u0000\u0000\u00d9\u00db\u0007\u0000"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00e1\u0007\u0001"+
		"\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0018\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005-\u0000\u0000\u00e3\u00e4\u0005>\u0000\u0000"+
		"\u00e4\u001a\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\u001d\u000e\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u001c\u0001\u0000\u0000\u0000\u00ea\u00ec\u0007\u0002\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00f1\u0007\u0003\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f5\u0007\u0001\u0000\u0000"+
		"\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u001e\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0007\u0004\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0006\u000f\u0000\u0000\u00fc \u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0007\u0005\u0000\u0000\u00fe\"\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005E\u0000\u0000\u0100\u0101\u0005R\u0000\u0000\u0101\u0102\u0005R"+
		"\u0000\u0000\u0102\u0103\u0005O\u0000\u0000\u0103\u0104\u0005R\u0000\u0000"+
		"\u0104\u0105\u0005 \u0000\u0000\u0105$\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0007\u0000\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d"+
		"\u0005.\u0000\u0000\u010c\u010e\u0007\u0000\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0113\u0001"+
		"\u0000\u0000\u0000\u0111\u0114\u0007\u0001\u0000\u0000\u0112\u0114\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114&\u0001\u0000\u0000\u0000\u0115\u0116\u0005c\u0000"+
		"\u0000\u0116\u0117\u0005o\u0000\u0000\u0117\u0118\u0005r\u0000\u0000\u0118"+
		"\u0119\u0005r\u0000\u0000\u0119\u011a\u0005e\u0000\u0000\u011a\u011b\u0005"+
		"c\u0000\u0000\u011b\u011c\u0005t\u0000\u0000\u011c(\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005w\u0000\u0000\u011e\u011f\u0005r\u0000\u0000\u011f"+
		"\u0120\u0005o\u0000\u0000\u0120\u0121\u0005n\u0000\u0000\u0121\u0122\u0005"+
		"g\u0000\u0000\u0122*\u0001\u0000\u0000\u0000\u0123\u0124\u0005_\u0000"+
		"\u0000\u0124\u0125\u0005_\u0000\u0000\u0125\u0126\u0005_\u0000\u0000\u0126"+
		",\u0001\u0000\u0000\u0000\u0127\u0128\u0005T\u0000\u0000\u0128\u0129\u0005"+
		"r\u0000\u0000\u0129\u012a\u0005u\u0000\u0000\u012a\u012b\u0005e\u0000"+
		"\u0000\u012b.\u0001\u0000\u0000\u0000\u012c\u012d\u0005F\u0000\u0000\u012d"+
		"\u012e\u0005a\u0000\u0000\u012e\u012f\u0005l\u0000\u0000\u012f\u0130\u0005"+
		"s\u0000\u0000\u0130\u0131\u0005e\u0000\u0000\u01310\u0001\u0000\u0000"+
		"\u0000\u000b\u0000\u00dc\u00e0\u00e8\u00ed\u00f0\u00f4\u00f9\u0109\u010f"+
		"\u0113\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}