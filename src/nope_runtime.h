#ifndef NOPE_RUNTIME_H
#define NOPE_RUNTIME_H

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <regex.h>

void nope_anyof(const char* val, const char* of[], int of_size);
void nope_check(bool condition);
void nope_match(const char* val, const char* pattern);
void nope_range_int(int val, int min, int max);
void nope_range_float(float val, float min, float max);
void nope_assert_equal(const char* val1, const char* val2);
char* nope_read_line(void);
char** nope_split_space(const char* line, int* out_size);
void nope_free_split(char** tokens, int size);

#endif // NOPE_RUNTIME_H