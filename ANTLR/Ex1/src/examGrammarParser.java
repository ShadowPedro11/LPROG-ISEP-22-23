// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\examGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class examGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ERROR=25, TRUE=26, FALSE=27, CORRECT=28, WRONG=29, ARROW=30, MISSING_WORDSYMBOL=31, 
		NUMBERS=32, FEEDBACKTYPE=33, INT=34, DECIMAL=35, SPACE=36, HIFEN=37, VIRGULA=38, 
		END_STRING=39, STRING=40, WORD=41, WS=42, NEWLINE=43, PERCENTAGE=44;
	public static final int
		RULE_exam = 0, RULE_title = 1, RULE_header = 2, RULE_feedbackType = 3, 
		RULE_gradeType = 4, RULE_description = 5, RULE_section = 6, RULE_question = 7, 
		RULE_matchingQuestion = 8, RULE_questionValue = 9, RULE_feedback = 10, 
		RULE_matchingQuestion_questionText = 11, RULE_matchingQuestion_subQuestions = 12, 
		RULE_matchingQuestion_subQuestion = 13, RULE_matchingQuestion_answers = 14, 
		RULE_matchingQuestion_answer = 15, RULE_multipleChoiceQuestion = 16, RULE_multipleChoiceQuestion_questionText = 17, 
		RULE_multipleChoiceQuestion_options = 18, RULE_multipleChoiceQuestion_option = 19, 
		RULE_multipleChoiceQuestion_optionText = 20, RULE_shortAnswerQuestion = 21, 
		RULE_shortAnswerQuestion_question = 22, RULE_shortAnswerQuestion_answer = 23, 
		RULE_numericalQuestion = 24, RULE_numericalQuestion_question = 25, RULE_numericalQuestion_answer = 26, 
		RULE_numericalQuestion_error = 27, RULE_missingWordQuestion = 28, RULE_missingWordQuestion_lines = 29, 
		RULE_missingWordQuestion_sentence = 30, RULE_missingWordQuestion_answer = 31, 
		RULE_missingWordQuestion_options = 32, RULE_trueFalseQuestion = 33, RULE_trueFalseQuestion_sentence = 34, 
		RULE_trueFalseQuestion_anwser = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"exam", "title", "header", "feedbackType", "gradeType", "description", 
			"section", "question", "matchingQuestion", "questionValue", "feedback", 
			"matchingQuestion_questionText", "matchingQuestion_subQuestions", "matchingQuestion_subQuestion", 
			"matchingQuestion_answers", "matchingQuestion_answer", "multipleChoiceQuestion", 
			"multipleChoiceQuestion_questionText", "multipleChoiceQuestion_options", 
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
			null, "'=====EXAM_START====='", "'=====EXAM_END====='", "'Title: '", 
			"'Header:'", "'Feedback: '", "'Grade: '", "'Description: '", "'Section: '", 
			"'Question:'", "'=====MATCHING_QUESTION====='", "'=====END_QUESTION====='", 
			"'Value: '", "'Sub-Questions:'", "'Answers:'", "'=====MULTIPLE_CHOICE_QUESTION====='", 
			"'=====SHORT_ANSWER_QUESTION====='", "'=====NUMERICAL_QUESTION====='", 
			"'('", "'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", "'Answer: '", 
			"';'", "'=====TRUE_OR_FALSE_QUESTION====='", "'ERROR '", "'True'", "'False'", 
			"'correct'", "'wrong'", null, null, null, null, null, null, "' '", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ERROR", "TRUE", "FALSE", "CORRECT", "WRONG", "ARROW", "MISSING_WORDSYMBOL", 
			"NUMBERS", "FEEDBACKTYPE", "INT", "DECIMAL", "SPACE", "HIFEN", "VIRGULA", 
			"END_STRING", "STRING", "WORD", "WS", "NEWLINE", "PERCENTAGE"
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
	public String getGrammarFileName() { return "examGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public examGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExamContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public ExamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterExam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitExam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitExam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExamContext exam() throws RecognitionException {
		ExamContext _localctx = new ExamContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exam);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			match(NEWLINE);
			setState(74);
			title();
			setState(75);
			header();
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(76);
					section();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(81);
			match(NEWLINE);
			setState(82);
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
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__2);
			setState(85);
			match(STRING);
			setState(86);
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
	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
		}
		public FeedbackTypeContext feedbackType() {
			return getRuleContext(FeedbackTypeContext.class,0);
		}
		public GradeTypeContext gradeType() {
			return getRuleContext(GradeTypeContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NEWLINE);
			setState(89);
			match(T__3);
			setState(90);
			match(NEWLINE);
			setState(91);
			feedbackType();
			setState(92);
			gradeType();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(93);
				description();
				}
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
	public static class FeedbackTypeContext extends ParserRuleContext {
		public TerminalNode FEEDBACKTYPE() { return getToken(examGrammarParser.FEEDBACKTYPE, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public FeedbackTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedbackType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterFeedbackType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitFeedbackType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitFeedbackType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackTypeContext feedbackType() throws RecognitionException {
		FeedbackTypeContext _localctx = new FeedbackTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feedbackType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(97);
			match(FEEDBACKTYPE);
			setState(98);
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
	public static class GradeTypeContext extends ParserRuleContext {
		public TerminalNode FEEDBACKTYPE() { return getToken(examGrammarParser.FEEDBACKTYPE, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public GradeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterGradeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitGradeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitGradeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradeTypeContext gradeType() throws RecognitionException {
		GradeTypeContext _localctx = new GradeTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gradeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
			setState(101);
			match(FEEDBACKTYPE);
			setState(102);
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
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__6);
			setState(105);
			match(STRING);
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
	public static class SectionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
		}
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(NEWLINE);
			setState(109);
			match(T__7);
			setState(110);
			match(STRING);
			setState(111);
			match(NEWLINE);
			setState(112);
			description();
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(113);
					question();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class QuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
		}
		public MatchingQuestionContext matchingQuestion() {
			return getRuleContext(MatchingQuestionContext.class,0);
		}
		public MultipleChoiceQuestionContext multipleChoiceQuestion() {
			return getRuleContext(MultipleChoiceQuestionContext.class,0);
		}
		public ShortAnswerQuestionContext shortAnswerQuestion() {
			return getRuleContext(ShortAnswerQuestionContext.class,0);
		}
		public NumericalQuestionContext numericalQuestion() {
			return getRuleContext(NumericalQuestionContext.class,0);
		}
		public MissingWordQuestionContext missingWordQuestion() {
			return getRuleContext(MissingWordQuestionContext.class,0);
		}
		public TrueFalseQuestionContext trueFalseQuestion() {
			return getRuleContext(TrueFalseQuestionContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NEWLINE);
			setState(119);
			match(T__8);
			setState(120);
			match(NEWLINE);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(121);
				matchingQuestion();
				}
				break;
			case T__14:
				{
				setState(122);
				multipleChoiceQuestion();
				}
				break;
			case T__15:
				{
				setState(123);
				shortAnswerQuestion();
				}
				break;
			case T__16:
				{
				setState(124);
				numericalQuestion();
				}
				break;
			case T__20:
				{
				setState(125);
				missingWordQuestion();
				}
				break;
			case T__23:
				{
				setState(126);
				trueFalseQuestion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
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
	public static class MatchingQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
		}
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public FeedbackContext feedback() {
			return getRuleContext(FeedbackContext.class,0);
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMatchingQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMatchingQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMatchingQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestionContext matchingQuestion() throws RecognitionException {
		MatchingQuestionContext _localctx = new MatchingQuestionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matchingQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__9);
			setState(132);
			match(NEWLINE);
			setState(133);
			questionValue();
			setState(134);
			match(NEWLINE);
			setState(135);
			feedback();
			setState(136);
			match(NEWLINE);
			setState(137);
			matchingQuestion_questionText();
			setState(138);
			match(NEWLINE);
			setState(139);
			matchingQuestion_subQuestions();
			setState(140);
			matchingQuestion_answers();
			setState(141);
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
	public static class QuestionValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(examGrammarParser.INT, 0); }
		public QuestionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionValueContext questionValue() throws RecognitionException {
		QuestionValueContext _localctx = new QuestionValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_questionValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__11);
			setState(144);
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
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public FeedbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterFeedback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitFeedback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitFeedback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackContext feedback() throws RecognitionException {
		FeedbackContext _localctx = new FeedbackContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_feedback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__4);
			setState(147);
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
	public static class MatchingQuestion_questionTextContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public MatchingQuestion_questionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_questionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMatchingQuestion_questionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMatchingQuestion_questionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_questionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_questionTextContext matchingQuestion_questionText() throws RecognitionException {
		MatchingQuestion_questionTextContext _localctx = new MatchingQuestion_questionTextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matchingQuestion_questionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMatchingQuestion_subQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMatchingQuestion_subQuestions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_subQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_subQuestionsContext matchingQuestion_subQuestions() throws RecognitionException {
		MatchingQuestion_subQuestionsContext _localctx = new MatchingQuestion_subQuestionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matchingQuestion_subQuestions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__12);
			setState(152);
			match(NEWLINE);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				matchingQuestion_subQuestion();
				}
				}
				setState(156); 
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
		public TerminalNode NUMBERS() { return getToken(examGrammarParser.NUMBERS, 0); }
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public MatchingQuestion_subQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_subQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMatchingQuestion_subQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMatchingQuestion_subQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_subQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_subQuestionContext matchingQuestion_subQuestion() throws RecognitionException {
		MatchingQuestion_subQuestionContext _localctx = new MatchingQuestion_subQuestionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matchingQuestion_subQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(NUMBERS);
			setState(159);
			match(STRING);
			setState(160);
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
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMatchingQuestion_answers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMatchingQuestion_answers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_answers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_answersContext matchingQuestion_answers() throws RecognitionException {
		MatchingQuestion_answersContext _localctx = new MatchingQuestion_answersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_matchingQuestion_answers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__13);
			setState(163);
			match(NEWLINE);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				matchingQuestion_answer();
				}
				}
				setState(167); 
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
		public TerminalNode NUMBERS() { return getToken(examGrammarParser.NUMBERS, 0); }
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public MatchingQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMatchingQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMatchingQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMatchingQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingQuestion_answerContext matchingQuestion_answer() throws RecognitionException {
		MatchingQuestion_answerContext _localctx = new MatchingQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_matchingQuestion_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(NUMBERS);
			setState(170);
			match(STRING);
			setState(171);
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
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMultipleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMultipleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestionContext multipleChoiceQuestion() throws RecognitionException {
		MultipleChoiceQuestionContext _localctx = new MultipleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multipleChoiceQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__14);
			setState(174);
			match(NEWLINE);
			setState(175);
			questionValue();
			setState(176);
			match(NEWLINE);
			setState(177);
			feedback();
			setState(178);
			match(NEWLINE);
			setState(179);
			multipleChoiceQuestion_questionText();
			setState(180);
			match(NEWLINE);
			setState(181);
			multipleChoiceQuestion_options();
			setState(182);
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
	public static class MultipleChoiceQuestion_questionTextContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public MultipleChoiceQuestion_questionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_questionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMultipleChoiceQuestion_questionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMultipleChoiceQuestion_questionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_questionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_questionTextContext multipleChoiceQuestion_questionText() throws RecognitionException {
		MultipleChoiceQuestion_questionTextContext _localctx = new MultipleChoiceQuestion_questionTextContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multipleChoiceQuestion_questionText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				match(STRING);
				}
				}
				setState(187); 
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMultipleChoiceQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMultipleChoiceQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionsContext multipleChoiceQuestion_options() throws RecognitionException {
		MultipleChoiceQuestion_optionsContext _localctx = new MultipleChoiceQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multipleChoiceQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				multipleChoiceQuestion_option();
				}
				}
				setState(192); 
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
		public TerminalNode ARROW() { return getToken(examGrammarParser.ARROW, 0); }
		public TerminalNode PERCENTAGE() { return getToken(examGrammarParser.PERCENTAGE, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public TerminalNode CORRECT() { return getToken(examGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(examGrammarParser.WRONG, 0); }
		public MultipleChoiceQuestion_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMultipleChoiceQuestion_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMultipleChoiceQuestion_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionContext multipleChoiceQuestion_option() throws RecognitionException {
		MultipleChoiceQuestion_optionContext _localctx = new MultipleChoiceQuestion_optionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multipleChoiceQuestion_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			multipleChoiceQuestion_optionText();
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
			setState(197);
			match(PERCENTAGE);
			setState(198);
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
		public TerminalNode STRING() { return getToken(examGrammarParser.STRING, 0); }
		public MultipleChoiceQuestion_optionTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion_optionText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMultipleChoiceQuestion_optionText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMultipleChoiceQuestion_optionText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion_optionText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestion_optionTextContext multipleChoiceQuestion_optionText() throws RecognitionException {
		MultipleChoiceQuestion_optionTextContext _localctx = new MultipleChoiceQuestion_optionTextContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multipleChoiceQuestion_optionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__15);
			setState(203);
			match(NEWLINE);
			setState(204);
			questionValue();
			setState(205);
			match(NEWLINE);
			setState(206);
			feedback();
			setState(207);
			match(NEWLINE);
			setState(208);
			shortAnswerQuestion_question();
			setState(209);
			match(NEWLINE);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				shortAnswerQuestion_answer();
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(215);
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
	public static class ShortAnswerQuestion_questionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterShortAnswerQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitShortAnswerQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_questionContext shortAnswerQuestion_question() throws RecognitionException {
		ShortAnswerQuestion_questionContext _localctx = new ShortAnswerQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shortAnswerQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(STRING);
				}
				}
				setState(220); 
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
		public TerminalNode ARROW() { return getToken(examGrammarParser.ARROW, 0); }
		public TerminalNode INT() { return getToken(examGrammarParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public ShortAnswerQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterShortAnswerQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitShortAnswerQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestion_answerContext shortAnswerQuestion_answer() throws RecognitionException {
		ShortAnswerQuestion_answerContext _localctx = new ShortAnswerQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shortAnswerQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(STRING);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(227);
			match(ARROW);
			setState(228);
			match(INT);
			setState(229);
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
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterNumericalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitNumericalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitNumericalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestionContext numericalQuestion() throws RecognitionException {
		NumericalQuestionContext _localctx = new NumericalQuestionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__16);
			setState(232);
			match(NEWLINE);
			setState(233);
			questionValue();
			setState(234);
			match(NEWLINE);
			setState(235);
			feedback();
			setState(236);
			match(NEWLINE);
			setState(237);
			numericalQuestion_question();
			setState(238);
			match(NEWLINE);
			setState(239);
			numericalQuestion_answer();
			setState(240);
			match(NEWLINE);
			setState(241);
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
	public static class NumericalQuestion_questionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public NumericalQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterNumericalQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitNumericalQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_questionContext numericalQuestion_question() throws RecognitionException {
		NumericalQuestion_questionContext _localctx = new NumericalQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(STRING);
				}
				}
				setState(246); 
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
		public TerminalNode ARROW() { return getToken(examGrammarParser.ARROW, 0); }
		public List<TerminalNode> INT() { return getTokens(examGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(examGrammarParser.INT, i);
		}
		public TerminalNode DECIMAL() { return getToken(examGrammarParser.DECIMAL, 0); }
		public NumericalQuestion_errorContext numericalQuestion_error() {
			return getRuleContext(NumericalQuestion_errorContext.class,0);
		}
		public NumericalQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterNumericalQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitNumericalQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_answerContext numericalQuestion_answer() throws RecognitionException {
		NumericalQuestion_answerContext _localctx = new NumericalQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(249);
				numericalQuestion_error();
				}
			}

			setState(252);
			match(ARROW);
			setState(253);
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
		public List<TerminalNode> SPACE() { return getTokens(examGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(examGrammarParser.SPACE, i);
		}
		public TerminalNode ERROR() { return getToken(examGrammarParser.ERROR, 0); }
		public TerminalNode HIFEN() { return getToken(examGrammarParser.HIFEN, 0); }
		public List<TerminalNode> INT() { return getTokens(examGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(examGrammarParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(examGrammarParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(examGrammarParser.DECIMAL, i);
		}
		public NumericalQuestion_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterNumericalQuestion_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitNumericalQuestion_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_errorContext numericalQuestion_error() throws RecognitionException {
		NumericalQuestion_errorContext _localctx = new NumericalQuestion_errorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(SPACE);
			setState(256);
			match(T__17);
			setState(257);
			match(ERROR);
			setState(258);
			match(HIFEN);
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(260);
			match(SPACE);
			setState(261);
			match(T__18);
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(263);
			match(T__19);
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
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMissingWordQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMissingWordQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestionContext missingWordQuestion() throws RecognitionException {
		MissingWordQuestionContext _localctx = new MissingWordQuestionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__20);
			setState(266);
			match(NEWLINE);
			setState(267);
			questionValue();
			setState(268);
			match(NEWLINE);
			setState(269);
			feedback();
			setState(270);
			match(NEWLINE);
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				missingWordQuestion_lines();
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MISSING_WORDSYMBOL || _la==STRING );
			setState(276);
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
	public static class MissingWordQuestion_linesContext extends ParserRuleContext {
		public List<MissingWordQuestion_sentenceContext> missingWordQuestion_sentence() {
			return getRuleContexts(MissingWordQuestion_sentenceContext.class);
		}
		public MissingWordQuestion_sentenceContext missingWordQuestion_sentence(int i) {
			return getRuleContext(MissingWordQuestion_sentenceContext.class,i);
		}
		public TerminalNode MISSING_WORDSYMBOL() { return getToken(examGrammarParser.MISSING_WORDSYMBOL, 0); }
		public MissingWordQuestion_answerContext missingWordQuestion_answer() {
			return getRuleContext(MissingWordQuestion_answerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(examGrammarParser.NEWLINE, 0); }
		public MissingWordQuestion_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMissingWordQuestion_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMissingWordQuestion_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_linesContext missingWordQuestion_lines() throws RecognitionException {
		MissingWordQuestion_linesContext _localctx = new MissingWordQuestion_linesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			missingWordQuestion_sentence();
			setState(279);
			match(MISSING_WORDSYMBOL);
			setState(280);
			missingWordQuestion_sentence();
			setState(281);
			missingWordQuestion_answer();
			{
			setState(282);
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
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public MissingWordQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMissingWordQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMissingWordQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_sentenceContext missingWordQuestion_sentence() throws RecognitionException {
		MissingWordQuestion_sentenceContext _localctx = new MissingWordQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(284);
				match(STRING);
				}
				}
				setState(289);
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
		public TerminalNode SPACE() { return getToken(examGrammarParser.SPACE, 0); }
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMissingWordQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMissingWordQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_answerContext missingWordQuestion_answer() throws RecognitionException {
		MissingWordQuestion_answerContext _localctx = new MissingWordQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(SPACE);
			setState(291);
			match(T__21);
			setState(292);
			missingWordQuestion_options();
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				missingWordQuestion_options();
				}
				}
				setState(296); 
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
		public TerminalNode ARROW() { return getToken(examGrammarParser.ARROW, 0); }
		public TerminalNode CORRECT() { return getToken(examGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(examGrammarParser.WRONG, 0); }
		public TerminalNode SPACE() { return getToken(examGrammarParser.SPACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public MissingWordQuestion_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterMissingWordQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitMissingWordQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_optionsContext missingWordQuestion_options() throws RecognitionException {
		MissingWordQuestion_optionsContext _localctx = new MissingWordQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_missingWordQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				match(STRING);
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(303);
			match(ARROW);
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(305);
				match(T__22);
				setState(306);
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
		public List<TerminalNode> NEWLINE() { return getTokens(examGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(examGrammarParser.NEWLINE, i);
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
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__23);
			setState(311);
			match(NEWLINE);
			setState(312);
			questionValue();
			setState(313);
			match(NEWLINE);
			setState(314);
			feedback();
			setState(315);
			match(NEWLINE);
			setState(316);
			trueFalseQuestion_sentence();
			setState(317);
			match(NEWLINE);
			setState(318);
			trueFalseQuestion_anwser();
			setState(319);
			match(NEWLINE);
			setState(320);
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
	public static class TrueFalseQuestion_sentenceContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(examGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(examGrammarParser.STRING, i);
		}
		public TrueFalseQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterTrueFalseQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitTrueFalseQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() throws RecognitionException {
		TrueFalseQuestion_sentenceContext _localctx = new TrueFalseQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(STRING);
				}
				}
				setState(325); 
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
		public TerminalNode TRUE() { return getToken(examGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(examGrammarParser.FALSE, 0); }
		public TrueFalseQuestion_anwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).enterTrueFalseQuestion_anwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof examGrammarListener ) ((examGrammarListener)listener).exitTrueFalseQuestion_anwser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof examGrammarVisitor ) return ((examGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_anwser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() throws RecognitionException {
		TrueFalseQuestion_anwserContext _localctx = new TrueFalseQuestion_anwserContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		"\u0004\u0001,\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000N\b\u0000\u000b\u0000\f\u0000O\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002_\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006s\b\u0006\u000b\u0006\f\u0006t\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0080\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u009b\b\f\u000b\f\f\f\u009c"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u00a6\b\u000e\u000b\u000e\f\u000e\u00a7\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u00ba\b\u0011\u000b\u0011\f\u0011"+
		"\u00bb\u0001\u0012\u0004\u0012\u00bf\b\u0012\u000b\u0012\f\u0012\u00c0"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u00d4\b\u0015\u000b\u0015\f\u0015\u00d5\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0004\u0016\u00db\b\u0016\u000b\u0016\f\u0016\u00dc\u0001\u0017"+
		"\u0004\u0017\u00e0\b\u0017\u000b\u0017\f\u0017\u00e1\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u00f5\b\u0019\u000b"+
		"\u0019\f\u0019\u00f6\u0001\u001a\u0001\u001a\u0003\u001a\u00fb\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0004\u001c\u0111\b\u001c\u000b\u001c\f\u001c"+
		"\u0112\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0005\u001e\u011e\b\u001e\n"+
		"\u001e\f\u001e\u0121\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0004\u001f\u0127\b\u001f\u000b\u001f\f\u001f\u0128\u0001 \u0004"+
		" \u012c\b \u000b \f \u012d\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0135"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0004\"\u0144\b\"\u000b\"\f\"\u0145\u0001#\u0001"+
		"#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0003"+
		"\u0001\u0000\u001c\u001d\u0001\u0000\"#\u0001\u0000\u001a\u001b\u013c"+
		"\u0000H\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004X"+
		"\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\bd\u0001\u0000"+
		"\u0000\u0000\nh\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000e"+
		"v\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u008f"+
		"\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016\u0095"+
		"\u0001\u0000\u0000\u0000\u0018\u0097\u0001\u0000\u0000\u0000\u001a\u009e"+
		"\u0001\u0000\u0000\u0000\u001c\u00a2\u0001\u0000\u0000\u0000\u001e\u00a9"+
		"\u0001\u0000\u0000\u0000 \u00ad\u0001\u0000\u0000\u0000\"\u00b9\u0001"+
		"\u0000\u0000\u0000$\u00be\u0001\u0000\u0000\u0000&\u00c2\u0001\u0000\u0000"+
		"\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00ca\u0001\u0000\u0000\u0000,"+
		"\u00da\u0001\u0000\u0000\u0000.\u00df\u0001\u0000\u0000\u00000\u00e7\u0001"+
		"\u0000\u0000\u00002\u00f4\u0001\u0000\u0000\u00004\u00f8\u0001\u0000\u0000"+
		"\u00006\u00ff\u0001\u0000\u0000\u00008\u0109\u0001\u0000\u0000\u0000:"+
		"\u0116\u0001\u0000\u0000\u0000<\u011f\u0001\u0000\u0000\u0000>\u0122\u0001"+
		"\u0000\u0000\u0000@\u012b\u0001\u0000\u0000\u0000B\u0136\u0001\u0000\u0000"+
		"\u0000D\u0143\u0001\u0000\u0000\u0000F\u0147\u0001\u0000\u0000\u0000H"+
		"I\u0005\u0001\u0000\u0000IJ\u0005+\u0000\u0000JK\u0003\u0002\u0001\u0000"+
		"KM\u0003\u0004\u0002\u0000LN\u0003\f\u0006\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005+\u0000\u0000RS\u0005\u0002\u0000"+
		"\u0000S\u0001\u0001\u0000\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0005"+
		"(\u0000\u0000VW\u0005+\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0005"+
		"+\u0000\u0000YZ\u0005\u0004\u0000\u0000Z[\u0005+\u0000\u0000[\\\u0003"+
		"\u0006\u0003\u0000\\^\u0003\b\u0004\u0000]_\u0003\n\u0005\u0000^]\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0005\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0005\u0000\u0000ab\u0005!\u0000\u0000bc\u0005+\u0000\u0000"+
		"c\u0007\u0001\u0000\u0000\u0000de\u0005\u0006\u0000\u0000ef\u0005!\u0000"+
		"\u0000fg\u0005+\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\u0007\u0000"+
		"\u0000ij\u0005(\u0000\u0000jk\u0005+\u0000\u0000k\u000b\u0001\u0000\u0000"+
		"\u0000lm\u0005+\u0000\u0000mn\u0005\b\u0000\u0000no\u0005(\u0000\u0000"+
		"op\u0005+\u0000\u0000pr\u0003\n\u0005\u0000qs\u0003\u000e\u0007\u0000"+
		"rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0005+\u0000"+
		"\u0000wx\u0005\t\u0000\u0000x\u007f\u0005+\u0000\u0000y\u0080\u0003\u0010"+
		"\b\u0000z\u0080\u0003 \u0010\u0000{\u0080\u0003*\u0015\u0000|\u0080\u0003"+
		"0\u0018\u0000}\u0080\u00038\u001c\u0000~\u0080\u0003B!\u0000\u007fy\u0001"+
		"\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000"+
		"\u0000\u007f|\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005+\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\n\u0000\u0000\u0084\u0085\u0005+\u0000\u0000\u0085\u0086\u0003\u0012"+
		"\t\u0000\u0086\u0087\u0005+\u0000\u0000\u0087\u0088\u0003\u0014\n\u0000"+
		"\u0088\u0089\u0005+\u0000\u0000\u0089\u008a\u0003\u0016\u000b\u0000\u008a"+
		"\u008b\u0005+\u0000\u0000\u008b\u008c\u0003\u0018\f\u0000\u008c\u008d"+
		"\u0003\u001c\u000e\u0000\u008d\u008e\u0005\u000b\u0000\u0000\u008e\u0011"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0005"+
		"\"\u0000\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0005"+
		"\u0000\u0000\u0093\u0094\u0005(\u0000\u0000\u0094\u0015\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005(\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\r\u0000\u0000\u0098\u009a\u0005+\u0000\u0000\u0099"+
		"\u009b\u0003\u001a\r\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005 \u0000\u0000\u009f\u00a0\u0005(\u0000\u0000\u00a0\u00a1\u0005+"+
		"\u0000\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000e"+
		"\u0000\u0000\u00a3\u00a5\u0005+\u0000\u0000\u00a4\u00a6\u0003\u001e\u000f"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005 \u0000\u0000"+
		"\u00aa\u00ab\u0005(\u0000\u0000\u00ab\u00ac\u0005+\u0000\u0000\u00ac\u001f"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u00af"+
		"\u0005+\u0000\u0000\u00af\u00b0\u0003\u0012\t\u0000\u00b0\u00b1\u0005"+
		"+\u0000\u0000\u00b1\u00b2\u0003\u0014\n\u0000\u00b2\u00b3\u0005+\u0000"+
		"\u0000\u00b3\u00b4\u0003\"\u0011\u0000\u00b4\u00b5\u0005+\u0000\u0000"+
		"\u00b5\u00b6\u0003$\u0012\u0000\u00b6\u00b7\u0005\u000b\u0000\u0000\u00b7"+
		"!\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005(\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc#\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0003&\u0013\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1%\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0003(\u0014\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000\u00c4"+
		"\u00c5\u0007\u0000\u0000\u0000\u00c5\u00c6\u0005,\u0000\u0000\u00c6\u00c7"+
		"\u0005+\u0000\u0000\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"(\u0000\u0000\u00c9)\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0010\u0000"+
		"\u0000\u00cb\u00cc\u0005+\u0000\u0000\u00cc\u00cd\u0003\u0012\t\u0000"+
		"\u00cd\u00ce\u0005+\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf"+
		"\u00d0\u0005+\u0000\u0000\u00d0\u00d1\u0003,\u0016\u0000\u00d1\u00d3\u0005"+
		"+\u0000\u0000\u00d2\u00d4\u0003.\u0017\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u000b\u0000\u0000\u00d8+\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0005(\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0005(\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"\u001e\u0000\u0000\u00e4\u00e5\u0005\"\u0000\u0000\u00e5\u00e6\u0005+"+
		"\u0000\u0000\u00e6/\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0011\u0000"+
		"\u0000\u00e8\u00e9\u0005+\u0000\u0000\u00e9\u00ea\u0003\u0012\t\u0000"+
		"\u00ea\u00eb\u0005+\u0000\u0000\u00eb\u00ec\u0003\u0014\n\u0000\u00ec"+
		"\u00ed\u0005+\u0000\u0000\u00ed\u00ee\u00032\u0019\u0000\u00ee\u00ef\u0005"+
		"+\u0000\u0000\u00ef\u00f0\u00034\u001a\u0000\u00f0\u00f1\u0005+\u0000"+
		"\u0000\u00f1\u00f2\u0005\u000b\u0000\u0000\u00f21\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0005(\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f73\u0001\u0000\u0000\u0000\u00f8\u00fa"+
		"\u0007\u0001\u0000\u0000\u00f9\u00fb\u00036\u001b\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\u001e\u0000\u0000\u00fd\u00fe\u0005"+
		"\"\u0000\u0000\u00fe5\u0001\u0000\u0000\u0000\u00ff\u0100\u0005$\u0000"+
		"\u0000\u0100\u0101\u0005\u0012\u0000\u0000\u0101\u0102\u0005\u0019\u0000"+
		"\u0000\u0102\u0103\u0005%\u0000\u0000\u0103\u0104\u0007\u0001\u0000\u0000"+
		"\u0104\u0105\u0005$\u0000\u0000\u0105\u0106\u0005\u0013\u0000\u0000\u0106"+
		"\u0107\u0007\u0001\u0000\u0000\u0107\u0108\u0005\u0014\u0000\u0000\u0108"+
		"7\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0015\u0000\u0000\u010a\u010b"+
		"\u0005+\u0000\u0000\u010b\u010c\u0003\u0012\t\u0000\u010c\u010d\u0005"+
		"+\u0000\u0000\u010d\u010e\u0003\u0014\n\u0000\u010e\u0110\u0005+\u0000"+
		"\u0000\u010f\u0111\u0003:\u001d\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\u000b\u0000\u0000\u01159\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0003<\u001e\u0000\u0117\u0118\u0005\u001f\u0000\u0000\u0118\u0119"+
		"\u0003<\u001e\u0000\u0119\u011a\u0003>\u001f\u0000\u011a\u011b\u0005+"+
		"\u0000\u0000\u011b;\u0001\u0000\u0000\u0000\u011c\u011e\u0005(\u0000\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120=\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005$\u0000\u0000\u0123\u0124\u0005\u0016\u0000\u0000\u0124\u0126"+
		"\u0003@ \u0000\u0125\u0127\u0003@ \u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129?\u0001\u0000\u0000\u0000"+
		"\u012a\u012c\u0005(\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005\u001e\u0000\u0000\u0130\u0134\u0007\u0000\u0000\u0000\u0131"+
		"\u0132\u0005\u0017\u0000\u0000\u0132\u0135\u0005$\u0000\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0133"+
		"\u0001\u0000\u0000\u0000\u0135A\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		"\u0018\u0000\u0000\u0137\u0138\u0005+\u0000\u0000\u0138\u0139\u0003\u0012"+
		"\t\u0000\u0139\u013a\u0005+\u0000\u0000\u013a\u013b\u0003\u0014\n\u0000"+
		"\u013b\u013c\u0005+\u0000\u0000\u013c\u013d\u0003D\"\u0000\u013d\u013e"+
		"\u0005+\u0000\u0000\u013e\u013f\u0003F#\u0000\u013f\u0140\u0005+\u0000"+
		"\u0000\u0140\u0141\u0005\u000b\u0000\u0000\u0141C\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0005(\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146E\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0007\u0002\u0000\u0000\u0148G\u0001\u0000\u0000\u0000\u0013O^t\u007f"+
		"\u009c\u00a7\u00bb\u00c0\u00d5\u00dc\u00e1\u00f6\u00fa\u0112\u011f\u0128"+
		"\u012d\u0134\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}