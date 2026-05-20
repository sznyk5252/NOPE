#include "nope_runtime.h"

int main() {
	nope_init();
	int x;

	// TODO: Wczytaj zmienna INT ze stdout

	int y;

	// TODO: Wczytaj zmienna INT ze stdout

	if (!((x   y) == 10)) {

	            printf("[NOPE] Failed test on condition: CHECK((x   y) == 10)\n");

		return 1;

		}

	nope_cleanup();
	return 0;
}