package main;

import antlr.exam.examGrammarBaseVisitor;
import antlr.exam.examGrammarParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Visitor extends examGrammarBaseVisitor {

        List<String> examTitleAndHeader = new ArrayList<>();
        List<examGrammarParser.SectionContext> examSections = new ArrayList<>();
        int examScore = 0;

        List<String> stringList = new ArrayList<>();


        @Override
        public Void visitTitle(examGrammarParser.TitleContext ctx) {
            examTitleAndHeader.add("Exam Title: " + ctx.STRING().getText());
            return null;
        }

        @Override
        public Void visitHeader(examGrammarParser.HeaderContext ctx) {
            examTitleAndHeader.add("Header:");
            examTitleAndHeader.add("  Grade: " + ctx.gradeType().FEEDBACKTYPE().getText());
            if (ctx.description() != null) {
                examTitleAndHeader.add("  Description: " + ctx.description().STRING().getText());
            }
            return null;
        }

        @Override
        public Void visitSection(examGrammarParser.SectionContext ctx) {
            examSections.add(ctx);

            for (examGrammarParser.QuestionContext s: ctx.question()){
                visitinho(s);
            }

            visitChildren(ctx);

            return null;
        }




    public Void visitinho(examGrammarParser.QuestionContext questionContext) {
        if (questionContext.matchingQuestion() != null) {
            examScore = examScore + Integer.parseInt(questionContext.matchingQuestion().questionValue().INT().getText());
        } else if (questionContext.multipleChoiceQuestion() != null) {
            examScore = examScore + Integer.parseInt(questionContext.multipleChoiceQuestion().questionValue().INT().getText());
        } else if (questionContext.shortAnswerQuestion() != null) {
            examScore = examScore + Integer.parseInt(questionContext.shortAnswerQuestion().questionValue().INT().getText());
        } else if (questionContext.numericalQuestion() != null) {
            examScore = examScore + Integer.parseInt(questionContext.numericalQuestion().questionValue().INT().getText());
        } else if (questionContext.missingWordQuestion() != null) {
            examScore = examScore + Integer.parseInt(questionContext.missingWordQuestion().questionValue().INT().getText());
        } else if (questionContext.trueFalseQuestion() != null) {
            examScore = examScore + Integer.parseInt(questionContext.trueFalseQuestion().questionValue().INT().getText());
        }
        return null;
    }



        @Override
        public Void visitQuestion(examGrammarParser.QuestionContext ctx) {
            if (ctx.matchingQuestion() != null) {
                visitMatchingQuestion(ctx.matchingQuestion());
            } else if (ctx.multipleChoiceQuestion() != null) {
                visitMultipleChoiceQuestion(ctx.multipleChoiceQuestion());
            } else if (ctx.shortAnswerQuestion() != null) {
                visitShortAnswerQuestion(ctx.shortAnswerQuestion());
            } else if (ctx.numericalQuestion() != null) {
                visitNumericalQuestion(ctx.numericalQuestion());
            } else if (ctx.missingWordQuestion() != null) {
                visitMissingWordQuestion(ctx.missingWordQuestion());
            } else if (ctx.trueFalseQuestion() != null) {
                visitTrueFalseQuestion(ctx.trueFalseQuestion());
            }
            return null;
        }
        public Void visitMatchingQuestion(examGrammarParser.MatchingQuestionContext ctx) {
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
            return null;
        }

        public Void visitMultipleChoiceQuestion(examGrammarParser.MultipleChoiceQuestionContext ctx) {
            System.out.println("Question: " + ctx.multipleChoiceQuestion_questionText().getText());
            System.out.println(" " + ctx.questionValue().getText());
            for (examGrammarParser.MultipleChoiceQuestion_optionContext optionContext : ctx.multipleChoiceQuestion_options().multipleChoiceQuestion_option()) {
                System.out.println("  Option: " + optionContext.multipleChoiceQuestion_optionText().getText());
            }
            return null;
        }

        public Void visitShortAnswerQuestion(examGrammarParser.ShortAnswerQuestionContext ctx) {
            System.out.println("Question: " + ctx.shortAnswerQuestion_question().getText());
            System.out.println(" " + ctx.questionValue().getText());
            return null;
        }

        public Void visitNumericalQuestion(examGrammarParser.NumericalQuestionContext ctx) {
            System.out.println("Question: " + ctx.numericalQuestion_question().getText());
            System.out.println(" " + ctx.questionValue().getText());
            return null;
        }

        public Void visitMissingWordQuestion(examGrammarParser.MissingWordQuestionContext ctx) {
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
            return null;
        }

        public Void visitTrueFalseQuestion(examGrammarParser.TrueFalseQuestionContext ctx) {
            System.out.println("Question Sentence: " + ctx.trueFalseQuestion_sentence().getText());
            System.out.println(" " + ctx.questionValue().getText());
            return null;
        }


        public List<String> ExamTitleAndHeader() {
            return examTitleAndHeader;
        }

        public List<examGrammarParser.SectionContext> ExamSections() {
            return examSections;
        }

        public int ExamMaxScore() {
            return examScore;
        }
}

