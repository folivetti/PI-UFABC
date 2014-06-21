#include <stdio.h>

int main(){
  int i;

  for(i=1;i<=100;i++){
    if( !(i%15) )
      printf("Fizzbuzz\n");
    else if(!(i%3))
      printf("Fizz\n");
    else if(!(i%5))
      printf("Buzz\n");
    else
      printf("%d\n",i);
  }
  return 0;
}
