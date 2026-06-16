#include "nope_runtime.h"

void SUM(int a, int b) 
{
	char* c;
	c = "Sum of a and b is: ";
	int sum;
	sum = (a + b);
	nope_expect_str(c);
	nope_expect_char(' ');
	nope_expect_int(sum);
}


int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_char('\n');
	int a1;
	a1 = nope_read_int();
	nope_expect_char(' ');
	int b1;
	b1 = nope_read_int();
	nope_expect_char('\n');
	int a2;
	a2 = nope_read_int();
	nope_expect_char(' ');
	int b2;
	b2 = nope_read_int();
	nope_expect_char('\n');
	SUM(a1, b1);
	nope_expect_char('\n');
	SUM(a2, b2);
	nope_expect_eof();
	nope_cleanup();
	return 0;
}