# Quick Start

## Classic exact-match
Expect that program will print exactly what is provided.
```
1 2 3
1.2 4.5
123
```

## Range
```
RANGE(0, 10)
```
Expect that program will print number between 0 and 10 ([see more on that](docs/range.md))

## Match
```
MATCH('-?[0-9]+\.?[0-9]*')
```
Expect that program will print string matching the regex.

## Throws
```
THROWS(EXCEPTION)
```
Expect that program will throw exception which name matches the argument.

## Comment
```
# This is comment line 
```

## How to check for `#`, keywords, etc.?
Just use `\` as escape character.
```
\# This is NOT comment line
```
## How to ignore whitespaces?
By default every space and newline is checked in program output - in most cases it realy simplify writing in NOPE. 

You can change that behavior by writing sth in `IGNORE_WHITESPACE()` or just using `\` before every wshitespace that you want to ignore. In that tag you have to define spaces and newlines by typing `SPACE` or `ENDL`.

```
IGNORE_WHITESPACE(
    0 1 
    2 3
)
IGNORE_WHITESPACE(
    0 SPACE 1 ENDL
    2 SPACE 3 ENDL
)
0\ 1\
2\ 3\

```
this will be same as writing: 
```
0123
0 1
2 3
0123
```

## Simple variables
Deafault type for the variables is `INT`
```
VAR(x) \
x 5 x x
```
This expect that the program will print sth like:
- `1 1 5 1 1`
- `2 2 5 2 2`
- `999 999 5 999 999`
