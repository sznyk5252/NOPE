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

### Identifiers and Literals

| Name | Description | Regex / ANTLR Definition | Example |
| :--- | :--- | :--- | :--- |
| **`ID`** | Variable/function identifier | `[a-zA-Z_][a-zA-Z0-9_]*` | `punkty`, `_temp`, `x1` |
| **`NUMB`** | Numeric literal (integer and floating-point) | `'-'?[0-9]+('.'[0-9]*)?` | `42`, `-15`, `3.14` |
| **`STR`** | String literal (quoted or raw text) | `'\'' ~[\r\n]*? '\''` \| `~[ \t\r\n#(),{}*+/=<>!\-\\]+` | `'Hello'`, `Zaliczone` |
| **`TYPE`** | Data type keywords & Arrays | `'INT'` \| `'FLOAT'` \| `'STR'` \| `'BOOL'` \| `type[size]` | `INT`, `BOOL`, `INT[10]` |

### Arithmetic Operators

| Name | Description | Regex / ANTLR Definition | Example |
| :--- | :--- | :--- | :--- |
| **`ADD`** | Addition | `'+'` | `+` |
| **`SUB`** | Subtraction | `'-'` | `-` |
| **`MUL`** | Multiplication | `'*'` | `*` |
| **`DIV`** | Division | `'/'` | `/` |

### Relational and Logical Operators

| Name | Description | Regex / ANTLR Definition | Example |
| :--- | :--- | :--- | :--- |
| **`EQ`** | Equality | `'=='` | `==` |
| **`NEQ`** | Inequality | `'!='` | `!=` |
| **`LS`** | Less than | `'<'` | `<` |
| **`GR`** | Greater than | `'>'` | `>` |
| **`LSEQ`** | Less than or equal to | `'<='` | `<=` |
| **`GREQ`** | Greater than or equal to | `'>='` | `>=` |
| **`AND`** | Logical conjunction (AND) | `'AND'` | `AND` |
| **`OR`** | Logical disjunction (OR) | `'OR'` | `OR` |
| **`NEGATION`** | Logical negation (NOT) | `'NOT'` | `NOT` |

### Structural Symbols and Assignments

| Name | Description | Regex / ANTLR Definition | Example |
| :--- | :--- | :--- | :--- |
| **`ASSIGN`** | Value assignment operator | `'<<'` | `<<` |
| **`RETURN`** | Function return keyword | `'RETURN'` | `RETURN` |
| **`RETURN_TYPING_ARROW`**| Return value typing arrow | `'->'` | `->` |
| **`LP`** | Left parenthesis | `'('` | `(` |
| **`RP`** | Right parenthesis | `')'` | `)` |
| **`LBRACE`** | Left brace (block start) | `'{'` | `{` |
| **`RBRACE`** | Right brace (block end) | `'}'` | `}` |
| **`SEP`** | Argument separator | `','` | `,` |
| **`QUOTE`** | Single quote character | `'\''` | `'` |
| **`ESCCHAR`** | Escape character | `'\\'` | `\` |

### Whitespaces and Comments

| Name | Description | Regex / ANTLR Definition | Example |
| :--- | :--- | :--- | :--- |
| **`COM`** | Single-line comment | `'#' ~[\r\n]*` | `# this is a test` |
| **`SPACE`** | Spaces and tabs | `[ \t]+` | ` ` (space) |
| **`ENDL`** | Newline character | `[\r\n]+` \| `'\n'+` | `\n` |
| **`EXPL_SPACE`** | Explicitly defined space for the parser | `'SPACE'` | `SPACE` |
| **`EXPL_ENDL`** | Explicitly defined newline for the parser | `'ENDL'` | `ENDL` |

### Macros and Structures (Parser Rules)

| Construction | Rule Type | Description | Example |
| :--- | :--- | :--- | :--- |
| **`VAR`** | `var_macro` | Variable capture and optional assignment | `VAR(INT x << 10)` |
| **`REP`** | `rep_loop` | Loop with iterator, limits, step, and code block | `REP(i, 10, 0, 2) { ... }` |
| **`DEF`** | `def` | Custom macro/function definition | `DEF MY_FUNC(INT a) -> INT { ... }` |
| **`CUSTOM`** | `custom_macro` | Calling a user-defined macro/function | `MY_FUNC(10, 'text')` |
| **`IF / ELSE`** | `if_stmt` | Conditional logic flow | `IF (x > 0) { ... } ELSE { ... }` |
| **`CHECK`** | `check_macro` | Assertion evaluating logical expressions | `CHECK(x + y >= 10 AND x < 20)` |
| **`MATCH`** | `match_macro` | Exact or regex matching | `MATCH('Passed')` |
| **`ANYOF`** | `anyof_macro` | Multiple choice matching | `ANYOF('yes', 'YES')` |
| **`THROWS`** | `throws_macro`| Negative testing (expects an error) | `THROWS('Exception')` |
| **`RANGE`** | `range_macro` | Boundary check | `RANGE(0, 100)` |
| **`C_HEADER`** | `header_macro`| Code to include at the beginning | `C_HEADER('#include <math.h>')` |
| **`IGNORE_WHITESPACE`**| `ignore_ws` | Disables strict whitespace checking for a block | `IGNORE_WHITESPACE { MATCH('A') }` |

# 5. Formal Grammar
The structure of the language is defined in the standard ANTLR4 notation (file: `NOPE.g4`). 

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

// logic_expr: NEGATION ws? logic_expr ws?
//     | expr ws? comparator ws? expr 
//     | logic_expr ws? comparator ws? logic_expr 
//     | logic_expr ws? (AND | OR) ws? logic_expr
//     | LP ws? logic_expr ws? RP
//     | macro_call 
//     | ID
//     ;

logic_expr
    : LP ws? logic_expr ws? RP
    | macro_call 
    | ID
    | NEGATION ws? logic_expr
    | expr ws? comparator ws? expr 
    // | logic_expr ws? (comparator) ws? logic_expr 
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