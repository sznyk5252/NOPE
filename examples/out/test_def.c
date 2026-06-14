#include "nope_runtime.h"

void Custom_Range(int expected, int margin) 
{
	float result;
	result = nope_read_float();
	nope_expect_char(' ');
	if (!(result >= (expected - margin) && result <= (expected + margin))) {
		nope_fail("CHECK assertion failed", "CHECK(result >= (expected - margin) && result <= (expected + margin))", "false");
	}
}


int main(){
	nope_init();
	nope_expect_eof();
	nope_cleanup();
	return 0;
}