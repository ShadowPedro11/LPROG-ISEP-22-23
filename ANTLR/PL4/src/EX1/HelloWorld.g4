grammar HelloWorld;

helloWorld: sentences+;

sentences: HELLO_WORLD;

HELLO_WORLD: 'Hello World';

WS: [ \n\t\r]+ -> skip ;