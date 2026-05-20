#include "nope_runtime.h"

int main() {
	nope_init();
	for (int i = 0; i < 5; i += 1) 
	{

	    nope_expect_char('T');

	    nope_expect_char('e');

	    nope_expect_char('s');

	    nope_expect_char('t');

	    nope_expect_char(' ');

	}

	nope_cleanup();
	return 0;
}