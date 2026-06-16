#include "nope_runtime.h"

void Custom_Range(int expected, int margin) 
{
	float result;
	result = nope_read_float();
	nope_expect_char(' ');
	if (!(result >= (expected - margin) && result <= (expected + margin))) {
		nope_fail("CHECK assertion failed", "Condition \"result >= (expected - margin) && result <= (expected + margin)\" must be true", "");
	}
}


int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_eof();
	nope_cleanup();
	return 0;
}