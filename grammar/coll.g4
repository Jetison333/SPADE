grammar coll;

options {
    language = CSharp;
}
start     : set EOF ;
format    : '{' format (CM format)* '}' 
          | '(' format (CM format)* ')' 
          | TERM
          ;
constraint: TERM DEFINITION object;
DEFINITION: 'is' 
          | 'in' 
          | '=' 
          | 'subset'
          ;
object    : object BIN_OP object
          | set 
          | list 
          | TERM
          | BUILT_IN
          ;
set       : '{' format  '|' constraint? (CM constraint)*  '}' 
          | '{' TERM (CM TERM)*  '}' 
          ;
list      : '(' TERM (CM TERM)* ')';
BIN_OP    : 'union' 
          | 'intersection' 
          | 'cross'
          | 'unorderedcross'
          ;
BUILT_IN  : 'set' 
          | 'list' 
          | 'graph' 
          | 'weightedGraph' 
          | 'int'
		  ;
TERM      : [a-zA-Z0-9.]+ ;
WS        : [ \t\r\n]+ -> skip ;
CM        : [,] ; 
