package antlr.multiple;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\multipleChoiceQuestionGrammar.g4 by ANTLR 4.12.0
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
		T__9=10, T__10=11, T__11=12, CORRECT=13, WRONG=14, ARROW=15, STRING=16, 
		WORD=17, NEWLINE=18, WS=19, INT=20, ERROR=21, DECIMAL=22, MISSING_WORDSYMBOL=23, 
		TRUE=24, FALSE=25;
	public static final int
		RULE_multipleChoiceQuestion = 0, RULE_multipleChoiceQuestion_questionText = 1, 
		RULE_multipleChoiceQuestion_options = 2, RULE_multipleChoiceQuestion_option = 3, 
		RULE_multipleChoiceQuestion_optionText = 4, RULE_shortAnswerQuestion = 5, 
		RULE_shortAnswerQuestion_question = 6, RULE_shortAnswerQuestion_answer = 7, 
		RULE_numericalQuestion = 8, RULE_numericalQuestion_question = 9, RULE_numericalQuestion_answer = 10, 
		RULE_numericalQuestion_error = 11, RULE_missingWordQuestion = 12, RULE_missingWordQuestion_lines = 13, 
		RULE_missingWordQuestion_sentence = 14, RULE_missingWordQuestion_answer = 15, 
		RULE_missingWordQuestion_options = 16, RULE_trueFalseQuestion = 17, RULE_trueFalseQuestion_sentence = 18, 
		RULE_trueFalseQuestion_anwser = 19;
	private static String[] makeRuleNames() {
		return new String[] {
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
			null, "'=====MULTIPLE_CHOICE_QUESTION====='", "'=====END_QUESTION====='", 
			"'=====SHORT_ANSWER_QUESTION====='", "'=====NUMERICAL_QUESTION====='", 
			"'('", "'-'", "'+'", "')'", "'=====MISSING_WORDS_QUESTION====='", "'Answer:'", 
			"','", "'=====TRUE_OR_FALSE_QUESTION====='", "'correct'", "'wrong'", 
			"'->'", null, null, null, null, null, "'ERROR '", null, "'___'", "'True'", 
			"'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CORRECT", "WRONG", "ARROW", "STRING", "WORD", "NEWLINE", "WS", 
			"INT", "ERROR", "DECIMAL", "MISSING_WORDSYMBOL", "TRUE", "FALSE"
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
			setState(40);
			match(T__0);
			setState(41);
			match(NEWLINE);
			setState(42);
			multipleChoiceQuestion_questionText();
			setState(43);
			match(NEWLINE);
			setState(44);
			multipleChoiceQuestion_options();
			setState(45);
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
		enterRule(_localctx, 2, RULE_multipleChoiceQuestion_questionText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				match(STRING);
				}
				}
				setState(50); 
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
		enterRule(_localctx, 4, RULE_multipleChoiceQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				multipleChoiceQuestion_option();
				}
				}
				setState(55); 
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
		enterRule(_localctx, 6, RULE_multipleChoiceQuestion_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			multipleChoiceQuestion_optionText();
			setState(58);
			match(ARROW);
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(60);
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
		enterRule(_localctx, 8, RULE_multipleChoiceQuestion_optionText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 10, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
			match(NEWLINE);
			setState(66);
			shortAnswerQuestion_question();
			setState(67);
			match(NEWLINE);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				shortAnswerQuestion_answer();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(73);
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
		enterRule(_localctx, 12, RULE_shortAnswerQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				match(STRING);
				}
				}
				setState(78); 
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
		enterRule(_localctx, 14, RULE_shortAnswerQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				match(STRING);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(85);
			match(ARROW);
			setState(86);
			match(INT);
			setState(87);
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
		enterRule(_localctx, 16, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__3);
			setState(90);
			match(NEWLINE);
			setState(91);
			numericalQuestion_question();
			setState(92);
			match(NEWLINE);
			setState(93);
			numericalQuestion_answer();
			setState(94);
			match(NEWLINE);
			setState(95);
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
		enterRule(_localctx, 18, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(STRING);
				}
				}
				setState(100); 
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
		enterRule(_localctx, 20, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(103);
				numericalQuestion_error();
				}
			}

			setState(106);
			match(ARROW);
			setState(107);
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
		public TerminalNode ERROR() { return getToken(multipleChoiceQuestionGrammarParser.ERROR, 0); }
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
		enterRule(_localctx, 22, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__4);
			setState(110);
			match(ERROR);
			setState(111);
			match(T__5);
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(T__6);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
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
		public TerminalNode NEWLINE() { return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, 0); }
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
		enterRule(_localctx, 24, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__8);
			setState(118);
			match(NEWLINE);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				missingWordQuestion_lines();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==MISSING_WORDSYMBOL );
			setState(124);
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
		enterRule(_localctx, 26, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			missingWordQuestion_sentence();
			setState(127);
			match(MISSING_WORDSYMBOL);
			setState(128);
			missingWordQuestion_sentence();
			setState(129);
			missingWordQuestion_answer();
			{
			setState(130);
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
		enterRule(_localctx, 28, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(132);
				match(STRING);
				}
				}
				setState(137);
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
		enterRule(_localctx, 30, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__9);
			setState(139);
			missingWordQuestion_options();
			setState(140);
			match(T__10);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				missingWordQuestion_options();
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
	public static class MissingWordQuestion_optionsContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(multipleChoiceQuestionGrammarParser.ARROW, 0); }
		public TerminalNode CORRECT() { return getToken(multipleChoiceQuestionGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(multipleChoiceQuestionGrammarParser.WRONG, 0); }
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
		enterRule(_localctx, 32, RULE_missingWordQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(STRING);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(151);
			match(ARROW);
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(153);
				match(T__10);
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
		public List<TerminalNode> NEWLINE() { return getTokens(multipleChoiceQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(multipleChoiceQuestionGrammarParser.NEWLINE, i);
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
		enterRule(_localctx, 34, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__11);
			setState(158);
			match(NEWLINE);
			setState(159);
			trueFalseQuestion_sentence();
			setState(160);
			match(NEWLINE);
			setState(161);
			trueFalseQuestion_anwser();
			setState(162);
			match(NEWLINE);
			setState(163);
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
		enterRule(_localctx, 36, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(STRING);
				}
				}
				setState(168); 
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
		enterRule(_localctx, 38, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		"\u0004\u0001\u0019\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u00011\b"+
		"\u0001\u000b\u0001\f\u00012\u0001\u0002\u0004\u00026\b\u0002\u000b\u0002"+
		"\f\u00027\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005F\b\u0005\u000b\u0005\f\u0005G\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u0006M\b\u0006\u000b\u0006\f\u0006N\u0001\u0007"+
		"\u0004\u0007R\b\u0007\u000b\u0007\f\u0007S\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0004\tc\b\t\u000b\t\f\td\u0001\n\u0001\n\u0003\ni"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0004\fy\b\f\u000b\f\f\fz\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0005\u000e\u0086\b\u000e\n\u000e"+
		"\f\u000e\u0089\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u008f\b\u000f\u000b\u000f\f\u000f\u0090\u0001\u0010\u0004"+
		"\u0010\u0094\b\u0010\u000b\u0010\f\u0010\u0095\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u009c\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0004\u0012\u00a7\b\u0012\u000b\u0012\f\u0012\u00a8\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0003\u0001\u0000\r\u000e\u0002\u0000\u0014\u0014\u0016\u0016\u0001\u0000"+
		"\u0018\u0019\u00a5\u0000(\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000"+
		"\u0000\u00045\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b"+
		">\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000"+
		"\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012"+
		"b\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016m\u0001"+
		"\u0000\u0000\u0000\u0018u\u0001\u0000\u0000\u0000\u001a~\u0001\u0000\u0000"+
		"\u0000\u001c\u0087\u0001\u0000\u0000\u0000\u001e\u008a\u0001\u0000\u0000"+
		"\u0000 \u0093\u0001\u0000\u0000\u0000\"\u009d\u0001\u0000\u0000\u0000"+
		"$\u00a6\u0001\u0000\u0000\u0000&\u00aa\u0001\u0000\u0000\u0000()\u0005"+
		"\u0001\u0000\u0000)*\u0005\u0012\u0000\u0000*+\u0003\u0002\u0001\u0000"+
		"+,\u0005\u0012\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005\u0002\u0000"+
		"\u0000.\u0001\u0001\u0000\u0000\u0000/1\u0005\u0010\u0000\u00000/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u000046\u0003\u0006"+
		"\u0003\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000"+
		"\u00009:\u0003\b\u0004\u0000:;\u0005\u000f\u0000\u0000;<\u0007\u0000\u0000"+
		"\u0000<=\u0005\u0012\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0010\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000"+
		"AB\u0005\u0012\u0000\u0000BC\u0003\f\u0006\u0000CE\u0005\u0012\u0000\u0000"+
		"DF\u0003\u000e\u0007\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0002\u0000\u0000J\u000b\u0001\u0000\u0000\u0000"+
		"KM\u0005\u0010\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\r\u0001\u0000"+
		"\u0000\u0000PR\u0005\u0010\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0005\u000f\u0000\u0000VW\u0005\u0014\u0000"+
		"\u0000WX\u0005\u0012\u0000\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0004\u0000\u0000Z[\u0005\u0012\u0000\u0000[\\\u0003\u0012\t\u0000\\"+
		"]\u0005\u0012\u0000\u0000]^\u0003\u0014\n\u0000^_\u0005\u0012\u0000\u0000"+
		"_`\u0005\u0002\u0000\u0000`\u0011\u0001\u0000\u0000\u0000ac\u0005\u0010"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0013\u0001\u0000\u0000"+
		"\u0000fh\u0007\u0001\u0000\u0000gi\u0003\u0016\u000b\u0000hg\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005"+
		"\u000f\u0000\u0000kl\u0005\u0014\u0000\u0000l\u0015\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0005\u0000\u0000no\u0005\u0015\u0000\u0000op\u0005\u0006"+
		"\u0000\u0000pq\u0007\u0001\u0000\u0000qr\u0005\u0007\u0000\u0000rs\u0007"+
		"\u0001\u0000\u0000st\u0005\b\u0000\u0000t\u0017\u0001\u0000\u0000\u0000"+
		"uv\u0005\t\u0000\u0000vx\u0005\u0012\u0000\u0000wy\u0003\u001a\r\u0000"+
		"xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0002"+
		"\u0000\u0000}\u0019\u0001\u0000\u0000\u0000~\u007f\u0003\u001c\u000e\u0000"+
		"\u007f\u0080\u0005\u0017\u0000\u0000\u0080\u0081\u0003\u001c\u000e\u0000"+
		"\u0081\u0082\u0003\u001e\u000f\u0000\u0082\u0083\u0005\u0012\u0000\u0000"+
		"\u0083\u001b\u0001\u0000\u0000\u0000\u0084\u0086\u0005\u0010\u0000\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u001d\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\n\u0000\u0000\u008b\u008c\u0003 \u0010\u0000\u008c"+
		"\u008e\u0005\u000b\u0000\u0000\u008d\u008f\u0003 \u0010\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001f"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0005\u0010\u0000\u0000\u0093\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u000f\u0000\u0000\u0098\u009b"+
		"\u0007\u0000\u0000\u0000\u0099\u009c\u0005\u000b\u0000\u0000\u009a\u009c"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c!\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\f\u0000\u0000\u009e\u009f\u0005\u0012\u0000\u0000\u009f\u00a0\u0003$"+
		"\u0012\u0000\u00a0\u00a1\u0005\u0012\u0000\u0000\u00a1\u00a2\u0003&\u0013"+
		"\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000"+
		"\u0000\u00a4#\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005\u0010\u0000\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0002\u0000\u0000\u00ab"+
		"\'\u0001\u0000\u0000\u0000\r27GNSdhz\u0087\u0090\u0095\u009b\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}