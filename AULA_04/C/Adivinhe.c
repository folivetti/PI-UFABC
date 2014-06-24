#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main( ){
  int x, n;
  srand(time(NULL));
  x = 1 + 99*(rand()/(float)RAND_MAX);

  while( 1 ){
    printf("n = ");
    scanf("%d",&n);
    if( n==x ){
      printf("Acertou\n");
      break;
    }else if( n>x ){
      printf("O número é menor\n");
    }else{
      printf("O número é maior\n");
    }
  }
  return 0;
}
