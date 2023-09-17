package antlr.multiple;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\multipleChoiceQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link multipleChoiceQuestionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface multipleChoiceQuestionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_questionText(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_options(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_option(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_optionText(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(multipleChoiceQuestionGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_question(multipleChoiceQuestionGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_answer(multipleChoiceQuestionGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(multipleChoiceQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_question(multipleChoiceQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_answer(multipleChoiceQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_error(multipleChoiceQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion(multipleChoiceQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_lines(multipleChoiceQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_sentence(multipleChoiceQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_answer(multipleChoiceQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_options(multipleChoiceQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(multipleChoiceQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_sentence(multipleChoiceQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_anwser(multipleChoiceQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
}