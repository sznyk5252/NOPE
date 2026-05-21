#include "nope_runtime.h"

int main() {
	nope_init();
	{

		nope_expect_char('-');
		nope_expect_char('-');
		nope_expect_char('-');
		nope_expect_char('-');
		nope_expect_char('-');
		nope_expect_char('\n');

		nope_expect_char('R');
		nope_expect_char('e');
		nope_expect_char('s');
		nope_expect_char('u');
		nope_expect_char('l');
		nope_expect_char('t');
		nope_expect_char(':');
		nope_expect_char(' ');
	}

	nope_cleanup();
	return 0;
}