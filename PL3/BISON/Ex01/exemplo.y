%{
 #include <stdio.h>

 void yyerror (char *s) {
	printf("erro sintactico/semantico:%s\n",s);
}
%}

%token HELLO WORLD WORD

%start phrase

%%

phrase: 
		| phrase HELLO WORLD { printf("HELLO WORLD\n"); }
		| phrase HELLO 
		| phrase WORLD 
		| phrase WORD
		;

%%

int main () {
	yyparse() ;
}

