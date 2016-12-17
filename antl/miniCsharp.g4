grammar miniCsharp;

mcSHARP : MAIN'{'codigo'}';
         
codigo  : cmd';'
        | cmd';'cmd ';' codigo
        | cmd';'cmd ';';

cmd     : ler
        | escrever
        | declaracao
        | cf
        | atr
        | opl
        | op ;

declaracao : INT VAR
           | FLOAT VAR
           | DOUBLE VAR
           | STRING VAR
           | BOOL VAR
           | INT VAR '='
           | FLOAT VAR '='
           | DOUBLE VAR '='
           | STRING VAR '='
           | BOOL VAR '=';

           
ler     : READ'('num')'
        | READ'('texto')'
        | READ'('VAR')'
        | READ'('texto','VAR')'
        | READ'('texto','NUM')';

escrever: WHITE'('num')'
        | WHITE'('texto')'
        | WHITE'('VAR')';


cf     :IF(opl)'{'codigo'}'
       |IF(opl)'{'codigo'}'ELSE'{'codigo'}';

op      :VAR
        |NUM
        |VAR '+' op
        |VAR '-' op
        |VAR '/' op
        |VAR '*' op
        |VAR '%' op
        |NUM '+' op
        |NUM '-' op
        |NUM '/' op
        |NUM '*' op
        |NUM '%' op;
          
       
atr   : VAR '=' op
      |VAR'++'
      |VAR'--';

opl    :VAR '&&' opl
       |VAR '||' opl
       |cmp
       |cmp opl;

cmp    :VAR '==' cmp 
       |VAR '!=' cmp
       |VAR '>' cmp
       |VAR '<' cmp
       |VAR '<=' cmp
       |VAR '>=' cmp
       |NUM '==' cmp
       |NUM '!=' cmp
       |NUM '>' cmp
       |NUM '<' cmp
       |NUM '<=' cmp
       |NUM '>=' cmp
       |'!' VAR
       |NUM
       |VAR;



texto  :TEXTO;

num    :NUM;

//TOKENS

MAIN  : 'Main';
READ  : 'read';
WHITE : 'white';
INT   : 'int';
FLOAT : 'float';
DOUBLE: 'double';
STRING: 'string';
BOOL  : 'bool';
B     : ['true''false'];
NUM   : [0-9]+([.]?[0-9]+|[0-9]*);
VAR   : ([_]|[a-zA-Z])([a-zA-Z0-9]|[_])*;
SOMA  : '+';
SUB   : '-';
DIV   : '/';
MULT  : '*';
REST  : '%';
E     : '&&';
OU    : '||';
IF    : 'if';
ELSE  : 'else';
TRUE  : 'true';
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
SEP   : ',';
TEXTO : [/w/W]+;
WS : (' '|'\t'|'/n')+ -> skip;