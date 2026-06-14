#include "nope_runtime.h"

int main(){
	nope_init();
	nope_expect_char('t');
	nope_expect_char('h');
	nope_expect_char('i');
	nope_expect_char('s');
	nope_expect_char('w');
	nope_expect_char('i');
	nope_expect_char('l');
	nope_expect_char('l');
	nope_expect_char('b');
	nope_expect_char('e');
	nope_expect_char('s');
	nope_expect_char('i');
	nope_expect_char('n');
	nope_expect_char('g');
	nope_expect_char('l');
	nope_expect_char('e');
	nope_expect_char('l');
	nope_expect_char('i');
	nope_expect_char('n');
	nope_expect_char('e');
	nope_expect_char('w');
	nope_expect_char('i');
	nope_expect_char('t');
	nope_expect_char('h');
	nope_expect_char('o');
	nope_expect_char('u');
	nope_expect_char('t');
	nope_expect_char('s');
	nope_expect_char('p');
	nope_expect_char('a');
	nope_expect_char('c');
	nope_expect_char('e');
	nope_expect_char('s');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}