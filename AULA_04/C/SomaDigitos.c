#include <stdio.h>

int main(){
  int n,soma;

  printf("n = ");
  scanf("%d",&n);
  soma = 0;

  while( n!=0 ){
    soma += n%10;
    n /= 10;
  }
  printf("%d\n", soma);

  return 0;
}
