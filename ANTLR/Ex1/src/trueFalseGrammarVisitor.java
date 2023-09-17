// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\trueFalseGrammar.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(trueFalseGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionValue(trueFalseGrammarParser.QuestionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#feedback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeedback(trueFalseGrammarParser.FeedbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_sentence(trueFalseGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_anwser(trueFalseGrammarParser.TrueFalseQuestion_anwserContext ctx);
}