package antlr.shorts;// Generated from C:/Users/0941p/OneDrive/Ambiente de Trabalho/ISEP/ISEP_2�ano/2�Semestre/LPROG/ANTLR/Ex1\shortAnswerGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link shortAnswerGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface shortAnswerGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(shortAnswerGrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_question(shortAnswerGrammarParser.ShortAnswerQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#shortAnswerQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion_answer(shortAnswerGrammarParser.ShortAnswerQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(shortAnswerGrammarParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_question(shortAnswerGrammarParser.NumericalQuestion_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_answer(shortAnswerGrammarParser.NumericalQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#numericalQuestion_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion_error(shortAnswerGrammarParser.NumericalQuestion_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion(shortAnswerGrammarParser.MissingWordQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_lines(shortAnswerGrammarParser.MissingWordQuestion_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_sentence(shortAnswerGrammarParser.MissingWordQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_answer(shortAnswerGrammarParser.MissingWordQuestion_answerContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#missingWordQuestion_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingWordQuestion_options(shortAnswerGrammarParser.MissingWordQuestion_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(shortAnswerGrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_sentence(shortAnswerGrammarParser.TrueFalseQuestion_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link shortAnswerGrammarParser#trueFalseQuestion_anwser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion_anwser(shortAnswerGrammarParser.TrueFalseQuestion_anwserContext ctx);
}