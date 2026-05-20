#include "nope_runtime.h"

int main() {
	nope_init();
	{

	    nope_expect_char('S');

	    nope_expect_char('e');

	    nope_expect_char('n');

	    nope_expect_char('s');

	    nope_expect_char('o');

	    nope_expect_char('r');

	    nope_expect_char(' ');

	    nope_expect_char('v');

	    nope_expect_char('a');

	    nope_expect_char('l');

	    nope_expect_char('u');

	    nope_expect_char('e');

	    nope_expect_char(':');

	    nope_expect_char(' ');

	float reading;

	// TODO: Wczytaj zmienna FLOAT  ze stdout

	if (reading < 0.0) 
	{

	    THROWS('Sensor reading cannot be negative');

	}

	    return reading;

	}

	nope_cleanup();
	return 0;
}