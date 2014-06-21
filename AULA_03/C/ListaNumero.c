#include <stdio.h>

int main(){
  int i,n;
  printf("N = ");
  scanf("%d",&n);

  for( i=1;i<=n;i++ ){
    printf("%d",i);
    if( i==n )
      break;
    printf(", ");
  }
  printf("\n");

  return 0;
}
