#include "nope_runtime.h"

int main() { int main() {
     for (int i = 0; i < 10; i += 1)  {
     if (i < 8 && i != 2)  {
         if (!(i == 0 || i == 1)) {
             printf("[NOPE] Failed test on condition: CHECK(i == 0 || i == 1)\n");
             return 1;
         }
   
 }
     else  {
     testowa_funkcja(i, 100);
 }
 }
 return 0;
}