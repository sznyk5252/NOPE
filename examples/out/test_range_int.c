#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_range_int(nope_read_int(), 0, 100);
	nope_expect_eof();
	nope_cleanup();
	return 0;
}