package antlr.numerical;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\numericalQuestionGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link numericalQuestionGrammarParser}.
 */
public interface numericalQuestionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(numericalQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(numericalQuestionGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_question(numericalQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_question(numericalQuestionGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_answer(numericalQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_answer(numericalQuestionGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion_error(numericalQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion_error(numericalQuestionGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion(numericalQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion(numericalQuestionGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_lines(numericalQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_lines(numericalQuestionGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_sentence(numericalQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_sentence(numericalQuestionGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_answer(numericalQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_answer(numericalQuestionGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_options(numericalQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_options(numericalQuestionGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(numericalQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(numericalQuestionGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(numericalQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(numericalQuestionGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(numericalQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link numericalQuestionGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(numericalQuestionGrammarParser.TrueFalseQuestion_anwserContext ctx);
}