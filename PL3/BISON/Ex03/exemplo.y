%{
  #include <stdio.h>
  #include "exemplo.h"

  

  void yyerror(const char *s){
    printf("erro sintactico/semantico: %s\n",s);
  }
  void comparator(int num1,char *s, int num2);
  void comparator2(char *s1,char *s, char *s2);
  void comparator3(int num1,char *s, int num2);

%}

%union {
    int inteiro;
	char *str;
}

%token <inteiro> INT
%token <str> LETRA
%token <str> IGUAL 
%token <str> MENOR 
%token <str> MAIOR 
%token <str> MENOR_IGUAL 
%token <str> MAIOR_IGUAL 
%token <str> DIFERENTE
%token <str> BREAK

%type <str> comparador
%type <str> igualDiferente

%start inicio

%debug
  /* em versões do bison menores que 3.0.x usar
     %error-verbose
  */
%define parse.error verbose

%%

inicio:
	| inicio many BREAK { }
    | inicio INT comparador INT BREAK{ comparator($2,$3,$4); }
    | inicio comparador INT	BREAK{ printf("%s %d -> Invalid operation\n",$2,$3); }
    | inicio INT comparador BREAK{ printf("%d %s -> Invalid operation\n",$2,$3); }
    | inicio LETRA igualDiferente LETRA BREAK{ comparator2($2,$3,$4); }
    | inicio INT comparador LETRA BREAK{ printf("%d %s %s -> Invalid operation\n",$2,$3,$4); }
    | inicio LETRA comparador INT BREAK{ printf("%s %s %d-> Invalid operation\n",$2,$3,$4); }
    ;
    
many: INT comparador INT many { comparator3($1,$2,$3);$$=$3;}
	| comparador INT { printf("%d %s %d\n",$$,$1,$2);}
	| comparador INT many { }
	|	
	;

comparador:IGUAL
		  | MENOR
		  | MAIOR
		  | MENOR_IGUAL
		  | MAIOR_IGUAL
		  | DIFERENTE
		  ;

igualDiferente:IGUAL
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

void comparator2(char *s1,char *s, char *s2) {
    // Check the operation specified by the string
    if (strcmp(s, "=") == 0) {
        printf("%s == %s is %s\n", s1, s2, !strcmp(s1, s2) ? "true" : "false");
    } else if (strcmp(s, "<>") == 0) {
         printf("%s <> %s is %s\n", s1, s2, strcmp(s1, s2) ? "true" : "false");
    } else {
        printf("Invalid operation: %s\n", s);
    }
}

void comparator3(int num1, char *s, int num2) {
    // Check the operation specified by the string
    if (strcmp(s, "=") == 0) {
        printf("%d == %d is %s ", num1, num2, num1 == num2 ? "true" : "false");
    } else if (strcmp(s, "<>") == 0) {
        printf("%d <> %d is %s ", num1, num2, num1 != num2 ? "true" : "false");
    } else if (strcmp(s, ">") == 0) {
        printf("%d > %d is %s ", num1, num2, num1 > num2 ? "true" : "false");
    } else if (strcmp(s, "<") == 0) {
        printf("%d < %d is %s ", num1, num2, num1 < num2 ? "true" : "false");
    } else if (strcmp(s, ">=") == 0) {
        printf("%d >= %d is %s ", num1, num2, num1 >= num2 ? "true" : "false");
    } else if (strcmp(s, "<=") == 0) {
        printf("%d <= %d is %s ", num1, num2, num1 <= num2 ? "true" : "false");
    } else {
        printf("Invalid operation: %s ", s);
    }
}

