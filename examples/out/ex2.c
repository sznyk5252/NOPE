#include "nope_runtime.h"

int main(){
	nope_init();
	nope_range_float(nope_read_float(), -10.5, 20.);
	nope_expect_char(')');
	nope_expect_char('(');
	nope_expect_char('a');
	nope_expect_char('b');
	nope_expect_char('c');
	nope_expect_char(')');
	nope_cleanup();
	return 0;
}