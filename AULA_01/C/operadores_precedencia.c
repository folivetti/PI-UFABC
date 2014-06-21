#include <stdio.h>

int main( ){

  int a,b,c,d;
  a = 20;
  b = 10;
  c = 15;
  d = 5;

  printf("%d\n", a+b*c-a+b*d ); // qual o resultado?
  printf("%d\n", a + (b*c) - a + (b*d) ); // mais claro
  int e;

  e = (a+b)*c/d;
  printf("Valor de (a+b)*c/d = %d\n",e);

  e = ((a+b)*c)/d;
  printf("Valor de ((a+b)*c)/d = %d\n",e);

  e = (a+b)*(c/d);
  printf("Valor de (a+b)*(c/d) = %d\n",e);

  e = a+(b*c/d);
  printf("Valor de a+(b*c/d) = %d\n",e);

  return 0;
}
