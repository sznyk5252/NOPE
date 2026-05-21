#include "nope_runtime.h"

int main(){
	nope_init();
	for (int i = 0; i < 10; i += 1) 
	{
		nope_expect_char('I');
		nope_expect_char('n');
		nope_expect_char('d');
		nope_expect_char('e');
		nope_expect_char('x');
		nope_expect_char(':');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('\n');

	}
	nope_cleanup();
	return 0;
}