#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int x;
	x = nope_read_int();
	    nope_expect_char(' ');
	int y;
	y = nope_read_int();
	    nope_match_endl();
	if (!((x + y) == 10)) {
		nope_fail("CHECK assertion failed", "Condition \"(x + y) == 10\" must be true", "");
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}