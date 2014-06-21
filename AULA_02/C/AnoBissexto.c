#include <stdio.h>

int main(){

  int ano;
  printf("Qual é o ano? ");
  scanf("%d",&ano);

  if ( !(ano%400) || (!(ano%4) && (ano%100)) ){
    printf("É bissexto\n");
  }else{
    printf("Não é bissexto\n");
  }

  return 0;
}
