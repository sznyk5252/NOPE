# How to crate a variables?
## Usage
```
VAR( [TYPE] NAME ) [<< EXPR]
```
## Default usage
by default typing 
```
VAR(x)
```
create and capture `x` from stdin as integer 

## Typing
To create variable of different type than `INT` use 
```
VAR( <TYPE> <NAME>)
```
for example:
```
VAR(STR x)
```

## Asign

To create variable and asign value to it instead of reading from stdout use assignment like that:
```
VAR(x) << 10
```
# How to use it as expected input

Once you have created a viariable, let's say `x`, to specify that on output, just type
```
x
```
This way it will be expected that on the stdout to found whatever is in `x`.

# Arrays
```
VAR( <TYPE>[EXPR] NAME )
```
extra rules for arrayes:
- Arrays are NOT read from stdout as Variables
- You can't acces array all at once - this mean no assignment and no specifying expected output

To pass this limitations use 
([see more about variables](docs/loops.md))
