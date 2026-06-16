#include "nope_runtime.h"

float get_sensor_data() 
{

nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
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
nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
float reading;
reading = nope_read_float();
nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
if (reading < 0.0) 
{
	nope_expect_char('S');
	nope_expect_char('e');
	nope_expect_char('n');
	nope_expect_char('s');
	nope_expect_char('o');
	nope_expect_char('r');
	nope_expect_char(' ');
	nope_expect_char('r');
	nope_expect_char('e');
	nope_expect_char('a');
	nope_expect_char('d');
	nope_expect_char('i');
	nope_expect_char('n');
	nope_expect_char('g');
	nope_expect_char(' ');
	nope_expect_char('c');
	nope_expect_char('a');
	nope_expect_char('n');
	nope_expect_char('n');
	nope_expect_char('o');
	nope_expect_char('t');
	nope_expect_char(' ');
	nope_expect_char('b');
	nope_expect_char('e');
	nope_expect_char(' ');
	nope_expect_char('n');
	nope_expect_char('e');
	nope_expect_char('g');
	nope_expect_char('a');
	nope_expect_char('t');
	nope_expect_char('i');
	nope_expect_char('v');
	nope_expect_char('e');
}
nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char('\n');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
nope_expect_char(' ');
    return reading;

}



int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_eof();
	nope_cleanup();
	return 0;
}