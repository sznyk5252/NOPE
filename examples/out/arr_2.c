#include "nope_runtime.h"

void check_grid(int grid[10][10]) 
{
	for (int i = 0; i < 10; i += 1) 
	{
		for (int j = 0; j < 10; j += 1) 
		{
			if (i == j) 
			{
				if (!(grid[i] == grid[j])) {
					nope_fail("CHECK assertion failed", "CHECK(grid[i] == grid[j])", "false");
				}
			}
			nope_expect_char(' ');
		}
		nope_expect_char('\n');

	}
}


int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_char('\n');
	nope_expect_eof();
	nope_cleanup();
	return 0;
}