package main.Chest;


import antlr.missing.missingWordsGrammarLexer;
import antlr.missing.missingWordsGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MissingWordsQuestionParser {
    public static void main(String[] args) {
        String filename = "src/question/missingWordQuestion"; // Specify the path to your file here

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            missingWordsGrammarLexer lexer = new missingWordsGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            missingWordsGrammarParser parser = new missingWordsGrammarParser(tokens);

            missingWordsGrammarParser.MissingWordQuestionContext questionContext = parser.missingWordQuestion();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid question:");
                for (missingWordsGrammarParser.MissingWordQuestion_linesContext lineContext : questionContext.missingWordQuestion_lines()) {
                    System.out.println("Sentence: " + lineContext.missingWordQuestion_sentence(0).getText() + lineContext.MISSING_WORDSYMBOL().getText() + lineContext.missingWordQuestion_sentence(1).getText());

                    System.out.println("Answer: ");
                    for (missingWordsGrammarParser.MissingWordQuestion_optionsContext optionContext : lineContext.missingWordQuestion_answer().missingWordQuestion_options()) {
                        System.out.print("  Option: ");
                        for (TerminalNode s: optionContext.STRING()){
                            System.out.print(s);
                        }
                        System.out.println();
                        System.out.println("  Validation: " + (optionContext.CORRECT() != null));
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid question!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
