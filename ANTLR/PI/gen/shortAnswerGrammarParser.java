// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\shortAnswerGrammar.g4 by ANTLR 4.12.0
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
		T__9=10, T__10=11, INT=12, ARROW=13, STRING=14, WORD=15, WS=16, NEWLINE=17, 
		ERROR=18, DECIMAL=19, CORRECT=20, WRONG=21, MISSING_WORDSYMBOL=22, TRUE=23, 
		FALSE=24;
	public static final int
		RULE_shortAnswerQuestion = 0, RULE_shortAnswerQuestion_question = 1, RULE_shortAnswerQuestion_answer = 2, 
		RULE_numericalQuestion = 3, RULE_numericalQuestion_question = 4, RULE_numericalQuestion_answer = 5, 
		RULE_numericalQuestion_error = 6, RULE_missingWordQuestion = 7, RULE_missingWordQuestion_lines = 8, 
		RULE_missingWordQuestion_sentence = 9, RULE_missingWordQuestion_answer = 10, 
		RULE_missingWordQuestion_options = 11, RULE_trueFalseQuestion = 12, RULE_trueFalseQuestion_sentence = 13, 
		RULE_trueFalseQuestion_anwser = 14;
	private static String[] makeRuleNames() {
		return new String[] {
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
			setState(30);
			match(T__0);
			setState(31);
			match(NEWLINE);
			setState(32);
			shortAnswerQuestion_question();
			setState(33);
			match(NEWLINE);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				shortAnswerQuestion_answer();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(39);
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
		enterRule(_localctx, 2, RULE_shortAnswerQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				match(STRING);
				}
				}
				setState(44); 
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
		public TerminalNode INT() { return getToken(shortAnswerGrammarParser.INT, 0); }
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
		enterRule(_localctx, 4, RULE_shortAnswerQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(STRING);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(51);
			match(ARROW);
			setState(52);
			match(INT);
			setState(53);
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
		enterRule(_localctx, 6, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
			match(NEWLINE);
			setState(57);
			numericalQuestion_question();
			setState(58);
			match(NEWLINE);
			setState(59);
			numericalQuestion_answer();
			setState(60);
			match(NEWLINE);
			setState(61);
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
		enterRule(_localctx, 8, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				match(STRING);
				}
				}
				setState(66); 
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
		enterRule(_localctx, 10, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(69);
				numericalQuestion_error();
				}
			}

			setState(72);
			match(ARROW);
			setState(73);
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
		public TerminalNode ERROR() { return getToken(shortAnswerGrammarParser.ERROR, 0); }
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
		enterRule(_localctx, 12, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__3);
			setState(76);
			match(ERROR);
			setState(77);
			match(T__4);
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			match(T__5);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			match(T__6);
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
		public TerminalNode NEWLINE() { return getToken(shortAnswerGrammarParser.NEWLINE, 0); }
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
		enterRule(_localctx, 14, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__7);
			setState(84);
			match(NEWLINE);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				missingWordQuestion_lines();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==MISSING_WORDSYMBOL );
			setState(90);
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
		enterRule(_localctx, 16, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			missingWordQuestion_sentence();
			setState(93);
			match(MISSING_WORDSYMBOL);
			setState(94);
			missingWordQuestion_sentence();
			setState(95);
			missingWordQuestion_answer();
			{
			setState(96);
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
		enterRule(_localctx, 18, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(98);
				match(STRING);
				}
				}
				setState(103);
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
		enterRule(_localctx, 20, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__8);
			setState(105);
			missingWordQuestion_options();
			setState(106);
			match(T__9);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				missingWordQuestion_options();
				}
				}
				setState(110); 
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
		enterRule(_localctx, 22, RULE_missingWordQuestion_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				match(STRING);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(117);
			match(ARROW);
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119);
				match(T__9);
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
		public List<TerminalNode> NEWLINE() { return getTokens(shortAnswerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(shortAnswerGrammarParser.NEWLINE, i);
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
		enterRule(_localctx, 24, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__10);
			setState(124);
			match(NEWLINE);
			setState(125);
			trueFalseQuestion_sentence();
			setState(126);
			match(NEWLINE);
			setState(127);
			trueFalseQuestion_anwser();
			setState(128);
			match(NEWLINE);
			setState(129);
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
		enterRule(_localctx, 26, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(STRING);
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
		enterRule(_localctx, 28, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		"\u0004\u0001\u0018\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001+\b\u0001"+
		"\u000b\u0001\f\u0001,\u0001\u0002\u0004\u00020\b\u0002\u000b\u0002\f\u0002"+
		"1\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0004\u0004A\b\u0004\u000b\u0004\f\u0004B\u0001\u0005\u0001"+
		"\u0005\u0003\u0005G\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007W\b"+
		"\u0007\u000b\u0007\f\u0007X\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0005\td\b\t\n\t\f\tg\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\nm\b\n\u000b\n\f\nn\u0001\u000b\u0004\u000br"+
		"\b\u000b\u000b\u000b\f\u000bs\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bz\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0004\r\u0085\b\r\u000b\r\f\r\u0086\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0002\u0000"+
		"\f\f\u0013\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0017\u0018\u0086"+
		"\u0000\u001e\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004"+
		"/\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nD\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000e"+
		"S\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012e\u0001"+
		"\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016q\u0001\u0000\u0000"+
		"\u0000\u0018{\u0001\u0000\u0000\u0000\u001a\u0084\u0001\u0000\u0000\u0000"+
		"\u001c\u0088\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000"+
		"\u001f \u0005\u0011\u0000\u0000 !\u0003\u0002\u0001\u0000!#\u0005\u0011"+
		"\u0000\u0000\"$\u0003\u0004\u0002\u0000#\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0005\u0002\u0000\u0000(\u0001\u0001\u0000"+
		"\u0000\u0000)+\u0005\u000e\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-\u0003\u0001\u0000\u0000\u0000.0\u0005\u000e\u0000\u0000/.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\r\u0000\u000045\u0005"+
		"\f\u0000\u000056\u0005\u0011\u0000\u00006\u0005\u0001\u0000\u0000\u0000"+
		"78\u0005\u0003\u0000\u000089\u0005\u0011\u0000\u00009:\u0003\b\u0004\u0000"+
		":;\u0005\u0011\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005\u0011\u0000\u0000"+
		"=>\u0005\u0002\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?A\u0005\u000e"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000"+
		"DF\u0007\u0000\u0000\u0000EG\u0003\f\u0006\u0000FE\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\r\u0000\u0000"+
		"IJ\u0005\f\u0000\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0005\u0004\u0000"+
		"\u0000LM\u0005\u0012\u0000\u0000MN\u0005\u0005\u0000\u0000NO\u0007\u0000"+
		"\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0007\u0000\u0000\u0000QR\u0005"+
		"\u0007\u0000\u0000R\r\u0001\u0000\u0000\u0000ST\u0005\b\u0000\u0000TV"+
		"\u0005\u0011\u0000\u0000UW\u0003\u0010\b\u0000VU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005\u0002\u0000\u0000[\u000f\u0001"+
		"\u0000\u0000\u0000\\]\u0003\u0012\t\u0000]^\u0005\u0016\u0000\u0000^_"+
		"\u0003\u0012\t\u0000_`\u0003\u0014\n\u0000`a\u0005\u0011\u0000\u0000a"+
		"\u0011\u0001\u0000\u0000\u0000bd\u0005\u000e\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000hi\u0005\t\u0000\u0000ij\u0003\u0016\u000b\u0000jl\u0005\n\u0000"+
		"\u0000km\u0003\u0016\u000b\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0015"+
		"\u0001\u0000\u0000\u0000pr\u0005\u000e\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\r\u0000\u0000vy\u0007\u0001"+
		"\u0000\u0000wz\u0005\n\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0017\u0001\u0000\u0000\u0000"+
		"{|\u0005\u000b\u0000\u0000|}\u0005\u0011\u0000\u0000}~\u0003\u001a\r\u0000"+
		"~\u007f\u0005\u0011\u0000\u0000\u007f\u0080\u0003\u001c\u000e\u0000\u0080"+
		"\u0081\u0005\u0011\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082"+
		"\u0019\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u000e\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u001b\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0002\u0000\u0000\u0089"+
		"\u001d\u0001\u0000\u0000\u0000\u000b%,1BFXensy\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}