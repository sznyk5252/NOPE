#include "nope_runtime.h"

int main(){
	nope_init();
	int x;
	x = nope_read_int();
	nope_expect_char(' ');
	int y;
	y = nope_read_int();
	nope_expect_char('\n');
	if (!((x + y) == 10)) {
		nope_fail("CHECK assertion failed", "CHECK((x + y) == 10)", "false");
	}
	nope_expect_char('\n');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}