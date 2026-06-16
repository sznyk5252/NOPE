#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_char('\'');
	    nope_match_endl();
	nope_expect_char('\\');
	nope_expect_char('\\');
	    nope_match_endl();
	nope_expect_char('#');
	nope_expect_char('\n');
	nope_expect_char('\\');
	nope_expect_char('n');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}