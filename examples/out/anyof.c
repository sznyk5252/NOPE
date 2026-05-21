#include "nope_runtime.h"

int main(){
	nope_init();
	nope_expect_char(' ');
	nope_expect_char('1');
	nope_expect_char('2');
	nope_expect_char('3');
	nope_expect_char(' ');
	nope_cleanup();
	return 0;
}