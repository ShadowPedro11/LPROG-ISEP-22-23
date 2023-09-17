%{
  #include <stdio.h>
  #include "exemplo.h"
  int numErros=0;
  

  void yyerror(const char *s){
    numErros++;
    printf("erro sintactico/semantico: %s\n",s);
  }

%}

%union {
    int inteiro;
    float real;
}

%token <inteiro> INT
%token <real> FLOAT

%type <inteiro> lista

%start inicio

%debug
  /* em versões do bison menores que 3.0.x usar
     %error-verbose
  */
%define parse.error verbose

%%

inicio: lista         {printf("Final de lista de %d elementos!!!\n",$1);}
        ;

lista: INT             {$$=1; printf("Inteiro %d\n",$1);}
    |  FLOAT           {$$=1; printf("Real %f\n",$1);}
    | lista ',' INT    {$$=$1+1; printf("Inteiro %d\n",$3);}
    | lista ',' FLOAT  {$$=$1+1; printf("Real %f\n",$3);}
    ;


%%

int main(){
  yyparse();
  if(numErros==0)
    printf("Frase válida\n");
  else
    printf("Frase inválida\nNúmero de erros: %d\n",numErros);
  return 0;
}
