%{
  #include"exemplo.tab.h" /* header gerado pelo bison */
  extern int numErros;    /* variável criado no bison */
%}

%option noyywrap
%option nounput
%option noinput
%option case-insensitive

%%
café    	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return CAFE; }
pingo  	 	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return PINGO; }
chá    	 	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return CHA; }
chocolate 	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return CHOCOLATE; }
copo    	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return COPO; }
leite   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return LEITE; }
€0.01   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return UM_CENT; }
€0.02   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return DOIS_CENT; }
€0.05   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return CINCO_CENT; }
€0.10   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return DEZ_CENT; }
€0.20   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return VINTE_CENT; }
€0.50   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return CINQUENTA_CENT; }
€1.00   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return UM_EUR; }
€2.00   	{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return DOIS_EUR; }
[\n]		{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return BREAK; }
[ \t\r,]*       		 /* ignorado */
<<EOF>>         	return 0;
%%
