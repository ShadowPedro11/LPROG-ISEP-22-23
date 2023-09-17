package elearning.base.examresolutionmanagment.application;

import eapli.framework.io.util.Console;
import elearning.base.exammanagement.antlr.grammar.examGrammar.examGrammarParser;
import elearning.base.exammanagement.domain.Exam;
import elearning.base.examresolutionmanagment.domain.ExamParser;
import elearning.base.usermanagment.auth.AuthRegisters;
import elearning.base.usermanagment.auth.AuthorizationService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ExamResolutionService {
    private final AuthorizationService authorizationService = AuthRegisters.authorizationService();

    public boolean solveExam(Exam exam) {

        String directoryPath = "base.core/src/main/java/elearning/base/examresolutionmanagment/examResolutionBank";
        String fileName = exam.identity().title() + "_" + authorizationService.session().get().email().email()+ ".txt";
        File directory = new File(directoryPath);
        File file = new File(directory, fileName);

        try {
            if(file.createNewFile()) {
                Path path = Path.of(file.getPath());
                String content = String.format("Exam: %s \nStudent: %s - %s " ,exam.identity().title(),authorizationService.session().get().name(),authorizationService.session().get().email().email());
                Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

            }else {
                System.out.println("Error creating exam file");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

        ExamParser.printExamHeader(exam);

        List<examGrammarParser.SectionContext> examSections = ExamParser.examSections(exam);



        for (examGrammarParser.SectionContext sectionContext : examSections){
            ExamParser.printExamSection(sectionContext);
            for(examGrammarParser.QuestionContext questionContext : sectionContext.question()){
                ExamParser.printQuestion(questionContext);
                solveQuestion(questionContext,file);
            }
        }

        return true;
    }

    private void solveQuestion(examGrammarParser.QuestionContext questionContext, File file) {
        Path path = Path.of(file.getPath());
        if (questionContext.matchingQuestion() != null) {
            solveMatchingQuestion(path);
        } else if (questionContext.multipleChoiceQuestion() != null) {
            solveMultipleChoiceQuestion(path);
        } else if (questionContext.shortAnswerQuestion() != null) {
            solveShortAnswerQuestion(path);
        } else if (questionContext.numericalQuestion() != null) {
            solveNumericalQuestion(path);
        } else if (questionContext.missingWordQuestion() != null) {
            solveMissingWordQuestion(path);
        } else if (questionContext.trueFalseQuestion() != null) {
            solveTrueOrFalseQuestion(path);
        }
    }

    private void solveMatchingQuestion(Path path) {
        String init = "============================";
        String content = Console.readLine("Answer: ");
        String end = "============================";

        try {
            Files.write(path, (init + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (end + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void solveMultipleChoiceQuestion(Path path) {
        String init = "============================";
        String content = Console.readLine("Answer: ");
        String end = "============================";

        try {
            Files.write(path, (init + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (end + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void solveShortAnswerQuestion(Path path) {
        String init = "============================";
        String content = Console.readLine("Answer: ");
        String end = "============================";

        try {
            Files.write(path, (init + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (end + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void solveNumericalQuestion(Path path) {
        String init = "============================";
        String content = Console.readLine("Answer: ");
        String end = "============================";

        try {
            Files.write(path, (init + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (end + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void solveMissingWordQuestion(Path path) {
        String init = "============================";
        String content = Console.readLine("Answer: ");
        String end = "============================";

        try {
            Files.write(path, (init + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (end + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void solveTrueOrFalseQuestion(Path path) {
        String init = "============================";
        String content = Console.readLine("Answer: ");
        String end = "============================";

        try {
            Files.write(path, (init + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(path, (end + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
