#include <stdio.h>

int main(){
  char s[256];
  char * c;
  scanf("%[^\n]s",s);

  c = s;

  while( *c!='\0' ){
    switch(*c){
      case 'A': case 'a': *c='4';break;
      case 'C': case 'c': *c='(';break;
      case 'E': case 'e': *c='3';break;
      case 'G': case 'g': *c='6';break;
      case 'H': case 'h': *c='#';break;
      case 'I': case 'i': *c='1';break;
      case 'O': case 'o': *c='0';break;
      case 'S': case 's': *c='$';break;
      case 'T': case 't': *c='7';break;
      case 'X': case 'x': *c='%';break;
    }
    c++;
  }
  printf("%s\n",s);

  return 0;
}
