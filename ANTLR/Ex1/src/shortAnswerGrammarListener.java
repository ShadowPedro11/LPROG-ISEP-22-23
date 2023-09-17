// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\shortAnswerGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link shortAnswerGrammarParser}.
 */
public interface shortAnswerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(shortAnswerGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(shortAnswerGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(shortAnswerGrammarParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(shortAnswerGrammarParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void enterFeedback(shortAnswerGrammarParser.FeedbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void exitFeedback(shortAnswerGrammarParser.FeedbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_question(shortAnswerGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_question(shortAnswerGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion_answer(shortAnswerGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion_answer(shortAnswerGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(shortAnswerGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(shortAnswerGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_question(shortAnswerGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_question(shortAnswerGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_answer(shortAnswerGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_answer(shortAnswerGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_error(shortAnswerGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_error(shortAnswerGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion(shortAnswerGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion(shortAnswerGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_lines(shortAnswerGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_lines(shortAnswerGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_sentence(shortAnswerGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_sentence(shortAnswerGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_answer(shortAnswerGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_answer(shortAnswerGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_options(shortAnswerGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_options(shortAnswerGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(shortAnswerGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(shortAnswerGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(shortAnswerGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(shortAnswerGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(shortAnswerGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(shortAnswerGrammarParser.TrueFalseQuestion_anwserContext ctx);
}