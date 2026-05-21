#include "nope_runtime.h"

int main() {
	nope_init();
	int score;
	score = nope_read_int();
	if (score >= 50) 
	{

		nope_expect_char('P');
		nope_expect_char('a');
		nope_expect_char('s');
		nope_expect_char('s');
		nope_expect_char('e');
		nope_expect_char('d');
		nope_expect_char('\n');

	}

	    else 
	{

		nope_expect_char('F');
		nope_expect_char('a');
		nope_expect_char('i');
		nope_expect_char('l');
		nope_expect_char('e');
		nope_expect_char('d');
		nope_expect_char('\n');

	}

	nope_cleanup();
	return 0;
}