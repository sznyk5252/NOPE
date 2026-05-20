#include "nope_runtime.h"

int main() {
	{
	    if (reading < 0.0) 	{
	    THROWS('Sensor reading cannot be negative');
	}
	    return reading;
	}
	return 0;
}