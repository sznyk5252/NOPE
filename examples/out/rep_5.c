#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	for (int j = 10; ((-1) > 0 ? (j < 0) : (j > 0)); j += (-1)) 
	{
		nope_expect_char(''C'');
		nope_expect_char(''o'');
		nope_expect_char(''u'');
		nope_expect_char(''n'');
		nope_expect_char(''t'');
		nope_expect_char(''d'');
		nope_expect_char(''o'');
		nope_expect_char(''w'');
		nope_expect_char(''n'');
		nope_expect_char('':'');
		nope_expect_char('' '');
		nope_expect_int(j);
		nope_match_endl();
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}