#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	for (int idx = 1; ((1) > 0 ? (idx < 5) : (idx > 5)); idx += (1)) 
	{
		int x;
		x = nope_read_int();
		nope_expect_char(' ');
		if (!(x == (idx * 2))) {
			nope_fail("CHECK assertion failed", "CHECK(x == (idx * 2))", "false");
		}
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}