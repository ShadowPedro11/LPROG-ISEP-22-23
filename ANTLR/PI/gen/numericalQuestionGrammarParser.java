// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/Ex1\numericalQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class numericalQuestionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ERROR=11, ARROW=12, INT=13, DECIMAL=14, STRING=15, WORD=16, WS=17, 
		NEWLINE=18, CORRECT=19, WRONG=20, MISSING_WORDSYMBOL=21, TRUE=22, FALSE=23;
	public static final int
		RULE_numericalQuestion = 0, RULE_numericalQuestion_question = 1, RULE_numericalQuestion_answer = 2, 
		RULE_numericalQuestion_error = 3, RULE_missingWordQuestion = 4, RULE_missingWordQuestion_lines = 5, 
		RULE_missingWordQuestion_sentence = 6, RULE_missingWordQuestion_answer = 7, 
		RULE_missingWordQuestion_options = 8, RULE_trueFalseQuestion = 9, RULE_trueFalseQuestion_sentence = 10, 
		RULE_trueFalseQuestion_anwser = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"numericalQuestion", "numericalQuestion_question", "numericalQuestion_answer", 
			"numericalQuestion_error", "missingWordQuestion", "missingWordQuestion_lines", 
			"missingWordQuestion_sentence", "missingWordQuestion_answer", "missingWordQuestion_options", 
			"trueFalseQuestion", "trueFalseQuestion_sentence", "trueFalseQuestion_anwser"
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

	@Override
	public String getGrammarFileName() { return "numericalQuestionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public numericalQuestionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericalQuestionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(numericalQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(numericalQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterNumericalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitNumericalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestionContext numericalQuestion() throws RecognitionException {
		NumericalQuestionContext _localctx = new NumericalQuestionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(NEWLINE);
			setState(26);
			numericalQuestion_question();
			setState(27);
			match(NEWLINE);
			setState(28);
			numericalQuestion_answer();
			setState(29);
			match(NEWLINE);
			setState(30);
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
		public List<TerminalNode> STRING() { return getTokens(numericalQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(numericalQuestionGrammarParser.STRING, i);
		}
		public NumericalQuestion_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterNumericalQuestion_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitNumericalQuestion_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_questionContext numericalQuestion_question() throws RecognitionException {
		NumericalQuestion_questionContext _localctx = new NumericalQuestion_questionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numericalQuestion_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				match(STRING);
				}
				}
				setState(35); 
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
		public TerminalNode ARROW() { return getToken(numericalQuestionGrammarParser.ARROW, 0); }
		public List<TerminalNode> INT() { return getTokens(numericalQuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(numericalQuestionGrammarParser.INT, i);
		}
		public TerminalNode DECIMAL() { return getToken(numericalQuestionGrammarParser.DECIMAL, 0); }
		public NumericalQuestion_errorContext numericalQuestion_error() {
			return getRuleContext(NumericalQuestion_errorContext.class,0);
		}
		public NumericalQuestion_answerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterNumericalQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitNumericalQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_answerContext numericalQuestion_answer() throws RecognitionException {
		NumericalQuestion_answerContext _localctx = new NumericalQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericalQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(38);
				numericalQuestion_error();
				}
			}

			setState(41);
			match(ARROW);
			setState(42);
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
		public TerminalNode ERROR() { return getToken(numericalQuestionGrammarParser.ERROR, 0); }
		public List<TerminalNode> INT() { return getTokens(numericalQuestionGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(numericalQuestionGrammarParser.INT, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(numericalQuestionGrammarParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(numericalQuestionGrammarParser.DECIMAL, i);
		}
		public NumericalQuestion_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterNumericalQuestion_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitNumericalQuestion_error(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitNumericalQuestion_error(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestion_errorContext numericalQuestion_error() throws RecognitionException {
		NumericalQuestion_errorContext _localctx = new NumericalQuestion_errorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericalQuestion_error);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			match(ERROR);
			setState(46);
			match(T__3);
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			match(T__4);
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			match(T__5);
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
		public TerminalNode NEWLINE() { return getToken(numericalQuestionGrammarParser.NEWLINE, 0); }
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
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterMissingWordQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitMissingWordQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestionContext missingWordQuestion() throws RecognitionException {
		MissingWordQuestionContext _localctx = new MissingWordQuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_missingWordQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__6);
			setState(53);
			match(NEWLINE);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				missingWordQuestion_lines();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==MISSING_WORDSYMBOL );
			setState(59);
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
		public TerminalNode MISSING_WORDSYMBOL() { return getToken(numericalQuestionGrammarParser.MISSING_WORDSYMBOL, 0); }
		public MissingWordQuestion_answerContext missingWordQuestion_answer() {
			return getRuleContext(MissingWordQuestion_answerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(numericalQuestionGrammarParser.NEWLINE, 0); }
		public MissingWordQuestion_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterMissingWordQuestion_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitMissingWordQuestion_lines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_lines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_linesContext missingWordQuestion_lines() throws RecognitionException {
		MissingWordQuestion_linesContext _localctx = new MissingWordQuestion_linesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_missingWordQuestion_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			missingWordQuestion_sentence();
			setState(62);
			match(MISSING_WORDSYMBOL);
			setState(63);
			missingWordQuestion_sentence();
			setState(64);
			missingWordQuestion_answer();
			{
			setState(65);
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
		public List<TerminalNode> STRING() { return getTokens(numericalQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(numericalQuestionGrammarParser.STRING, i);
		}
		public MissingWordQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterMissingWordQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitMissingWordQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_sentenceContext missingWordQuestion_sentence() throws RecognitionException {
		MissingWordQuestion_sentenceContext _localctx = new MissingWordQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_missingWordQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(67);
				match(STRING);
				}
				}
				setState(72);
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
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterMissingWordQuestion_answer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitMissingWordQuestion_answer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_answer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_answerContext missingWordQuestion_answer() throws RecognitionException {
		MissingWordQuestion_answerContext _localctx = new MissingWordQuestion_answerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_missingWordQuestion_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__7);
			setState(74);
			missingWordQuestion_options();
			setState(75);
			match(T__8);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				missingWordQuestion_options();
				}
				}
				setState(79); 
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
		public TerminalNode ARROW() { return getToken(numericalQuestionGrammarParser.ARROW, 0); }
		public TerminalNode CORRECT() { return getToken(numericalQuestionGrammarParser.CORRECT, 0); }
		public TerminalNode WRONG() { return getToken(numericalQuestionGrammarParser.WRONG, 0); }
		public List<TerminalNode> STRING() { return getTokens(numericalQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(numericalQuestionGrammarParser.STRING, i);
		}
		public MissingWordQuestion_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missingWordQuestion_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterMissingWordQuestion_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitMissingWordQuestion_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitMissingWordQuestion_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingWordQuestion_optionsContext missingWordQuestion_options() throws RecognitionException {
		MissingWordQuestion_optionsContext _localctx = new MissingWordQuestion_optionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_missingWordQuestion_options);
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
			setState(86);
			match(ARROW);
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==CORRECT || _la==WRONG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(88);
				match(T__8);
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
		public List<TerminalNode> NEWLINE() { return getTokens(numericalQuestionGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(numericalQuestionGrammarParser.NEWLINE, i);
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
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__9);
			setState(93);
			match(NEWLINE);
			setState(94);
			trueFalseQuestion_sentence();
			setState(95);
			match(NEWLINE);
			setState(96);
			trueFalseQuestion_anwser();
			setState(97);
			match(NEWLINE);
			setState(98);
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
		public List<TerminalNode> STRING() { return getTokens(numericalQuestionGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(numericalQuestionGrammarParser.STRING, i);
		}
		public TrueFalseQuestion_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterTrueFalseQuestion_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitTrueFalseQuestion_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_sentenceContext trueFalseQuestion_sentence() throws RecognitionException {
		TrueFalseQuestion_sentenceContext _localctx = new TrueFalseQuestion_sentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_trueFalseQuestion_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				match(STRING);
				}
				}
				setState(103); 
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
		public TerminalNode TRUE() { return getToken(numericalQuestionGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(numericalQuestionGrammarParser.FALSE, 0); }
		public TrueFalseQuestion_anwserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion_anwser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).enterTrueFalseQuestion_anwser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof numericalQuestionGrammarListener ) ((numericalQuestionGrammarListener)listener).exitTrueFalseQuestion_anwser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof numericalQuestionGrammarVisitor ) return ((numericalQuestionGrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion_anwser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestion_anwserContext trueFalseQuestion_anwser() throws RecognitionException {
		TrueFalseQuestion_anwserContext _localctx = new TrueFalseQuestion_anwserContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_trueFalseQuestion_anwser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		"\u0004\u0001\u0017l\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001"+
		"#\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u00048\b\u0004\u000b\u0004\f\u00049\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0005\u0006E\b\u0006\n\u0006\f\u0006H\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007N\b\u0007\u000b\u0007\f\u0007"+
		"O\u0001\b\u0004\bS\b\b\u000b\b\f\bT\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b[\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\nf\b\n\u000b\n\f\ng\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0003\u0001\u0000\r\u000e\u0001\u0000\u0013\u0014\u0001\u0000\u0016"+
		"\u0017g\u0000\u0018\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000"+
		"\u0004%\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b4\u0001"+
		"\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fF\u0001\u0000\u0000\u0000"+
		"\u000eI\u0001\u0000\u0000\u0000\u0010R\u0001\u0000\u0000\u0000\u0012\\"+
		"\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016i\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0005\u0012"+
		"\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005\u0012"+
		"\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0012"+
		"\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f\u0001\u0001\u0000"+
		"\u0000\u0000 \"\u0005\u000f\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\u0003\u0001\u0000\u0000\u0000%\'\u0007\u0000\u0000\u0000&(\u0003\u0006"+
		"\u0003\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0005\f\u0000\u0000*+\u0005\r\u0000\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\u000b\u0000"+
		"\u0000./\u0005\u0004\u0000\u0000/0\u0007\u0000\u0000\u000001\u0005\u0005"+
		"\u0000\u000012\u0007\u0000\u0000\u000023\u0005\u0006\u0000\u00003\u0007"+
		"\u0001\u0000\u0000\u000045\u0005\u0007\u0000\u000057\u0005\u0012\u0000"+
		"\u000068\u0003\n\u0005\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0002\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0003"+
		"\f\u0006\u0000>?\u0005\u0015\u0000\u0000?@\u0003\f\u0006\u0000@A\u0003"+
		"\u000e\u0007\u0000AB\u0005\u0012\u0000\u0000B\u000b\u0001\u0000\u0000"+
		"\u0000CE\u0005\u000f\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\r\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\b\u0000\u0000JK\u0003"+
		"\u0010\b\u0000KM\u0005\t\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u000f\u0001\u0000\u0000\u0000QS\u0005\u000f\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005"+
		"\f\u0000\u0000WZ\u0007\u0001\u0000\u0000X[\u0005\t\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\u0011\u0001\u0000\u0000\u0000\\]\u0005\n\u0000\u0000]^\u0005\u0012\u0000"+
		"\u0000^_\u0003\u0014\n\u0000_`\u0005\u0012\u0000\u0000`a\u0003\u0016\u000b"+
		"\u0000ab\u0005\u0012\u0000\u0000bc\u0005\u0002\u0000\u0000c\u0013\u0001"+
		"\u0000\u0000\u0000df\u0005\u000f\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u0015\u0001\u0000\u0000\u0000ij\u0007\u0002\u0000\u0000j\u0017"+
		"\u0001\u0000\u0000\u0000\b#\'9FOTZg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}