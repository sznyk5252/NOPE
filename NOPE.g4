grammar NOPE;

// ==========================================
// PARSER
// ==========================================

program
    : code EOF 
    ;

code: (
        input_in_escape
        | macro_call
        | if_stmt
        | rep_loop
        | def
        | ignore_ws
        | comment
        | input
        | ws
    )*;

input_in_escape: ESCCHAR (ESCCHAR|QUOTE|ANY_SINGLE_CHAR); 

block
    : LBRACE code RBRACE
    ;

if_stmt
    : 'IF' ws? LP ws? logic_expr ws? RP ws? block (ws? 'ELSE' ws? block)?
    | 'IF' ws? LP ws? logic_expr ws? RP ws? block (ws? 'ELSE' ws? if_stmt)?
    ;

rep_loop
    : 'REP' ws? LP ws? (expr ws? SEP ws?)? expr (ws? SEP ws? expr)? ws? RP ws? block // tu dodalem kolejny blok () jako krok i powinno dzialac jako np. REP(i, 10, 2)
    ;

def : 'DEF' ws? LP ws? (opt_type STR ws? (SEP ws? opt_type STR ws?)* )? RP ws?
                block;

any_expr : expr | logic_expr;

expr: expr ws? ('*' | '/') ws? expr
    | expr ws? ('+' | '-') ws? expr
    | LP ws? expr ws? RP
    | macro_call
    | input
    ;

logic_expr: expr ws? ('==' | '!=' | '>' | '<' | '>=' | '<=') ws? expr // usunięcie | zeby wyrazenie nie moglo byc niczym
    | logic_expr ws? ('AND' | 'OR') ws? logic_expr
    | LP ws? logic_expr ws? RP
    | macro_call
    ;


opt_type: (type ws)? ;

macro_call
    : range_macro
    | match_macro
    | anyof_macro
    | throws_macro
    | var_macro
    | check_macro
    | header_macro
    ;

range_macro  : 'RANGE' ws? LP ws? expr ws? SEP ws? expr ws? RP ; 
match_macro  : 'MATCH' ws? LP ws? expr ws? RP ;
anyof_macro  : 'ANYOF' ws? LP ws? expr (ws? SEP ws? expr)* ws? RP ;
throws_macro : 'THROWS' ws? LP ws? STR ws? RP ;

var_macro    : 'VAR' ws? LP ws? opt_type STR ws? RP
                ( ws? ASSIGN ws? any_expr)?;

check_macro  : 'CHECK' ws? LP ws? logic_expr ws? RP ;
header_macro : 'C_HEADER' ws? LP ws? STR ws? RP ;

custom_macro : STR ws? LP ws? (expr ws? (SEP ws? expr ws?)* )? ws? RP ;

ignore_ws: 'IGNORE_WHITESPACE' LP code RP
    ;

input : NUMB | expl_ws | STR ; 
comment : COM; 

single_ws : SPACE | ENDL;
ws  : (SPACE | ENDL)+;

expl_ws: EXPL_SPACE | EXPL_ENDL;

type
    : 'INT'
    | 'FLOAT'
    | 'STR'
    | type '[' expr ']' 
    ;

// ==========================================
// LEKSER
// ==========================================

COM : '#' ~[\r\n]* ; 

EXPL_SPACE: 'SPACE';
EXPL_ENDL: 'ENDL';

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

ASSIGN : '<<';


AND : 'AND' ;
OR  : 'OR' ;
QUOTE: '\'';
STR : QUOTE ~[\r\n]*? QUOTE      
    | ~[ \t\r\n#(),{}*+/=<>!\-\\]+
    ;

ANY_SINGLE_CHAR: '.';