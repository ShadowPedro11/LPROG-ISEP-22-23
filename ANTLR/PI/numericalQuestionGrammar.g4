grammar numericalQuestionGrammar;

import missingWordsGrammar;

numericalQuestion: '=====NUMERICAL_QUESTION=====' NEWLINE
                    questionValue NEWLINE
                    feedback NEWLINE
                    numericalQuestion_question NEWLINE
                    numericalQuestion_answer NEWLINE '=====END_QUESTION=====';

questionValue: 'Value: ' INT;

feedback: 'Feedback: ' STRING;

numericalQuestion_question: STRING+;

numericalQuestion_answer: ((INT|DECIMAL) numericalQuestion_error? PERCENTAGE);

numericalQuestion_error: SPACE '(' ERROR '-'(INT|DECIMAL) SPACE '+'(INT|DECIMAL) ')';


ERROR: 'ERROR ';

PERCENTAGE: ARROW [0-9]+[%];

ARROW: SPACE'->'SPACE;

INT: [0-9]+;

DECIMAL: [0-9]+ '.' [0-9]+;


SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;

WS: [ \t\r]+ -> skip;

NEWLINE: [\n] ;

