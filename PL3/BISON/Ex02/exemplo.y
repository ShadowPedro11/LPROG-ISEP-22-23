%{
  #include <stdio.h>
  #include "exemplo.h"

  

  void yyerror(const char *s){
    printf("erro sintactico/semantico: %s\n",s);
  }
  void comparator(int num1,char *s, int num2);

%}

%union {
    int inteiro;
	char *str;
}

%token <inteiro> INT
%token <str> IGUAL 
%token <str> MENOR 
%token <str> MAIOR 
%token <str> MENOR_IGUAL 
%token <str> MAIOR_IGUAL 
%token <str> DIFERENTE

%type <str> comparador

%start inicio

%debug
  /* em versões do bison menores que 3.0.x usar
     %error-verbose
  */
%define parse.error verbose

%%

inicio:
    | inicio INT comparador INT { comparator($2,$3,$4); }
    ;

comparador:IGUAL
		  | MENOR
		  | MAIOR
		  | MENOR_IGUAL
		  | MAIOR_IGUAL
		  | DIFERENTE
		  ;
		  
%%

int main(){
  yyparse();
  return 0;
}

void comparator(int num1, char *s, int num2) {
    // Check the operation specified by the string
    if (strcmp(s, "=") == 0) {
        printf("%d == %d is %s\n", num1, num2, num1 == num2 ? "true" : "false");
    } else if (strcmp(s, "<>") == 0) {
        printf("%d <> %d is %s\n", num1, num2, num1 != num2 ? "true" : "false");
    } else if (strcmp(s, ">") == 0) {
        printf("%d > %d is %s\n", num1, num2, num1 > num2 ? "true" : "false");
    } else if (strcmp(s, "<") == 0) {
        printf("%d < %d is %s\n", num1, num2, num1 < num2 ? "true" : "false");
    } else if (strcmp(s, ">=") == 0) {
        printf("%d >= %d is %s\n", num1, num2, num1 >= num2 ? "true" : "false");
    } else if (strcmp(s, "<=") == 0) {
        printf("%d <= %d is %s\n", num1, num2, num1 <= num2 ? "true" : "false");
    } else {
        printf("Invalid operation: %s\n", s);
    }
}

