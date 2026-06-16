#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int x;
	x = nope_read_int();
	nope_expect_char(' ');
	nope_expect_int(x);
	nope_expect_char(' ');
	nope_expect_char('5');
	nope_expect_char(' ');
	nope_expect_int(x);
	nope_expect_char(' ');
	nope_expect_int(x);
	nope_expect_eof();
	nope_cleanup();
	return 0;
}