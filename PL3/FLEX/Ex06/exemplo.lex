%{
/*	#include<time.h>*/
%}

%option nounput
%option noinput
%option noyywrap



%%
[1-9][0-9]*([ ]|\n)   	{ printf("%s é um número inteiro positivo.\n", yytext); }
-[1-9][0-9]*([ ]|\n)   	{ printf("%s é um número inteiro negativo.\n", yytext); }
0              				{ printf("0 é um número inteiro.\n"); }
.              				{ printf("%s não é um número inteiro.\n", yytext); }


%%

int main() {
	yylex( ) ;
	return 0;
}
