# Quick Start

## Classic exact-match
Expect that program will print exactly what is provided.
```
{% include "examples/in/classic.nope" %}
```

## Range
```
{% include "examples/in/range.nope" %}
```
Expect that program will print number between 0 and 10 ([see more on that](docs/range.md))

## Match
```
{% include "examples/in/match.nope" %}
```
Expect that program will print string matching the regex.

## Throws
```
{% include "examples/in/throws.nope" %}
```
Expect that program will throw exception which name matches the argument.

## Comment
```
{% include "examples/in/comment.nope" %}
```

## How to check for `#`, keywords, etc.?
Just use `\` as escape character.
```
{% include "examples/in/escchar.nope" %}
```
## How to ignore whitespaces?
By default every space and newline is checked in program output - in most cases it realy simplify writing in NOPE. 

You can change that behavior by writing sth in `IGNORE_WHITESPACE()` or just using `\` before every wshitespace that you want to ignore. In that tag you have to define spaces and newlines by typing `SPACE` or `ENDL`.

```
{% include "examples/in/ignore_ws.nope" %}
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
{% include "examples/in/var.nope" %}
```
This expect that the program will print sth like:
- `1 1 5 1 1`
- `2 2 5 2 2`
- `999 999 5 999 999`
([see more about variables](docs/variables.md))
