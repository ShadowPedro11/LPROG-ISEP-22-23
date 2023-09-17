package main.Chest;

import antlr.exam.examGrammarLexer;
import antlr.exam.examGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExamParser {
    public static void main(String[] args) {
        String filename = "src/question/exam"; // Specify the path to your file here

        Path path = Paths.get(filename);
        try {
            String input = new String(Files.readAllBytes(path));

            examGrammarLexer lexer = new examGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            examGrammarParser parser = new examGrammarParser(tokens);

            examGrammarParser.ExamContext examContext = parser.exam();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("Valid exam:");
                System.out.println();
                System.out.println("Title: " + examContext.title().STRING().getText());
                System.out.println();
                System.out.println("Header:");
                System.out.println("  Grade: " + examContext.header().gradeType().FEEDBACKTYPE().getText());
                if (examContext.header().description() != null) {
                    System.out.println("  Description: " + examContext.header().description().STRING().getText());
                }

                for (examGrammarParser.SectionContext sectionContext : examContext.section()) {
                    System.out.println();
                    System.out.println("Section: " + sectionContext.STRING().getText());
                    if (sectionContext.description() != null) {
                        System.out.println("  Description: " + sectionContext.description().STRING().getText());
                    }
                    for (examGrammarParser.QuestionContext questionContext : sectionContext.question()) {
                        System.out.println();
                        if (questionContext.matchingQuestion() != null) {
                            //matchingQuestion(questionContext.matchingQuestion());
                            matchingQuestion2(questionContext.matchingQuestion());
                        } else if (questionContext.multipleChoiceQuestion() != null) {
                            //multipleChoiceQuestion(questionContext.multipleChoiceQuestion());
                            multipleChoiceQuestion2(questionContext.multipleChoiceQuestion());
                        } else if (questionContext.shortAnswerQuestion() != null) {
                            //shortAnswerQuestion(questionContext.shortAnswerQuestion());
                            shortAnswerQuestion2(questionContext.shortAnswerQuestion());
                        } else if (questionContext.numericalQuestion() != null) {
                            //numericalQuestion(questionContext.numericalQuestion());
                            numericalQuestion2(questionContext.numericalQuestion());
                        } else if (questionContext.missingWordQuestion() != null) {
                            //missingWordQuestion(questionContext.missingWordQuestion());
                            missingWordQuestion2(questionContext.missingWordQuestion());
                        } else if (questionContext.trueFalseQuestion() != null) {
                            //trueOrFalseQuestion(questionContext.trueFalseQuestion());
                            trueOrFalseQuestion2(questionContext.trueFalseQuestion());
                        }
                        Scanner myObj = new Scanner(System.in);
                        System.out.println("Enter answer");
                        String userName = myObj.nextLine();
                    }
                }
            } else {
                System.out.println("Invalid exam!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void matchingQuestion(examGrammarParser.MatchingQuestionContext matchingQuestion) {

        System.out.println("Question: " + matchingQuestion.matchingQuestion_questionText().getText());
        System.out.println(" " + matchingQuestion.questionValue().getText());
        System.out.println(" " + matchingQuestion.feedback().getText());
        System.out.println(" Sub-Questions:");
        for (examGrammarParser.MatchingQuestion_subQuestionContext subQuestionContext : matchingQuestion.matchingQuestion_subQuestions().matchingQuestion_subQuestion()) {
            System.out.println("  " + subQuestionContext.NUMBERS().getText() + " " + subQuestionContext.STRING().getText());
        }
        System.out.println("Answers:");
        for (examGrammarParser.MatchingQuestion_answerContext answerContext : matchingQuestion.matchingQuestion_answers().matchingQuestion_answer()) {
            System.out.println("  " + answerContext.NUMBERS().getText() + " " + answerContext.STRING().getText());
        }
    }
    private static void multipleChoiceQuestion(examGrammarParser.MultipleChoiceQuestionContext multipleChoiceQuestion) {

        System.out.println("Question: " + multipleChoiceQuestion.multipleChoiceQuestion_questionText().getText());
        System.out.println(" " + multipleChoiceQuestion.questionValue().getText());
        System.out.println(" " + multipleChoiceQuestion.feedback().getText());
        for (examGrammarParser.MultipleChoiceQuestion_optionContext optionContext : multipleChoiceQuestion.multipleChoiceQuestion_options().multipleChoiceQuestion_option()) {
            System.out.println("  Option: " + optionContext.getText());
        }
    }
    private static void shortAnswerQuestion(examGrammarParser.ShortAnswerQuestionContext shortAnswerQuestion) {
        System.out.println("Question: " + shortAnswerQuestion.shortAnswerQuestion_question().getText());
        System.out.println(" " + shortAnswerQuestion.questionValue().getText());
        System.out.println(" " + shortAnswerQuestion.feedback().getText());
        for (examGrammarParser.ShortAnswerQuestion_answerContext answerContext : shortAnswerQuestion.shortAnswerQuestion_answer()) {
            System.out.print(" Answer: " + answerContext.getText());
        }
    }
    private static void numericalQuestion(examGrammarParser.NumericalQuestionContext numericalQuestion) {
        System.out.println("Question: " + numericalQuestion.numericalQuestion_question().getText());
        System.out.println(" " + numericalQuestion.questionValue().getText());
        System.out.println(" " + numericalQuestion.feedback().getText());
        System.out.println(" Answer: " + numericalQuestion.numericalQuestion_answer().getText());
    }
    private static void missingWordQuestion(examGrammarParser.MissingWordQuestionContext missingWordQuestion) {
        System.out.println("Question:");
        System.out.println(" " + missingWordQuestion.questionValue().getText());
        System.out.println(" " + missingWordQuestion.feedback().getText());

        for (examGrammarParser.MissingWordQuestion_linesContext lineContext : missingWordQuestion.missingWordQuestion_lines()) {
            System.out.println("Sentence: " + lineContext.missingWordQuestion_sentence(0).getText() + lineContext.MISSING_WORDSYMBOL().getText() + lineContext.missingWordQuestion_sentence(1).getText());

            System.out.println("Answer: ");
            for (examGrammarParser.MissingWordQuestion_optionsContext optionContext : lineContext.missingWordQuestion_answer().missingWordQuestion_options()) {
                System.out.print("  Option: ");
                for (TerminalNode s: optionContext.STRING()){
                    System.out.print(s);
                }
                System.out.println();
                System.out.println("  Validation: " + (optionContext.CORRECT() != null));
            }
            System.out.println();
        }
    }
    public static void trueOrFalseQuestion(examGrammarParser.TrueFalseQuestionContext trueFalseQuestionContext){
        System.out.println("Question Sentence: " + trueFalseQuestionContext.trueFalseQuestion_sentence().getText());
        System.out.println(" " + trueFalseQuestionContext.questionValue().getText());
        System.out.println(" " + trueFalseQuestionContext.feedback().getText());
        System.out.println(" Answer: " + trueFalseQuestionContext.trueFalseQuestion_anwser().getText());
    }





    private static void matchingQuestion2(examGrammarParser.MatchingQuestionContext matchingQuestion) {

        System.out.println("Question: " + matchingQuestion.matchingQuestion_questionText().getText());
        System.out.println(" " + matchingQuestion.questionValue().getText());
        System.out.println(" Sub-Questions:");
        for (examGrammarParser.MatchingQuestion_subQuestionContext subQuestionContext : matchingQuestion.matchingQuestion_subQuestions().matchingQuestion_subQuestion()) {
            System.out.println("  " + subQuestionContext.NUMBERS().getText() + " " + subQuestionContext.STRING().getText());
        }
        System.out.println("Answers:");
        for (examGrammarParser.MatchingQuestion_answerContext answerContext : matchingQuestion.matchingQuestion_answers().matchingQuestion_answer()) {
            System.out.println("  " + answerContext.NUMBERS().getText() + " " + answerContext.STRING().getText());
        }
    }
    private static void multipleChoiceQuestion2(examGrammarParser.MultipleChoiceQuestionContext multipleChoiceQuestion) {

        System.out.println("Question: " + multipleChoiceQuestion.multipleChoiceQuestion_questionText().getText());
        System.out.println(" " + multipleChoiceQuestion.questionValue().getText());
        for (examGrammarParser.MultipleChoiceQuestion_optionContext optionContext : multipleChoiceQuestion.multipleChoiceQuestion_options().multipleChoiceQuestion_option()) {
            System.out.println("  Option: " + optionContext.multipleChoiceQuestion_optionText().getText());
        }
    }
    private static void shortAnswerQuestion2(examGrammarParser.ShortAnswerQuestionContext shortAnswerQuestion) {
        System.out.println("Question: " + shortAnswerQuestion.shortAnswerQuestion_question().getText());
        System.out.println(" " + shortAnswerQuestion.questionValue().getText());

    }
    private static void numericalQuestion2(examGrammarParser.NumericalQuestionContext numericalQuestion) {
        System.out.println("Question: " + numericalQuestion.numericalQuestion_question().getText());
        System.out.println(" " + numericalQuestion.questionValue().getText());
    }
    private static void missingWordQuestion2(examGrammarParser.MissingWordQuestionContext missingWordQuestion) {
        System.out.println("Question:");
        System.out.println(" " + missingWordQuestion.questionValue().getText());

        for (examGrammarParser.MissingWordQuestion_linesContext lineContext : missingWordQuestion.missingWordQuestion_lines()) {
            System.out.println("Sentence: " + lineContext.missingWordQuestion_sentence(0).getText() + lineContext.MISSING_WORDSYMBOL().getText() + lineContext.missingWordQuestion_sentence(1).getText());

            System.out.println("Answer: ");
            for (examGrammarParser.MissingWordQuestion_optionsContext optionContext : lineContext.missingWordQuestion_answer().missingWordQuestion_options()) {
                System.out.print("  Option: ");
                for (TerminalNode s: optionContext.STRING()){
                    System.out.print(s);
                }
                System.out.println();
            }

        }
    }
    public static void trueOrFalseQuestion2(examGrammarParser.TrueFalseQuestionContext trueFalseQuestionContext){
        System.out.println("Question Sentence: " + trueFalseQuestionContext.trueFalseQuestion_sentence().getText());
        System.out.println(" " + trueFalseQuestionContext.questionValue().getText());
    }


}
