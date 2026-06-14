#include "nope_runtime.h"

int main(){
	nope_init();
	for (int i = 0; i < 3; i += 1) 
	{
		nope_expect_int(i);
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}