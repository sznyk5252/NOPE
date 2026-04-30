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

input_in_escape: ESCCHAR (ESCCHAR|COM|QUOTE|ws|LP|RP|LBRACE|RBRACE|ADD|SUB|DIV|MUL|LS|GR); 

block
    : LBRACE code RBRACE
    ;

block_with_return
    : LBRACE code RETURN ws? expr ws? RBRACE
    ;

if_stmt
    : 'IF' ws? LP ws? logic_expr ws? RP ws? block (ws? 'ELSE' ws? block)?
    | 'IF' ws? LP ws? logic_expr ws? RP ws? block (ws? 'ELSE' ws? if_stmt)?
    ;

rep_loop
    : 'REP' ws? LP ws? (ID ws? SEP ws?)?    // iterator ID
     expr                                   // upper bound       
     (ws? SEP ws? expr)?                    // lower bound
     (ws? SEP ws? expr)?                    // step
      ws? RP ws? 
        block 
           ;

def 
    : 'DEF' SPACE+ ID ws? LP ws? (opt_type ID ws? (SEP ws? opt_type ID ws?)* )? RP ws?
                block
    | 'DEF' SPACE+ ID ws? LP ws? (opt_type ID ws? (SEP ws? opt_type ID ws?)* )? RP ws? rtype ws?
                block_with_return
        ;



rtype: RETURN_TYPING_ARROW ws? type ws?;

any_expr : expr | logic_expr;

expr
    : LP ws? expr ws? RP
    | macro_call
    | expr ws? (MUL | DIV) ws? expr
    | expr ws? (ADD | SUB) ws? expr
    | ID
    | input
    ;

logic_expr
    : LP ws? logic_expr ws? RP
    | macro_call 
    | ID
    | NEGATION ws? logic_expr
    | expr ws? comparator ws? expr 
    | logic_expr ws? AND ws? logic_expr
    | logic_expr ws? OR ws? logic_expr
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
    | custom_macro
    ;

range_macro  : 'RANGE' ws? LP ws? expr ws? SEP ws? expr ws? RP ; 
match_macro  : 'MATCH' ws? LP ws? expr ws? RP ;
anyof_macro  : 'ANYOF' ws? LP ws? expr (ws? SEP ws? expr)* ws? RP ;
throws_macro : 'THROWS' ws? LP ws? (STR|ID) ws? RP ;

var_macro    : 'VAR' ws? LP ws? opt_type ID ws? RP
                ( ws? ASSIGN ws? any_expr)?;

check_macro  : 'CHECK' ws? LP ws? logic_expr ws? RP ;
header_macro : 'C_HEADER' ws? LP ws? STR ws? RP ;

custom_macro : ID ws? LP ws? (expr ws? (SEP ws? expr ws?)* )? ws? RP ;

ignore_ws: 'IGNORE_WHITESPACE' LP code RP
    ;

input : NUMB 
    | expl_ws
    | ID
    | STR ;

comment : COM; 

single_ws : SPACE | ENDL;
ws  : (SPACE | ENDL)+;

expl_ws: EXPL_SPACE | EXPL_ENDL;

type
    : 'INT'
    | 'FLOAT'
    | 'STR'
    | 'BOOL'
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

comparator: EQ | NEQ | LS | GR | LSEQ | GREQ;

EQ: '==';
NEQ: '!=';
LS: '<';
GR: '>';
LSEQ: '<=';
GREQ: '>=';


NEGATION: 'NOT';


MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

RETURN: 'RETURN';
RETURN_TYPING_ARROW: '->';

ID : [a-zA-Z_] [a-zA-Z0-9_]* ; // If there is no variable/macro/c++function with this ID this will be later interpreted as STR

STR : QUOTE ~[\r\n]*? QUOTE      
    | ~[ \t\r\n#(),{}*+/=<>!\-\\]+
    ;
