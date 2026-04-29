# NOPE
### N - Notation for 
### O - Output
### P - Pattern
### E - Evaluation

## 1. Authors
* Szymon Krężołek
* Jakub Kosowicz

## 2. Contact
* skrezolek@student.agh.edu.pl
* jkosowicz@student.agh.edu.pl

## 3. Program assumptions
**3.1. General Goals:** NOPE is a language designed for automated judging systems. Its primary goal is to speed up the creation of test cases, simplify their development, and improve the clarity of verifying a program's standard output.

**3.2. Translator Type:** Compiler

**3.3. Planned Output:** Compiler evaluates NOPE scripts into standard **C code**. This C script evaluates the tested program's output and returns `0` if the output passes the rules, or `1` if it fails.

**3.4. Implementation Language:** Python 3.

**3.5. Scanner/Parser Implementation:** The scanner and parser are automatically generated using the **ANTLR4** tool based on a custom grammar file.

## 4. Tokens

| Token | TokenCode | Description | Example Matches |
| :--- | :--- | :--- | :--- |
| **LEFT_PARENTESE** | `LP` | Left parenthesis for macro arguments | `(` |
| **RIGHT_PARENTESE** | `RP` | Right parenthesis for macro arguments | `)` |
| **SEPARATOR** | `SEP` | Comma separating multiple arguments | `,` |
| **NUMBER** | `NUMB` | Integer and floating-point numbers | `10`, `-15`, `12.3` |
| **STRING** | `STR` | Quoted strings or raw unquoted text | `'val'`, `x_var` |
| **SPACE** | `SPACE` | White spaces (spaces and tabs) | `' '` |
| **NEWLINE** | `ENDL` | Newline characters | `\n` |
| **COMMENT** | `COM` | Single-line comment starting with `#` | `# text` |
| **VAR(name)** | `TAG` | Variable capture | `VAR(x)` |
| **CHECK(cond)** | `TAG` | Assertion (C grammar inside) | `CHECK(x + y == 10)` |
| **MATCH(pattern)** | `TAG` | Regex matching | `MATCH(x > 0)` |
| **ANYOF(opt1...)** | `TAG` | Multiple choice | `ANYOF(yes, YES)` |
| **DEF(name, val)** | `TAG` | Macro definition | `DEF(YES_M, ANYOF(yes))` |
| **REP(n, value, iter_name = i)** | `TAG` | Loop definition | `REP(10, "a ")` |
| **THROWS(error)** | `TAG` | Negative testing | `THROWS(Exception)` |
| **RANGE(from, to)**| `TAG` | Boundary check | `RANGE(0, 10)` |
| **C_HEADER(code)** | `TAG` | Code to include at the beginning | `C_HEADER(#include <math.h>)` |

# 5. Formal Grammar
The structure of the language is defined in the standard ANTLR4 notation (`NOPE.g4`). 

```antlr
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

input_in_escape: ESCCHAR (ESCCHAR|COM|QUOTE|ws|ANY_SINGLE_CHAR); 

block
    : LBRACE code RBRACE
    ;

if_stmt
    : 'IF' ws? LP ws? logic_expr ws? RP ws? block (ws? 'ELSE' ws? block)?
    | 'IF' ws? LP ws? logic_expr ws? RP ws? block (ws? 'ELSE' ws? if_stmt)?
    ;

rep_loop
    : 'REP' ws? LP ws? (ID ws? SEP ws?)? expr (ws? SEP ws? expr)? ws? RP ws? 
        block // tu dodalem kolejny blok () jako krok i powinno dzialac jako np. REP(i, 10, 2)
    ;

def : 'DEF' ws? LP ws? (opt_type ID ws? (SEP ws? opt_type ID ws?)* )? RP ws?
                block;

any_expr : expr | logic_expr;

expr: expr ws? (MUL | DIV) ws? expr
    | expr ws? (ADD | SUB) ws? expr
    | LP ws? expr ws? RP
    | macro_call
    | input
    ;

logic_expr: expr ws? COMPARATOR ws? expr 
    | logic_expr ws? (AND | OR) ws? logic_expr
    | LP ws? logic_expr ws? RP
    | macro_call
    | ID
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
throws_macro : 'THROWS' ws? LP ws? STR ws? RP ;

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

ID : [a-zA-Z_] [a-zA-Z0-9_]* ; // If there is no variable/macro/c++function with this ID this will be later interpreted as STR

AND : 'AND' ;
OR  : 'OR' ;
QUOTE: '\'';
STR : QUOTE ~[\r\n]*? QUOTE      
    | ~[ \t\r\n#(),{}*+/=<>!\-\\]+
    ;

ANY_SINGLE_CHAR: '.';

COMPARATOR: '==' | '!=' | '>' | '<' | '>=' | '<=';

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

```
# 6. External Generators & Packages
* ANTLR4 - Parser generator used to build the Lexer and Parser from the .g4 grammar.
* antlr4-python3-runtime - The runtime library required to execute the generated ANTLR Python code.
* Graphviz - External package used for rendering the Abstract Syntax Tree (AST) visually.

# 7. User Manual
If you want to change the grammar, modify the NOPE.g4, and run
```
uv run antlr4 -Dlanguage=Python3 -o src NOPE.g4
```
To see the result see ```uv run main.py -h```

# 8. Learn NOPE
Visit [quick start](docs/quick_start.md)


# TODO
### Zwiększyć złożoność gramatyki

[x] 2S -opcja IGNORE_WHITESPACE - domyślnie spacje, endl między elementami mają znaczenie, a w tej sekcji by nie miały - ułatwiałoby to zapisywanie części logicznej

- K - przerobić REP żeby działało podobnie jak w Pythonie

- K - expr (logiczne i arytmetyczne)

- K - if else

- S - DEF() - przerobić żeby działało podobnie jak w zwykłym języku

[x] 1S - Typowanie, ale najlepiej z jakimś domyślnym np int, dobrze by było dodać tag do zmienienia domyślnego typu 

- K - Rozbić wszystkie tagi na osobne tokeny, żeby były lepsze komunikaty o błędach. Pamiętaj o typach, powinna być możliwość nie pisania typów - domyślny byłby np int.

[x] ESCCHAR - tak żeby można było wymusić wpisanie słów kluczowych, `'` itp. 

## DEADLINE
- 1S , 2S - 25.04
- K - 28.04
- S - 29.04