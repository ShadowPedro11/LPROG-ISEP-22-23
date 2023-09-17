package EX2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) {
        String filename = "src/EX2/main_text";

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            ex2Lexer lexer = new ex2Lexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ex2Parser parser = new ex2Parser(tokens);
            ex2Parser.ExContext questionContext = parser.ex();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid:");

                for (ex2Parser.CoisasContext c: questionContext.coisas()){
                    System.out.println(c.INT(0) + " " + c.OPERATOR() + " " + c.INT(1) +  "->" + smooth_comparator(c.INT(0),c.OPERATOR(),c.INT(1)));
                }

            } else {
                System.out.println("Invalid!");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String smooth_comparator(TerminalNode anInt, TerminalNode operators, TerminalNode terminalNode){
        int a = Integer.parseInt(anInt.getText());
        int b = Integer.parseInt(terminalNode.getText());

        String operator = operators.getText();
        String returnStr = null;

        switch (operator) {
            case ">":
                if (a > b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }
                break;

            case "<":
                if (a < b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }
                break;

            case ">=":
                if (a >= b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }
                break;

            case "<=":
                if (a <= b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }
                break;

            case "=":
                if (a == b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }
                break;

            case "<>":
                if (a != b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }


        return returnStr;
    }
}
