#include "nope_runtime.h"

int main(){
	nope_init();
	int x;
	x = 1;
	nope_expect_int(x);
	nope_expect_char(' ');
	nope_expect_int(x);
	nope_expect_char(' ');
	nope_expect_char('5');
	nope_expect_char(' ');
	nope_expect_int(x);
	nope_expect_char(' ');
	nope_expect_int(x);
	nope_cleanup();
	nope_expect_eof();
	return 0;
}