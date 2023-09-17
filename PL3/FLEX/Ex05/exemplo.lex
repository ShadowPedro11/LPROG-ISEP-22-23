%{
/*	#include<time.h>*/
%}

%option nounput
%option noinput
%option noyywrap



%%

([ ]|\n)[0-9]+([ ]|\n)	{ printf("%s", yytext); }
.              			{ printf(""); }

%%

int main() {
	yylex() ;
	return 0;
}
