#include "nope_runtime.h"

int main(){
	nope_init();
	nope_expect_char('\'');
	nope_expect_char('\n');
	nope_expect_char('\\');
	nope_expect_char('\\');
	nope_expect_char('\n');
	nope_expect_char('#');
	nope_expect_char('\n');
	nope_expect_char('\\');
	nope_expect_char('n');
	nope_cleanup();
	nope_expect_eof();
	return 0;
}