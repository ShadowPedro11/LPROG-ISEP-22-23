package EX3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String filename = "src/EX3/main_text";

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            ex3Lexer lexer = new ex3Lexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ex3Parser parser = new ex3Parser(tokens);
            ex3Parser.ExContext questionContext = parser.ex();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid:");


                for (ex3Parser.CoisasContext c: questionContext.coisas()){
                    String str = c.getText().replace("\n","");
                    System.out.print(str + " -> ");
                    List<String> stringList = List.of(str.split(" "));
                    for (int i = 0; i < (stringList.size() - 2); i=i+2) {
                        System.out.print(smooth_comparator(stringList.get(i),stringList.get(i+1),stringList.get(i+2)) + " ");
                    }
                    System.out.println();
                }


            } else {
                System.out.println("Invalid!");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String smooth_comparator(String value1, String valueOperator, String value2){
        int a = 0;
        int b = 0;
        boolean aValid = false;
        boolean bValid = false;
        String operator = valueOperator;


        try {
            a = Integer.parseInt(value1);
            aValid = true;
        } catch (NumberFormatException e) {
        }

        try {
            b = Integer.parseInt(value2);
            bValid = true;
        } catch (NumberFormatException e) {
        }



        String returnStr = null;

        switch (operator) {
            case ">":
                if(aValid && bValid) {
                    if (a > b) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else if(!aValid && !bValid){
                    if (((int) value1.charAt(0)) > ((int) value2.charAt(0)) ) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else {
                    returnStr = "invalido";
                }
                break;

            case "<":
                if(aValid && bValid) {
                if (a < b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }

                }else if(!aValid && !bValid){
                    if (((int) value1.charAt(0)) < ((int) value2.charAt(0)) ) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else {
                    returnStr = "invalido";
                }
                break;

            case ">=":
                if(aValid && bValid) {
                if (a >= b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }

                }else if(!aValid && !bValid){
                    if (((int) value1.charAt(0)) >= ((int) value2.charAt(0)) ) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else {
                    returnStr = "invalido";
                }
                break;

            case "<=":
                if(aValid && bValid) {
                if (a <= b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }

                }else if(!aValid && !bValid){
                    if (((int) value1.charAt(0)) <= ((int) value2.charAt(0)) ) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else {
                    returnStr = "invalido";
                }
                break;

            case "=":
                if(aValid && bValid) {
                if (a == b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }

                }else if(!aValid && !bValid){
                    if (((int) value1.charAt(0)) == ((int) value2.charAt(0)) ) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else {
                    returnStr = "invalido";
                }
                break;

            case "<>":
                if(aValid && bValid) {
                if (a != b) {
                    returnStr = "verdadeiro";
                }else {
                    returnStr = "falso";
                }

                }else if(!aValid && !bValid){
                    if (((int) value1.charAt(0)) != ((int) value2.charAt(0)) ) {
                        returnStr = "verdadeiro";
                    } else {
                        returnStr = "falso";
                    }
                }else {
                    returnStr = "invalido";
                }
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }


        return returnStr;
    }
}
