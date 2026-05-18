# Quick Start

## Classic exact-match
Expect that the program will print exactly what is provided.
```
1 2 3
1.2 4.5
123
```

## Range
```
RANGE(0, 10)
```
Expect that the program will print a number between 0 and 10 ([see more on that](range.md)).

## Match
```
MATCH('-?[0-9]+\.?[0-9]*')
```
Expect that the program will print a string matching the regex.

## Comment
```
# This is comment line 
```

## How to check for `#`, keywords, etc.?
Just use `\` as the escape character.
```
\# This is NOT comment line
```

## How to ignore whitespaces?
By default, every space and newline is checked in the program output - in most cases, it really simplifies writing in NOPE. 

You can change that behavior by writing something inside an `IGNORE_WHITESPACE()` block or just using `\` before every whitespace that you want to ignore. Inside that tag, you have to define spaces and newlines explicitly by typing `SPACE` or `ENDL`.
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
This will be the same as writing: 
```
0123
0 1
2 3
0123
```
[Learn more about the escape character](escape_char.md)

## Simple variables
The default type for variables is `INT`.
```
VAR(x) \
x 5 x x
```
This expects that the program will print something like:
- `1 1 5 1 1`
- `2 2 5 2 2`
- `999 999 5 999 999`

[Learn more about variables](variables.md)

# More advanced:
- [Functions](def.md)
- [If statements](if_else.md)
- [Loops](loops.md)