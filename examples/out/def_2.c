#include "nope_runtime.h"

void Custom_Range(int expected, int margin) {	float result;	result = nope_read_float();	nope_expect_char(' ');	if (!(result >= (expected   margin) && result <= (expected   margin))) {	            printf("[NOPE] Failed test on condition: CHECK(result >= (expected   margin) && result <= (expected   margin))\n");		return 1;		}}


int main(){
	nope_init();
	nope_cleanup();
	return 0;
}