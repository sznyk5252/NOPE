#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_char('1');
	nope_expect_char(' ');
	nope_expect_char('2');
	nope_expect_char(' ');
	nope_expect_char('3');
	nope_expect_char('\n');
	nope_expect_char('1');
	nope_expect_char('.');
	nope_expect_char('2');
	nope_expect_char(' ');
	nope_expect_char('4');
	nope_expect_char('.');
	nope_expect_char('5');
	nope_expect_char('\n');
	nope_expect_char('1');
	nope_expect_char('2');
	nope_expect_char('3');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}