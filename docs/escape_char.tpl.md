# When to use it?
You can use `\` to escape special grammar characters so they can be printed to standard output (stdout). Examples include:
- `#` - used for comments
- `'` - used to specify strings (`STR`)
- `\` - the escape character itself

It can also be used to ignore whitespace.
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
If you want to print a keyword to stdout, please **DO NOT** use:
```
\RANGE
```
Instead, use an explicit `STR`:
```
'RANGE'
```