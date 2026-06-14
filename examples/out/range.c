#include "nope_runtime.h"

int main(){
	nope_init();
	nope_range_int(nope_read_int(), 0, 10);
	nope_expect_eof();
	nope_cleanup();
	return 0;
}