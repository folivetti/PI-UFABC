#include <stdio.h>

int main(){

  float nota, limiar;
  int faltas, maxFaltas;
  int nAlunos, i;

  printf("Digite o limiar de notas: ");
  scanf("%f",&limiar);
  printf("Digite o limiar de faltas: ");
  scanf("%d",&maxFaltas);
  printf("Quantos alunos? ");
  scanf("%d",&nAlunos);

  for( i=1;i<=nAlunos;i++ ){
    printf("Digite a nota: ");
    scanf("%f",&nota);
    printf("Digite as faltas:");
    scanf("%d",&faltas);

    printf("Aluno %d conceito ",i);

    if( faltas > maxFaltas ){
      printf("O\n");
    }else{
      if( nota > limiar ){
        printf("A\n");
      }else{
        printf("R\n");
      }
    }
  }

  return 0;
}
