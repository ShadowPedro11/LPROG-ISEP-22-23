%{
/*	#include<time.h>*/
	 int numChars=0,numAlgarismos=0,numLinhas=0;
%}

%option nounput
%option noinput
%option noyywrap

ALGARISMO		[0-9]{2}
LETRA			[A-Z]{2}
MATR ({ALGARISMO}-{ALGARISMO}-{LETRA})|({ALGARISMO}-{LETRA}-{ALGARISMO})|({LETRA}-{ALGARISMO}-{ALGARISMO})

%%

{MATR} {printf("%s é uma matrícula portuguesa!\n",yytext);}
.* {printf("%s é uma matrícula inválida!\n", yytext);}
\n 

%%

int main() {
	yylex();
	return 0;
}
