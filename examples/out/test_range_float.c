#include "nope_runtime.h"

int main(){
	nope_init();
	nope_range_float(nope_read_float(), -10.5, 20.0);
	nope_cleanup();
	nope_expect_eof();
	return 0;
}