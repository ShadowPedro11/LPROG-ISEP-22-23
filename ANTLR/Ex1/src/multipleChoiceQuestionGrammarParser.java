// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\multipleChoiceQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class multipleChoiceQuestionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INT=14, PERCENTAGE=15, CORRECT=16, 
		WRONG=17, ARROW=18, SPACE=19, HIFEN=20, VIRGULA=21, END_STRING=22, STRING=23, 
		WORD=24, NEWLINE=25, WS=26, ERROR=27, DECIMAL=28, MISSING_WORDSYMBOL=29, 
		TRUE=30, FALSE=31;
	public static final int
		RULE_multipleChoiceQuestion = 0, RULE_questionValue = 1, RULE_feedback = 2, 
		RULE_multipleChoiceQuestion_questionText = 3, RULE_multipleChoiceQuestion_options = 4, 
		RULE_multipleChoiceQuestion_option = 5, RULE_multipleChoiceQuestion_optionText = 6, 
		RULE_shortAnswerQuestion = 7, RULE_shortAnswerQuestion_question = 8, RULE_shortAnswerQuestion_answer = 9, 
		RULE_numericalQuestion = 10, RULE_numericalQuestion_question = 11, RULE_numericalQuestion_answer = 12, 
		RULE_numericalQuestion_error = 13, RULE_missingWordQuestion = 14, RULE_missingWordQuestion_lines = 15, 
		RULE_missingWordQuestion_sentence = 16, RULE_missingWordQuestion_answer = 17, 
		RULE_missingWordQuestion_options = 18, RULE_trueFalseQuestion = 19, RULE_trueFalseQuestion_sentence = 20, 
		RULE_trueFalseQuestion_anwser = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"multipleChoiceQuestion", "questionValue", "feedback", "multipleChoiceQuestion_questionText", 
			"multipleChoiceQuestion_options", "multipleChoiceQuestion_option", "multipleChoiceQuestion_optionText", 
			"shortAnswerQuestion", "shortAnswerQuestion_question", "shortAnswerQuestion_answer", 
			"numericalQuestion", "numericalQuestion_question", "numericalQuestion_answer", 
			"numericalQuestion_error", "missingWordQuestion", "missingWordQuestion_lines", 
			"missingWordQuestion_sentence", "missingWordQuestion_answer", "missingWordQuestion_options", 
			"trueFalseQuestion", "trueFalseQuestion_sentence", "trueFalseQuestion_anwser"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=====MULTIPLE_CHOICE_QUESTION====='", "'=====END_QUESTION====='", 
			"'Value: '", "'Feedback: '", "'=====SHORT_ANSWER_QUESTION====='", "'=====NUMERICAL_QUESTION====='", 
			"'('", "'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", "'Answer: '", 
			"';'", "'=====TRUE_OR_FALSE_QUESTION====='", null, null, "'correct'", 
			"'wrong'", null, "' '", "'-'", null, null, null, null, null, null, "'ERROR '", 
			null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT", "PERCENTAGE", "CORRECT", "WRONG", "ARROW", "SPACE", 
			"HIFEN", "VIRGULA", "END_STRING", "STRING", "WORD", "NEWLINE", "WS", 
			"ERROR", "DECIMAL", "MISSING_WORDSYMBOL", "TRUE", "FALSE"
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
	public String getGrammarFileName() { return "multipleChoiceQuestionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public multipleChoiceQuestionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleChoiceQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(multipleChoiceQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, i);
		}
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
		}
		public MultipleChoiceQuestion_questionTextContext multipleChoiceQuestion_questionText() {
			return getRuleContext(MultipleChoiceQuestion_questionTextContext.class,0);
		}
		public MultipleChoiceQuestion_optionsContext multipleChoiceQuestion_options() {
			return getRuleContext(MultipleChoiceQuestion_optionsContext.class,0);
		}
		public MultipleChoiceQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMultipleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMultipleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestionContext multipleChoiceQuestion() throws RecognitionException {
		MultipleChoiceQuestionContext _localctx = new MultipleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multipleChoiceQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(NEWLINE);
			setState(46);
			questionValue();
			setState(47);
			match(NEWLINE);
			setState(48);
			feedback();
			setState(49);
			match(NEWLINE);
			setState(50);
			multipleChoiceQuestion_questionText();
			setState(51);
			match(NEWLINE);
			setState(52);
			multipleChoiceQuestion_options();
			setState(53);
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
		public TerminalNode INT() { return getToken(multipleChoiceQuestionGrammarParser.INT, 0); }
		public QuestionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionValueContext questionValue() throws RecognitionException {
		QuestionValueContext _localctx = new QuestionValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_questionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
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
		public TerminalNode STRING() { return getToken(multipleChoiceQuestionGrammarParser.STRING, 0); }
		public FeedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feedback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__3);
			setState(59);
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
	public static class MultipleChoiceQuestion_questionTextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public MultipleChoiceQuestion_questionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_questionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMultipleChoiceQuestion_questionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMultipleChoiceQuestion_questionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_questionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_questionTextContext multipleChoiceQuestion_questionText() throws RecognitionException {
		MultipleChoiceQuestion_questionTextContext _localctx = new MultipleChoiceQuestion_questionTextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multipleChoiceQuestion_questionText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				match(STRING);
				}
				}
				setState(64); 
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
	public static class MultipleChoiceQuestion_optionsContext extends ParserRuleContext {
		public List<MultipleChoiceQuestion_optionContext> multipleChoiceQuestion_option() {
			return getRuleContexts(MultipleChoiceQuestion_optionContext.class);
		}
		public MultipleChoiceQuestion_optionContext multipleChoiceQuestion_option(int i) {
			return getRuleContext(MultipleChoiceQuestion_optionContext.class,i);
		}
		public MultipleChoiceQuestion_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMultipleChoiceQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMultipleChoiceQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionsContext multipleChoiceQuestion_options() throws RecognitionException {
		MultipleChoiceQuestion_optionsContext _localctx = new MultipleChoiceQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multipleChoiceQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				multipleChoiceQuestion_option();
				}
				}
				setState(69); 
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
	public static class MultipleChoiceQuestion_optionContext extends ParserRuleContext {
		public MultipleChoiceQuestion_optionTextContext multipleChoiceQuestion_optionText() {
			return getRuleContext(MultipleChoiceQuestion_optionTextContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(multipleChoiceQuestionGrammarParser.ARROW, 0); }
		public TerminalNode PERCENTAGE() { return getToken(multipleChoiceQuestionGrammarParser.PERCENTAGE, 0); }
		public TerminalNode NEWLINE() { return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, 0); }
		public TerminalNode CORRECT() { return getToken(multipleChoiceQuestionGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(multipleChoiceQuestionGrammarParser.WRONG, 0); }
		public MultipleChoiceQuestion_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMultipleChoiceQuestion_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMultipleChoiceQuestion_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionContext multipleChoiceQuestion_option() throws RecognitionException {
		MultipleChoiceQuestion_optionContext _localctx = new MultipleChoiceQuestion_optionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleChoiceQuestion_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			multipleChoiceQuestion_optionText();
			setState(72);
			match(ARROW);
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(74);
			match(PERCENTAGE);
			setState(75);
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
	public static class MultipleChoiceQuestion_optionTextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(multipleChoiceQuestionGrammarParser.STRING, 0); }
		public MultipleChoiceQuestion_optionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_optionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMultipleChoiceQuestion_optionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMultipleChoiceQuestion_optionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_optionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionTextContext multipleChoiceQuestion_optionText() throws RecognitionException {
		MultipleChoiceQuestion_optionTextContext _localctx = new MultipleChoiceQuestion_optionTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multipleChoiceQuestion_optionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
	public static class ShortAnswerQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(multipleChoiceQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__4);
			setState(80);
			match(NEWLINE);
			setState(81);
			questionValue();
			setState(82);
			match(NEWLINE);
			setState(83);
			feedback();
			setState(84);
			match(NEWLINE);
			setState(85);
			shortAnswerQuestion_question();
			setState(86);
			match(NEWLINE);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				shortAnswerQuestion_answer();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(92);
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
	public static class ShortAnswerQuestion_questionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterShortAnswerQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitShortAnswerQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_questionContext shortAnswerQuestion_question() throws RecognitionException {
		ShortAnswerQuestion_questionContext _localctx = new ShortAnswerQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shortAnswerQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				match(STRING);
				}
				}
				setState(97); 
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
		public TerminalNode ARROW() { return getToken(multipleChoiceQuestionGrammarParser.ARROW, 0); }
		public TerminalNode INT() { return getToken(multipleChoiceQuestionGrammarParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterShortAnswerQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitShortAnswerQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_answerContext shortAnswerQuestion_answer() throws RecognitionException {
		ShortAnswerQuestion_answerContext _localctx = new ShortAnswerQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shortAnswerQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				match(STRING);
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(104);
			match(ARROW);
			setState(105);
			match(INT);
			setState(106);
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
		public List<TerminalNode> NEWLINE() { return getTokens(multipleChoiceQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterNumericalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitNumericalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestionContext numericalQuestion() throws RecognitionException {
		NumericalQuestionContext _localctx = new NumericalQuestionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(109);
			match(NEWLINE);
			setState(110);
			questionValue();
			setState(111);
			match(NEWLINE);
			setState(112);
			feedback();
			setState(113);
			match(NEWLINE);
			setState(114);
			numericalQuestion_question();
			setState(115);
			match(NEWLINE);
			setState(116);
			numericalQuestion_answer();
			setState(117);
			match(NEWLINE);
			setState(118);
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
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public NumericalQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterNumericalQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitNumericalQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_questionContext numericalQuestion_question() throws RecognitionException {
		NumericalQuestion_questionContext _localctx = new NumericalQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				match(STRING);
				}
				}
				setState(123); 
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
		public TerminalNode ARROW() { return getToken(multipleChoiceQuestionGrammarParser.ARROW, 0); }
		public List<TerminalNode> INT() { return getTokens(multipleChoiceQuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.INT, i);
		}
		public TerminalNode DECIMAL() { return getToken(multipleChoiceQuestionGrammarParser.DECIMAL, 0); }
		public NumericalQuestion_errorContext numericalQuestion_error() {
			return getRuleContext(NumericalQuestion_errorContext.class,0);
		}
		public NumericalQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterNumericalQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitNumericalQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_answerContext numericalQuestion_answer() throws RecognitionException {
		NumericalQuestion_answerContext _localctx = new NumericalQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(126);
				numericalQuestion_error();
				}
			}

			setState(129);
			match(ARROW);
			setState(130);
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
		public List<TerminalNode> SPACE() { return getTokens(multipleChoiceQuestionGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.SPACE, i);
		}
		public TerminalNode ERROR() { return getToken(multipleChoiceQuestionGrammarParser.ERROR, 0); }
		public TerminalNode HIFEN() { return getToken(multipleChoiceQuestionGrammarParser.HIFEN, 0); }
		public List<TerminalNode> INT() { return getTokens(multipleChoiceQuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(multipleChoiceQuestionGrammarParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.DECIMAL, i);
		}
		public NumericalQuestion_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterNumericalQuestion_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitNumericalQuestion_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_errorContext numericalQuestion_error() throws RecognitionException {
		NumericalQuestion_errorContext _localctx = new NumericalQuestion_errorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(SPACE);
			setState(133);
			match(T__6);
			setState(134);
			match(ERROR);
			setState(135);
			match(HIFEN);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(SPACE);
			setState(138);
			match(T__7);
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			match(T__8);
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
		public List<TerminalNode> NEWLINE() { return getTokens(multipleChoiceQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMissingWordQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMissingWordQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestionContext missingWordQuestion() throws RecognitionException {
		MissingWordQuestionContext _localctx = new MissingWordQuestionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__9);
			setState(143);
			match(NEWLINE);
			setState(144);
			questionValue();
			setState(145);
			match(NEWLINE);
			setState(146);
			feedback();
			setState(147);
			match(NEWLINE);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				missingWordQuestion_lines();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==MISSING_WORDSYMBOL );
			setState(153);
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
		public TerminalNode MISSING_WORDSYMBOL() { return getToken(multipleChoiceQuestionGrammarParser.MISSING_WORDSYMBOL, 0); }
		public MissingWordQuestion_answerContext missingWordQuestion_answer() {
			return getRuleContext(MissingWordQuestion_answerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, 0); }
		public MissingWordQuestion_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMissingWordQuestion_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMissingWordQuestion_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_linesContext missingWordQuestion_lines() throws RecognitionException {
		MissingWordQuestion_linesContext _localctx = new MissingWordQuestion_linesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			missingWordQuestion_sentence();
			setState(156);
			match(MISSING_WORDSYMBOL);
			setState(157);
			missingWordQuestion_sentence();
			setState(158);
			missingWordQuestion_answer();
			{
			setState(159);
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
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public MissingWordQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMissingWordQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMissingWordQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_sentenceContext missingWordQuestion_sentence() throws RecognitionException {
		MissingWordQuestion_sentenceContext _localctx = new MissingWordQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(161);
				match(STRING);
				}
				}
				setState(166);
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
		public TerminalNode SPACE() { return getToken(multipleChoiceQuestionGrammarParser.SPACE, 0); }
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
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMissingWordQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMissingWordQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_answerContext missingWordQuestion_answer() throws RecognitionException {
		MissingWordQuestion_answerContext _localctx = new MissingWordQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(SPACE);
			setState(168);
			match(T__10);
			setState(169);
			missingWordQuestion_options();
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				missingWordQuestion_options();
				}
				}
				setState(173); 
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
		public TerminalNode ARROW() { return getToken(multipleChoiceQuestionGrammarParser.ARROW, 0); }
		public TerminalNode CORRECT() { return getToken(multipleChoiceQuestionGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(multipleChoiceQuestionGrammarParser.WRONG, 0); }
		public TerminalNode SPACE() { return getToken(multipleChoiceQuestionGrammarParser.SPACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public MissingWordQuestion_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterMissingWordQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitMissingWordQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_optionsContext missingWordQuestion_options() throws RecognitionException {
		MissingWordQuestion_optionsContext _localctx = new MissingWordQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_missingWordQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				match(STRING);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(180);
			match(ARROW);
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(182);
				match(T__11);
				setState(183);
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
		public List<TerminalNode> NEWLINE() { return getTokens(multipleChoiceQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__12);
			setState(188);
			match(NEWLINE);
			setState(189);
			questionValue();
			setState(190);
			match(NEWLINE);
			setState(191);
			feedback();
			setState(192);
			match(NEWLINE);
			setState(193);
			trueFalseQuestion_sentence();
			setState(194);
			match(NEWLINE);
			setState(195);
			trueFalseQuestion_anwser();
			setState(196);
			match(NEWLINE);
			setState(197);
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
		public List<TerminalNode> STRING() { return getTokens(multipleChoiceQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.STRING, i);
		}
		public TrueFalseQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterTrueFalseQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitTrueFalseQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() throws RecognitionException {
		TrueFalseQuestion_sentenceContext _localctx = new TrueFalseQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				match(STRING);
				}
				}
				setState(202); 
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
		public TerminalNode TRUE() { return getToken(multipleChoiceQuestionGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(multipleChoiceQuestionGrammarParser.FALSE, 0); }
		public TrueFalseQuestion_anwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).enterTrueFalseQuestion_anwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof multipleChoiceQuestionGrammarListener ) ((multipleChoiceQuestionGrammarListener)listener).exitTrueFalseQuestion_anwser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof multipleChoiceQuestionGrammarVisitor ) return ((multipleChoiceQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_anwser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() throws RecognitionException {
		TrueFalseQuestion_anwserContext _localctx = new TrueFalseQuestion_anwserContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		"\u0004\u0001\u001f\u00cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u0003?\b\u0003\u000b\u0003\f\u0003@\u0001\u0004\u0004\u0004"+
		"D\b\u0004\u000b\u0004\f\u0004E\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007Y\b\u0007\u000b\u0007\f\u0007Z\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0004\b`\b\b\u000b\b\f\ba\u0001\t\u0004\te\b\t\u000b"+
		"\t\f\tf\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bz\b\u000b\u000b\u000b\f\u000b{\u0001\f\u0001\f\u0003"+
		"\f\u0080\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0096"+
		"\b\u000e\u000b\u000e\f\u000e\u0097\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0005\u0010\u00a3\b\u0010\n\u0010\f\u0010\u00a6\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00ac\b\u0011\u000b\u0011\f"+
		"\u0011\u00ad\u0001\u0012\u0004\u0012\u00b1\b\u0012\u000b\u0012\f\u0012"+
		"\u00b2\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ba\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u00c9\b\u0014\u000b\u0014\f"+
		"\u0014\u00ca\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0003\u0001\u0000\u0010\u0011\u0002\u0000\u000e\u000e"+
		"\u001c\u001c\u0001\u0000\u001e\u001f\u00c5\u0000,\u0001\u0000\u0000\u0000"+
		"\u00027\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006>"+
		"\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000"+
		"\u0000\fM\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010"+
		"_\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014l\u0001"+
		"\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018}\u0001\u0000\u0000"+
		"\u0000\u001a\u0084\u0001\u0000\u0000\u0000\u001c\u008e\u0001\u0000\u0000"+
		"\u0000\u001e\u009b\u0001\u0000\u0000\u0000 \u00a4\u0001\u0000\u0000\u0000"+
		"\"\u00a7\u0001\u0000\u0000\u0000$\u00b0\u0001\u0000\u0000\u0000&\u00bb"+
		"\u0001\u0000\u0000\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0005\u0019\u0000\u0000./\u0003"+
		"\u0002\u0001\u0000/0\u0005\u0019\u0000\u000001\u0003\u0004\u0002\u0000"+
		"12\u0005\u0019\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0019\u0000"+
		"\u000045\u0003\b\u0004\u000056\u0005\u0002\u0000\u00006\u0001\u0001\u0000"+
		"\u0000\u000078\u0005\u0003\u0000\u000089\u0005\u000e\u0000\u00009\u0003"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005\u0017\u0000"+
		"\u0000<\u0005\u0001\u0000\u0000\u0000=?\u0005\u0017\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BD\u0003\n\u0005"+
		"\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000GH\u0003"+
		"\f\u0006\u0000HI\u0005\u0012\u0000\u0000IJ\u0007\u0000\u0000\u0000JK\u0005"+
		"\u000f\u0000\u0000KL\u0005\u0019\u0000\u0000L\u000b\u0001\u0000\u0000"+
		"\u0000MN\u0005\u0017\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\u0005"+
		"\u0000\u0000PQ\u0005\u0019\u0000\u0000QR\u0003\u0002\u0001\u0000RS\u0005"+
		"\u0019\u0000\u0000ST\u0003\u0004\u0002\u0000TU\u0005\u0019\u0000\u0000"+
		"UV\u0003\u0010\b\u0000VX\u0005\u0019\u0000\u0000WY\u0003\u0012\t\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u0002"+
		"\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^`\u0005\u0017\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000ce\u0005"+
		"\u0017\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0012\u0000\u0000ij\u0005\u000e\u0000\u0000jk\u0005\u0019"+
		"\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0005\u0006\u0000\u0000"+
		"mn\u0005\u0019\u0000\u0000no\u0003\u0002\u0001\u0000op\u0005\u0019\u0000"+
		"\u0000pq\u0003\u0004\u0002\u0000qr\u0005\u0019\u0000\u0000rs\u0003\u0016"+
		"\u000b\u0000st\u0005\u0019\u0000\u0000tu\u0003\u0018\f\u0000uv\u0005\u0019"+
		"\u0000\u0000vw\u0005\u0002\u0000\u0000w\u0015\u0001\u0000\u0000\u0000"+
		"xz\u0005\u0017\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0017\u0001"+
		"\u0000\u0000\u0000}\u007f\u0007\u0001\u0000\u0000~\u0080\u0003\u001a\r"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0012\u0000\u0000"+
		"\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u0019\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0013\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000"+
		"\u0086\u0087\u0005\u001b\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000"+
		"\u0088\u0089\u0007\u0001\u0000\u0000\u0089\u008a\u0005\u0013\u0000\u0000"+
		"\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c\u0007\u0001\u0000\u0000\u008c"+
		"\u008d\u0005\t\u0000\u0000\u008d\u001b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\n\u0000\u0000\u008f\u0090\u0005\u0019\u0000\u0000\u0090\u0091\u0003"+
		"\u0002\u0001\u0000\u0091\u0092\u0005\u0019\u0000\u0000\u0092\u0093\u0003"+
		"\u0004\u0002\u0000\u0093\u0095\u0005\u0019\u0000\u0000\u0094\u0096\u0003"+
		"\u001e\u000f\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0002\u0000\u0000\u009a\u001d\u0001\u0000\u0000\u0000\u009b\u009c\u0003"+
		" \u0010\u0000\u009c\u009d\u0005\u001d\u0000\u0000\u009d\u009e\u0003 \u0010"+
		"\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0\u0005\u0019\u0000\u0000"+
		"\u00a0\u001f\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005\u0017\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5!\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0013\u0000\u0000\u00a8\u00a9\u0005\u000b\u0000\u0000\u00a9"+
		"\u00ab\u0003$\u0012\u0000\u00aa\u00ac\u0003$\u0012\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae#\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0005\u0017\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0012\u0000\u0000\u00b5\u00b9\u0007\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\f\u0000\u0000\u00b7\u00ba\u0005\u0013\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba%\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\r\u0000\u0000\u00bc\u00bd\u0005\u0019\u0000\u0000\u00bd"+
		"\u00be\u0003\u0002\u0001\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf"+
		"\u00c0\u0003\u0004\u0002\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1"+
		"\u00c2\u0003(\u0014\u0000\u00c2\u00c3\u0005\u0019\u0000\u0000\u00c3\u00c4"+
		"\u0003*\u0015\u0000\u00c4\u00c5\u0005\u0019\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0002\u0000\u0000\u00c6\'\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005\u0017"+
		"\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb)\u0001\u0000\u0000\u0000\u00cc\u00cd\u0007\u0002\u0000"+
		"\u0000\u00cd+\u0001\u0000\u0000\u0000\r@EZaf{\u007f\u0097\u00a4\u00ad"+
		"\u00b2\u00b9\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}