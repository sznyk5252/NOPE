#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int a;
	a = nope_read_int();
	nope_expect_char('\n');
	if (a > 0) 
	{
		nope_expect_int(a);
	}
	    else 
	{
		int b;
		b = (0 - a);
		nope_expect_int(b);
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}