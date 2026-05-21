#include "nope_runtime.h"

int main() {
	nope_init();
	{

		int value;
		value = nope_read_int();
		if (value < min_val || value > max_val) 
		{

			THROWS(error_msg);
		}

	}

	nope_cleanup();
	return 0;
}