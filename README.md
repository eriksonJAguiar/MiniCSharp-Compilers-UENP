# MiniCSharp

#### Construção de um Compilador Baseado na liguagem C# para a materia de Compiladores
#### Curso de Ciência da Computação
#### UENP- CLM - Bandeirantes - PR

#### Colaboradores

* **Erikson Júlio de Aguiar**;
* **Eduardo Pacheco Beraldo**.

## Especificação da Gramática

###### 1. Ler -> Console.Read()
###### 2. Escrever -> Console.Write()
###### 3. inteiro -> int
###### 4. ponto fluante -> float
###### 5. duplo ponto fluante -> double
###### 6. caracter -> char
###### 7. texto -> string
###### 8. lógico -> bool
###### 9. Soma -> +
###### 10. Subtração -> -
###### 11. Multiplicação -> *
###### 12. Divisão -> /
###### 13. Resto -> %
###### 14. E lógico -> &&
###### 15. OU lógico -> ||
###### 16. Controle de fluxo -> if
###### 16. Controle de fluxo -> if(cond){ }else{ }
###### 17. Inicio -> public static void main(){ "programa"}

###### Exemplo:

**public void main{
  Console.Write("Ola mundo");
}**

### Gramática

<MC#> -- MAIN{<CODIGO>}
<CODIGO> -- <CMD> | <CMD> EOL <CODIGO>
<CMD> -- <LER> | <ESCREVER> | <INTEIRO> | <PTFLUT> | <DPTFLUT> | <CHAR> | <STRING> | <BOOL> | <OP> | <OPL> | <CF> 
<LER> -- READ(<NUM>) | READ(<TEXTO>) | READ(<VAR>)
<ESCREVER> -- WRITE(<NUM>) | WRITE(<TEXTO>) | WRITE(<VAR>)
<INTEIRO> -- INT <VAR>
<PTFLUT> -- FLOAT <VAR>
<DPTFLUT> -- DOUBLE <VAR>
<CHAR> -- CHAR <VAR>
<STRING> -- STRING <VAR>
<BOOL> -- BOOL <VAR>
<OP> -- <VAR> <SOMA> <VAR> | <VAR> <SUB> <VAR> | <VAR> <DIV> <VAR> | <VAR> <MULT> <VAR> | <VAR> <REST> <VAR>
<OPL> -- <VAR> E <VAR> | <VAR> OU <VAR> 
<CF> -- IF(<OPL>){<CODIGO>} | IF(<OPL>){<CODIGO>}ELSE{<CODIGO>}
<TEXTO> -- TEXTO
<NUM> -- NUM | NUM SEP NUM


### Tabela de Tokens

**Token** | **Padrão** | **Atributo**
----------|------------|-------------
  MAIN    |val         |val
  EOL     |   /n /t    |
  READ    |   read     |
  WRITE   |   write    |
  INT     |   int      |
  FLOAT   |   float    |
  DOUBLE  |   double   |
  CHAR    |   char     |
  STRING  |   string   |
  BOOL    |   bool     |
  SOMA    |   ([+])    |
  SUB     |   ([-])    |
  DIV     |   ([/])    |
  MULT    |   ([*])    |
  REST    |   ([%])    |
  E       |   [&&]     |
  OU      |   [||]     |
  IF      |    if      |
  TEXTO   |   [" "]    |
  NUM     |   [0-9]+   |
  ,       |     ,      |
  
  
  
Console.Read
Console.Write



### Análise Lexica + Sintática

[ANTLR]:http://www.antlr.org/

**Para fazer a analise léxica e sintática utilizaremos do gerador de analisador léxico e sintático [ANTLR], cujo o mesmo tem suporte a java, C# e Python, para a nossa abordagem utilizaremos a linguagem Java.**
