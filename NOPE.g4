grammar NOPE;

// ==========================================
// PARSER
// ==========================================

program
    : code EOF 
    ;

code: (
        (ESCCHAR input) 
        | tag
        | comment
        | input 
        | ws
    )*;

tag
    : tagname LP (arg | args)? RP
    ;

args
    : arg (SEP arg)*
    ;

arg
    : arg_part+
    ;

arg_part
    : input
    | tag
    | LP args? RP
    | ws
    ;

tagname
    : 'RANGE' 
    | 'MATCH' 
    | 'ANYOF' 
    | 'THROWS' 
    | 'VAR' 
    | 'CHECK' 
    | 'DEF' 
    | 'REP' 
    | 'C_HEADER'
    ;

ignore_ws: 'IGNORE_WHITESPACE' LP code RP
    ;

input : NUMB | STR ; 
comment : COM; 

ws  : (SPACE | ENDL)+;

// ==========================================
// LEKSER
// ==========================================

COM : '#' ~[\r\n]* ; 

SPACE : [ \t]+ ;

ENDL    : [\r\n]+ 
        | '\n'+
        ;

SEP : ',' ;
LP  : '(' ;
RP  : ')' ;

NUMB : '-'? [0-9]+ ('.' [0-9]*)? ;

STR : '\'' .*? '\''      
    | ~[ \t\r\n#(),]+    
    ;

TYPE    
    : 'INT'
    | 'FLOAT'
    | 'STR'
    ;

ESCCHAR : '\\';