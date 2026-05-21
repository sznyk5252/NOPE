#include "nope_runtime.h"

char *nope_input_buffer = NULL;
char *nope_cursor = NULL;
bool nope_ignore_ws_active = false;

void nope_anyof(const char* val, const char* of[], int of_size){
    for (int i = 0; i < of_size; i++) {
        if (strcmp(val, of[i]) == 0) {
            return;
        }
    }
    fprintf(stderr, "Error: value '%s' not in allowed list\n", val);
    exit(1);
}

void nope_check(bool condition) {
    if (!condition) {
        fprintf(stderr, "Error: check failed\n");
        exit(1);
    }
}

void nope_match(const char* val, const char* pattern)
{
    regex_t regex;
    int reti;

    reti = regcomp(&regex, pattern, REG_EXTENDED);
    if (reti) {
        fprintf(stderr, "Error: Could not compile regex\n");
        exit(1);
    }

    reti = regexec(&regex, val, 0, NULL, 0);
    regfree(&regex);

    if (reti == REG_NOMATCH) {
        fprintf(stderr, "Error: value '%s' does not match pattern '%s'\n", val, pattern);
        exit(1);
    }
}

void nope_range_int(int val, int min, int max) {
    if (val < min || val > max) {
        fprintf(stderr, "Error: value %d out of range [%d, %d]\n", val, min, max);
        exit(1);
    }
}

void nope_range_float(float val, float min, float max) {
    if (val < min || val > max) {
        fprintf(stderr, "Error: value %f out of range [%f, %f]\n", val, min, max);
        exit(1);
    }
}


char* nope_read_line(void) {
    char* line = NULL;
    size_t len = 0;
    if (getline(&line, &len, stdin) == -1) {
        free(line);
        return NULL;
    }
    return line;
}

char** nope_split_space(const char* line, int* out_size) {
    char* line_copy = strdup(line);
    
    int capacity = 10;
    int count = 0;
    char** tokens = malloc(capacity * sizeof(char*));

    char* token = strtok(line_copy, " \n");
    while (token != NULL) {
        if (count >= capacity) {
            capacity *= 2;
            tokens = realloc(tokens, capacity * sizeof(char*));
        }
        
        tokens[count++] = strdup(token);
        
        token = strtok(NULL, " \n");
    }

    free(line_copy); 
    *out_size = count;
    return tokens;
}

void nope_free_split(char** tokens, int size) {
    if (tokens == NULL) return;
    for (int i = 0; i < size; i++) {
        free(tokens[i]); 
    }
    free(tokens); 
}

static void trim_trailing_spaces(char *str) {
    if (!str) return;
    
    char *read_ptr = str;
    char *write_ptr = str;
    char *last_non_space = NULL;

    while (*read_ptr != '\0') {
        if (*read_ptr == '\n') {
            if (last_non_space != NULL) {
                write_ptr = last_non_space + 1;
            }
            *write_ptr++ = '\n';
            last_non_space = NULL; 
        } else {
            *write_ptr = *read_ptr;
            if (*read_ptr != ' ' && *read_ptr != '\t') {
                last_non_space = write_ptr;
            }
            write_ptr++;
        }
        read_ptr++;
    }
    
    if (last_non_space != NULL) {
        write_ptr = last_non_space + 1;
    }
    *write_ptr = '\0';
}

void nope_init(void) {
    size_t capacity = 4096;
    size_t size = 0;
    
    nope_input_buffer = malloc(capacity);
    if (!nope_input_buffer) {
        fprintf(stderr, "[NOPE SYSTEM ERROR] Memory allocation failed!\n");
        exit(1);
    }

    int ch;
    // Odczyt z potoku (stdin)
    while ((ch = getchar()) != EOF) {
        if (size + 1 >= capacity) {
            capacity *= 2;
            char *new_buffer = realloc(nope_input_buffer, capacity);
            if (!new_buffer) {
                free(nope_input_buffer);
                fprintf(stderr, "[NOPE SYSTEM ERROR] Memory reallocation failed!\n");
                exit(1);
            }
            nope_input_buffer = new_buffer;
        }
        nope_input_buffer[size++] = (char)ch;
    }
    nope_input_buffer[size] = '\0';

    // Usunięcie tzw. trailing whitespaces
    trim_trailing_spaces(nope_input_buffer);

    // Inicjalizacja kursora
    nope_cursor = nope_input_buffer;
}

void nope_cleanup(void) {
    if (nope_input_buffer) {
        free(nope_input_buffer);
        nope_input_buffer = NULL;
        nope_cursor = NULL;
    }
}

void nope_fail(const char *reason, const char *expected, const char *got) {
    fprintf(stderr, "[NOPE] %s\n", reason);
    if (expected) {
        fprintf(stderr, "   Expected: '%s'\n", expected);
    }
    if (got) {
        fprintf(stderr, "   Got:      '%s'\n", got);
    }
    
    // Zwalniamy zasoby przed wyjściem
    nope_cleanup();
    exit(1); // Wymóg: wyjście 1 oznacza błąd dla judge'a
}

void nope_expect_char(char expected) {
    if (nope_ignore_ws_active) {
        nope_skip_whitespace();
    }

    if (*nope_cursor == expected) {
        nope_cursor++; // Pasuje, przesuwamy kursor
    } else {
        char got_str[2] = { *nope_cursor, '\0' };
        char exp_str[2] = { expected, '\0' };
        
        if (*nope_cursor == '\0') {
            nope_fail("Unexpected end of input (EOF)", exp_str, "EOF");
        } else {
            nope_fail("Exact match failed", exp_str, got_str);
        }
    }
}

void nope_skip_whitespace(void) {
    while (*nope_cursor == ' ' || *nope_cursor == '\t' || *nope_cursor == '\n' || *nope_cursor == '\r') {
        nope_cursor++;
    }
}

char* nope_read_str(void) {
    if (nope_ignore_ws_active) {
        nope_skip_whitespace();
    }
    char *end_ptr = nope_cursor;
    while (*end_ptr != '\0' && *end_ptr != ' ' && *end_ptr != '\t' && *end_ptr != '\n' && *end_ptr != '\r') {
        end_ptr++;
    }

    size_t length = end_ptr - nope_cursor;
    
    if (length == 0) {
        nope_fail("Expected to read a string, but found whitespace/EOF instead", "Any string", "Empty");
    }

    char *result = malloc(length + 1);
    if (!result) {
        fprintf(stderr, "[NOPE SYSTEM ERROR] Memory allocation failed while reading STR!\n");
        exit(1);
    }

    strncpy(result, nope_cursor, length);
    result[length] = '\0';
    
    nope_cursor = end_ptr; 
    return result;
}

int nope_read_int(void) {
    if (nope_ignore_ws_active) nope_skip_whitespace();
    
    char *endptr;
    long val = strtol(nope_cursor, &endptr, 10);
    
    if (endptr == nope_cursor) {
        nope_fail("Expected to read an INT, but found invalid characters/EOF", "Integer", "NaN");
    }
    
    nope_cursor = endptr; // Aktualizacja głównego kursora!
    return (int)val;
}

float nope_read_float(void) {
    if (nope_ignore_ws_active) nope_skip_whitespace();
    
    char *endptr;
    float val = strtof(nope_cursor, &endptr);
    
    if (endptr == nope_cursor) {
        nope_fail("Expected to read a FLOAT, but found invalid characters/EOF", "Float", "NaN");
    }
    
    nope_cursor = endptr;
    return val;
}

void nope_expect_int(int expected) {
    if (nope_ignore_ws_active) nope_skip_whitespace();
    
    char *endptr;
    long val = strtol(nope_cursor, &endptr, 10);
    
    if (endptr == nope_cursor) {
        char exp_str[32];
        snprintf(exp_str, sizeof(exp_str), "%d", expected);
        nope_fail("Expected integer to match variable, but found text/EOF", exp_str, "NaN");
    }
    
    if ((int)val != expected) {
        char exp_str[32], got_str[32];
        snprintf(exp_str, sizeof(exp_str), "%d", expected);
        snprintf(got_str, sizeof(got_str), "%ld", val);
        nope_fail("Variable (INT) match failed", exp_str, got_str);
    }
    
    nope_cursor = endptr;
}

void nope_expect_float(float expected) {
    if (nope_ignore_ws_active) nope_skip_whitespace();
    
    char *endptr;
    float val = strtof(nope_cursor, &endptr);
    
    if (endptr == nope_cursor) {
        char exp_str[32];
        snprintf(exp_str, sizeof(exp_str), "%f", expected);
        nope_fail("Expected float to match variable, but found text/EOF", exp_str, "NaN");
    }
    
    float diff = val - expected;
    if (diff < 0) diff = -diff; 
    
    if (diff > 0.0001f) {
        char exp_str[32], got_str[32];
        snprintf(exp_str, sizeof(exp_str), "%f", expected);
        snprintf(got_str, sizeof(got_str), "%f", val);
        nope_fail("Variable (FLOAT) match failed", exp_str, got_str);
    }
    nope_cursor = endptr;
}

void nope_expect_str(const char *expected) {
    if (nope_ignore_ws_active) nope_skip_whitespace();
    
    size_t len = strlen(expected);
    if (strncmp(nope_cursor, expected, len) == 0) {
        nope_cursor += len;
    } else {
        char got_str[64];
        snprintf(got_str, sizeof(got_str), "%.*s", (int)len, nope_cursor);
        nope_fail("Variable (STR) match failed", expected, got_str);
    }
}