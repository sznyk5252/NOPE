#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	for (int i = 0; ((1) > 0 ? (i < 3) : (i > 3)); i += (1)) 
	{
		nope_expect_int(i);
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}