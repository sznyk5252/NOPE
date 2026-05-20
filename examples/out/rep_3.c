#include "nope_runtime.h"

int main() {
	for (int idx = 5; idx < 1; idx += 1) 	{
	 	        if (!(x == (idx   2))) {
	            printf("[NOPE] Failed test on condition: CHECK(x == (idx   2))\n");
	            return 1;
	        }
	}
	return 0;
}