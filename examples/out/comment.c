#include "nope_runtime.h"

int main(){
	nope_init();
	nope_expect_eof();
	nope_cleanup();
	return 0;
}