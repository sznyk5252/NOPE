#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_char('a');
	nope_expect_char('b');
	nope_expect_char('c');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}