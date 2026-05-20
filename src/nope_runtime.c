#include "nope_runtime.h"

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

void nope_assert_equal(const char* val1, const char* val2) {
    if (strcmp(val1, val2) != 0) {
        fprintf(stderr, "Error: assertion failed, '%s' != '%s'\n", val1, val2);
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