#include "nope_runtime.h"

int main() {
	nope_init();
	int size;
	size = nope_read_int();
	float buffer;
	buffer = nope_read_float();
	for (int i = 0; i < size; i += 1) 
	{

		float current_val;
		current_val = nope_read_float();
		buffer = current_val;
		nope_expect_char('\n');

	}

	nope_cleanup();
	return 0;
}