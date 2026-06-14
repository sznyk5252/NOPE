#include "nope_runtime.h"

int calculate_area(int width, int height) 
{

nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
    return (width * height);

}



int main(){
	nope_init();
	nope_expect_eof();
	nope_cleanup();
	return 0;
}