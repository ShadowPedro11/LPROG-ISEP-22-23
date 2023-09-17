// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2ºano/2ºSemestre/LPROG/ANTLR/Ex1\missingWordsGrammar.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(missingWordsGrammarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(missingWordsGrammarParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(missingWordsGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(missingWordsGrammarParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(missingWordsGrammarParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(missingWordsGrammarParser.OptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(missingWordsGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(missingWordsGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(missingWordsGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(missingWordsGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(missingWordsGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(missingWordsGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link missingWordsGrammarParser#anwser}.
	 * @param ctx the parse tree
	 */
	void enterAnwser(missingWordsGrammarParser.AnwserContext ctx);
	/**
	 * Exit a parse tree produced by {@link missingWordsGrammarParser#anwser}.
	 * @param ctx the parse tree
	 */
	void exitAnwser(missingWordsGrammarParser.AnwserContext ctx);
}