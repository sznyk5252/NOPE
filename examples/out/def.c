#include "nope_runtime.h"

int main() {
	nope_init();
	{

		char* c;
		c = 'Sum of a and b is: ';
		int sum;
		sum = (a   b);
		nope_expect_str(c);
		nope_expect_char(' ');
		nope_expect_int(sum);
	}

	int a1;
	a1 = nope_read_int();
	int b1;
	b1 = nope_read_int();
	int a2;
	a2 = nope_read_int();
	int b2;
	b2 = nope_read_int();
	SUM(a1, b1);
	SUM(a2, b2);
	nope_cleanup();
	return 0;
}