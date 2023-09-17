package antlr.matching;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\matchingQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matchingQuestionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matchingQuestionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion(matchingQuestionGrammarParser.MatchingQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_questionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_questionText(matchingQuestionGrammarParser.MatchingQuestion_questionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_subQuestions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_subQuestions(matchingQuestionGrammarParser.MatchingQuestion_subQuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_subQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_subQuestion(matchingQuestionGrammarParser.MatchingQuestion_subQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_answers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_answers(matchingQuestionGrammarParser.MatchingQuestion_answersContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_answer(matchingQuestionGrammarParser.MatchingQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion(matchingQuestionGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_questionText(matchingQuestionGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_options(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_option(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_optionText(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(matchingQuestionGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_question(matchingQuestionGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_answer(matchingQuestionGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(matchingQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_question(matchingQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_answer(matchingQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_error(matchingQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion(matchingQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_lines(matchingQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_sentence(matchingQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_answer(matchingQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_options(matchingQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(matchingQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_sentence(matchingQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_anwser(matchingQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
}