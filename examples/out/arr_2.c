#include "nope_runtime.h"

int main() {
	{
	for (int i = 0; i < 10; i += 1) 	{
	for (int j = 0; j < 10; j += 1) 	{
	    if (i == j) 	{
	        if (!(grid[i] == grid[j])) {
	            printf("[NOPE] Failed test on condition: CHECK(grid[i] == grid[j])\n");
	            return 1;
	        }
	}
	 	}
	
	}
	}
	return 0;
}