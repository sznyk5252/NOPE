#include "nope_runtime.h"

int main(){
	nope_init();
	for (int i = 0; i < 10; i += 2) 
	{
		nope_expect_char('V');
		nope_expect_char('a');
		nope_expect_char('l');
		nope_expect_char('u');
		nope_expect_char('e');
		nope_expect_char(':');
		nope_expect_char(' ');
		nope_expect_char('i');
		nope_expect_char('\n');

	}
	nope_cleanup();
	return 0;
}