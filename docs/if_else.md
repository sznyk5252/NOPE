# Examples

## Plain if:
```
VAR(INT x)
IF (x > 10) {
    CHECK(x != 100)
    'The number is greater than 10, but it is not 100'
}
```
```
VAR(FLOAT temp)
IF (NOT temp <= 0.0 AND temp < 100.0) {
    'Water is in a liquid state'
    SPACE
}
```
```
VAR(a)
IF (a > 0) {
    a
}ELSE{
    VAR(b) << -a
    b
}
```
## if else:
```
VAR(INT score)
IF (score >= 50) {
    'Passed'
    ENDL
} ELSE {
    'Failed'
    ENDL
}
```
```
VAR(INT status)
IF (status == 1) {
    'Initialization'
} ELSE IF (status == 2) {
    'Processing'
} ELSE IF (status == 3) {
    'Finished'
} ELSE {
    'Unknown status'
}
```
```
VAR(INT x)
VAR(INT y)
IF (x > 0) {
    IF (y > 0) {
        'First quadrant of the coordinate system'
    } ELSE {
        'Fourth quadrant of the coordinate system'
    }
} ELSE {
    'Left side of the coordinate system'
}
```
