grammar miniCsharp;

/*@parser::header{
    import java.util.HashMap;
}*/

/*@parser::members{
     HashMap<String, Object> table = new HashMap<>();
}*/

/*@parser::members {
    public static void main(String[] args) throws Exception {
        MiniCsharpLexer lex = new MiniCsharpLexer(new ANTLRFileStream("teste.mcs"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        //MiniCsharpParser parser = new MiniCsharpParser(tokens);
 
        try {
            //parser.MiniCsharp;
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}*/

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
        : READ'('n=num')' //{System.out.println($n.text);}
        | READ'('t=TEXTO')' //{System.out.println($t.text);}
        | READ'('VAR')'   //{System.out.println($VAR.text);}
        | READ'('t=TEXTO','v=VAR')' //{System.out.println($t.text+""+$v.text);}
        | READ'('t=TEXTO','n=num')'//{System.out.println($t.text+""+$n.text);}
        ;

escrever : WRITE'('VAR')' 
         | WRITE'('TEXTO')'
         ;


cf     :IF'('cond')''{'codigo'}'
       |IF'('cond')''{'codigo'}'ELSE'{'codigo'}'
       ;


atr      //returns [Object valor]
         : v=VAR '=' op=operacao
           /*{
            if($op.text instanceof Double){
               $v.text = Double.valueOf($op.text);
               $atr.valor = Double.valueOf($v.text);
             }else{
                 $v.text = Integer.valueOf($op.text);
                 $atr.valor = Integer.valueOf($v.text);
             }
           }
         | v1=VAR '=' v2=VAR
            {
            if($v2.text instanceof Double){
               $v1.text = Double.valueOf($v2.text);
               $atr.valor = Double.valueOf($v1.text);
               
             }else{
                $v1.text = Integer.valueOf($v2.text);   
                $atr.valor = Integer.valueOf($v1.text);
             }
           }
         | v1=VAR '=' n=num 
           {
               if($n.text instanceof Integer){
                     $v1.text = Integer.valueOf($n.text);
                     $atr.valor = Integer.valueOf($v1.text);
                  }
               if($n.text instanceof Double){
                     $v1.text = Double.valueOf($n.text);
                     $atr.valor = Double.valueOf($v1.text);
                  }
           }*/
         | v=VAR '=' b=B //{$v.text = Boolean.valueOf($b.text); $atr.valor = Boolean.valueOf($v.text);}
         | v=VAR '=' t=TEXTO //{$v.text = String.valueOf($t.text); $atr.valor = String.valueOf($v.text);}
         | v=VAR '=' c=CARACTER //{$v.text = Character.valueOf($c.text); $atr.valor =  Character.valueOf($v.text);}
         | VAR '=' num
         ;

operacao //returns [Object valor]
         : op1=operacaoAux 
           /*{
            if($op1.text instanceof Double){
               $operacao.valor = Double.valueOf($op1.text);
             }else{
                $operacao.valor = Integer.valueOf($op1.text);
             }
           }*/
         | op2=operacaoAux 
            /*{
            if($op2.text instanceof Double){
               $operacao.valor = Double.valueOf($op2.text);
             }else{
                $operacao.valor = Integer.valueOf($op2.text);
             }
           }*/
           opr=operacao 
         ;

operacaoAux //returns [Object valor]
            : v1=VAR op=operadores v2=VAR 
              /*{
               if(($v1.text instanceof Double) || ($v2.text instanceof Double)){
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Double.valueOf($v1.text) + Double.valueOf($v2.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Double.valueOf($v1.text) - Double.valueOf($v2.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Double.valueOf($v1.text) * Double.valueOf($v2.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Double.valueOf($v1.text) / Double.valueOf($v2.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Double.valueOf($v1.text) % Double.valueOf($v2.text);
                        break;
                     }
                }else{
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Integer.valueOf($v1.text) + Integer.valueOf($v2.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Integer.valueOf($v1.text) - Integer.valueOf($v2.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Integer.valueOf($v1.text) * Integer.valueOf($v2.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Integer.valueOf($v1.text) / Integer.valueOf($v2.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Integer.valueOf($v1.text) % Integer.valueOf($v2.text);
                        break;
                     }   
                }
                         
            }*/
            | n1=num op=operadores v2=VAR 
             /*{
               if(($v2.text instanceof Double) || ($n1.text instanceof Double)){
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Double.valueOf($n1.text) + Double.valueOf($v2.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Double.valueOf($n1.text) - Double.valueOf($v2.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Double.valueOf($n1.text) * Double.valueOf($v2.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Double.valueOf($n1.text) / Double.valueOf($v2.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Double.valueOf($n1.text) % Double.valueOf($v2.text);
                        break;
                     }
                }else{
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) + Integer.valueOf($v2.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) - Integer.valueOf($v2.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) * Integer.valueOf($v2.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) / Integer.valueOf($v2.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) % Integer.valueOf($v2.text);
                        break;
                     }   
                }
                         
            }
            | v=VAR op=operadores n=num
              /*{
               if(($v.text instanceof Double) || ($n.text instanceof Double)){
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Double.valueOf($v.text) + Double.valueOf($n.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Double.valueOf($v.text) - Double.valueOf($n.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Double.valueOf($v.text) * Double.valueOf($n.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Double.valueOf($v.text) / Double.valueOf($n.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Double.valueOf($v.text) % Double.valueOf($n.text);
                        break;
                     }
                }else{
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Integer.valueOf($v.text) + Integer.valueOf($n.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Integer.valueOf($v.text) - Integer.valueOf($n.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Integer.valueOf($v.text) * Integer.valueOf($n.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Integer.valueOf($v.text) / Integer.valueOf($n.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Integer.valueOf($v.text) % Integer.valueOf($n.text);
                        break;
                     }   
                }
                         
            }*/
            | n1=num op=operadores n2=num
               /*{
               if(($n1.text instanceof Double) || ($n2.text instanceof Double)){
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Double.valueOf($n1.text) + Double.valueOf($n2.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Double.valueOf($n1.text) + Double.valueOf($n2.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Double.valueOf($n1.text) + Double.valueOf($n2.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Double.valueOf($n1.text) + Double.valueOf($n2.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Double.valueOf($n1.text) + Double.valueOf($n2.text);
                        break;
                     }
                }else{
                    switch($op.text.charAt(0)){
                       case '+': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) + Integer.valueOf($n2.text);
                        break;
                      case '-': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) - Integer.valueOf($n2.text);
                        break;
                        case '*': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) * Integer.valueOf($n2.text);
                        break;
                       case '/': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) / Integer.valueOf($n2.text);
                        break;
                        case '%': 
                           $operacaoAux.valor = Integer.valueOf($n1.text) % Integer.valueOf($n2.text));
                        break;
                     }   
                }
                         
            }*/
            ;

operadores //returns [Character value]
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

comp returns [Boolean valor]
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
num    //returns [Object valor]
       : n1=NUMF //{$num.valor = Double.valueOf($n1.text);}
       | n2=NUMI //{$num.valor = Integer.valueOf($n2.text);}
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