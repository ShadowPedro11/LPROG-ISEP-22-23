%{
  #include <stdio.h>
  #include "exemplo.h"
  int numErros=0;
  char* biggest;
  int bigger = 0;
  
  void yyerror(const char *s){
    numErros++;
    printf("erro sintactico/semantico: %s\n",s);
  }
  
  void printTitleWithMostDownloads(char* title) {
  
    if(title == NULL){
      return;
    }
        
    int downloads = atoi(title);
    if(downloads > bigger){
        bigger = downloads;
        if(biggest != NULL){
            free(biggest);
        }
        
        biggest = strdup(title);
    }
}

%}

%union {
    char* titulo;
    char* nome;
    char* ano;
    char* virgul;
    char* tipo;
    char* tipoAcesso;
    char* dowloads;
   
}

%token NEWLINE
%token <titulo> TITULO
%token <nome> NOME
%token <virgul> VIRGUL
%token <ano> ANO
%token <tipo> TIPO
%token <tipoAcesso> TIPO_ACESSO
%token <dowloads> DOWLOADS

%type <nome> autor
%type <nome> orientadores
%type <tipoAcesso> acessos

%start inicio

%debug
%define parse.error verbose

%%

inicio: linha inicio | linha 
        ;

linha: TITULO autor orientadores ANO acessos DOWLOADS NEWLINE { printf("%s - %s (%d orientadores) - %s - Downloads: %s\n", $1, $2, $3, $4, $6);  printTitleWithMostDownloads($6);}

		; 

autor: NOME;

orientadores: NOME VIRGUL orientadores { $$ = $3 + 1; }
			| NOME { $$ = 1; }
			;

acessos: TIPO TIPO_ACESSO 
		| TIPO 
		;




%%

int main(){
  yyparse();
  if(numErros==0){
    printf("Frase válida\n");
    printf("Tese com maior nº de downloads: %s\n", biggest);
  }else{
    printf("Frase inválida\nNúmero de erros: %d\n",numErros);
  }
  
  return 0;
}
