#include "nope_runtime.h"

char *nope_input_buffer = NULL;
char *nope_cursor = NULL;
bool nope_ignore_ws_active = false;
int nope_snippet_length = 100;

void nope_anyof(const char* of[], int of_size) {
    if (nope_ignore_ws_active) nope_skip_whitespace();

    for (int i = 0; i < of_size; i++) {
        size_t len = strlen(of[i]);
        if (strncmp(nope_cursor, of[i], len) == 0) {
            nope_cursor += len;
            return;
        }
    }
    
    char expected_msg[512] = "One of: "; // Rezerwujemy bezpiecznie 512 bajtów
    
    for (int i = 0; i < of_size; i++) {
        // Zabezpieczenie przed przepełnieniem bufora
        if (strlen(expected_msg) + strlen(of[i]) + 5 >= sizeof(expected_msg)) {
            strcat(expected_msg, "...");
            break; 
        }
        
        strcat(expected_msg, "'");
        strcat(expected_msg, of[i]);
        strcat(expected_msg, "'");
        
        if (i < of_size - 1) {
            strcat(expected_msg, ", ");
        }
    }

    // 3. Sprawdzamy, co dostaliśmy na wejściu (Got)
    char got_str[32];
    if (*nope_cursor == '\0') {
        strcpy(got_str, "EOF");
    } else {
        snprintf(got_str, sizeof(got_str), "%.31s...", nope_cursor);
    }
    
    // 4. Wyrzucamy błąd!
    nope_fail("ANYOF match failed", expected_msg, got_str);
}

void nope_check(bool condition) {
    if (!condition) {
        fprintf(stderr, "Error: check failed\n");
        exit(1);
    }
}
void nope_match_endl(void) {
    if (*nope_cursor == '\n') {
        nope_cursor++; // Zwykły Linuxowy Enter
    } else if (*nope_cursor == '\r' && *(nope_cursor + 1) == '\n') {
        nope_cursor += 2; // Windowsowy Enter
    } else if (*nope_cursor == '\0') {
        // MAGICZNY TRIK: Jeśli to koniec pliku, wybaczamy brakujący Enter!
        return; 
    } else {
        char got_str[8] = {0};
        got_str[0] = *nope_cursor;
        nope_fail("Expected End Of Line (ENDL)", "\\n", got_str);
    }
}
void nope_match(const char* pattern) {
    if (nope_ignore_ws_active) nope_skip_whitespace();

    regex_t regex;
    int reti;

    // REG_EXTENDED dla potężniejszych regexów
    reti = regcomp(&regex, pattern, REG_EXTENDED);
    if (reti) {
        fprintf(stderr, "[NOPE SYSTEM ERROR] Could not compile regex: %s\n", pattern);
        exit(1);
    }

    // regmatch_t pmatch[1] pozwala nam wyciągnąć początek i koniec dopasowania
    regmatch_t pmatch[1];
    reti = regexec(&regex, nope_cursor, 1, pmatch, 0);
    regfree(&regex);

    if (reti == REG_NOMATCH) {
        // Obcinamy output, żeby nie wypisać całego pozostałego bufora
        char got_str[32];
        snprintf(got_str, sizeof(got_str), "%.31s...", nope_cursor);
        nope_fail("Regex pattern match failed", pattern, got_str);
    }
    
    // Upewniamy się, że dopasowanie zaczyna się dokładnie w miejscu kursora!
    if (pmatch[0].rm_so != 0) {
        char got_str[32];
        snprintf(got_str, sizeof(got_str), "%.31s...", nope_cursor);
        nope_fail("Regex pattern matched, but not at the current position", pattern, got_str);
    }

    // Przesuwamy kursor o długość dopasowania
    nope_cursor += pmatch[0].rm_eo;
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
    size_t length = 0;
    
    nope_input_buffer = (char *)malloc(capacity);
    if (!nope_input_buffer) {
        fprintf(stderr, "Fatal Error: Memory allocation failed in nope_init\n");
        exit(1);
    }

    size_t bytes_read;
    while ((bytes_read = fread(nope_input_buffer + length, 1, capacity - length - 1, stdin)) > 0) {
        length += bytes_read;
        if (length + 1 == capacity) {
            capacity *= 2;
            char *new_buffer = (char *)realloc(nope_input_buffer, capacity);
            if (!new_buffer) {
                fprintf(stderr, "Fatal Error: Memory reallocation failed in nope_init\n");
                free(nope_input_buffer);
                exit(1);
            }
            nope_input_buffer = new_buffer;
        }
    }


    nope_input_buffer[length] = '\0';
    trim_trailing_spaces(nope_input_buffer);
    
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
    int line = 1;
    int col = 1;
    char *ptr = nope_input_buffer;
    char *line_start = nope_input_buffer;

    // Przechodzimy przez bufor od początku aż do miejsca błędu
    while (ptr < nope_cursor) {
        if (*ptr == '\n') {
            line++;
            col = 1;
            line_start = ptr + 1; // Zapisujemy, gdzie zaczyna się nowa linia
        } else {
            col++;
        }
        ptr++;
    }

    // 2. Wypisywanie głównego komunikatu błędu
    fprintf(stderr, "\n========================================\n");
    fprintf(stderr, "[NOPE ERROR] %s\n", reason);
    fprintf(stderr, "Location: Line %d, Column %d\n", line, col);
    fprintf(stderr, "----------------------------------------\n");
    if (expected && expected[0] != '\0') {
        if (strcmp(expected, "\n") == 0) fprintf(stderr, "   Expected: '\\n'\n");
        else if (strcmp(expected, "\r\n") == 0) fprintf(stderr, "   Expected: '\\r\\n'\n");
        else fprintf(stderr, "   Expected: '%s'\n", expected);
    }

    if (got && got[0] != '\0') {
        if (strcmp(got, "\n") == 0) fprintf(stderr, "   Got:      '\\n'\n");
        else if (strcmp(got, "\r\n") == 0) fprintf(stderr, "   Got:      '\\r\\n'\n");
        else fprintf(stderr, "   Got:      '%s'\n", got);
    }

    // 3. Generowanie "Okienka" (Snippetu)
    fprintf(stderr, "\n--- Output Snippet ---\n");

    // Szukamy końca obecnej linii
    char *line_end = line_start;
    while (*line_end != '\0' && *line_end != '\n') {
        line_end++;
    }

    char *snippet_start = line_start;
    int snippet_len = line_end - line_start;

    // Jeżeli linijka jest dłuższa niż nasz limit, musimy przesunąć okienko
    if (snippet_len > nope_snippet_length) {
        snippet_len = nope_snippet_length;
        int half_window = snippet_len / 2;
        
        // Przesuwamy początek okienka tak, aby błąd był mniej więcej w połowie
        if (nope_cursor - line_start > half_window) {
            snippet_start = nope_cursor - half_window;
        }
        
        // Zabezpieczenie przed wyjechaniem za prawy koniec linii
        if (snippet_start + snippet_len > line_end) {
            snippet_start = line_end - snippet_len;
        }
    }

    // Jeśli ucięliśmy początek linii, pokazujemy 3 kropki
    if (snippet_start > line_start) {
        fprintf(stderr, "...");
    }
    
    // Wypisujemy właściwy, przesunięty wycinek tekstu
    fprintf(stderr, "%.*s", snippet_len, snippet_start);
    
    // Jeśli ucięliśmy koniec linii, pokazujemy 3 kropki
    if (snippet_start + snippet_len < line_end) {
        fprintf(stderr, "...");
    }
    fprintf(stderr, "\n");

    // Rysujemy kursor w odpowiednim miejscu
    if (snippet_start > line_start) {
        fprintf(stderr, "   "); // Musimy przesunąć kursor o te 3 kropki z lewej!
    }

    for (char *p = snippet_start; p < nope_cursor; p++) {
        if (*p == '\t') fprintf(stderr, "\t");
        else fprintf(stderr, " ");
    }
    fprintf(stderr, "^\n");
    fprintf(stderr, "========================================\n\n");
    
    // Zwalniamy zasoby przed wyjściem
    nope_cleanup();
    exit(1);
}

void nope_expect_char(char expected) {
    if (nope_ignore_ws_active && expected != ' ' && expected != '\t' && expected != '\n' && expected != '\r') {
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
    if (!nope_ignore_ws_active) {
        if (*nope_cursor == ' ' || *nope_cursor == '\t' ||
            *nope_cursor == '\n' || *nope_cursor == '\r') {
            nope_fail("Unexpected whitespace before number (strict mode)", "digit", "whitespace");
        }
    }

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
    if (!nope_ignore_ws_active) {
        if (*nope_cursor == ' ' || *nope_cursor == '\t' ||
            *nope_cursor == '\n' || *nope_cursor == '\r') {
            nope_fail("Unexpected whitespace before number (strict mode)", "digit", "whitespace");
        }
    }
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
    if (!nope_ignore_ws_active) {
        if (*nope_cursor == ' ' || *nope_cursor == '\t' ||
            *nope_cursor == '\n' || *nope_cursor == '\r') {
            nope_fail("Unexpected whitespace before number (strict mode)", "digit", "whitespace");
        }
    }

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
    if (!nope_ignore_ws_active) {
        if (*nope_cursor == ' ' || *nope_cursor == '\t' ||
            *nope_cursor == '\n' || *nope_cursor == '\r') {
            nope_fail("Unexpected whitespace before number (strict mode)", "digit", "whitespace");
        }
    }
    
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

void nope_expect_eof(void) {
    // Jeśli jesteśmy w trybie ignorowania spacji (w bloku IGNORE_WHITESPACE),
    // pozwalamy sędziemu zjeść na koniec puste entery i spacje
    // if (nope_ignore_ws_active) {
    nope_skip_whitespace();
    // }

    // Jeśli po zjedzeniu spacji kursor nadal widzi jakieś znaki (nie jest to '\0')
    if (*nope_cursor != '\0') {
        char got_str[32];
        // Kopiujemy kawałek śmieciowego wyjścia, żeby pokazać je w logach
        snprintf(got_str, sizeof(got_str), "%.31s...", nope_cursor);
        nope_fail("Expected End Of File (EOF), but found extra output", "EOF", got_str);
    }
}