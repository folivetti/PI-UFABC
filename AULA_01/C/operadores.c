// compilar com: -lm
#include <stdio.h>
#include <math.h>

int main( ){

  printf("Números inteiros:\n");
  int x,y;
  x=10;
  y=3;
  printf("%d + %d = %d\n",x,y,x+y);
  printf("%d - %d = %d\n",x,y,x-y);
  printf("%d * %d = %d\n",x,y,x*y);
  printf("%d / %d = %d\n",x,y,x/y);
  printf("%d^%d = %d\n",x,y,pow(x,y));

  printf("%d == %d?  %d\n",x,y,x==y);
  printf("%d != %d?  %d\n",x,y,x==y);
  printf("%d > %d?  %d\n",x,y,x>y);
  printf("%d < %d?  %d\n",x,y,x<y);
  printf("%d >= %d?  %d\n",x,y,x>=y);
  printf("%d <= %d?  %d\n",x,y,x<=y);

  printf("Números ponto flutuante:\n");
  float xf,yf;
  xf=10.0;
  yf=3.0;
  printf("%f + %f = %f\n",xf,yf,xf+yf);
  printf("%f - %f = %f\n",xf,y,xf-yf);
  printf("%f * %f = %f\n",xf,y,xf*yf);
  printf("%f / %f = %f\n",xf,y,xf/yf);
  printf("%f^%f = %f\n",xf,yf,pow(xf,yf));

  printf("Operações booleanas: \n");
  printf(" 5>2 E 5<10: %d\n",(5>2)&&(5<10));
  printf(" 5>2 OU 5<3: %d\n",(5>2)&&(5<10));
  printf(" 5>2 E NÃO 5<3: %d\n", (5>2) && (!(5<3)));


  return 0;
}
