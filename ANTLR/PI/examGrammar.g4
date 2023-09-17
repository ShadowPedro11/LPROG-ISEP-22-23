grammar examGrammar;

import matchingQuestionGrammar;

exam: '=====EXAM_START=====' NEWLINE title header section+ NEWLINE '=====EXAM_END=====';

title: 'Title: ' STRING NEWLINE ;

header: NEWLINE 'Header:' NEWLINE feedbackType  gradeType  description?;

feedbackType: 'Feedback: ' FEEDBACKTYPE NEWLINE;

gradeType: 'Grade: ' FEEDBACKTYPE NEWLINE;

description: 'Description: ' STRING NEWLINE;

section: NEWLINE 'Section: ' STRING NEWLINE description question+;

question: NEWLINE'Question:' NEWLINE (matchingQuestion | multipleChoiceQuestion |
          shortAnswerQuestion |  numericalQuestion |
          missingWordQuestion | trueFalseQuestion) NEWLINE;

PERCENTAGE: ARROW [0-9]+[%];

ERROR: 'ERROR ';

TRUE: 'True' ;
FALSE: 'False';

CORRECT: 'correct';

WRONG: 'wrong';

ARROW: SPACE'->'SPACE;

MISSING_WORDSYMBOL: SPACE'___'SPACE;

NUMBERS: INT ':'SPACE;

FEEDBACKTYPE: ('none' | 'on-submission' | 'after-closing');

INT: [0-9]+;
DECIMAL: [0-9]+ '.' [0-9]+;

SPACE: ' ';

HIFEN: '-';

VIRGULA: ','SPACE;

END_STRING: ('?' | '.');

STRING: WORD ((SPACE | HIFEN | VIRGULA) WORD)* END_STRING? ;

WORD:([a-zA-Z0-9])+;

WS: [ \t\r]+ -> skip ;

NEWLINE: [\n];
