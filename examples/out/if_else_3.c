#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int x;
	x = nope_read_int();
	    nope_match_endl();
	int y;
	y = nope_read_int();
	    nope_match_endl();
	if (x > 0) 
	{
		if (y > 0) 
		{
			nope_expect_char('F');
			nope_expect_char('i');
			nope_expect_char('r');
			nope_expect_char('s');
			nope_expect_char('t');
			nope_expect_char(' ');
			nope_expect_char('q');
			nope_expect_char('u');
			nope_expect_char('a');
			nope_expect_char('d');
			nope_expect_char('r');
			nope_expect_char('a');
			nope_expect_char('n');
			nope_expect_char('t');
			nope_expect_char(' ');
			nope_expect_char('o');
			nope_expect_char('f');
			nope_expect_char(' ');
			nope_expect_char('t');
			nope_expect_char('h');
			nope_expect_char('e');
			nope_expect_char(' ');
			nope_expect_char('c');
			nope_expect_char('o');
			nope_expect_char('o');
			nope_expect_char('r');
			nope_expect_char('d');
			nope_expect_char('i');
			nope_expect_char('n');
			nope_expect_char('a');
			nope_expect_char('t');
			nope_expect_char('e');
			nope_expect_char(' ');
			nope_expect_char('s');
			nope_expect_char('y');
			nope_expect_char('s');
			nope_expect_char('t');
			nope_expect_char('e');
			nope_expect_char('m');
		}
		    else 
		{
			nope_expect_char('F');
			nope_expect_char('o');
			nope_expect_char('u');
			nope_expect_char('r');
			nope_expect_char('t');
			nope_expect_char('h');
			nope_expect_char(' ');
			nope_expect_char('q');
			nope_expect_char('u');
			nope_expect_char('a');
			nope_expect_char('d');
			nope_expect_char('r');
			nope_expect_char('a');
			nope_expect_char('n');
			nope_expect_char('t');
			nope_expect_char(' ');
			nope_expect_char('o');
			nope_expect_char('f');
			nope_expect_char(' ');
			nope_expect_char('t');
			nope_expect_char('h');
			nope_expect_char('e');
			nope_expect_char(' ');
			nope_expect_char('c');
			nope_expect_char('o');
			nope_expect_char('o');
			nope_expect_char('r');
			nope_expect_char('d');
			nope_expect_char('i');
			nope_expect_char('n');
			nope_expect_char('a');
			nope_expect_char('t');
			nope_expect_char('e');
			nope_expect_char(' ');
			nope_expect_char('s');
			nope_expect_char('y');
			nope_expect_char('s');
			nope_expect_char('t');
			nope_expect_char('e');
			nope_expect_char('m');
		}
	}
	    else 
	{
		nope_expect_char('L');
		nope_expect_char('e');
		nope_expect_char('f');
		nope_expect_char('t');
		nope_expect_char(' ');
		nope_expect_char('s');
		nope_expect_char('i');
		nope_expect_char('d');
		nope_expect_char('e');
		nope_expect_char(' ');
		nope_expect_char('o');
		nope_expect_char('f');
		nope_expect_char(' ');
		nope_expect_char('t');
		nope_expect_char('h');
		nope_expect_char('e');
		nope_expect_char(' ');
		nope_expect_char('c');
		nope_expect_char('o');
		nope_expect_char('o');
		nope_expect_char('r');
		nope_expect_char('d');
		nope_expect_char('i');
		nope_expect_char('n');
		nope_expect_char('a');
		nope_expect_char('t');
		nope_expect_char('e');
		nope_expect_char(' ');
		nope_expect_char('s');
		nope_expect_char('y');
		nope_expect_char('s');
		nope_expect_char('t');
		nope_expect_char('e');
		nope_expect_char('m');
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}