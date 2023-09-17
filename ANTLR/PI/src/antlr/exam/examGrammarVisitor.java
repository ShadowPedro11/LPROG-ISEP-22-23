package antlr.exam;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PI\examGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link examGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface examGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#exam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam(examGrammarParser.ExamContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(examGrammarParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(examGrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#feedbackType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeedbackType(examGrammarParser.FeedbackTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#gradeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGradeType(examGrammarParser.GradeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(examGrammarParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(examGrammarParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(examGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#matchingQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion(examGrammarParser.MatchingQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionValue(examGrammarParser.QuestionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#feedback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeedback(examGrammarParser.FeedbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#matchingQuestion_questionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_questionText(examGrammarParser.MatchingQuestion_questionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#matchingQuestion_subQuestions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_subQuestions(examGrammarParser.MatchingQuestion_subQuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#matchingQuestion_subQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_subQuestion(examGrammarParser.MatchingQuestion_subQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#matchingQuestion_answers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_answers(examGrammarParser.MatchingQuestion_answersContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#matchingQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingQuestion_answer(examGrammarParser.MatchingQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion(examGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_questionText(examGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_options(examGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_option(examGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion_optionText(examGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(examGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_question(examGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_answer(examGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(examGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_question(examGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_answer(examGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_error(examGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion(examGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_lines(examGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_sentence(examGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_answer(examGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_options(examGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(examGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_sentence(examGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link examGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_anwser(examGrammarParser.TrueFalseQuestion_anwserContext ctx);
}