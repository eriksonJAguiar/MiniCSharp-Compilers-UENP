grammar miniCsharp;

mcSHARP : MAIN'{'codigo'}';
         
codigo  : cmd';'
        | cmd';' EOL codigo;

cmd     : ler
        | escrever
        | declaracao
        | op
        | opl
        | cf
        | atr;

declaracao : | inteiro
             | ptflut
             | dptflut
             | string
             | bool;
           
ler     : READ'('num')'
        | READ'('texto')'
        | READ'('VAR')';

escrever: WHITE'('num')'
        | WHITE'('texto')'
        | WHITE'('VAR')';

inteiro:INT VAR;

ptflut :FLOAT VAR;

dptflut:DOUBLE VAR;

string :STRING VAR;

bool   :BOOL VAR;

op     :VAR '=' VAR '+' VAR
       |VAR '=' VAR '-' VAR
       |VAR '=' VAR '/' VAR
       |VAR '=' VAR '*' VAR
       |VAR '=' VAR '%' VAR
       |VAR '=' NUM '+' NUM
       |VAR '=' NUM '-' NUM
       |VAR '=' NUM '/' NUM
       |VAR '=' NUM '*' NUM
       |VAR '=' NUM '%' NUM;
       
atr   :VAR'++'
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


cf     :IF(opl)'{'codigo'}'
       |IF(opl)'{'codigo'}'ELSE'{'codigo'}';

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
EOL   : [\t\s\n]+;
