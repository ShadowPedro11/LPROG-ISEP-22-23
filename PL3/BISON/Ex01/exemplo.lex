%{
  #include"exemplo.tab.h" /* header gerado pelo bison */
%}

%option noyywrap
%option nounput
%option noinput
%option case-insensitive

%%

[H][E][L][L][O] 		return HELLO;
[W][O][R][L][D] 		return WORLD;
[A-Z]+       	return WORD;
[ \t\r\n]*       /* ignorado */
.               {printf("Erro lexico: simbolo desconhecido %s\n",yytext);}
<<EOF>>         return 0;

%%
