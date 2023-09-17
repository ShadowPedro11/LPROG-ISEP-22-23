package main;


import antlr.exam.examGrammarLexer;
import antlr.exam.examGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExamMain {



    public static void main(String[] args) {
        String filename = "src/question/exam"; // Specify the path to your file here
        Path path = Paths.get(filename);


        try {
            String input = new String(Files.readAllBytes(path));

            examGrammarLexer lexer = new examGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            examGrammarParser parser = new examGrammarParser(tokens);

            ParseTree tree = parser.exam();
            Visitor visitor = new Visitor();
            visitor.visit(tree);

            System.out.println(visitor.ExamMaxScore());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
