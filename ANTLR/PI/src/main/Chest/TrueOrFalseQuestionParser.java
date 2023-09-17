package main.Chest;

import antlr.trueOrFalse.trueFalseGrammarLexer;
import antlr.trueOrFalse.trueFalseGrammarParser;
import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TrueOrFalseQuestionParser {
    public static void main(String[] args) {
        String filename = "src/question/trueOrFalseQuestion";

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));
            trueFalseGrammarLexer lexer = new trueFalseGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            trueFalseGrammarParser parser = new trueFalseGrammarParser(tokens);

            trueFalseGrammarParser.TrueFalseQuestionContext questionContext = parser.trueFalseQuestion();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid question:");
                System.out.println("Question Sentence: " + questionContext.trueFalseQuestion_sentence().getText());
                System.out.println("Answer: " + questionContext.trueFalseQuestion_anwser().getText());
            } else {
                System.out.println("Invalid question!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
