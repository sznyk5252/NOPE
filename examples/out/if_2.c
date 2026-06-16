#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	float temp;
	temp = nope_read_float();
	    nope_match_endl();
	if (!(temp <= 0.0) && temp < 100.0) 
	{
		nope_expect_char('W');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('e');
		nope_expect_char('r');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('s');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('n');
		nope_expect_char(' ');
		nope_expect_char('a');
		nope_expect_char(' ');
		nope_expect_char('l');
		nope_expect_char('i');
		nope_expect_char('q');
		nope_expect_char('u');
		nope_expect_char('i');
		nope_expect_char('d');
		nope_expect_char(' ');
		nope_expect_char('s');
		nope_expect_char('t');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('e');
		nope_expect_char(' ');
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}