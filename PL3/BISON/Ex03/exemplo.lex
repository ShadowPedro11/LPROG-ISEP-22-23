%{
  #include"exemplo.tab.h" /* header gerado pelo bison */
%}

%option noyywrap
%option nounput
%option noinput
%option case-insensitive

%%
[0-9]+          { yylval.inteiro = atoi(yytext); return INT; }
[a-zA-Z]+		{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return LETRA; }
"="				{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return IGUAL; }  
">"				{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return MENOR; } 
">"				{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return MAIOR; }
"<="			{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return MENOR_IGUAL; }
">="			{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return MAIOR_IGUAL; }
"<>"			{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return DIFERENTE; }
[\n]			{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return BREAK; }
[ \t\r]*        /* ignorado */
.               { printf("Caracter inválido: %c\n", yytext[0]); }
<<EOF>>         return 0;

%%


