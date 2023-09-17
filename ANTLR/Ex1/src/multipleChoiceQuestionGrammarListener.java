// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\multipleChoiceQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link multipleChoiceQuestionGrammarParser}.
 */
public interface multipleChoiceQuestionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(multipleChoiceQuestionGrammarParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(multipleChoiceQuestionGrammarParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void enterFeedback(multipleChoiceQuestionGrammarParser.FeedbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void exitFeedback(multipleChoiceQuestionGrammarParser.FeedbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_questionText(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_questionText(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_options(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_options(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_option(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_option(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_optionText(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_optionText(multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(multipleChoiceQuestionGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(multipleChoiceQuestionGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_question(multipleChoiceQuestionGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_question(multipleChoiceQuestionGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_answer(multipleChoiceQuestionGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_answer(multipleChoiceQuestionGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(multipleChoiceQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(multipleChoiceQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_question(multipleChoiceQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_question(multipleChoiceQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_answer(multipleChoiceQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_answer(multipleChoiceQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_error(multipleChoiceQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_error(multipleChoiceQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion(multipleChoiceQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion(multipleChoiceQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_lines(multipleChoiceQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_lines(multipleChoiceQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_sentence(multipleChoiceQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_sentence(multipleChoiceQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_answer(multipleChoiceQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_answer(multipleChoiceQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_options(multipleChoiceQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_options(multipleChoiceQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(multipleChoiceQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(multipleChoiceQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(multipleChoiceQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(multipleChoiceQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(multipleChoiceQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link multipleChoiceQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(multipleChoiceQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
}