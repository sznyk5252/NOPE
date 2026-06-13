#include "nope_runtime.h"

int main(){
	nope_init();
	nope_match("-?[0-9]+\\.?[0-9]*");
	nope_cleanup();
	nope_expect_eof();
	return 0;
}