// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\matchingQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matchingQuestionGrammarParser}.
 */
public interface matchingQuestionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion(matchingQuestionGrammarParser.MatchingQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion(matchingQuestionGrammarParser.MatchingQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(matchingQuestionGrammarParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(matchingQuestionGrammarParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void enterFeedback(matchingQuestionGrammarParser.FeedbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void exitFeedback(matchingQuestionGrammarParser.FeedbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_questionText(matchingQuestionGrammarParser.MatchingQuestion_questionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_questionText(matchingQuestionGrammarParser.MatchingQuestion_questionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_subQuestions}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_subQuestions(matchingQuestionGrammarParser.MatchingQuestion_subQuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_subQuestions}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_subQuestions(matchingQuestionGrammarParser.MatchingQuestion_subQuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_subQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_subQuestion(matchingQuestionGrammarParser.MatchingQuestion_subQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_subQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_subQuestion(matchingQuestionGrammarParser.MatchingQuestion_subQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_answers}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_answers(matchingQuestionGrammarParser.MatchingQuestion_answersContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_answers}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_answers(matchingQuestionGrammarParser.MatchingQuestion_answersContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_answer(matchingQuestionGrammarParser.MatchingQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#matchingQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_answer(matchingQuestionGrammarParser.MatchingQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion(matchingQuestionGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion(matchingQuestionGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_questionText(matchingQuestionGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_questionText(matchingQuestionGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_options(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_options(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_option(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_option(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_optionText(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_optionText(matchingQuestionGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(matchingQuestionGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(matchingQuestionGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_question(matchingQuestionGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_question(matchingQuestionGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_answer(matchingQuestionGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_answer(matchingQuestionGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(matchingQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(matchingQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_question(matchingQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_question(matchingQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_answer(matchingQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_answer(matchingQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_error(matchingQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_error(matchingQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion(matchingQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion(matchingQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_lines(matchingQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_lines(matchingQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_sentence(matchingQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_sentence(matchingQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_answer(matchingQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_answer(matchingQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_options(matchingQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_options(matchingQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(matchingQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(matchingQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(matchingQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(matchingQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(matchingQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link matchingQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(matchingQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
}