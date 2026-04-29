# Why to use it?
You can use `\` to specify you want on stdout some of the special chars that are used in the grammar - like:
- `#` - used to command
- `'` - used to specify `STR`
- `\` - escchar itself

Or if you want to ignore any whitespace 
### For example

```
{% include "examples/in/escchar.nope" %}
```

```
{% include "examples/in/escchar2.nope" %}
```

```
{% include "examples/in/escchar3.nope" %}
```

# When not to use it? 
If you want to specify you want some of the keyword on the stdout
Please NOT use:
```
\RANGE
```
Insteade use explicit `STR`:
```
'RANGE'
```