# Examples:
```
# Prints the same word with a single space 5 times
REP (4) {
    'Test' SPACE
}\
Test
```
```
# Prints indices from 0 to 9 separated by '\n'
REP (i, 10) {
    'Index: '
    i ENDL
}
```
```
# Loop from 1 to 5
REP (idx, 1, 5) {
    VAR(INT x) SPACE
    CHECK(x == idx * 2)
}
```
```
# Loop with iterator 'i', upper bound 10, lower bound 0, and step 2
REP (i, 0, 10, 2) {
    'Value: '
    i
    ENDL
}
```
```
# Countdown loop: upper bound 0, lower bound 10, step -1
REP (j, 10, 0, -1) {
    'Countdown: '
    j
    ENDL
}
```
```
VAR(INT limit)
VAR(INT step_size)
# Loop bounds calculated with expresions
REP (0, limit * 2, step_size + 1) {
    'Processing batch...'
    ENDL
}
```
