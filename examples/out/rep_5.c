#include "nope_runtime.h"

int main(){
	nope_init();
	nope_expect_char('\n');
	for (int j = 10; j < 0; j += -1) 
	{
		nope_expect_char('C');
		nope_expect_char('o');
		nope_expect_char('u');
		nope_expect_char('n');
		nope_expect_char('t');
		nope_expect_char('d');
		nope_expect_char('o');
		nope_expect_char('w');
		nope_expect_char('n');
		nope_expect_char(':');
		nope_expect_char(' ');
		nope_expect_char('j');
		nope_expect_char('\n');

	}
	nope_cleanup();
	return 0;
}