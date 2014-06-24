#include <stdio.h>

int main ( ){
  int n,m,r;
  printf("Entre com m e n: ");
  scanf("%d %d",&m,&n);
  r = m%n;

  while( r!=0 ){
    m = n;
    n = r;
    r = m%n;
  }
  printf("MDC = %d\n",n);

  return 0;

}
