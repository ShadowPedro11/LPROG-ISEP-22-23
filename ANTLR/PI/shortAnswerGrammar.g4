grammar shortAnswerGrammar;

import numericalQuestionGrammar;

shortAnswerQuestion: '=====SHORT_ANSWER_QUESTION=====' NEWLINE
                     questionValue NEWLINE
                     feedback NEWLINE
                     shortAnswerQuestion_question
                     NEWLINE shortAnswerQuestion_answer+
                     '=====END_QUESTION=====';

questionValue: 'Value: ' INT;

feedback: 'Feedback: ' STRING;

shortAnswerQuestion_question: STRING+;

shortAnswerQuestion_answer:  STRING+ PERCENTAGE NEWLINE;

PERCENTAGE: ARROW [0-9]+[%];

INT: [0-9]+;
ARROW: SPACE'->'SPACE;

SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;

WS: [ \t\r]+ -> skip ;

NEWLINE: [\n];




