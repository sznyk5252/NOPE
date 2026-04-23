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

# 5. Format Grammar
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

- 2S -opcja IGNORE_WHITESPACE - domyślnie spacje, endl między elementami mają znaczenie, a w tej sekcji by nie miały - ułatwiałoby to zapisywanie części logicznej

- K - przerobić REP żeby działało podobnie jak w Pythonie

- K - expr (logiczne i arytmetyczne)

- K - if else

- S - DEF() - przerobić żeby działało podobnie jak w zwykłym języku

- 1S - Typowanie, ale najlepiej z jakimś domyślnym np int, dobrze by było dodać tag do zmienienia domyślnego typu 

- K - Rozbić wszystkie tagi na osobne tokeny, żeby były lepsze komunikaty o błędach. Pamiętaj o typach, powinna być możliwość nie pisania typów - domyślny byłby np int.

- ESCCHAR - tak żeby można było wymusić wpisanie słów kluczowych, `'` itp. 

## DEADLINE
- 1S , 2S - 25.04
- K - 28.04
- S - 29.04