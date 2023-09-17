// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/Ex1\trueFalseGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link trueFalseGrammarParser}.
 */
public interface trueFalseGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(trueFalseGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(trueFalseGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(trueFalseGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(trueFalseGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(trueFalseGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(trueFalseGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(trueFalseGrammarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(trueFalseGrammarParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#anwser}.
	 * @param ctx the parse tree
	 */
	void enterAnwser(trueFalseGrammarParser.AnwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#anwser}.
	 * @param ctx the parse tree
	 */
	void exitAnwser(trueFalseGrammarParser.AnwserContext ctx);
}