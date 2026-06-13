#include "nope_runtime.h"

int main(){
	nope_init();
	int a;
	a = nope_read_int();
	nope_expect_char('\n');
	int b;
	b = nope_read_int();
	if (!((a + b) == 10)) {
		nope_fail("CHECK assertion failed", "CHECK((a + b) == 10)", "false");
	}
	nope_cleanup();
	nope_expect_eof();
	return 0;
}