#include "nope_runtime.h"

int main(){
	nope_init();
	nope_anyof((const char*[]){"abc", "cba"}, 2);
	nope_expect_char(' ');
	nope_expect_char('1');
	nope_expect_char('2');
	nope_expect_char('3');
	nope_expect_char(' ');
	nope_expect_char('\n');
	nope_cleanup();
	nope_expect_eof();
	return 0;
}