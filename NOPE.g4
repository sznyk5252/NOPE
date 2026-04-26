grammar NOPE;

// ==========================================
// PARSER
// ==========================================

program
    : code EOF 
    ;

code: (
         (ESCCHAR (input|single_ws))
        | macro_call
        | if_stmt
        | rep_loop
        | ignore_ws
        | comment
        | input
        | ws
    )*;

block
    : LBRACE code RBRACE
    ;

if_stmt
    : 'IF' ws? LP ws? expr ws? RP ws? block (ws? 'ELSE' ws? block)?
    ;

rep_loop
    : 'REP' ws? LP ws? (STR ws? SEP ws?)? expr ws? RP ws? block
    ;

expr: expr ws? ('*' | '/') ws? expr
    | expr ws? ('+' | '-') ws? expr
    | expr ws? ('==' | '!=' | '>' | '<' | '>=' | '<=') ws? expr
    | expr ws? ('AND' | 'OR') ws? expr
    | LP ws? expr ws? RP
    | macro_call
    | input
    ;

opt_type: (TYPE ws?)? ;

macro_call
    : range_macro
    | match_macro
    | anyof_macro
    | throws_macro
    | var_macro
    | check_macro
    | header_macro
    | def_macro
    ;

range_macro  : 'RANGE' ws? LP ws? opt_type expr ws? SEP ws? opt_type expr ws? RP ;
match_macro  : 'MATCH' ws? LP ws? expr ws? RP ;
anyof_macro  : 'ANYOF' ws? LP ws? expr (ws? SEP ws? expr)* ws? RP ;
throws_macro : 'THROWS' ws? LP ws? STR ws? RP ;
var_macro    : 'VAR' ws? LP ws? opt_type STR ws? RP ;
check_macro  : 'CHECK' ws? LP ws? expr ws? RP ;
header_macro : 'C_HEADER' ws? LP ws? expr ws? RP ;
def_macro    : 'DEF' ws? LP ws? STR ws? SEP ws? expr ws? RP ; // podstawowa forma

ignore_ws: 'IGNORE_WHITESPACE' LP code RP
    ;

input : NUMB | STR ; 
comment : COM; 

single_ws : SPACE | ENDL;
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
LBRACE : '{' ;
RBRACE : '}' ;

NUMB : '-'? [0-9]+ ('.' [0-9]*)? ;

ESCCHAR : '\\';

TYPE
    : 'INT'
    | 'FLOAT'
    | 'STR'
    ;

AND : 'AND' ;
OR  : 'OR' ;

STR : '\'' .*? '\''      
    | ~[ \t\r\n#(),{}*+/=<>!-]+
    ;