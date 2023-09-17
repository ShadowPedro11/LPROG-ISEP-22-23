grammar missingWordsGrammar;

import trueFalseGrammar;

missingWordQuestion: '=====MISSING_WORDS_QUESTION=====' NEWLINE
                     questionValue NEWLINE
                     feedback NEWLINE
                     missingWordQuestion_lines+ '=====END_QUESTION=====' ;


questionValue: 'Value: ' INT;

feedback: 'Feedback: ' STRING;

missingWordQuestion_lines: missingWordQuestion_sentence MISSING_WORDSYMBOL missingWordQuestion_sentence missingWordQuestion_answer (NEWLINE);

missingWordQuestion_sentence: STRING*;

missingWordQuestion_answer: SPACE'Answer: ' missingWordQuestion_options missingWordQuestion_options+;

missingWordQuestion_options: STRING+ ARROW (CORRECT | WRONG) (';' SPACE|  );

INT: [0-9]+;

CORRECT: 'correct';
WRONG: 'wrong';

ARROW: SPACE'->'SPACE;

MISSING_WORDSYMBOL: SPACE'___'SPACE;

SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;
WS: [ \t\r]+ -> skip;

NEWLINE: [\n] ;