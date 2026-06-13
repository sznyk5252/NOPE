#include "nope_runtime.h"

int main(){
	nope_init();
	nope_range_int(nope_read_int(), 0, 10);
	nope_cleanup();
	nope_expect_eof();
	return 0;
}