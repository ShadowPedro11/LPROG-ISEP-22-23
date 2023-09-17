%{
  #include <stdio.h>
  #include "exemplo.h"

  

  void yyerror(const char *s){
    printf("erro sintactico/semantico: %s\n",s);
  }

%}

%union {
    int inteiro;
	char *str;
}

%token <inteiro> DIGITO
%token <str> LETRA
%token <str> PONTO


%start declaracoes

%debug
  /* em versões do bison menores que 3.0.x usar
     %error-verbose
  */
%define parse.error verbose

%%

declaracoes: declaracao declaracoes
	| 
	;
	
declaracao: tipo lista_variaveis;

tipo: modificador tipo_var | tipo_var;
	
lista_variaveis: var lista_variaveis | var;

modificador: short | long | unsigned;

tipovar : int | char | float | double;

var : id | id valor | id id;

id : letra alfas;

valor : id | inteiro | char | real;

letra : LETRA;

alfas : alfa alfas | alfa;

inteiro : digito inteiro | digito;

char  : letra;

real : inteiro PONTO inteiro ;

alfa : letra | digito;

digito : DIGITO;

    
		  
%%

int main(){
  yyparse();
  return 0;
}
