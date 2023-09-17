// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\trueFalseGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class trueFalseGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TRUE=5, FALSE=6, INT=7, SPACE=8, HIFEN=9, 
		VIRGULA=10, END_STRING=11, STRING=12, WORD=13, WS=14, NEWLINE=15;
	public static final int
		RULE_trueFalseQuestion = 0, RULE_questionValue = 1, RULE_feedback = 2, 
		RULE_trueFalseQuestion_sentence = 3, RULE_trueFalseQuestion_anwser = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"trueFalseQuestion", "questionValue", "feedback", "trueFalseQuestion_sentence", 
			"trueFalseQuestion_anwser"
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

	@Override
	public String getGrammarFileName() { return "trueFalseGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public trueFalseGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrueFalseQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(trueFalseGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(trueFalseGrammarParser.NEWLINE, i);
		}
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() {
			return getRuleContext(TrueFalseQuestion_sentenceContext.class,0);
		}
		public TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() {
			return getRuleContext(TrueFalseQuestion_anwserContext.class,0);
		}
		public TrueFalseQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trueFalseGrammarVisitor ) return ((trueFalseGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(NEWLINE);
			setState(12);
			questionValue();
			setState(13);
			match(NEWLINE);
			setState(14);
			feedback();
			setState(15);
			match(NEWLINE);
			setState(16);
			trueFalseQuestion_sentence();
			setState(17);
			match(NEWLINE);
			setState(18);
			trueFalseQuestion_anwser();
			setState(19);
			match(NEWLINE);
			setState(20);
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
	public static class QuestionValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(trueFalseGrammarParser.INT, 0); }
		public QuestionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trueFalseGrammarVisitor ) return ((trueFalseGrammarVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionValueContext questionValue() throws RecognitionException {
		QuestionValueContext _localctx = new QuestionValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_questionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__2);
			setState(23);
			match(INT);
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
	public static class FeedbackContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(trueFalseGrammarParser.STRING, 0); }
		public FeedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trueFalseGrammarVisitor ) return ((trueFalseGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feedback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__3);
			setState(26);
			match(STRING);
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
	public static class TrueFalseQuestion_sentenceContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(trueFalseGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(trueFalseGrammarParser.STRING, i);
		}
		public TrueFalseQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).enterTrueFalseQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).exitTrueFalseQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trueFalseGrammarVisitor ) return ((trueFalseGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() throws RecognitionException {
		TrueFalseQuestion_sentenceContext _localctx = new TrueFalseQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				match(STRING);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
	public static class TrueFalseQuestion_anwserContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(trueFalseGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(trueFalseGrammarParser.FALSE, 0); }
		public TrueFalseQuestion_anwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).enterTrueFalseQuestion_anwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trueFalseGrammarListener ) ((trueFalseGrammarListener)listener).exitTrueFalseQuestion_anwser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trueFalseGrammarVisitor ) return ((trueFalseGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_anwser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() throws RecognitionException {
		TrueFalseQuestion_anwserContext _localctx = new TrueFalseQuestion_anwserContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u0003\u001e\b\u0003\u000b\u0003\f\u0003\u001f\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0001\u0001\u0000\u0005\u0006\u001f\u0000\n\u0001\u0000\u0000\u0000\u0002"+
		"\u0016\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006"+
		"\u001d\u0001\u0000\u0000\u0000\b!\u0001\u0000\u0000\u0000\n\u000b\u0005"+
		"\u0001\u0000\u0000\u000b\f\u0005\u000f\u0000\u0000\f\r\u0003\u0002\u0001"+
		"\u0000\r\u000e\u0005\u000f\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000"+
		"\u000f\u0010\u0005\u000f\u0000\u0000\u0010\u0011\u0003\u0006\u0003\u0000"+
		"\u0011\u0012\u0005\u000f\u0000\u0000\u0012\u0013\u0003\b\u0004\u0000\u0013"+
		"\u0014\u0005\u000f\u0000\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015"+
		"\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0003\u0000\u0000\u0017"+
		"\u0018\u0005\u0007\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u0004\u0000\u0000\u001a\u001b\u0005\f\u0000\u0000\u001b\u0005"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0005\f\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0007\u0001\u0000\u0000"+
		"\u0000!\"\u0007\u0000\u0000\u0000\"\t\u0001\u0000\u0000\u0000\u0001\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}