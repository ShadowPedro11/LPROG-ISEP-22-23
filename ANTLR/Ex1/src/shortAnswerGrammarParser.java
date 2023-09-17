// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\shortAnswerGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class shortAnswerGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PERCENTAGE=13, INT=14, ARROW=15, SPACE=16, 
		HIFEN=17, VIRGULA=18, END_STRING=19, STRING=20, WORD=21, WS=22, NEWLINE=23, 
		ERROR=24, DECIMAL=25, CORRECT=26, WRONG=27, MISSING_WORDSYMBOL=28, TRUE=29, 
		FALSE=30;
	public static final int
		RULE_shortAnswerQuestion = 0, RULE_questionValue = 1, RULE_feedback = 2, 
		RULE_shortAnswerQuestion_question = 3, RULE_shortAnswerQuestion_answer = 4, 
		RULE_numericalQuestion = 5, RULE_numericalQuestion_question = 6, RULE_numericalQuestion_answer = 7, 
		RULE_numericalQuestion_error = 8, RULE_missingWordQuestion = 9, RULE_missingWordQuestion_lines = 10, 
		RULE_missingWordQuestion_sentence = 11, RULE_missingWordQuestion_answer = 12, 
		RULE_missingWordQuestion_options = 13, RULE_trueFalseQuestion = 14, RULE_trueFalseQuestion_sentence = 15, 
		RULE_trueFalseQuestion_anwser = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"shortAnswerQuestion", "questionValue", "feedback", "shortAnswerQuestion_question", 
			"shortAnswerQuestion_answer", "numericalQuestion", "numericalQuestion_question", 
			"numericalQuestion_answer", "numericalQuestion_error", "missingWordQuestion", 
			"missingWordQuestion_lines", "missingWordQuestion_sentence", "missingWordQuestion_answer", 
			"missingWordQuestion_options", "trueFalseQuestion", "trueFalseQuestion_sentence", 
			"trueFalseQuestion_anwser"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=====SHORT_ANSWER_QUESTION====='", "'=====END_QUESTION====='", 
			"'Value: '", "'Feedback: '", "'=====NUMERICAL_QUESTION====='", "'('", 
			"'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", "'Answer: '", "';'", 
			"'=====TRUE_OR_FALSE_QUESTION====='", null, null, null, "' '", "'-'", 
			null, null, null, null, null, null, "'ERROR '", null, "'correct'", "'wrong'", 
			null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PERCENTAGE", "INT", "ARROW", "SPACE", "HIFEN", "VIRGULA", "END_STRING", 
			"STRING", "WORD", "WS", "NEWLINE", "ERROR", "DECIMAL", "CORRECT", "WRONG", 
			"MISSING_WORDSYMBOL", "TRUE", "FALSE"
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
	public String getGrammarFileName() { return "shortAnswerGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public shortAnswerGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortAnswerQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(shortAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(shortAnswerGrammarParser.NEWLINE, i);
		}
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public ShortAnswerQuestion_questionContext shortAnswerQuestion_question() {
			return getRuleContext(ShortAnswerQuestion_questionContext.class,0);
		}
		public List<ShortAnswerQuestion_answerContext> shortAnswerQuestion_answer() {
			return getRuleContexts(ShortAnswerQuestion_answerContext.class);
		}
		public ShortAnswerQuestion_answerContext shortAnswerQuestion_answer(int i) {
			return getRuleContext(ShortAnswerQuestion_answerContext.class,i);
		}
		public ShortAnswerQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(NEWLINE);
			setState(36);
			questionValue();
			setState(37);
			match(NEWLINE);
			setState(38);
			feedback();
			setState(39);
			match(NEWLINE);
			setState(40);
			shortAnswerQuestion_question();
			setState(41);
			match(NEWLINE);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				shortAnswerQuestion_answer();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
	public static class QuestionValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(shortAnswerGrammarParser.INT, 0); }
		public QuestionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionValueContext questionValue() throws RecognitionException {
		QuestionValueContext _localctx = new QuestionValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_questionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(50);
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
		public TerminalNode STRING() { return getToken(shortAnswerGrammarParser.STRING, 0); }
		public FeedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feedback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(53);
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
	public static class ShortAnswerQuestion_questionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(shortAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(shortAnswerGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterShortAnswerQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitShortAnswerQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_questionContext shortAnswerQuestion_question() throws RecognitionException {
		ShortAnswerQuestion_questionContext _localctx = new ShortAnswerQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shortAnswerQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(STRING);
				}
				}
				setState(58); 
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
	public static class ShortAnswerQuestion_answerContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(shortAnswerGrammarParser.ARROW, 0); }
		public TerminalNode PERCENTAGE() { return getToken(shortAnswerGrammarParser.PERCENTAGE, 0); }
		public TerminalNode NEWLINE() { return getToken(shortAnswerGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> STRING() { return getTokens(shortAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(shortAnswerGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterShortAnswerQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitShortAnswerQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_answerContext shortAnswerQuestion_answer() throws RecognitionException {
		ShortAnswerQuestion_answerContext _localctx = new ShortAnswerQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shortAnswerQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				match(STRING);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(65);
			match(ARROW);
			setState(66);
			match(PERCENTAGE);
			setState(67);
			match(NEWLINE);
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
	public static class NumericalQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(shortAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(shortAnswerGrammarParser.NEWLINE, i);
		}
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public NumericalQuestion_questionContext numericalQuestion_question() {
			return getRuleContext(NumericalQuestion_questionContext.class,0);
		}
		public NumericalQuestion_answerContext numericalQuestion_answer() {
			return getRuleContext(NumericalQuestion_answerContext.class,0);
		}
		public NumericalQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterNumericalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitNumericalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitNumericalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestionContext numericalQuestion() throws RecognitionException {
		NumericalQuestionContext _localctx = new NumericalQuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(70);
			match(NEWLINE);
			setState(71);
			questionValue();
			setState(72);
			match(NEWLINE);
			setState(73);
			feedback();
			setState(74);
			match(NEWLINE);
			setState(75);
			numericalQuestion_question();
			setState(76);
			match(NEWLINE);
			setState(77);
			numericalQuestion_answer();
			setState(78);
			match(NEWLINE);
			setState(79);
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
	public static class NumericalQuestion_questionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(shortAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(shortAnswerGrammarParser.STRING, i);
		}
		public NumericalQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterNumericalQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitNumericalQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_questionContext numericalQuestion_question() throws RecognitionException {
		NumericalQuestion_questionContext _localctx = new NumericalQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(STRING);
				}
				}
				setState(84); 
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
	public static class NumericalQuestion_answerContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(shortAnswerGrammarParser.ARROW, 0); }
		public List<TerminalNode> INT() { return getTokens(shortAnswerGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(shortAnswerGrammarParser.INT, i);
		}
		public TerminalNode DECIMAL() { return getToken(shortAnswerGrammarParser.DECIMAL, 0); }
		public NumericalQuestion_errorContext numericalQuestion_error() {
			return getRuleContext(NumericalQuestion_errorContext.class,0);
		}
		public NumericalQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterNumericalQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitNumericalQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_answerContext numericalQuestion_answer() throws RecognitionException {
		NumericalQuestion_answerContext _localctx = new NumericalQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(87);
				numericalQuestion_error();
				}
			}

			setState(90);
			match(ARROW);
			setState(91);
			match(INT);
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
	public static class NumericalQuestion_errorContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(shortAnswerGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(shortAnswerGrammarParser.SPACE, i);
		}
		public TerminalNode ERROR() { return getToken(shortAnswerGrammarParser.ERROR, 0); }
		public TerminalNode HIFEN() { return getToken(shortAnswerGrammarParser.HIFEN, 0); }
		public List<TerminalNode> INT() { return getTokens(shortAnswerGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(shortAnswerGrammarParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(shortAnswerGrammarParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(shortAnswerGrammarParser.DECIMAL, i);
		}
		public NumericalQuestion_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterNumericalQuestion_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitNumericalQuestion_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_errorContext numericalQuestion_error() throws RecognitionException {
		NumericalQuestion_errorContext _localctx = new NumericalQuestion_errorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(SPACE);
			setState(94);
			match(T__5);
			setState(95);
			match(ERROR);
			setState(96);
			match(HIFEN);
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(SPACE);
			setState(99);
			match(T__6);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			match(T__7);
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
	public static class MissingWordQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(shortAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(shortAnswerGrammarParser.NEWLINE, i);
		}
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public List<MissingWordQuestion_linesContext> missingWordQuestion_lines() {
			return getRuleContexts(MissingWordQuestion_linesContext.class);
		}
		public MissingWordQuestion_linesContext missingWordQuestion_lines(int i) {
			return getRuleContext(MissingWordQuestion_linesContext.class,i);
		}
		public MissingWordQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterMissingWordQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitMissingWordQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestionContext missingWordQuestion() throws RecognitionException {
		MissingWordQuestionContext _localctx = new MissingWordQuestionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__8);
			setState(104);
			match(NEWLINE);
			setState(105);
			questionValue();
			setState(106);
			match(NEWLINE);
			setState(107);
			feedback();
			setState(108);
			match(NEWLINE);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				missingWordQuestion_lines();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==MISSING_WORDSYMBOL );
			setState(114);
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
	public static class MissingWordQuestion_linesContext extends ParserRuleContext {
		public List<MissingWordQuestion_sentenceContext> missingWordQuestion_sentence() {
			return getRuleContexts(MissingWordQuestion_sentenceContext.class);
		}
		public MissingWordQuestion_sentenceContext missingWordQuestion_sentence(int i) {
			return getRuleContext(MissingWordQuestion_sentenceContext.class,i);
		}
		public TerminalNode MISSING_WORDSYMBOL() { return getToken(shortAnswerGrammarParser.MISSING_WORDSYMBOL, 0); }
		public MissingWordQuestion_answerContext missingWordQuestion_answer() {
			return getRuleContext(MissingWordQuestion_answerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(shortAnswerGrammarParser.NEWLINE, 0); }
		public MissingWordQuestion_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterMissingWordQuestion_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitMissingWordQuestion_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_linesContext missingWordQuestion_lines() throws RecognitionException {
		MissingWordQuestion_linesContext _localctx = new MissingWordQuestion_linesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			missingWordQuestion_sentence();
			setState(117);
			match(MISSING_WORDSYMBOL);
			setState(118);
			missingWordQuestion_sentence();
			setState(119);
			missingWordQuestion_answer();
			{
			setState(120);
			match(NEWLINE);
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
	public static class MissingWordQuestion_sentenceContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(shortAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(shortAnswerGrammarParser.STRING, i);
		}
		public MissingWordQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterMissingWordQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitMissingWordQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_sentenceContext missingWordQuestion_sentence() throws RecognitionException {
		MissingWordQuestion_sentenceContext _localctx = new MissingWordQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(122);
				match(STRING);
				}
				}
				setState(127);
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
	public static class MissingWordQuestion_answerContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(shortAnswerGrammarParser.SPACE, 0); }
		public List<MissingWordQuestion_optionsContext> missingWordQuestion_options() {
			return getRuleContexts(MissingWordQuestion_optionsContext.class);
		}
		public MissingWordQuestion_optionsContext missingWordQuestion_options(int i) {
			return getRuleContext(MissingWordQuestion_optionsContext.class,i);
		}
		public MissingWordQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterMissingWordQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitMissingWordQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_answerContext missingWordQuestion_answer() throws RecognitionException {
		MissingWordQuestion_answerContext _localctx = new MissingWordQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SPACE);
			setState(129);
			match(T__9);
			setState(130);
			missingWordQuestion_options();
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				missingWordQuestion_options();
				}
				}
				setState(134); 
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
	public static class MissingWordQuestion_optionsContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(shortAnswerGrammarParser.ARROW, 0); }
		public TerminalNode CORRECT() { return getToken(shortAnswerGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(shortAnswerGrammarParser.WRONG, 0); }
		public TerminalNode SPACE() { return getToken(shortAnswerGrammarParser.SPACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(shortAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(shortAnswerGrammarParser.STRING, i);
		}
		public MissingWordQuestion_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterMissingWordQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitMissingWordQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_optionsContext missingWordQuestion_options() throws RecognitionException {
		MissingWordQuestion_optionsContext _localctx = new MissingWordQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_missingWordQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(STRING);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(141);
			match(ARROW);
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(143);
				match(T__10);
				setState(144);
				match(SPACE);
				}
				break;
			case STRING:
			case NEWLINE:
				{
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
	public static class TrueFalseQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(shortAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(shortAnswerGrammarParser.NEWLINE, i);
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
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__11);
			setState(149);
			match(NEWLINE);
			setState(150);
			questionValue();
			setState(151);
			match(NEWLINE);
			setState(152);
			feedback();
			setState(153);
			match(NEWLINE);
			setState(154);
			trueFalseQuestion_sentence();
			setState(155);
			match(NEWLINE);
			setState(156);
			trueFalseQuestion_anwser();
			setState(157);
			match(NEWLINE);
			setState(158);
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
	public static class TrueFalseQuestion_sentenceContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(shortAnswerGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(shortAnswerGrammarParser.STRING, i);
		}
		public TrueFalseQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterTrueFalseQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitTrueFalseQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() throws RecognitionException {
		TrueFalseQuestion_sentenceContext _localctx = new TrueFalseQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				match(STRING);
				}
				}
				setState(163); 
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
		public TerminalNode TRUE() { return getToken(shortAnswerGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(shortAnswerGrammarParser.FALSE, 0); }
		public TrueFalseQuestion_anwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).enterTrueFalseQuestion_anwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shortAnswerGrammarListener ) ((shortAnswerGrammarListener)listener).exitTrueFalseQuestion_anwser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shortAnswerGrammarVisitor ) return ((shortAnswerGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_anwser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() throws RecognitionException {
		TrueFalseQuestion_anwserContext _localctx = new TrueFalseQuestion_anwserContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		"\u0004\u0001\u001e\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u00039\b\u0003\u000b\u0003\f\u0003:\u0001\u0004\u0004\u0004>\b"+
		"\u0004\u000b\u0004\f\u0004?\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u0006S\b\u0006\u000b\u0006\f\u0006T\u0001\u0007"+
		"\u0001\u0007\u0003\u0007Y\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\to\b\t\u000b\t\f\tp\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0005\u000b|\b\u000b\n\u000b\f\u000b\u007f\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0085\b\f\u000b\f\f\f\u0086\u0001"+
		"\r\u0004\r\u008a\b\r\u000b\r\f\r\u008b\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0093\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00a2\b\u000f\u000b\u000f"+
		"\f\u000f\u00a3\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0003\u0002\u0000\u000e\u000e\u0019\u0019\u0001\u0000\u001a"+
		"\u001b\u0001\u0000\u001d\u001e\u00a1\u0000\"\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u00068\u0001"+
		"\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000"+
		"\fR\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010]\u0001"+
		"\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014t\u0001\u0000\u0000"+
		"\u0000\u0016}\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000\u0000\u0000"+
		"\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u0094\u0001\u0000\u0000\u0000"+
		"\u001e\u00a1\u0001\u0000\u0000\u0000 \u00a5\u0001\u0000\u0000\u0000\""+
		"#\u0005\u0001\u0000\u0000#$\u0005\u0017\u0000\u0000$%\u0003\u0002\u0001"+
		"\u0000%&\u0005\u0017\u0000\u0000&\'\u0003\u0004\u0002\u0000\'(\u0005\u0017"+
		"\u0000\u0000()\u0003\u0006\u0003\u0000)+\u0005\u0017\u0000\u0000*,\u0003"+
		"\b\u0004\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0002\u0000\u00000\u0001\u0001\u0000\u0000\u000012\u0005\u0003"+
		"\u0000\u000023\u0005\u000e\u0000\u00003\u0003\u0001\u0000\u0000\u0000"+
		"45\u0005\u0004\u0000\u000056\u0005\u0014\u0000\u00006\u0005\u0001\u0000"+
		"\u0000\u000079\u0005\u0014\u0000\u000087\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";\u0007\u0001\u0000\u0000\u0000<>\u0005\u0014\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u000f\u0000\u0000"+
		"BC\u0005\r\u0000\u0000CD\u0005\u0017\u0000\u0000D\t\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0005\u0000\u0000FG\u0005\u0017\u0000\u0000GH\u0003\u0002"+
		"\u0001\u0000HI\u0005\u0017\u0000\u0000IJ\u0003\u0004\u0002\u0000JK\u0005"+
		"\u0017\u0000\u0000KL\u0003\f\u0006\u0000LM\u0005\u0017\u0000\u0000MN\u0003"+
		"\u000e\u0007\u0000NO\u0005\u0017\u0000\u0000OP\u0005\u0002\u0000\u0000"+
		"P\u000b\u0001\u0000\u0000\u0000QS\u0005\u0014\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000"+
		"WY\u0003\u0010\b\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0005\u000f\u0000\u0000[\\\u0005\u000e\u0000"+
		"\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005\u0010\u0000\u0000^_\u0005"+
		"\u0006\u0000\u0000_`\u0005\u0018\u0000\u0000`a\u0005\u0011\u0000\u0000"+
		"ab\u0007\u0000\u0000\u0000bc\u0005\u0010\u0000\u0000cd\u0005\u0007\u0000"+
		"\u0000de\u0007\u0000\u0000\u0000ef\u0005\b\u0000\u0000f\u0011\u0001\u0000"+
		"\u0000\u0000gh\u0005\t\u0000\u0000hi\u0005\u0017\u0000\u0000ij\u0003\u0002"+
		"\u0001\u0000jk\u0005\u0017\u0000\u0000kl\u0003\u0004\u0002\u0000ln\u0005"+
		"\u0017\u0000\u0000mo\u0003\u0014\n\u0000nm\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0005\u0002\u0000\u0000s\u0013\u0001\u0000"+
		"\u0000\u0000tu\u0003\u0016\u000b\u0000uv\u0005\u001c\u0000\u0000vw\u0003"+
		"\u0016\u000b\u0000wx\u0003\u0018\f\u0000xy\u0005\u0017\u0000\u0000y\u0015"+
		"\u0001\u0000\u0000\u0000z|\u0005\u0014\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0017\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005\n\u0000\u0000"+
		"\u0082\u0084\u0003\u001a\r\u0000\u0083\u0085\u0003\u001a\r\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0019\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0014\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000f\u0000\u0000\u008e"+
		"\u0092\u0007\u0001\u0000\u0000\u008f\u0090\u0005\u000b\u0000\u0000\u0090"+
		"\u0093\u0005\u0010\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u001b\u0001\u0000\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0096"+
		"\u0005\u0017\u0000\u0000\u0096\u0097\u0003\u0002\u0001\u0000\u0097\u0098"+
		"\u0005\u0017\u0000\u0000\u0098\u0099\u0003\u0004\u0002\u0000\u0099\u009a"+
		"\u0005\u0017\u0000\u0000\u009a\u009b\u0003\u001e\u000f\u0000\u009b\u009c"+
		"\u0005\u0017\u0000\u0000\u009c\u009d\u0003 \u0010\u0000\u009d\u009e\u0005"+
		"\u0017\u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000\u009f\u001d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0005\u0014\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u001f\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6!\u0001\u0000"+
		"\u0000\u0000\u000b-:?TXp}\u0086\u008b\u0092\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}