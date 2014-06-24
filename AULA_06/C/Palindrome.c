#include <stdio.h>
#include <string.h>

int main(){
  char a[256];
  int i, len, palindrome;
  scanf("%s",a);

  palindrome = 1;

  len = strlen(a);
  for( i=0;i<len;i++ ){
    if( a[i] != a[len-i-1] ){
      palindrome = 0;
      break;
    }
  }
  if( palindrome )
    printf("É palindrome\n");
  else
    printf("Nao é palindrome\n");

  return 0;
}
