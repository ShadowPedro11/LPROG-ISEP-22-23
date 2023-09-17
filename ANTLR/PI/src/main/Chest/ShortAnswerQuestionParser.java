package main.Chest;

import antlr.shorts.shortAnswerGrammarLexer;
import antlr.shorts.shortAnswerGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ShortAnswerQuestionParser {
    public static void main(String[] args) {
        String filename = "src/question/shortAnswerQuestion";


        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));
            shortAnswerGrammarLexer lexer = new shortAnswerGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            shortAnswerGrammarParser parser = new shortAnswerGrammarParser(tokens);

            shortAnswerGrammarParser.ShortAnswerQuestionContext questionContext = parser.shortAnswerQuestion();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid question:");
                System.out.println("Question: " + questionContext.shortAnswerQuestion_question().getText());
                for (shortAnswerGrammarParser.ShortAnswerQuestion_answerContext answerContext : questionContext.shortAnswerQuestion_answer()) {
                    System.out.print("Answer: ");
                    for (TerminalNode s: answerContext.STRING()){
                        System.out.print(s);
                    }
                    System.out.println("Points: " + answerContext.INT().getText());
                }
            } else {
                System.out.println("Invalid question!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
