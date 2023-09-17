// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/Ex1\trueFalseGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link trueFalseGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface trueFalseGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(trueFalseGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(trueFalseGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(trueFalseGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(trueFalseGrammarParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnwser(trueFalseGrammarParser.AnwserContext ctx);
}