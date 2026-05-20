#include "nope_runtime.h"

int main() {
	nope_init();
	    nope_expect_char('0');

	    nope_expect_char('1');

	    nope_expect_char('2');

	    nope_expect_char('3');

	    nope_expect_char('0');

	    nope_expect_char(' ');

	    nope_expect_char('1');

	    nope_expect_char('\n');

	    nope_expect_char('2');

	    nope_expect_char(' ');

	    nope_expect_char('3');

	    nope_expect_char('\n');

	    nope_expect_char('0');

	    nope_expect_char('1');

	    nope_expect_char('2');

	    nope_expect_char('3');

	nope_cleanup();
	return 0;
}