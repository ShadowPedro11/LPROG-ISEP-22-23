package EX1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        String filename = "src/EX1/main_text";

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            HelloWorldLexer lexer = new HelloWorldLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HelloWorldParser parser = new HelloWorldParser(tokens);

            HelloWorldParser.HelloWorldContext questionContext = parser.helloWorld();


            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid:");
                for (HelloWorldParser.SentencesContext c: questionContext.sentences()){
                    System.out.println("Hello World!!!");
                }
            } else {
                System.out.println("Invalid!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
