#include "nope_runtime.h"

int main(){
	nope_init();
	nope_expect_char('#');
	nope_expect_char(' ');
	nope_expect_char('T');
	nope_expect_char('h');
	nope_expect_char('i');
	nope_expect_char('s');
	nope_expect_char(' ');
	nope_expect_char('i');
	nope_expect_char('s');
	nope_expect_char(' ');
	nope_expect_char('N');
	nope_expect_char('O');
	nope_expect_char('T');
	nope_expect_char(' ');
	nope_expect_char('c');
	nope_expect_char('o');
	nope_expect_char('m');
	nope_expect_char('m');
	nope_expect_char('e');
	nope_expect_char('n');
	nope_expect_char('t');
	nope_expect_char(' ');
	nope_expect_char('l');
	nope_expect_char('i');
	nope_expect_char('n');
	nope_expect_char('e');
	nope_cleanup();
	return 0;
}