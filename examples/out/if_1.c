#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int x;
	x = nope_read_int();
	    nope_match_endl();
	if (x > 10) 
	{
		if (!(x != 100)) {
			nope_fail("CHECK assertion failed", "CHECK(x != 100)", "false");
		}
		nope_expect_char('T');
		nope_expect_char('h');
		nope_expect_char('e');
		nope_expect_char(' ');
		nope_expect_char('n');
		nope_expect_char('u');
		nope_expect_char('m');
		nope_expect_char('b');
		nope_expect_char('e');
		nope_expect_char('r');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('s');
		nope_expect_char(' ');
		nope_expect_char('g');
		nope_expect_char('r');
		nope_expect_char('e');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('e');
		nope_expect_char('r');
		nope_expect_char(' ');
		nope_expect_char('t');
		nope_expect_char('h');
		nope_expect_char('a');
		nope_expect_char('n');
		nope_expect_char(' ');
		nope_expect_char('1');
		nope_expect_char('0');
		nope_expect_char(',');
		nope_expect_char(' ');
		nope_expect_char('b');
		nope_expect_char('u');
		nope_expect_char('t');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('t');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('s');
		nope_expect_char(' ');
		nope_expect_char('n');
		nope_expect_char('o');
		nope_expect_char('t');
		nope_expect_char(' ');
		nope_expect_char('1');
		nope_expect_char('0');
		nope_expect_char('0');
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}