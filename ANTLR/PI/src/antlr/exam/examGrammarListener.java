package antlr.exam;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/PI\examGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link examGrammarParser}.
 */
public interface examGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#exam}.
	 * @param ctx the parse tree
	 */
	void enterExam(examGrammarParser.ExamContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#exam}.
	 * @param ctx the parse tree
	 */
	void exitExam(examGrammarParser.ExamContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(examGrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(examGrammarParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(examGrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(examGrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#feedbackType}.
	 * @param ctx the parse tree
	 */
	void enterFeedbackType(examGrammarParser.FeedbackTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#feedbackType}.
	 * @param ctx the parse tree
	 */
	void exitFeedbackType(examGrammarParser.FeedbackTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#gradeType}.
	 * @param ctx the parse tree
	 */
	void enterGradeType(examGrammarParser.GradeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#gradeType}.
	 * @param ctx the parse tree
	 */
	void exitGradeType(examGrammarParser.GradeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(examGrammarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(examGrammarParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(examGrammarParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(examGrammarParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(examGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(examGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#matchingQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion(examGrammarParser.MatchingQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#matchingQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion(examGrammarParser.MatchingQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(examGrammarParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(examGrammarParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void enterFeedback(examGrammarParser.FeedbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void exitFeedback(examGrammarParser.FeedbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#matchingQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_questionText(examGrammarParser.MatchingQuestion_questionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#matchingQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_questionText(examGrammarParser.MatchingQuestion_questionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#matchingQuestion_subQuestions}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_subQuestions(examGrammarParser.MatchingQuestion_subQuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#matchingQuestion_subQuestions}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_subQuestions(examGrammarParser.MatchingQuestion_subQuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#matchingQuestion_subQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_subQuestion(examGrammarParser.MatchingQuestion_subQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#matchingQuestion_subQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_subQuestion(examGrammarParser.MatchingQuestion_subQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#matchingQuestion_answers}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_answers(examGrammarParser.MatchingQuestion_answersContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#matchingQuestion_answers}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_answers(examGrammarParser.MatchingQuestion_answersContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#matchingQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMatchingQuestion_answer(examGrammarParser.MatchingQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#matchingQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMatchingQuestion_answer(examGrammarParser.MatchingQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion(examGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion(examGrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_questionText(examGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_questionText}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_questionText(examGrammarParser.MultipleChoiceQuestion_questionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_options(examGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_options(examGrammarParser.MultipleChoiceQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_option(examGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_option}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_option(examGrammarParser.MultipleChoiceQuestion_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion_optionText(examGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#multipleChoiceQuestion_optionText}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion_optionText(examGrammarParser.MultipleChoiceQuestion_optionTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(examGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(examGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_question(examGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_question(examGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_answer(examGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_answer(examGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(examGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(examGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_question(examGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_question(examGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_answer(examGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_answer(examGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_error(examGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_error(examGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion(examGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion(examGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_lines(examGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_lines(examGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_sentence(examGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_sentence(examGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_answer(examGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_answer(examGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_options(examGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_options(examGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(examGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(examGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(examGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(examGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link examGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(examGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link examGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(examGrammarParser.TrueFalseQuestion_anwserContext ctx);
}