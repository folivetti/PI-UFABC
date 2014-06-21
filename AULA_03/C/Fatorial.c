#include <stdio.h>

int main(){
  long n, fat;
  long i;

  printf("Fatorial de? ");
  scanf("%ld",&n);

  fat = 1;
  for( i=1;i<=n;++i )
    fat *= i;
  printf("%ld\n",fat);
  
  return 0;
}
