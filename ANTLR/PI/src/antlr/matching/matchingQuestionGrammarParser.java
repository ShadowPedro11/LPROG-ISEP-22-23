package antlr.matching;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\matchingQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class matchingQuestionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBERS=16, 
		INT=17, STRING=18, WORD=19, WS=20, NEWLINE=21, CORRECT=22, WRONG=23, ARROW=24, 
		ERROR=25, DECIMAL=26, MISSING_WORDSYMBOL=27, TRUE=28, FALSE=29;
	public static final int
		RULE_matchingQuestion = 0, RULE_matchingQuestion_questionText = 1, RULE_matchingQuestion_subQuestions = 2, 
		RULE_matchingQuestion_subQuestion = 3, RULE_matchingQuestion_answers = 4, 
		RULE_matchingQuestion_answer = 5, RULE_multipleChoiceQuestion = 6, RULE_multipleChoiceQuestion_questionText = 7, 
		RULE_multipleChoiceQuestion_options = 8, RULE_multipleChoiceQuestion_option = 9, 
		RULE_multipleChoiceQuestion_optionText = 10, RULE_shortAnswerQuestion = 11, 
		RULE_shortAnswerQuestion_question = 12, RULE_shortAnswerQuestion_answer = 13, 
		RULE_numericalQuestion = 14, RULE_numericalQuestion_question = 15, RULE_numericalQuestion_answer = 16, 
		RULE_numericalQuestion_error = 17, RULE_missingWordQuestion = 18, RULE_missingWordQuestion_lines = 19, 
		RULE_missingWordQuestion_sentence = 20, RULE_missingWordQuestion_answer = 21, 
		RULE_missingWordQuestion_options = 22, RULE_trueFalseQuestion = 23, RULE_trueFalseQuestion_sentence = 24, 
		RULE_trueFalseQuestion_anwser = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"matchingQuestion", "matchingQuestion_questionText", "matchingQuestion_subQuestions", 
			"matchingQuestion_subQuestion", "matchingQuestion_answers", "matchingQuestion_answer", 
			"multipleChoiceQuestion", "multipleChoiceQuestion_questionText", "multipleChoiceQuestion_options", 
			"multipleChoiceQuestion_option", "multipleChoiceQuestion_optionText", 
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
			null, "'=====MATCHING_QUESTION====='", "'=====END_QUESTION====='", "'Sub-Questions:'", 
			"'Answers:'", "'=====MULTIPLE_CHOICE_QUESTION====='", "'=====SHORT_ANSWER_QUESTION====='", 
			"'=====NUMERICAL_QUESTION====='", "'('", "'-'", "'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", 
			"'Answer:'", "','", "'=====TRUE_OR_FALSE_QUESTION====='", null, null, 
			null, null, null, null, "'correct'", "'wrong'", "'->'", "'ERROR '", null, 
			"'___'", "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NUMBERS", "INT", "STRING", "WORD", "WS", "NEWLINE", 
			"CORRECT", "WRONG", "ARROW", "ERROR", "DECIMAL", "MISSING_WORDSYMBOL", 
			"TRUE", "FALSE"
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
	public String getGrammarFileName() { return "matchingQuestionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public matchingQuestionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchingQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(matchingQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matchingQuestionGrammarParser.NEWLINE, i);
		}
		public MatchingQuestion_questionTextContext matchingQuestion_questionText() {
			return getRuleContext(MatchingQuestion_questionTextContext.class,0);
		}
		public MatchingQuestion_subQuestionsContext matchingQuestion_subQuestions() {
			return getRuleContext(MatchingQuestion_subQuestionsContext.class,0);
		}
		public MatchingQuestion_answersContext matchingQuestion_answers() {
			return getRuleContext(MatchingQuestion_answersContext.class,0);
		}
		public MatchingQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMatchingQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMatchingQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMatchingQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestionContext matchingQuestion() throws RecognitionException {
		MatchingQuestionContext _localctx = new MatchingQuestionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_matchingQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(NEWLINE);
			setState(54);
			matchingQuestion_questionText();
			setState(55);
			match(NEWLINE);
			setState(56);
			matchingQuestion_subQuestions();
			setState(57);
			matchingQuestion_answers();
			setState(58);
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
	public static class MatchingQuestion_questionTextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(matchingQuestionGrammarParser.STRING, 0); }
		public MatchingQuestion_questionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_questionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMatchingQuestion_questionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMatchingQuestion_questionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_questionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_questionTextContext matchingQuestion_questionText() throws RecognitionException {
		MatchingQuestion_questionTextContext _localctx = new MatchingQuestion_questionTextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_matchingQuestion_questionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
	public static class MatchingQuestion_subQuestionsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public List<MatchingQuestion_subQuestionContext> matchingQuestion_subQuestion() {
			return getRuleContexts(MatchingQuestion_subQuestionContext.class);
		}
		public MatchingQuestion_subQuestionContext matchingQuestion_subQuestion(int i) {
			return getRuleContext(MatchingQuestion_subQuestionContext.class,i);
		}
		public MatchingQuestion_subQuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_subQuestions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMatchingQuestion_subQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMatchingQuestion_subQuestions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_subQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_subQuestionsContext matchingQuestion_subQuestions() throws RecognitionException {
		MatchingQuestion_subQuestionsContext _localctx = new MatchingQuestion_subQuestionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matchingQuestion_subQuestions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__2);
			setState(63);
			match(NEWLINE);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				matchingQuestion_subQuestion();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERS );
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
	public static class MatchingQuestion_subQuestionContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(matchingQuestionGrammarParser.NUMBERS, 0); }
		public TerminalNode STRING() { return getToken(matchingQuestionGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public MatchingQuestion_subQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_subQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMatchingQuestion_subQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMatchingQuestion_subQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_subQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_subQuestionContext matchingQuestion_subQuestion() throws RecognitionException {
		MatchingQuestion_subQuestionContext _localctx = new MatchingQuestion_subQuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_matchingQuestion_subQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NUMBERS);
			setState(70);
			match(STRING);
			setState(71);
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
	public static class MatchingQuestion_answersContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public List<MatchingQuestion_answerContext> matchingQuestion_answer() {
			return getRuleContexts(MatchingQuestion_answerContext.class);
		}
		public MatchingQuestion_answerContext matchingQuestion_answer(int i) {
			return getRuleContext(MatchingQuestion_answerContext.class,i);
		}
		public MatchingQuestion_answersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_answers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMatchingQuestion_answers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMatchingQuestion_answers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_answers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_answersContext matchingQuestion_answers() throws RecognitionException {
		MatchingQuestion_answersContext _localctx = new MatchingQuestion_answersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matchingQuestion_answers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(74);
			match(NEWLINE);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				matchingQuestion_answer();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBERS );
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
	public static class MatchingQuestion_answerContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(matchingQuestionGrammarParser.NUMBERS, 0); }
		public TerminalNode STRING() { return getToken(matchingQuestionGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public MatchingQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMatchingQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMatchingQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_answerContext matchingQuestion_answer() throws RecognitionException {
		MatchingQuestion_answerContext _localctx = new MatchingQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matchingQuestion_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NUMBERS);
			setState(81);
			match(STRING);
			setState(82);
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
	public static class MultipleChoiceQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(matchingQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matchingQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMultipleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMultipleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestionContext multipleChoiceQuestion() throws RecognitionException {
		MultipleChoiceQuestionContext _localctx = new MultipleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multipleChoiceQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__4);
			setState(85);
			match(NEWLINE);
			setState(86);
			multipleChoiceQuestion_questionText();
			setState(87);
			match(NEWLINE);
			setState(88);
			multipleChoiceQuestion_options();
			setState(89);
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
	public static class MultipleChoiceQuestion_questionTextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public MultipleChoiceQuestion_questionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_questionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMultipleChoiceQuestion_questionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMultipleChoiceQuestion_questionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_questionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_questionTextContext multipleChoiceQuestion_questionText() throws RecognitionException {
		MultipleChoiceQuestion_questionTextContext _localctx = new MultipleChoiceQuestion_questionTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multipleChoiceQuestion_questionText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(STRING);
				}
				}
				setState(94); 
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMultipleChoiceQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMultipleChoiceQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionsContext multipleChoiceQuestion_options() throws RecognitionException {
		MultipleChoiceQuestion_optionsContext _localctx = new MultipleChoiceQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multipleChoiceQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				multipleChoiceQuestion_option();
				}
				}
				setState(99); 
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
		public TerminalNode ARROW() { return getToken(matchingQuestionGrammarParser.ARROW, 0); }
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public TerminalNode CORRECT() { return getToken(matchingQuestionGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(matchingQuestionGrammarParser.WRONG, 0); }
		public MultipleChoiceQuestion_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMultipleChoiceQuestion_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMultipleChoiceQuestion_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionContext multipleChoiceQuestion_option() throws RecognitionException {
		MultipleChoiceQuestion_optionContext _localctx = new MultipleChoiceQuestion_optionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multipleChoiceQuestion_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			multipleChoiceQuestion_optionText();
			setState(102);
			match(ARROW);
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
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
		public TerminalNode STRING() { return getToken(matchingQuestionGrammarParser.STRING, 0); }
		public MultipleChoiceQuestion_optionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_optionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMultipleChoiceQuestion_optionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMultipleChoiceQuestion_optionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_optionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionTextContext multipleChoiceQuestion_optionText() throws RecognitionException {
		MultipleChoiceQuestion_optionTextContext _localctx = new MultipleChoiceQuestion_optionTextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multipleChoiceQuestion_optionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		public List<TerminalNode> NEWLINE() { return getTokens(matchingQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matchingQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(109);
			match(NEWLINE);
			setState(110);
			shortAnswerQuestion_question();
			setState(111);
			match(NEWLINE);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				shortAnswerQuestion_answer();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(117);
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
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterShortAnswerQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitShortAnswerQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_questionContext shortAnswerQuestion_question() throws RecognitionException {
		ShortAnswerQuestion_questionContext _localctx = new ShortAnswerQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shortAnswerQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				match(STRING);
				}
				}
				setState(122); 
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
		public TerminalNode ARROW() { return getToken(matchingQuestionGrammarParser.ARROW, 0); }
		public TerminalNode INT() { return getToken(matchingQuestionGrammarParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterShortAnswerQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitShortAnswerQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_answerContext shortAnswerQuestion_answer() throws RecognitionException {
		ShortAnswerQuestion_answerContext _localctx = new ShortAnswerQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_shortAnswerQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				match(STRING);
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(129);
			match(ARROW);
			setState(130);
			match(INT);
			setState(131);
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
		public List<TerminalNode> NEWLINE() { return getTokens(matchingQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matchingQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterNumericalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitNumericalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestionContext numericalQuestion() throws RecognitionException {
		NumericalQuestionContext _localctx = new NumericalQuestionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(134);
			match(NEWLINE);
			setState(135);
			numericalQuestion_question();
			setState(136);
			match(NEWLINE);
			setState(137);
			numericalQuestion_answer();
			setState(138);
			match(NEWLINE);
			setState(139);
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
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public NumericalQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterNumericalQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitNumericalQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_questionContext numericalQuestion_question() throws RecognitionException {
		NumericalQuestion_questionContext _localctx = new NumericalQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(STRING);
				}
				}
				setState(144); 
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
		public TerminalNode ARROW() { return getToken(matchingQuestionGrammarParser.ARROW, 0); }
		public List<TerminalNode> INT() { return getTokens(matchingQuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(matchingQuestionGrammarParser.INT, i);
		}
		public TerminalNode DECIMAL() { return getToken(matchingQuestionGrammarParser.DECIMAL, 0); }
		public NumericalQuestion_errorContext numericalQuestion_error() {
			return getRuleContext(NumericalQuestion_errorContext.class,0);
		}
		public NumericalQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterNumericalQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitNumericalQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_answerContext numericalQuestion_answer() throws RecognitionException {
		NumericalQuestion_answerContext _localctx = new NumericalQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(147);
				numericalQuestion_error();
				}
			}

			setState(150);
			match(ARROW);
			setState(151);
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
		public TerminalNode ERROR() { return getToken(matchingQuestionGrammarParser.ERROR, 0); }
		public List<TerminalNode> INT() { return getTokens(matchingQuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(matchingQuestionGrammarParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(matchingQuestionGrammarParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(matchingQuestionGrammarParser.DECIMAL, i);
		}
		public NumericalQuestion_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterNumericalQuestion_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitNumericalQuestion_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_errorContext numericalQuestion_error() throws RecognitionException {
		NumericalQuestion_errorContext _localctx = new NumericalQuestion_errorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__7);
			setState(154);
			match(ERROR);
			setState(155);
			match(T__8);
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			match(T__9);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(T__10);
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
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMissingWordQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMissingWordQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestionContext missingWordQuestion() throws RecognitionException {
		MissingWordQuestionContext _localctx = new MissingWordQuestionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__11);
			setState(162);
			match(NEWLINE);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				missingWordQuestion_lines();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==MISSING_WORDSYMBOL );
			setState(168);
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
		public TerminalNode MISSING_WORDSYMBOL() { return getToken(matchingQuestionGrammarParser.MISSING_WORDSYMBOL, 0); }
		public MissingWordQuestion_answerContext missingWordQuestion_answer() {
			return getRuleContext(MissingWordQuestion_answerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(matchingQuestionGrammarParser.NEWLINE, 0); }
		public MissingWordQuestion_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMissingWordQuestion_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMissingWordQuestion_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_linesContext missingWordQuestion_lines() throws RecognitionException {
		MissingWordQuestion_linesContext _localctx = new MissingWordQuestion_linesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			missingWordQuestion_sentence();
			setState(171);
			match(MISSING_WORDSYMBOL);
			setState(172);
			missingWordQuestion_sentence();
			setState(173);
			missingWordQuestion_answer();
			{
			setState(174);
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
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public MissingWordQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMissingWordQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMissingWordQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_sentenceContext missingWordQuestion_sentence() throws RecognitionException {
		MissingWordQuestion_sentenceContext _localctx = new MissingWordQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(176);
				match(STRING);
				}
				}
				setState(181);
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMissingWordQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMissingWordQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_answerContext missingWordQuestion_answer() throws RecognitionException {
		MissingWordQuestion_answerContext _localctx = new MissingWordQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__12);
			setState(183);
			missingWordQuestion_options();
			setState(184);
			match(T__13);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				missingWordQuestion_options();
				}
				}
				setState(188); 
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
		public TerminalNode ARROW() { return getToken(matchingQuestionGrammarParser.ARROW, 0); }
		public TerminalNode CORRECT() { return getToken(matchingQuestionGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(matchingQuestionGrammarParser.WRONG, 0); }
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public MissingWordQuestion_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterMissingWordQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitMissingWordQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_optionsContext missingWordQuestion_options() throws RecognitionException {
		MissingWordQuestion_optionsContext _localctx = new MissingWordQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_missingWordQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				match(STRING);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(195);
			match(ARROW);
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(197);
				match(T__13);
				}
				break;
			case 2:
				{
				}
				break;
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
		public List<TerminalNode> NEWLINE() { return getTokens(matchingQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(matchingQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__14);
			setState(202);
			match(NEWLINE);
			setState(203);
			trueFalseQuestion_sentence();
			setState(204);
			match(NEWLINE);
			setState(205);
			trueFalseQuestion_anwser();
			setState(206);
			match(NEWLINE);
			setState(207);
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
		public List<TerminalNode> STRING() { return getTokens(matchingQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(matchingQuestionGrammarParser.STRING, i);
		}
		public TrueFalseQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterTrueFalseQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitTrueFalseQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() throws RecognitionException {
		TrueFalseQuestion_sentenceContext _localctx = new TrueFalseQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				match(STRING);
				}
				}
				setState(212); 
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
		public TerminalNode TRUE() { return getToken(matchingQuestionGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(matchingQuestionGrammarParser.FALSE, 0); }
		public TrueFalseQuestion_anwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).enterTrueFalseQuestion_anwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matchingQuestionGrammarListener ) ((matchingQuestionGrammarListener)listener).exitTrueFalseQuestion_anwser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matchingQuestionGrammarVisitor ) return ((matchingQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_anwser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() throws RecognitionException {
		TrueFalseQuestion_anwserContext _localctx = new TrueFalseQuestion_anwserContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		"\u0004\u0001\u001d\u00d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002B\b\u0002\u000b"+
		"\u0002\f\u0002C\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004M\b\u0004\u000b\u0004\f\u0004"+
		"N\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0004\u0007]\b\u0007\u000b\u0007\f\u0007^\u0001\b\u0004\bb\b\b\u000b"+
		"\b\f\bc\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000br\b"+
		"\u000b\u000b\u000b\f\u000bs\u0001\u000b\u0001\u000b\u0001\f\u0004\fy\b"+
		"\f\u000b\f\f\fz\u0001\r\u0004\r~\b\r\u000b\r\f\r\u007f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u008f"+
		"\b\u000f\u000b\u000f\f\u000f\u0090\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0095\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00a5\b\u0012\u000b\u0012"+
		"\f\u0012\u00a6\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u00b2\b\u0014"+
		"\n\u0014\f\u0014\u00b5\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0004\u0015\u00bb\b\u0015\u000b\u0015\f\u0015\u00bc\u0001\u0016"+
		"\u0004\u0016\u00c0\b\u0016\u000b\u0016\f\u0016\u00c1\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00c8\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0004\u0018\u00d3\b\u0018\u000b\u0018\f\u0018\u00d4"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02\u0000\u0003\u0001\u0000\u0016\u0017\u0002\u0000\u0011\u0011\u001a"+
		"\u001a\u0001\u0000\u001c\u001d\u00cd\u00004\u0001\u0000\u0000\u0000\u0002"+
		"<\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006E\u0001"+
		"\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000"+
		"\fT\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010a\u0001"+
		"\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000"+
		"\u0000\u0016l\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001a"+
		"}\u0001\u0000\u0000\u0000\u001c\u0085\u0001\u0000\u0000\u0000\u001e\u008e"+
		"\u0001\u0000\u0000\u0000 \u0092\u0001\u0000\u0000\u0000\"\u0099\u0001"+
		"\u0000\u0000\u0000$\u00a1\u0001\u0000\u0000\u0000&\u00aa\u0001\u0000\u0000"+
		"\u0000(\u00b3\u0001\u0000\u0000\u0000*\u00b6\u0001\u0000\u0000\u0000,"+
		"\u00bf\u0001\u0000\u0000\u0000.\u00c9\u0001\u0000\u0000\u00000\u00d2\u0001"+
		"\u0000\u0000\u00002\u00d6\u0001\u0000\u0000\u000045\u0005\u0001\u0000"+
		"\u000056\u0005\u0015\u0000\u000067\u0003\u0002\u0001\u000078\u0005\u0015"+
		"\u0000\u000089\u0003\u0004\u0002\u00009:\u0003\b\u0004\u0000:;\u0005\u0002"+
		"\u0000\u0000;\u0001\u0001\u0000\u0000\u0000<=\u0005\u0012\u0000\u0000"+
		"=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000?A\u0005\u0015"+
		"\u0000\u0000@B\u0003\u0006\u0003\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000EF\u0005\u0010\u0000\u0000FG\u0005\u0012"+
		"\u0000\u0000GH\u0005\u0015\u0000\u0000H\u0007\u0001\u0000\u0000\u0000"+
		"IJ\u0005\u0004\u0000\u0000JL\u0005\u0015\u0000\u0000KM\u0003\n\u0005\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005\u0010"+
		"\u0000\u0000QR\u0005\u0012\u0000\u0000RS\u0005\u0015\u0000\u0000S\u000b"+
		"\u0001\u0000\u0000\u0000TU\u0005\u0005\u0000\u0000UV\u0005\u0015\u0000"+
		"\u0000VW\u0003\u000e\u0007\u0000WX\u0005\u0015\u0000\u0000XY\u0003\u0010"+
		"\b\u0000YZ\u0005\u0002\u0000\u0000Z\r\u0001\u0000\u0000\u0000[]\u0005"+
		"\u0012\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u000f\u0001\u0000"+
		"\u0000\u0000`b\u0003\u0012\t\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0011"+
		"\u0001\u0000\u0000\u0000ef\u0003\u0014\n\u0000fg\u0005\u0018\u0000\u0000"+
		"gh\u0007\u0000\u0000\u0000hi\u0005\u0015\u0000\u0000i\u0013\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0012\u0000\u0000k\u0015\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0006\u0000\u0000mn\u0005\u0015\u0000\u0000no\u0003\u0018\f\u0000"+
		"oq\u0005\u0015\u0000\u0000pr\u0003\u001a\r\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0002\u0000\u0000v\u0017\u0001"+
		"\u0000\u0000\u0000wy\u0005\u0012\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u0019\u0001\u0000\u0000\u0000|~\u0005\u0012\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0083\u0005\u0011\u0000"+
		"\u0000\u0083\u0084\u0005\u0015\u0000\u0000\u0084\u001b\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0087\u0005\u0015\u0000"+
		"\u0000\u0087\u0088\u0003\u001e\u000f\u0000\u0088\u0089\u0005\u0015\u0000"+
		"\u0000\u0089\u008a\u0003 \u0010\u0000\u008a\u008b\u0005\u0015\u0000\u0000"+
		"\u008b\u008c\u0005\u0002\u0000\u0000\u008c\u001d\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0005\u0012\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001f\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0007\u0001\u0000\u0000\u0093\u0095\u0003\"\u0011\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0018\u0000\u0000\u0097"+
		"\u0098\u0005\u0011\u0000\u0000\u0098!\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\b\u0000\u0000\u009a\u009b\u0005\u0019\u0000\u0000\u009b\u009c\u0005"+
		"\t\u0000\u0000\u009c\u009d\u0007\u0001\u0000\u0000\u009d\u009e\u0005\n"+
		"\u0000\u0000\u009e\u009f\u0007\u0001\u0000\u0000\u009f\u00a0\u0005\u000b"+
		"\u0000\u0000\u00a0#\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\f\u0000"+
		"\u0000\u00a2\u00a4\u0005\u0015\u0000\u0000\u00a3\u00a5\u0003&\u0013\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0002\u0000\u0000"+
		"\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003(\u0014\u0000\u00ab\u00ac"+
		"\u0005\u001b\u0000\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\u00ae\u0003"+
		"*\u0015\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\'\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0005\u0012\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4)\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\r\u0000\u0000"+
		"\u00b7\u00b8\u0003,\u0016\u0000\u00b8\u00ba\u0005\u000e\u0000\u0000\u00b9"+
		"\u00bb\u0003,\u0016\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd+\u0001\u0000\u0000\u0000\u00be\u00c0\u0005"+
		"\u0012\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0018\u0000\u0000\u00c4\u00c7\u0007\u0000\u0000\u0000\u00c5\u00c8\u0005"+
		"\u000e\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8-\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u000f\u0000\u0000\u00ca\u00cb\u0005\u0015"+
		"\u0000\u0000\u00cb\u00cc\u00030\u0018\u0000\u00cc\u00cd\u0005\u0015\u0000"+
		"\u0000\u00cd\u00ce\u00032\u0019\u0000\u00ce\u00cf\u0005\u0015\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0002\u0000\u0000\u00d0/\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0005\u0012\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d51\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0007\u0002\u0000\u0000\u00d73\u0001\u0000\u0000\u0000\u000fCN^csz\u007f"+
		"\u0090\u0094\u00a6\u00b3\u00bc\u00c1\u00c7\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}