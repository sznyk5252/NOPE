# Examples:
```
DEF prints_separator() {
    '-----'
    ENDL
    'Result:' SPACE
}

```
```
DEF Custom_Range(expected, margin) {
    VAR(FLOAT result) SPACE
    CHECK(result >= expected - margin AND result <= expected + margin)
}

```
```
DEF validate_bounds(INT min_val, INT max_val, STR error_msg) {
    VAR(INT value)
    IF (value < min_val OR value > max_val) {
        error_msg
    }
}
```
```
# Macro that calculates and returns the area of a rectangle
# No stdout is specified here 
DEF calculate_area(INT width, INT height) -> INT {
    RETURN width * height
}
```
```
# Macro that extracts a sensor reading, validates it, and returns the variable
DEF get_sensor_data() -> FLOAT {
    'Sensor value: '
    VAR(FLOAT reading)
    
    IF (reading < 0.0) {
        THROWS('Sensor reading cannot be negative')
    }
    
    RETURN reading
}
```
```
# Macro that calculates a final price after applying a discount
DEF apply_discount(FLOAT base_price, FLOAT discount) -> FLOAT {
    'Applying discount...'
    ENDL
    # Returns the price reduced by the discount percentage
    # Uses LP and RP from your expr rule: LP ws? expr ws? RP
    RETURN base_price - (base_price * discount)
}
```
