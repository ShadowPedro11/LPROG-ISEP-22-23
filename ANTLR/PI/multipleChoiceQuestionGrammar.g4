grammar multipleChoiceQuestionGrammar;

import shortAnswerGrammar;

multipleChoiceQuestion: '=====MULTIPLE_CHOICE_QUESTION=====' NEWLINE
                        questionValue NEWLINE
                        feedback NEWLINE
                        multipleChoiceQuestion_questionText NEWLINE
                        multipleChoiceQuestion_options '=====END_QUESTION=====';

questionValue: 'Value: ' INT;

feedback: 'Feedback: ' STRING;

multipleChoiceQuestion_questionText: STRING+;

multipleChoiceQuestion_options: multipleChoiceQuestion_option+;

multipleChoiceQuestion_option: multipleChoiceQuestion_optionText ARROW (CORRECT | WRONG) PERCENTAGE NEWLINE;

multipleChoiceQuestion_optionText: STRING;


INT: [0-9]+;

PERCENTAGE: ARROW [0-9]+[%];

CORRECT: 'correct';

WRONG: 'wrong';

ARROW: SPACE'->'SPACE;

SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;

NEWLINE: [\n] ;

WS: [ \t\r]+ -> skip;