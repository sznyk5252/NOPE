#include "nope_runtime.h"

int main() {
	nope_init();
	for (int idx = 5; idx < 1; idx += 1) 
	{

		int x;
		x = nope_read_int();
		nope_expect_char(' ');
		if (!(x == (idx   2))) {
		            printf("[NOPE] Failed test on condition: CHECK(x == (idx   2))\n");
			return 1;
			}
	}

	nope_cleanup();
	return 0;
}