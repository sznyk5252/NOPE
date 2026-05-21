#include "nope_runtime.h"

int main(){
	nope_init();
	int x;
	x = nope_read_int();
	nope_expect_char(' ');
	int y;
	y = nope_read_int();
	nope_expect_char('\n');
	if (!((x   y) == 10)) {
	            printf("[NOPE] Failed test on condition: CHECK((x   y) == 10)\n");
		return 1;
		}
	nope_cleanup();
	return 0;
}