// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\numericalQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link numericalQuestionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface numericalQuestionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(numericalQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionValue(numericalQuestionGrammarParser.QuestionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#feedback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeedback(numericalQuestionGrammarParser.FeedbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_question(numericalQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_answer(numericalQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_error(numericalQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion(numericalQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_lines(numericalQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_sentence(numericalQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_answer(numericalQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_options(numericalQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(numericalQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_sentence(numericalQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_anwser(numericalQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
}