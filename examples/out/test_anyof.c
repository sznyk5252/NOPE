#include "nope_runtime.h"

int main(){
	nope_init();
	nope_anyof((const char*[]){"yes", "YES", "y"}, 3);
	nope_cleanup();
	nope_expect_eof();
	return 0;
}