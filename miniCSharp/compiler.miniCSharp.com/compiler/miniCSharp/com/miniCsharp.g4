grammar miniCsharp;


mcSHARP : MAIN'('')''{'codigo'}'
        ;
         
codigo  : cmd';'
        | cmd';'codigo
        | cf 
        | cf codigo
        ;

cmd     : ler
        | escrever
        | atr
        ;

           
ler 
        : READ'('n=num')' 
        | READ'('t=TEXTO')' 
        | READ'('VAR')'  
        | READ'('t=TEXTO','v=VAR')'
        | READ'('t=TEXTO','n=num')'
        ;

escrever : WRITE'('VAR')' 
         | WRITE'('TEXTO')'
         ;


cf     :IF'('cond')''{'codigo'}'
       |IF'('cond')''{'codigo'}'ELSE'{'codigo'}'
       ;


atr      : v=VAR '=' op=operacao
         | v1=VAR '=' v2=VAR
         | v1=VAR '=' n=num 
         | v=VAR '=' b=B 
         | v=VAR '=' t=TEXTO 
         | v=VAR '=' c=CARACTER 
         | VAR '=' num   
         ;

operacao 
         : op1=operacaoAux 
           opr=operacao 
         ;

operacaoAux
            : v1=VAR op=operadores v2=VAR             
            | n1=num op=operadores v2=VAR 
            | v=VAR op=operadores n=num
            | n1=num op=operadores n2=num
            ;

operadores 
          : o1='+' //{$operadores.value = Character.valueOf($o1.text);}
          | o2='*' //{$operadores.value = Character.valueOf($o2.text);}
          | o3='/'  //{$operadores.value = Character.valueOf($o3.text);}
          | o4='-'  //{$operadores.value = Character.valueOf($o4.text);}
          | o5='%' //{$operadores.value = Character.valueOf($o5.text);}
          ;
        
                 
cond: comp
    | comp opComp cond
    | '(' comp ')'
    | '(' comp ')' opComp cond
    | '!'comp
    | VAR
    ;

comp 
    : VAR opComp VAR 
    | VAR opComp num
    | num opComp VAR
    | num opComp num
    ;

opComp 
       : '=='
       | '!='
       | '>' 
       | '<'
       | '<='
       | '>='
       | '&&'
       | '||'
       |'!' 
       ;
num    returns [Object valor]
       : n1=NUMF {$num.valor = Double.valueOf($n1.text);}
       | n2=NUMI {$num.valor = Integer.valueOf($n2.text);}
       ;

//TOKENS

MAIN  : 'Main';
READ  : 'read'; 
WRITE: 'write';
IF    : 'if';
ELSE  : 'else';
CHAR  : 'char';
B     : ('true'|'false');
NUMF  : [0-9]+([.]?[0-9]+|[0-9]*);
NUMI  : [0-9]+;
VAR   : ('@')([_]|[a-zA-Z])([a-zA-Z0-9]|[_])*;
SOMA  : '+';
SUB   : '-';
DIV   : '/';
MULT  : '*';
REST  : '%';
E     : '&&';
OU    : '||';
CHA   : '{';
CHF   : '}'; 
PAA   : '(';
PAF   : ')';
EDL   : ';';
EQL   : '=';
EQLEQL: '==';
DIF   : '!=';
MAI   : '>';
MEN   : '<';
MENEQL: '<=';
MAIEQL: '>=';
NEG   : '!';
ACR   : '++';
DEC   : '--';
ACRMORE: '+=';
DECMORE: '-=';
SEP   : ',';
CARACTER: [']('""'|~'"')['] ;
TEXTO : '"' ('""'|~'"')* '"';
WS : (' '|'\t'|'\r'?'\n')+ -> skip;
COMMENT: '//' .*? '\n' -> skip;
COMMENTBLOCK: '/*' .*? '*/' -> skip;