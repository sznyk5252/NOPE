#ifndef NOPE_RUNTIME_H
#define NOPE_RUNTIME_H

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <regex.h>

extern char *nope_input_buffer;
extern char *nope_cursor;
extern bool nope_ignore_ws_active;

void nope_anyof(const char* val, const char* of[], int of_size);
void nope_check(bool condition);
void nope_match(const char* val, const char* pattern);
void nope_range_int(int val, int min, int max);
void nope_range_float(float val, float min, float max);

void nope_init(void);
void nope_cleanup(void);
void nope_fail(const char *reason, const char *expected, const char *got);
void nope_expect_char(char expected);
void nope_skip_whitespace(void);

char* nope_read_str(void);
int nope_read_int(void);
float nope_read_float(void);

void nope_expect_int(int expected);
void nope_expect_float(float expected);
void nope_expect_str(const char *expected);

#endif // NOPE_RUNTIME_H