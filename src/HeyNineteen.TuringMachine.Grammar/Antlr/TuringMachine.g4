grammar TuringMachine ;

file
    : machine EOF
    ;
    
machine
    : line (line)*
    ;
    
line
    : mConfiguration '->' symbolSpecification '->' operations '->' finalMConfiguration ';'
    ;
    
finalMConfiguration
    : VALID_CHAR+
    ;
    
operations
    : operation (',' operation)*
    ;
    
operation
    : moveLeft
    | moveRight
    | erase
    | print
    ;
    
moveLeft
    : 'L'
    ;
    
moveRight
    : 'R'
    ;
    
erase
    : 'E'
    ;
    
print
    : 'P' VALID_CHAR
    ;
    
symbolSpecification
    : 'none'       #None
    | 'any'        #Any 
    | 'any-none'   #AnyNone
    | VALID_CHAR   #Symbol
    ;
    
mConfiguration
    : VALID_CHAR+
    ;
    
VALID_CHAR
    : [A-Za-z0-9]
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

// ----------
// Whitespace
//
// Characters and character constructs that are of no import
// to the parser and are used to make the grammar easier to read
// for humans.
//
WS : [ \t\r\n\f]+ -> skip ;