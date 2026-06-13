#include "nope_runtime.h"

int main(){
	nope_init();
	nope_ignore_ws_active = true;
	nope_expect_char('0');
	nope_expect_char('1');
	nope_expect_char('2');
	nope_expect_char('3');
	nope_ignore_ws_active = false;
	nope_expect_char('\n');
	nope_ignore_ws_active = true;
	nope_expect_char('0');
	nope_expect_char(' ');
	nope_expect_char('1');
	nope_expect_char('\n');

	nope_expect_char('2');
	nope_expect_char(' ');
	nope_expect_char('3');
	nope_expect_char('\n');

	nope_ignore_ws_active = false;
	nope_expect_char('\n');
	nope_expect_char('0');
	nope_expect_char('1');
	nope_expect_char('2');
	nope_expect_char('3');
	nope_cleanup();
	nope_expect_eof();
	return 0;
}