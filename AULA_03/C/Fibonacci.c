#include <stdio.h>

int main(){
  long N, fib, fibAnt, i, tmp;

  printf("Entre com N: ");
  scanf("%ld",&N);

  fib = 1;
  fibAnt = 0;

  if( N==0 )
    printf("0\n");
  else{
    for( i=2;i<=N;i++ ){
      tmp = fib+fibAnt;
      fibAnt = fib;
      fib = tmp;
    }
    printf("%ld\n",fib);
  }

  return 0;
}
