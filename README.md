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