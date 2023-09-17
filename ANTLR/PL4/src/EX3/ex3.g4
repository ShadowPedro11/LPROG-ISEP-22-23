grammar ex3;

ex: coisas+;

coisas: comparable ' ' OPERATOR ' ' comparable other* BREAK ;

other: ' ' OPERATOR ' ' comparable;

comparable: INT | WORD ;

WORD: [a-zA-Z];

INT: [1-9][0-9]*;

OPERATOR: ('>' | '<' |'>=' | '<=' | '=' | '<>');

BREAK: [\n];

WS: [ \t\r]+ -> skip ;