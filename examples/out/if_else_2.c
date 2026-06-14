#include "nope_runtime.h"

int main(){
	nope_init();
	int status;
	status = nope_read_int();
	nope_expect_char('\n');
	if (status == 1) 
	{
		nope_expect_char('I');
		nope_expect_char('n');
		nope_expect_char('i');
		nope_expect_char('t');
		nope_expect_char('i');
		nope_expect_char('a');
		nope_expect_char('l');
		nope_expect_char('i');
		nope_expect_char('z');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('i');
		nope_expect_char('o');
		nope_expect_char('n');
	}
	    else 
	if (status == 2) 
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
	}
	    else 
	if (status == 3) 
	{
		nope_expect_char('F');
		nope_expect_char('i');
		nope_expect_char('n');
		nope_expect_char('i');
		nope_expect_char('s');
		nope_expect_char('h');
		nope_expect_char('e');
		nope_expect_char('d');
	}
	    else 
	{
		nope_expect_char('U');
		nope_expect_char('n');
		nope_expect_char('k');
		nope_expect_char('n');
		nope_expect_char('o');
		nope_expect_char('w');
		nope_expect_char('n');
		nope_expect_char(' ');
		nope_expect_char('s');
		nope_expect_char('t');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('u');
		nope_expect_char('s');
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}