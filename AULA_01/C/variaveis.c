#include <stdio.h>
#include <limits.h>

int main( ){

  int i;
  unsigned int ui;
  i = 10;
  ui = -4; // ele é unsigned, o valor será outro
  printf("Eu sou o tipo int, tenho %d bytes e posso variar entre %d e %d, estou guardando o valor %d\n", sizeof(i),INT_MIN,INT_MAX,i);
  printf("Eu sou o tipo unsigned int, tenho %d bytes e posso variar entre %u e %u, estou guardando o valor %u\n", sizeof(ui),0,UINT_MAX,ui);

  short s;
  s = 10;
  printf("Eu sou o tipo short, tenho %d bytes e posso variar entre %d e %d, estou guardando o valor %d\n", sizeof(s),SHRT_MIN,SHRT_MAX,s);

  long l;
  l = 2147483;
  printf("Eu sou o tipo long, tenho %d bytes e posso variar entre %ld e %ld, estou guardando o valor %ld\n", sizeof(l),LONG_MIN,LONG_MAX,l);

  float f;
  f = 1.3;
  printf("Eu sou o tipo float, tenho %d bytes e estou guardando o valor %f\n", sizeof(f),f);

  double d;
  d = 1.3;
  printf("Eu sou o tipo double, tenho %d bytes e estou guardando o valor %lf\n", sizeof(d),d);

  char c;
  c = 'A';
  printf("Eu sou o tipo char, tenho %d bytes e posso variar entre %d e %d, estou guardando o valor %c\n", sizeof(c),CHAR_MIN,CHAR_MAX,c);

  return 0;
}
