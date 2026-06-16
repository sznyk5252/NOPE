#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	for (int i = 0; ((1) > 0 ? (i < 10) : (i > 10)); i += (1)) 
	{
		nope_expect_char('I');
		nope_expect_char('n');
		nope_expect_char('d');
		nope_expect_char('e');
		nope_expect_char('x');
		nope_expect_char(':');
		nope_expect_char(' ');
		nope_expect_int(i);
		nope_match_endl();
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}