%{
  #include"exemplo.tab.h" /* header gerado pelo bison */
  extern int numErros;    /* variável criado no bison */
%}

%option noyywrap
%option nounput
%option noinput
%option case-insensitive

%%

[0-9]	      	    { yylval.inteiro = atoi(yytext); return DIGITO; }
[a-zA-Z]			{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return LETRA; }
[.]					{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return PONTO; }
[ \t\r]*       		 /* ignorado */
<<EOF>>         	return 0;

%%
