// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/Ex1\missingWordsGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link missingWordsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface missingWordsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion(missingWordsGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(missingWordsGrammarParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(missingWordsGrammarParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptions(missingWordsGrammarParser.OptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(missingWordsGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(missingWordsGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(missingWordsGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link missingWordsGrammarParser#anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnwser(missingWordsGrammarParser.AnwserContext ctx);
}