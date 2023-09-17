%{
  #include"exemplo.tab.h" /* header gerado pelo bison */
  extern int numErros;    /* variável criado no bison */
%}

%option noyywrap
%option nounput
%option noinput
%option case-insensitive

%%

[1-9][0-9][0-9][0-9]+    			{ yylval.num = atoi(yytext); return EXTENSAO; }
ISEP|ESE|ISCAP 						{ yylval.str = strdup(yytext); yylval.str[strlen(yytext)] = '\0'; return NOME_ESCOLA; }
[1-9][0-9]{2,}					 	{ yylval.num = atoi(yytext); return NUM_ALUNOS; }
\"[^\"]{1,40}\"  					{ yylval.str = strdup(yytext + 1); yylval.str[strlen(yytext) - 2] = '\0'; return NOME; }

[ \t\n]+              	{ /* Ignorar espaços em branco e quebras de linha */ }
.                     	{ printf("Erro: caractere não reconhecido '%c'\n", yytext[0]); }


%%

