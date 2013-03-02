#include "mylib.h"
#define TRUE (1)
#define FALSE (0)

int printerS(char* aS) {
  return   printf("%s\n", aS);
}

int hello() {
  return   printerS("Hello");
}

int printerI(int aI) {
  return   printf("%d\n", aI);
}

int main() {
  hello();
  printerI(1);
  printerI(2);
  return   printerS("Hey apple");
}

