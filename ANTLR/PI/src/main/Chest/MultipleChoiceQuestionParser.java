package main.Chest;

import antlr.multiple.multipleChoiceQuestionGrammarLexer;
import antlr.multiple.multipleChoiceQuestionGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MultipleChoiceQuestionParser {
    public static void main(String[] args) {
        String filename = "src/question/multipleChoiceQuestion"; // Specify the path to your file here

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            multipleChoiceQuestionGrammarLexer lexer = new multipleChoiceQuestionGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            multipleChoiceQuestionGrammarParser parser = new multipleChoiceQuestionGrammarParser(tokens);

            multipleChoiceQuestionGrammarParser.MultipleChoiceQuestionContext questionContext = parser.multipleChoiceQuestion();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid question:");
                System.out.println("Question: " + questionContext.multipleChoiceQuestion_questionText().getText());
                for (multipleChoiceQuestionGrammarParser.MultipleChoiceQuestion_optionContext optionContext : questionContext.multipleChoiceQuestion_options().multipleChoiceQuestion_option()) {
                    System.out.println("Option: " + optionContext.multipleChoiceQuestion_optionText().getText());
                    System.out.println("Validation: " + (optionContext.CORRECT() != null));
                }
            } else {
                System.out.println("Invalid question!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
