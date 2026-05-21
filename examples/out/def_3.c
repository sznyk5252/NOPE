#include "nope_runtime.h"

void validate_bounds(int min_val, int max_val, char* error_msg) {	int value;	value = nope_read_int();	if (value < min_val || value > max_val) 	{		THROWS(error_msg);	}}


int main(){
	nope_init();
	nope_cleanup();
	return 0;
}