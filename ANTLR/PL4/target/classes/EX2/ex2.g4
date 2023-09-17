grammar ex2;

ex: coisas+;

coisas: INT ' ' OPERATOR ' ' INT BREAK;

INT: [1-9][0-9]*;

OPERATOR: ('>' | '<' |'>=' | '<=' | '=' | '<>');

BREAK: [\n];

WS: [ \t\r]+ -> skip ;