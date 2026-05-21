#include "nope_runtime.h"

int main() {
	nope_init();
	int x;
	x = nope_read_int();
	int y;
	y = nope_read_int();
	if (!((x   y) == 10)) {
	            printf("[NOPE] Failed test on condition: CHECK((x   y) == 10)\n");
		return 1;
		}
	nope_cleanup();
	return 0;
}