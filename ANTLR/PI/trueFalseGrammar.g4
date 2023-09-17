grammar trueFalseGrammar;

trueFalseQuestion: '=====TRUE_OR_FALSE_QUESTION=====' NEWLINE
                   questionValue NEWLINE
                   feedback NEWLINE
                   trueFalseQuestion_sentence NEWLINE
                   trueFalseQuestion_anwser NEWLINE
                   '=====END_QUESTION=====' ;

questionValue: 'Value: ' INT;

feedback: 'Feedback: ' STRING;

trueFalseQuestion_sentence: STRING+;

trueFalseQuestion_anwser:(TRUE|FALSE);

TRUE: 'True' ;
FALSE: 'False';

INT: [0-9]+;

SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;

WS: [ \t\r]+ -> skip ;
NEWLINE: [\n] ;