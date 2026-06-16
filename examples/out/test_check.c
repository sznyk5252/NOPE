#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int a;
	a = nope_read_int();
	    nope_match_endl();
	int b;
	b = nope_read_int();
	if (!((a + b) == 10)) {
		nope_fail("CHECK assertion failed", "Condition \"(a + b) == 10\" must be true", "");
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}