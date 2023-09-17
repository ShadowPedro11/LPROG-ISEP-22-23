package main;

import antlr.exam.examGrammarBaseListener;
import antlr.exam.examGrammarParser;

public class Listener extends examGrammarBaseListener {
    @Override
    public void enterTitle(examGrammarParser.TitleContext ctx) {
        String examTitle = ctx.STRING().getText();
        System.out.println("Exam Title: " + examTitle);
        System.out.println();
    }
    @Override
    public void enterSection(examGrammarParser.SectionContext ctx) {
        System.out.println();
        System.out.println("Section: " + ctx.STRING().getText());
        if (ctx.description() != null) {
            System.out.println("  Description: " + ctx.description().STRING().getText());
        }
        System.out.println();
    }

    @Override
    public void enterQuestion(examGrammarParser.QuestionContext ctx) {
        if (ctx.matchingQuestion() != null) {
            matchingQuestion(ctx.matchingQuestion());
        } else if (ctx.multipleChoiceQuestion() != null) {
            multipleChoiceQuestion(ctx.multipleChoiceQuestion());
        } else if (ctx.shortAnswerQuestion() != null) {
            shortAnswerQuestion(ctx.shortAnswerQuestion());
        } else if (ctx.numericalQuestion() != null) {
            numericalQuestion(ctx.numericalQuestion());
        } else if (ctx.missingWordQuestion() != null) {
            missingWordQuestion(ctx.missingWordQuestion());
        } else if (ctx.trueFalseQuestion() != null) {
            trueOrFalseQuestion(ctx.trueFalseQuestion());
        }
        System.out.println();
    }

    private void matchingQuestion(examGrammarParser.MatchingQuestionContext ctx) {
        System.out.println("Question: " + ctx.matchingQuestion_questionText().getText());
        System.out.println(" " + ctx.questionValue().getText());
        System.out.println(" Sub-Questions:");
        for (examGrammarParser.MatchingQuestion_subQuestionContext subQuestionContext : ctx.matchingQuestion_subQuestions().matchingQuestion_subQuestion()) {
            System.out.println(" " + subQuestionContext.STRING().getText());
        }
        System.out.println("Answers:");
        for (examGrammarParser.MatchingQuestion_answerContext answerContext : ctx.matchingQuestion_answers().matchingQuestion_answer()) {
            System.out.println(" " + answerContext.STRING().getText());
        }
    }

    private void multipleChoiceQuestion(examGrammarParser.MultipleChoiceQuestionContext ctx) {
        System.out.println("Question: " + ctx.multipleChoiceQuestion_questionText().getText());
        System.out.println(" " + ctx.questionValue().getText());
        for (examGrammarParser.MultipleChoiceQuestion_optionContext optionContext : ctx.multipleChoiceQuestion_options().multipleChoiceQuestion_option()) {
            System.out.println("  Option: " + optionContext.multipleChoiceQuestion_optionText().getText());
        }
    }

    private void shortAnswerQuestion(examGrammarParser.ShortAnswerQuestionContext ctx) {
        System.out.println("Question: " + ctx.shortAnswerQuestion_question().getText());
        System.out.println(" " + ctx.questionValue().getText());
    }

    private void numericalQuestion(examGrammarParser.NumericalQuestionContext ctx) {
        System.out.println("Question: " + ctx.numericalQuestion_question().getText());
        System.out.println(" " + ctx.questionValue().getText());
    }

    private void missingWordQuestion(examGrammarParser.MissingWordQuestionContext ctx) {
        System.out.println("Question:");
        System.out.println(" " + ctx.questionValue().getText());

        for (examGrammarParser.MissingWordQuestion_linesContext lineContext : ctx.missingWordQuestion_lines()) {
            System.out.println("Sentence: " + lineContext.missingWordQuestion_sentence(0).getText() + lineContext.MISSING_WORDSYMBOL().getText() + lineContext.missingWordQuestion_sentence(1).getText());

            System.out.println("Answer:");
            for (examGrammarParser.MissingWordQuestion_optionsContext optionContext : lineContext.missingWordQuestion_answer().missingWordQuestion_options()) {
                System.out.println("  " + optionContext.STRING().toString().replaceAll("\\[|\\]", ""));
            }
            System.out.println();
        }
    }

    private void trueOrFalseQuestion(examGrammarParser.TrueFalseQuestionContext ctx) {
        System.out.println("Question Sentence: " + ctx.trueFalseQuestion_sentence().getText());
        System.out.println(" " + ctx.questionValue().getText());
    }
}