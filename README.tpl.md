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

**3.3. Planned Output:** The compiler translates NOPE scripts into standard **C** code. This C program evaluates the tested program's output and returns `0` if the output passes the rules, or `1` if it fails.

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
| **`VAR`** | `var_macro` | Variable capture and optional assignment | `VAR(INT x) << 10` |
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
{% include "NOPE.g4" %}
```
You can see results of the grammar in `graphs/`

# 6. External Generators & Packages
* ANTLR4 - Parser generator used to build the Lexer and Parser from the .g4 grammar.
* antlr4-python3-runtime - The runtime library required to execute the generated ANTLR Python code.
* Graphviz - External package used for rendering the Abstract Syntax Tree (AST) visually.

# 7. Dev Man
If you want to change the grammar, modify `NOPE.g4` and push a commit. Changes will be applied by CI/CD. Alternatively, you can run:
```
uv run antlr4 -Dlanguage=Python3 -o src NOPE.g4
```

To see the results, use ```uv run nope -h```

If you want to change the compiler change file `src/NopeCompiler.py`, Do **NOT** change `src/NOPEVisitor.py`

To compile all .nope examples to .c files use:
```
uv run nope examples/in/*.nope -co examples/out 
```

To compile all .c examples to executables use somethink like this:
```
for f in examples/out/*.c; do gcc "$f" src/nope_runtime.c -I src -o "examples/exe/$(basename "${f%.c}").exe"; done
```

To compile all NOPE examples to c and c to executables use:
```
uv run nope examples/in/*.nope -co examples/out -b -eo examples/exe
```

# 8. Learn NOPE
Visit the [quick start guide](docs/quick_start.md)

# 9. Example of NOPE integration in judging system
[Universal-checker](https://gitlab.com/szymek.krezolek/universal-checker) 

# 10. TODO:

## JK
naprawić tak żeby działały przykłady:
- examples/in/if_3.nope
- examples/in/escchar.nope
- examples/in/def.nope

usunąć THROWS i C_HEADER z dokumentacji (w szczególności z README.tpl.md)

## SK
poprawić integrację z universal-checker