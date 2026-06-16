#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_anyof((const char*[]){"yes", "YES", "y"}, 3);
	nope_expect_eof();
	nope_cleanup();
	return 0;
}