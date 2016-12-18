grammar miniCsharp;

mcSHARP : MAIN'('')''{'codigo'}';
         
codigo  : cmd';'
        | cmd';'codigo
        | cf 
        | cf codigo
        ;

cmd     : ler
        | escrever
        | atr
        ;

           
ler     : READ'('num')' 
        | READ'('texto')'
        | READ'('VAR')'
        | READ'('texto','VAR')'
        | READ'('texto','num')';

escrever: WRITE'('num')'
        | WRITE'('texto')'
        | WRITE'('VAR')';


cf     :IF'('cond')''{'codigo'}'
       |IF'('cond')''{'codigo'}'ELSE'{'codigo'}';


atr      : VAR '=' operacao
         | VAR '=' num 
         | VAR '=' B
         | VAR '=' TEXTO
         | VAR '=' CARACTER
         | VAR'++'
         | VAR'--'
         | VAR '+=' NUMI
         | VAR '-=' NUMI
         ;

operacao : operacaoAux
         | operacaoAux operacao
         ;

operacaoAux : VAR operadores VAR
            | num operadores VAR
            | VAR operadores num
            | num operadores num
            ;

operadores: '+'
          | '*'
          | '/'
          | '-'
          | '%'
          ;
        
                 
cond: comp
    | comp opComp cond
    | '(' comp ')'
    | '(' comp ')' opComp cond
    | '!'comp
    | VAR
    ;

comp: VAR opComp VAR
    | VAR opComp num
    | num opComp VAR
    | num opComp num
    ;

opComp : '==' 
       | '!='
       | '>' 
       | '<'
       | '<='
       | '>='
       | '&&'
       | '||'
       |'!' 
       ;

texto  :TEXTO;

num    : NUMF
       | NUMI;

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