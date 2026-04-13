# NOPE
### N - Notation
### O - for Output
### P - Pattern
### E - Evaluation

# About the Project
NOPE is a language designed for automated judging systems. Its primary goal is to speed up the creation of test cases, simplify their development, and improve the clarity of verifying a program's standard output.

This language was created to bridge the gap between simple, exact-match output checkers and complex, custom-written testing scripts.

# Key Features
NOPE supports:
- custom macros (as functions)
- loops
- comments
- variables.

A major advantage of NOPE is that a single test file can seamlessly combine classic, static text (evaluated via exact match) with dynamic scripting elements.

# Implementation
Compiler was build using ANTLR4 and python. Compiler evaluates NOPE to C++ code, that can be compiled once again using standard C++ compiler.

## Tokens

|          Token         | TokenCode (Enum) |     Description     |     Example Matches     |
|:----------------------:|:----------------:|:-------------------:|:-----------------------:|
|     LEFT_PARENTESE     |        LP        |   Left parenthesis  |            (            |
|     RIGHT_PARENTESE    |        RP        |  Right parenthesis  |            )            |
|        SEPARATOR       |        SEP       |        Comma        |            ,            |
|         NUMBER         |       NUMB       |       Numbers       |   10, -15, 12.3, -0.9   |
|         STRING         |        STR       |       Strings       |     abc, x + y == 10    |
|          SPACE         |       SPACE      |     Single space    |           ' '           |
|         NEWLINE        |      NEWLINE     |  Newline character  |            \n           |
|         COMMENT        |        COM       | Single-line comment |            #            |
|        VAR(name)       |        TAG       |   Variable capture  |          VAR(x)         |
|       FINALCHECK       |        TAG       |   Final assertion   | FINALCHECK(x + y == 10) |
|     MATCH(pattern)     |        TAG       |  Felxible matching  |       MATCH(x > 0)      |
| ANYOF(opt1, opt2, ...) |        TAG       |   Multiple choice   |   ANYOF(yes, YES, yES)  |
|     DEF(var, value)    |        TAG       |  Constant definiton |   DEF(max_limit, 100)   |
|         REP(n)         |        TAG       |   Loop validation   |         REP(10)         |
|      THROWS(error)     |        TAG       |   Negative testing  |    THROWS(Exception)    |
|     RANGE(from, to)    |        TAG       |    Boundary check   |       RANGE(0, 10)      |

# Dafault usage
On default it is used to create C++ script for checking the output for each of the .nope file - so it can be efficently used with automated checkers  


# Examples

## Classic exact-match
```
5 %  abc
```
Expect that program will print `5` followed by space, `%` folowed by double space and finaly `abc`

## Range
```
Range(0, 10)
```
Expect that program will print number between 0 and 10 (10 not included)