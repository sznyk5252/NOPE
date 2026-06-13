#include "nope_runtime.h"

int main(){
	nope_init();
	int limit;
	limit = nope_read_int();
	nope_expect_char('\n');
	int step_size;
	step_size = nope_read_int();
	nope_expect_char('\n');
	for (int i = 0; i < (limit * 2); i += (step_size + 1)) 
	{
		nope_expect_char('P');
		nope_expect_char('r');
		nope_expect_char('o');
		nope_expect_char('c');
		nope_expect_char('e');
		nope_expect_char('s');
		nope_expect_char('s');
		nope_expect_char('i');
		nope_expect_char('n');
		nope_expect_char('g');
		nope_expect_char(' ');
		nope_expect_char('b');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('c');
		nope_expect_char('h');
		nope_expect_char('.');
		nope_expect_char('.');
		nope_expect_char('.');
		nope_expect_char('\n');

	}
	nope_cleanup();
	nope_expect_eof();
	return 0;
}