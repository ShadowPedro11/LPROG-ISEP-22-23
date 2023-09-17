// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PL4/src/EX3\ex3.g4 by ANTLR 4.12.0
package EX3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ex3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WORD=2, INT=3, OPERATOR=4, BREAK=5, WS=6;
	public static final int
		RULE_ex = 0, RULE_coisas = 1, RULE_other = 2, RULE_comparable = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"ex", "coisas", "other", "comparable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WORD", "INT", "OPERATOR", "BREAK", "WS"
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
	public String getGrammarFileName() { return "ex3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ex3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExContext extends ParserRuleContext {
		public List<CoisasContext> coisas() {
			return getRuleContexts(CoisasContext.class);
		}
		public CoisasContext coisas(int i) {
			return getRuleContext(CoisasContext.class,i);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ex3Visitor ) return ((ex3Visitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				coisas();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD || _la==INT );
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
	public static class CoisasContext extends ParserRuleContext {
		public List<ComparableContext> comparable() {
			return getRuleContexts(ComparableContext.class);
		}
		public ComparableContext comparable(int i) {
			return getRuleContext(ComparableContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(ex3Parser.OPERATOR, 0); }
		public TerminalNode BREAK() { return getToken(ex3Parser.BREAK, 0); }
		public List<OtherContext> other() {
			return getRuleContexts(OtherContext.class);
		}
		public OtherContext other(int i) {
			return getRuleContext(OtherContext.class,i);
		}
		public CoisasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coisas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).enterCoisas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).exitCoisas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ex3Visitor ) return ((ex3Visitor<? extends T>)visitor).visitCoisas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoisasContext coisas() throws RecognitionException {
		CoisasContext _localctx = new CoisasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_coisas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			comparable();
			setState(14);
			match(T__0);
			setState(15);
			match(OPERATOR);
			setState(16);
			match(T__0);
			setState(17);
			comparable();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				other();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(BREAK);
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
	public static class OtherContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(ex3Parser.OPERATOR, 0); }
		public ComparableContext comparable() {
			return getRuleContext(ComparableContext.class,0);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ex3Visitor ) return ((ex3Visitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(OPERATOR);
			setState(28);
			match(T__0);
			setState(29);
			comparable();
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
	public static class ComparableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ex3Parser.INT, 0); }
		public TerminalNode WORD() { return getToken(ex3Parser.WORD, 0); }
		public ComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).enterComparable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ex3Listener ) ((ex3Listener)listener).exitComparable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ex3Visitor ) return ((ex3Visitor<? extends T>)visitor).visitComparable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparableContext comparable() throws RecognitionException {
		ComparableContext _localctx = new ComparableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==INT) ) {
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
		"\u0004\u0001\u0006\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0002\u0003\u001f"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004"+
		"\u001a\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000\b\n"+
		"\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000"+
		"\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000"+
		"\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0003\u0006\u0003\u0000"+
		"\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u0010\u0005\u0004\u0000\u0000"+
		"\u0010\u0011\u0005\u0001\u0000\u0000\u0011\u0015\u0003\u0006\u0003\u0000"+
		"\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0005\u0000\u0000"+
		"\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000"+
		"\u001b\u001c\u0005\u0004\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000"+
		"\u001d\u001e\u0003\u0006\u0003\u0000\u001e\u0005\u0001\u0000\u0000\u0000"+
		"\u001f \u0007\u0000\u0000\u0000 \u0007\u0001\u0000\u0000\u0000\u0002\u000b"+
		"\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}