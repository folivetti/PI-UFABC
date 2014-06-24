#include <stdio.h>

int main(){
  int n,i,primo;

  printf("n = ");
  scanf("%d",&n);
  i = n-1;
  primo=1;

  while( i>1 ){
    if( !(n%i) ){
      primo = 0;
      break;
    }
    --i;
  }
  if( primo )
    printf("É primo!\n");
  else
    printf("Não é primo!\n");

  return 0;
}
