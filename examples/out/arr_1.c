#include "nope_runtime.h"

int main(){
	nope_init();
	int size;
	size = nope_read_int();
	nope_expect_char('\n');
	float buffer[size];
	for (int i = 0; i < size; i += 1) 
	{
		float current_val;
		current_val = nope_read_float();
		buffer[i] = current_val;
		nope_expect_char('\n');

	}
	nope_expect_char('\n');
	nope_cleanup();
	nope_expect_eof();
	return 0;
}