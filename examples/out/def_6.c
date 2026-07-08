#include "nope_runtime.h"

float apply_discount(float base_price, float discount) 
{

    nope_match_endl();
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
nope_expect_char(''A'');
nope_expect_char(''p'');
nope_expect_char(''p'');
nope_expect_char(''l'');
nope_expect_char(''y'');
nope_expect_char(''i'');
nope_expect_char(''n'');
nope_expect_char(''g'');
nope_expect_char('' '');
nope_expect_char(''d'');
nope_expect_char(''i'');
nope_expect_char(''s'');
nope_expect_char(''c'');
nope_expect_char(''o'');
nope_expect_char(''u'');
nope_expect_char(''n'');
nope_expect_char(''t'');
nope_expect_char(''.'');
nope_expect_char(''.'');
nope_expect_char(''.'');
    nope_match_endl();
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
nope_match_endl();
    nope_match_endl();
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    nope_expect_char(' ');
    return (base_price - ((base_price * discount)));

}



int main(){
	nope_init();
	nope_snippet_length = 100;
	nope_expect_eof();
	nope_cleanup();
	return 0;
}