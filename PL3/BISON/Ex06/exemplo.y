%{
  #include <stdio.h>
  #include "exemplo.h"

  

  void yyerror(const char *s){
    printf("erro sintactico/semantico: %s\n",s);
  }
  void troco(char *s);
  float convertEuroToFloat(char* euroString);

%}

%union {
	char *str;
}


%token <str> CAFE 
%token <str> PINGO 
%token <str> CHA 
%token <str> CHOCOLATE 
%token <str> COPO 
%token <str> LEITE
%token <str> UM_CENT 
%token <str> DOIS_CENT 
%token <str> CINCO_CENT 
%token <str> DEZ_CENT 
%token <str> VINTE_CENT 
%token <str> CINQUENTA_CENT 
%token <str> UM_EUR 
%token <str> DOIS_EUR
%token <str> BREAK

%type <str> item
%type <str> moeda
%type <str> moedas
%type <str> compra
%type <str> compras

%start compras

%debug
  /* em versões do bison menores que 3.0.x usar
     %error-verbose
  */
%define parse.error verbose

%%

compras: compra BREAK compras { printf("COMPRA: %s\n", $1); troco($1); }
		| 
		;
		

compra: item moedas { char buf[50];sprintf(buf, "%s %s", $1, $2);$$ = strdup(buf);}
		;

item: CAFE 		{ $$ = "café";}
	| PINGO 	{ $$ = "pingo";}
	| CHA 		{ $$ = "chá";}
	| CHOCOLATE { $$ = "chocolate";}
	| COPO 		{ $$ = "copo";}
	| LEITE 	{ $$ = "leite";}
	;

moedas: moeda moedas 	{ char buf[50];sprintf(buf, "%s %s", $1, $2);$$ = strdup(buf);}
	| moeda				{ $$ = strdup($1);}
	;
    
moeda: UM_CENT 			{ $$ = "€0.01";}
	| DOIS_CENT 		{ $$ = "€0.02";}
	| CINCO_CENT 		{ $$ = "€0.05";}
	| DEZ_CENT 			{ $$ = "€0.10";}
	| VINTE_CENT 		{ $$ = "€0.20";}
	| CINQUENTA_CENT 	{ $$ = "€0.50";}
	| UM_EUR 			{ $$ = "€1.00";}
	| DOIS_EUR 			{ $$ = "€2.00";}
	;

%%

int main(){
  yyparse();
  return 0;
}


void troco(char* pedido) {
    char* item;
    char* token;
    float valor_pago = 0.0;
    
    float valorItem;

 
    item = strtok(pedido, " ");
    if (strcmp(item, "café") == 0) {
        valorItem = 0.35;
    } else if (strcmp(item, "pingo") == 0) {
        valorItem = 0.35;
    } else if (strcmp(item, "chá") == 0) {
        valorItem = 0.35;
    } else if (strcmp(item, "chocolate") == 0) {
        valorItem = 0.40;
    } else if (strcmp(item, "copo") == 0) {
        valorItem = 0.05;
    } else if (strcmp(item, "leite") == 0) {
        valorItem = 0.30;
    }

  
    while ((token = strtok(NULL, " ")) != NULL) {
    
        if (strncmp(token, "€", 1) == 0) {
            float valor_moeda = convertEuroToFloat(token);
            valor_pago += valor_moeda;
        }
        
    }

    float troco = valor_pago - valorItem;
    printf("A %f  A",valor_pago);
    if (troco < 0) {
        printf("Erro: valor insuficiente.\n");
    }else{
    
		printf("A %f  A",valor_pago);
		
		while(valor_pago != 0.00){
		
			if(valor_pago >= 2.00){
				printf("2.00 ");
				valor_pago = valor_pago - 2.00;
			}else if(valor_pago >= 1.00){
				printf("1.00 ");
				valor_pago = valor_pago - 1.00;
			}else if(valor_pago >= 0.50){
				printf("0.50 ");
				valor_pago = valor_pago - 0.50;
			}else if(valor_pago >= 0.20){
				printf("0.20 ");
				valor_pago = valor_pago - 0.20;
			}else if(valor_pago >= 0.10){
				printf("0.10 ");
				valor_pago = valor_pago - 0.10;
			}else if(valor_pago >= 0.05){
				printf("0.05 ");
				valor_pago = valor_pago - 0.05;
			}else if(valor_pago >= 0.01){
				printf("0.01 ");
				valor_pago = valor_pago - 0.01;
			}else if(valor_pago == 0.00){
				printf("\n ");
			}
			
		
		}
    }

}


float convertEuroToFloat(char* euroString) {
    
	memmove(euroString, euroString+3, strlen(euroString+3) + 1);

	float value = atof(euroString);

    return value;
}
