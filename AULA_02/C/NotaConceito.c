#include <stdio.h>

int main(){

  float nota, limiar;
  int faltas, maxFaltas;

  printf("Digite a nota e o limiar: ");
  scanf("%f %f",&nota,&limiar);
  printf("Digite as faltas e o limiar: ");
  scanf("%d %d",&faltas,&maxFaltas);

  if( faltas > maxFaltas ){
    printf("O\n");
  }else{
    if( nota > limiar ){
      printf("A\n");
    }else{
      printf("R\n");
    }
  }

  return 0;
}
