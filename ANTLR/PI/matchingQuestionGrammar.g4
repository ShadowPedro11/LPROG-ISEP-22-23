grammar matchingQuestionGrammar;

import multipleChoiceQuestionGrammar;

matchingQuestion: '=====MATCHING_QUESTION=====' NEWLINE
                  questionValue NEWLINE
                  feedback NEWLINE
                  matchingQuestion_questionText
                  NEWLINE matchingQuestion_subQuestions matchingQuestion_answers '=====END_QUESTION=====';


questionValue: 'Value: ' INT;

feedback: 'Feedback: ' STRING;

matchingQuestion_questionText: STRING;

matchingQuestion_subQuestions: 'Sub-Questions:'  NEWLINE matchingQuestion_subQuestion+;

matchingQuestion_subQuestion: NUMBERS STRING NEWLINE;

matchingQuestion_answers: 'Answers:'  NEWLINE matchingQuestion_answer+;

matchingQuestion_answer: NUMBERS STRING NEWLINE ;


NUMBERS: INT ':'SPACE;

INT: [0-9]+;

SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;

WS: [ \t\r]+ -> skip ;

NEWLINE: [\n];
