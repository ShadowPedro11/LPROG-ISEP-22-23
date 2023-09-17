%{
  #include <stdio.h>
  #include "exemplo.h"
  
	int numErros=0;
	int isep = 0;
	int iscap = 0;
	int ese = 0;
	void contarEscola(char *s);
	void maiorEscola();
	void printFuncionario(char *escola,char *nome,int ext,char *departamento);
	void yyerror(const char *s){  
		numErros++;
		printf("erro sintactico/semantico: %s\n",s);
	}
  

	
	

%}

%union {
    char *str;
    int num;
}

%token <str> NOME_ESCOLA 
%token <num> NUM_ALUNOS 
%token <str> NOME 
%token <num> EXTENSAO

%type <str> escola
%type <str> nome
%type <num> alunos
%type <num> extensao

%start lista_telefonica

%debug
  /* em versões do bison menores que 3.0.x usar
     %error-verbose
  */
%define parse.error verbose

%%
lista_telefonica : 
                 | lista_telefonica escola alunos nome nome extensao nome {printf("Gramática válida\n");printFuncionario($2,$5,$6,$7); }
                 ;

escola : NOME_ESCOLA { contarEscola($1); }
       ;

alunos : NUM_ALUNOS {  }
       ;

nome	: NOME  {  }
        ;
        
extensao: EXTENSAO  { }
        ;

%%

int main(){
	yyparse();
	if(numErros==0)
		printf("Frase válida\n");
	else
		printf("Frase inválida->Número de erros: %d\n",numErros);
		
	maiorEscola();
  return 0;
}

void contarEscola(char *s){
	char* sIsep="ISEP";
	char* sIscap="ISCAP";
	char* sEse="ESE";
	
	if(strcmp(s, sIsep)==0){
		isep++;
	}
	if(strcmp(s, sIscap)==0){
		iscap++;
	}
	if(strcmp(s, sEse)==0){
		ese++;
	}

}

void maiorEscola(){
	
	if(isep == iscap && iscap == ese){
		printf("ISEP: %d, ISCAP: %d, ESE: %d\n",isep,iscap,ese);
	}
	if(isep > iscap && isep > ese){
		printf("ISEP: %d\n",isep);
	}
	if(iscap > isep && iscap > ese){
		printf("ISCAP: %d\n",iscap);
	}
	if(ese > iscap && ese > isep){
		printf("ESE: %d\n",ese);
	}

}

void printFuncionario(char *escola,char *nome,int ext,char *departamento){
	printf("\n");
	char* sIsep="ISEP";
	char* sDepInf="Departamento de Engenharia Informática";
	if(strcmp(escola, sIsep)==0){
		if(strcmp(departamento, sDepInf)==0){
		
			printf("ISEP-Departamento de Engenharia Informática-%s-%d\n",nome,ext);
	
		}
	}

}

 

