%{
/*	#include<time.h>*/
%}

%option nounput
%option noinput
%option noyywrap



%%
[1-9][0-9]*[.][0-9][0-9]*   				{ printf("%s é um número decimal positivo.\n", yytext); }
-[1-9][0-9]*[.][0-9][0-9]*   				{ printf("%s é um número decimal negativo.\n", yytext); }
.              							{ printf("%s não é/não faz parte um número decimal.\n", yytext); }


%%

int main() {
	yylex( ) ;
	return 0;
}
