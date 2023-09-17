// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PL4/src/EX2\ex2.g4 by ANTLR 4.12.0
package EX2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ex2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, OPERATOR=3, BREAK=4, WS=5;
	public static final int
		RULE_ex = 0, RULE_coisas = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"ex", "coisas"
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
			null, null, "INT", "OPERATOR", "BREAK", "WS"
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
	public String getGrammarFileName() { return "ex2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ex2Parser(TokenStream input) {
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
			if ( listener instanceof ex2Listener ) ((ex2Listener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ex2Listener ) ((ex2Listener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ex2Visitor ) return ((ex2Visitor<? extends T>)visitor).visitEx(this);
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
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				coisas();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
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
		public List<TerminalNode> INT() { return getTokens(ex2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ex2Parser.INT, i);
		}
		public TerminalNode OPERATOR() { return getToken(ex2Parser.OPERATOR, 0); }
		public TerminalNode BREAK() { return getToken(ex2Parser.BREAK, 0); }
		public CoisasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coisas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ex2Listener ) ((ex2Listener)listener).enterCoisas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ex2Listener ) ((ex2Listener)listener).exitCoisas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ex2Visitor ) return ((ex2Visitor<? extends T>)visitor).visitCoisas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoisasContext coisas() throws RecognitionException {
		CoisasContext _localctx = new CoisasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_coisas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(INT);
			setState(10);
			match(T__0);
			setState(11);
			match(OPERATOR);
			setState(12);
			match(T__0);
			setState(13);
			match(INT);
			setState(14);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u0011\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u000f\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0002\t\u0001\u0000\u0000\u0000\u0004\u0006"+
		"\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001"+
		"\u0000\u0000\u0000\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005\u0002\u0000"+
		"\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005\u0003\u0000\u0000"+
		"\f\r\u0005\u0001\u0000\u0000\r\u000e\u0005\u0002\u0000\u0000\u000e\u000f"+
		"\u0005\u0004\u0000\u0000\u000f\u0003\u0001\u0000\u0000\u0000\u0001\u0007";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}