#include <stdio.h>

int main(){
  int i,n,bin;

  i=1;
  bin=0;
  printf("n=");
  scanf("%d",&n);
  while( n!=0 ){
    bin += (n%2)*i;
    i *= 10;
    n /= 2;
  }

  printf("%d\n", bin);

  return 0;
}
