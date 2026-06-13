#include "nope_runtime.h"

int main(){
	nope_init();
	for (int idx = 5; idx < 1; idx += 1) 
	{
		int x;
		x = nope_read_int();
		nope_expect_char(' ');
		if (!(x == (idx * 2))) {
			nope_fail("CHECK assertion failed", "CHECK(x == (idx * 2))", "false");
		}
	}
	nope_cleanup();
	nope_expect_eof();
	return 0;
}