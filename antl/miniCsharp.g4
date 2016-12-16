grammar miniCsharp;

mcSHARP : MAIN'{'codigo'}';
         
codigo  : cmd
        | cmd EOL codigo;

cmd     : ler
        | escrever
        | declaracao
        | op
        | opl
        | cf;

declaracao : | inteiro
             | ptflut
             | dptflut
             | char
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

char   :CHAR VAR;

string :STRING VAR;

bool   :BOOL VAR;

op     :VAR '+' VAR
       |VAR '-' VAR
       |VAR '/' VAR
       |VAR '*' VAR
       |VAR '%' VAR
       |NUM '+' NUM
       |NUM '-' NUM
       |NUM '/' NUM
       |NUM '*' NUM
       |NUM '%' NUM;

opl    :VAR '&&' VAR opl
       |VAR '||' VAR;

cf     :IF(opl)'{'codigo'}'
       |IF(opl)'{'codigo'}'ELSE'{'codigo'}';

texto  :TEXTO;

num    :NUM
       |NUM ',' num;

//TOKENS

MAIN  : 'Main';
READ  : 'read';
WHITE : 'white';
INT   : 'int';
FLOAT : 'float';
DOUBLE: 'double';
CHAR  : 'char';
STRING: 'string';
BOOL  : 'bool';
SOMA  : '+';
SUB   : '-';
DIV   : '/';
MULT  : '*';
REST  : '%';
E     : '&&';
OU    : '||';
IF    : 'if';
ELSE  : 'else';
VAR   : [_a-zA-Z]+[_]?[a-zA-Z0-9]+;
TEXTO : [/w/W]+;
NUM   : [0-9]+;
SEP   : ',';
EOL   : [/n/t];
CHA   : '{';
CHF   : '}'; 