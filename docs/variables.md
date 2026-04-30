# How to create variables?
## Usage
```
VAR( [TYPE] NAME ) [<< EXPR]
```
## Default usage
By default, typing:
```
VAR(x)
```
creates and captures `x` from stdout as an integer.

## Typing
To create a variable of a different type than `INT`, use:
```
VAR( <TYPE> <NAME> )
```
For example:
```
VAR(STR x)
```

## Assignment
To create a variable and assign a value to it instead of reading from stdout, use an assignment like this:
```
VAR(x) << 10
```

### Example
```
VAR(x) << 1\
x x 5 x x
```
This will expect:
```
1 1 5 1 1
```

# How to use it as expected output
Once you have created a variable (let's say `x`), to specify it in the expected output, just type:
```
x
```
This way, the script expects to find whatever value is stored in `x` on stdout.

# Arrays
```
VAR( <TYPE>[EXPR] NAME )
```
Extra rules for arrays:
- Arrays are NOT implicitly read from stdout like regular variables.
- You can't access an entire array all at once - this means no direct assignment and no specifying it directly as expected output.

To bypass these limitations, use loops. 
[See more about loops](loops.md)