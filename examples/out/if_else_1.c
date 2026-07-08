#include "nope_runtime.h"

int main(){
	nope_init();
	nope_snippet_length = 100;
	int score;
	score = nope_read_int();
	    nope_match_endl();
	if (score >= 50) 
	{
		nope_expect_char(''P'');
		nope_expect_char(''a'');
		nope_expect_char(''s'');
		nope_expect_char(''s'');
		nope_expect_char(''e'');
		nope_expect_char(''d'');
		nope_match_endl();
	}
	    else 
	{
		nope_expect_char(''F'');
		nope_expect_char(''a'');
		nope_expect_char(''i'');
		nope_expect_char(''l'');
		nope_expect_char(''e'');
		nope_expect_char(''d'');
		nope_match_endl();
	}
	nope_expect_eof();
	nope_cleanup();
	return 0;
}