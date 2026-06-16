#include "nope_runtime.h"

void prints_separator() 
{
	nope_expect_char('-');
	nope_expect_char('-');
	nope_expect_char('-');
	nope_expect_char('-');
	nope_expect_char('-');
	nope_match_endl();
	nope_expect_char('R');
	nope_expect_char('e');
	nope_expect_char('s');
	nope_expect_char('u');
	nope_expect_char('l');
	nope_expect_char('t');
	nope_expect_char(':');
	nope_expect_char(' ');
}


int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_eof();
	nope_cleanup();
	return 0;
}