package main.Chest;

import antlr.matching.matchingQuestionGrammarLexer;
import antlr.matching.matchingQuestionGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MatchingQuestionParser {
    public static void main(String[] args) {
        String filename = "src/question/matchingQuestion"; // Specify the path to your file here

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            matchingQuestionGrammarLexer lexer = new matchingQuestionGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            matchingQuestionGrammarParser parser = new matchingQuestionGrammarParser(tokens);

            matchingQuestionGrammarParser.MatchingQuestionContext questionContext = parser.matchingQuestion();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid question:");
                System.out.println("Question: " + questionContext.matchingQuestion_questionText().getText());
                System.out.println("Sub-Questions:");
                for (matchingQuestionGrammarParser.MatchingQuestion_subQuestionContext subQuestionContext : questionContext.matchingQuestion_subQuestions().matchingQuestion_subQuestion()) {
                    System.out.println("  " + subQuestionContext.NUMBERS().getText() + " " + subQuestionContext.STRING().getText());
                }
                System.out.println("Answers:");
                for (matchingQuestionGrammarParser.MatchingQuestion_answerContext answerContext : questionContext.matchingQuestion_answers().matchingQuestion_answer()) {
                    System.out.println("  " + answerContext.NUMBERS().getText() + " " + answerContext.STRING().getText());
                }
            } else {
                System.out.println("Invalid question!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
