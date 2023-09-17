package antlr.missing;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\missingWordsGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link missingWordsGrammarParser}.
 */
public interface missingWordsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion(missingWordsGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion(missingWordsGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_lines(missingWordsGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_lines(missingWordsGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_sentence(missingWordsGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_sentence(missingWordsGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_answer(missingWordsGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_answer(missingWordsGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void enterMissingWordQuestion_options(missingWordsGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 */
	void exitMissingWordQuestion_options(missingWordsGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(missingWordsGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(missingWordsGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(missingWordsGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(missingWordsGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(missingWordsGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(missingWordsGrammarParser.TrueFalseQuestion_anwserContext ctx);
}