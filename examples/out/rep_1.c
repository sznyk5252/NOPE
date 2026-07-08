#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	for (int i = 0; ((1) > 0 ? (i < 4) : (i > 4)); i += (1)) 
	{
		nope_expect_char('T');
		nope_expect_char('e');
		nope_expect_char('s');
		nope_expect_char('t');
		nope_expect_char(' ');
	}
	nope_expect_char('T');
	nope_expect_char('e');
	nope_expect_char('s');
	nope_expect_char('t');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}