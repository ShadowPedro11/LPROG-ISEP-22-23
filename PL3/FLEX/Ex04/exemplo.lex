%{
/*	#include<time.h>*/
	 int numChars=0,numAlgarismos=0,numLinhas=0,numLetra=0, numSpace=0,numOther=0;
%}

%option nounput
%option noinput
%option noyywrap

ALGARISMO		[0-9]
LETRA			[A-Za-z]
ESPACO 			[ ]

%%

{ALGARISMO}		numAlgarismos++;
{LETRA}			numLetra++;
{ESPACO}		numSpace++;
\n 				{numLinhas++;}
\t				{numSpace++;}
. 				{numOther++;}
%%

int main() {
	yylex( ) ;
    printf("Número de algarismos %d\n" , numAlgarismos);
    printf("Número de letras %d\n" , numLetra);
    printf("Número de linhas %d\n" , numLinhas);
    printf("Número de espaços %d\n" , numSpace);
    printf("Número de outros %d\n" , numOther);
	return 0;
}
