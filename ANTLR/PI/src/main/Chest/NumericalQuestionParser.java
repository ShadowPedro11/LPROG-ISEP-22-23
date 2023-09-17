package main.Chest;

import antlr.numerical.numericalQuestionGrammarLexer;
import antlr.numerical.numericalQuestionGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NumericalQuestionParser {
    public static void main(String[] args) {
        String filename = "src/question/numericalQuestion"; // Specify the path to your file here

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            numericalQuestionGrammarLexer lexer = new numericalQuestionGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            numericalQuestionGrammarParser parser = new numericalQuestionGrammarParser(tokens);

            numericalQuestionGrammarParser.NumericalQuestionContext questionContext = parser.numericalQuestion();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid question:");
                System.out.println("Question: " + questionContext.numericalQuestion_question().getText());
                System.out.println("Answer: " + questionContext.numericalQuestion_answer().getText());
            } else {
                System.out.println("Invalid question!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
