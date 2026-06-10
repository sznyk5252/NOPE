#include "nope_runtime.h"

int main(){
	nope_init();
	nope_match("[0-9]+");
	nope_cleanup();
	return 0;
}