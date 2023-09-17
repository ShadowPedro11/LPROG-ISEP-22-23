// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/PI\trueFalseGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link trueFalseGrammarParser}.
 */
public interface trueFalseGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(trueFalseGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(trueFalseGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(trueFalseGrammarParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(trueFalseGrammarParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void enterFeedback(trueFalseGrammarParser.FeedbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#feedback}.
	 * @param ctx the parse tree
	 */
	void exitFeedback(trueFalseGrammarParser.FeedbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_sentence(trueFalseGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_sentence(trueFalseGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion_anwser(trueFalseGrammarParser.TrueFalseQuestion_anwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link trueFalseGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion_anwser(trueFalseGrammarParser.TrueFalseQuestion_anwserContext ctx);
}