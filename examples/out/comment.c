#include "nope_runtime.h"

int main(){
	nope_init();
	nope_cleanup();
	nope_expect_eof();
	return 0;
}