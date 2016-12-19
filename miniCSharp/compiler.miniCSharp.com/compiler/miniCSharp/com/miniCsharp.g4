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

           
ler     returns [Double valor]
        : READ'('num')'   //{System.out.println($n.text);}
        | READ'('TEXTO')' //{System.out.println($t.text);}
        | READ'('VAR')'   //{System.out.println($atr.dValor);}
        | READ'('TEXTO','VAR')' //{System.out.println($t.text,$v.text);}
        | READ'('TEXTO','num')'; 

escrever: WRITE'('num')'
        | WRITE'('TEXTO')'
        | WRITE'('VAR')';


cf     :IF'('cond')''{'codigo'}'
       |IF'('cond')''{'codigo'}'ELSE'{'codigo'}';


atr      returns [Integer iValor,Double dValor,Boolean bValor, Character cValor, String sValor]
         : v=VAR '=' operacao {$atr.dValor = Double.valueOf($operacao.valor);}
         | v=VAR '=' n=num 
           {
               if($n.text instanceof Integer){
                     $atr.iValor = Integer.valueOf($n.text);
                  }
               if($n.text instanceof Double){
                     $atr.dValor = Double.valueOf($n.text);
                  }
           }
         | VAR '=' b=B {$atr.bValor = Boolean.valueOf($b.text);}
         | VAR '=' t=TEXTO {$atr.sValor = String.valueOf($t.text);}
         | VAR '=' c=CARACTER {$atr.cValor = Boolean.valueOf($c.text);}
         | VAR'++'
         | VAR'--'
         | VAR '+=' NUMI
         | VAR '-=' NUMI
         ;

operacao returns [Double valor]
         : op=operacaoAux {$operacao.valor = Double.valueOf($op.text);}
         | op=operacaoAux {$operacao.valor = Double.valueOf($op.text);}
           operacao
         ;

operacaoAux returns [Double valor]
            : v1=VAR op=operadores v2=VAR 
              {switch($op.text){
                  case "+": 
                      $operacaoAux.valor = Double.valueOf($v1.text) + Double.valueOf($v2.text);
                   break;
                 case "-": 
                      $operacaoAux.valor = Double.valueOf($v1.text) - Double.valueOf($v2.text);
                   break;
                   case "*": 
                      $operacaoAux.valor = Double.valueOf($v1.text) * Double.valueOf($v2.text);
                   break;
                  case "/": 
                      $operacaoAux.valor = Double.valueOf($v1.text) / Double.valueOf($v2.text);
                   break;
                   case "%": 
                      $operacaoAux.valor = Double.valueOf($v1.text) % Double.valueOf($v2.text);
                   break;
              }          
                         
            }
            | num operadores VAR
            | VAR operadores num
            | num operadores num
            ;

operadores returns [String value]
          : o1='+' {$operadores.value = String.valueOf($o1.text);}
          | o2='*' {$operadores.value = String.valueOf($o2.text);}
          | o3='/' {$operadores.value = String.valueOf($o3.text);}
          | o4='-' {$operadores.value = String.valueOf($o4.text);}
          | o5='%' {$operadores.value = String.valueOf($o5.text);}
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
num    returns [Integer iValue, Double fValue]
       : n1=NUMF {$num.fValue = Double.valueOf($n1.text);}
       | n2=NUMI {$num.iValue = Integer.valueOf($n2.text);}
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