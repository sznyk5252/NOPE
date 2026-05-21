#include "nope_runtime.h"

int main(){
	nope_init();
	if (None) 
	{
		THROWS('The program threw an exception before terminating');
	}
	nope_cleanup();
	return 0;
}