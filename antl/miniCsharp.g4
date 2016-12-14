grammar miniCsharp;

mcSHARP : MAIN{codigo};
         
codigo  : cmd
        | cmd EOL codigo;

cmd     : ler
        | escrever
        | inteiro
        | ptflut
        | dptflut
        | char
        | string
        | bool
        | op
        | opl
        | cf;
           
ler     :READ(num)
        |READ(texto)
        |READ(VAR);

escrever:WHITE(num)
        |WHITE(texto)
        |WHITE(VAR);

inteiro:INT VAR;

ptflut :FLOAT VAR;

dptflut:DOUBLE VAR;

char   :CHAR VAR;

string :STRING VAR;

bool   :BOOL VAR;

op     :VAR SOMA VAR
       |VAR SUB VAR
       |VAR DIV VAR
       |VAR MULT VAR
       |VAR REST VAR;

opl    :VAR E VAR
       |VAR OU VAR;

cf     :IF(opl){codigo}
       |IF(opl){codigo}ELSE{codigo};

texto  :TEXTO;

num    :NUM
       |NUM SEP NUM;

//TOKENS

MAIN  : 'Main';
READ  : 'read';
WHITE : 'white';
INT   : 'int';
FLOAT : 'FLOAT';
DOUBLE: 'double';
CHAR  : 'char';
STRING: 'string';
BOOL  : 'bool';
SOMA  : [+];
SUB   : [-];
DIV   : [/];
MULT  : [*];
REST  : [%];
E     : [&&];
OU    : [||];
IF    : 'if';
ELSE  : 'else';
VAR   : ([A-Z])+;
TEXTO : [/w/W]+;
NUM   : [0-9]+;
SEP   : [,];
EOL   : [/n/t];