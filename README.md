# NOPE
### N - Notation for 
### O - Output
### P - Pattern
### E - Evaluation

## 1. Authors
* Szymon Krężołek
* Jakub Kosowicz

## 2. Contact
* szkrezolek@student.agh.edu.pl
* jkosowicz@student.agh.edu.pl

## 3. Program assumptions
**3.1. General Goals:** NOPE is a language designed for automated judging systems. Its primary goal is to speed up the creation of test cases, simplify their development, and improve the clarity of verifying a program's standard output.

**3.2. Translator Type:** Compiler

**3.3. Planned Output:** Compiler evaluates NOPE scripts into standard **C code**. This C script evaluates the tested program's output and returns `0` if the output passes the rules, or `1` if it fails.

**3.4. Implementation Language:** Python 3.

**3.5. Scanner/Parser Implementation:** The scanner and parser are automatically generated using the **ANTLR4** tool based on a custom grammar file.

## 4. Tokens

|          Token         | TokenCode (Enum) |     Description     |     Example Matches     |
|:----------------------:|:----------------:|:-------------------:|:-----------------------:|
|     LEFT_PARENTESE     |        LP        |   Left parenthesis  |            (            |
|     RIGHT_PARENTESE    |        RP        |  Right parenthesis  |            )            |
|        SEPARATOR       |        SEP       |        Comma        |            ,            |
|         NUMBER         |       NUMB       |       Numbers       |   10, -15, 12.3, -0.9   |
|         STRING         |        STR       |       Strings       |     abc, 'x + y == 10'    |
|          SPACE         |       SPACE      |     Single space    |           ' '           |
|         NEWLINE        |      ENDL     |  Newline character  |            \n           |
|         COMMENT        |        COM       | Single-line comment |            #Any comment         |
|        VAR(name, type = int)       |        TAG       |   Variable capture  |          VAR(x)         |
|       CHECK       |        TAG       |    Assertion (C gramar inside)   | CHECK(x + y == 10) |
|     MATCH(pattern)     |        TAG       |  Regex matching  |       MATCH(x > 0)      |
| ANYOF(opt1, opt2, ...) |        TAG       |   Multiple choice   |   ANYOF(yes, YES, yES)  |
|     DEF(name, value)    |        TAG       |  Macro definiton |   DEF(YES_M, ANYOF(yes, YES, yES)) # can by invoke by simply using `YES_M()`  |
|         REP(n, value, iterator_name = i)         |        TAG       |   Loop definition   |         REP(10, "a ")         |
|      THROWS(error)     |        TAG       |   Negative testing  |    THROWS(Exception)    |
|     RANGE(from, to)    |        TAG       |    Boundary check   |       RANGE(0, 10)      |
| C_HEADER(c_code)       |        TAG       |   code to include at the begining |   C_HEADER( #include <math.h> ) |

# 5. Format Grammar
The structure of the language is defined in the standard ANTLR4 notation (`NOPE.g4`). 

```antlr
grammar NOPE;

// PARSER RULES
program   : (tag | comment | input | ws)* EOF ;
tag       : tagname LP (arg | args)? RP ;
args      : arg (SEP arg)* ;
arg       : arg_part+ ;
arg_part  : input | tag | LP args? RP | ws ;
tagname   : 'RANGE' | 'MATCH' | 'ANYOF' | 'THROWS' | 'VAR' | 'CHECK' | 'DEF' | 'REP' | 'C_HEADER' ;
input     : NUMB | STR ; 
comment   : COM ; 
ws        : (SPACE | ENDL)+ ;

// LEXER RULES
COM       : '#' ~[\r\n]* ; 
SPACE     : [ \t]+ ;
ENDL      : [\r\n]+ | '\n'+ ;
SEP       : ',' ;
LP        : '(' ;
RP        : ')' ;
NUMB      : '-'? [0-9]+ ('.' [0-9]*)? ;
STR       : '\'' .*? '\'' | ~[ \t\r\n#(),]+ ;
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
To see the resoult see ```uv run main.py -h```

# 8. Examples
* Classic exact-match
```
5 %  abc
```
Expect that program will print 5 followed by space, % folowed by double space and finaly abc

* Range
```
Range(0, 10)
```
Expect that program will print number between 0 and 10 (10 not included)