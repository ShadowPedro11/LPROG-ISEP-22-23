%{
  #include "exemplo.tab.h"
  extern int numErros;
%}

TITULO 			\"[a-zA-Z0-9 ]{1,80}\"
NOME 			"#"[a-zA-Z ]{2,15}
ANO 			(198[0-9]|199[0-9]|20([01][0-9]|2[0-2]))
TIPO 			("MESTRADO"|"DOUTORAMENTO")
TIPO_ACESSO 	("ABERTO"|"RESTRITO"|"FECHADO")
DOWLOADS		[0-9]+
VIRGUL			","

%%

{TITULO}		{yylval.titulo = strdup(yytext); return TITULO;}
{NOME}			{yylval.nome = strdup(yytext); return NOME;}
{VIRGUL}		{yylval.virgul = strdup(yytext); return VIRGUL;}
{ANO}			{yylval.ano = strdup(yytext); return ANO;}
{TIPO}			{yylval.tipo = strdup(yytext); return TIPO;}
{TIPO_ACESSO}	{yylval.tipoAcesso = strdup(yytext); return TIPO_ACESSO;}
{DOWLOADS}		{yylval.dowloads = strdup(yytext); return DOWLOADS;}

[ \t]           
.               {printf("Erro lexico: simbolo desconhecido %s\n",yytext);
                 numErros++;
                }
\n 				return NEWLINE;
<<EOF>>         return 0;

%%
