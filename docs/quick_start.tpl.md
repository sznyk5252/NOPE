# Quick Start

## Classic exact-match
Expect that the program will print exactly what is provided.
```
{% include "examples/in/classic.nope" %}
```

## Range
```
{% include "examples/in/range.nope" %}
```
Expect that the program will print a number between 0 and 10 ([see more on that](range.md)).

## Match
```
{% include "examples/in/match.nope" %}
```
Expect that the program will print a string matching the regex.

## Comment
```
{% include "examples/in/comment.nope" %}
```

## How to check for `#`, keywords, etc.?
Just use `\` as the escape character.
```
{% include "examples/in/escchar.nope" %}
```

## How to ignore whitespaces?
By default, every space and newline is checked in the program output - in most cases, it really simplifies writing in NOPE. 

You can change that behavior by writing something inside an `IGNORE_WHITESPACE()` block or just using `\` before every whitespace that you want to ignore. Inside that tag, you have to define spaces and newlines explicitly by typing `SPACE` or `ENDL`.
```
{% include "examples/in/ignore_ws.nope" %}
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
{% include "examples/in/var.nope" %}
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