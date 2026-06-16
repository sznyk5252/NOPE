#include "nope_runtime.h"

void check_grid(int grid[10][10]) 
{
	for (int i = 0; ((1) > 0 ? (i < 10) : (i > 10)); i += (1)) 
	{
		for (int j = 0; ((1) > 0 ? (j < 10) : (j > 10)); j += (1)) 
		{
			if (i == j) 
			{
				if (!(grid[i] == grid[j])) {
					nope_fail("CHECK assertion failed", "Condition \"grid[i] == grid[j]\" must be true", "");
				}
			}
			nope_expect_char(' ');
		}
		nope_match_endl();
	}
}


int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_eof();
	nope_cleanup();
	return 0;
}