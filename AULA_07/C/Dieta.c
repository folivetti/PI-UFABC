#include <stdio.h>
#include <stdlib.h>

int main(){

  int A[3][7];
  double mediaDia[7], mediaRefeicao[3];
  FILE * f;
  int n,m;
  int i,j;
  int maior, maiorDia;

  n=3;
  m=7;

  f = fopen("calorias.csv","r");

  for( i=0;i<n;i++ )
    for( j=0;j<m;j++ )
      fscanf(f,"%d;",&A[i][j]);
  fclose(f);

  for( i=0;i<n;i++ ) mediaRefeicao[i]=0.0;
  for( i=0;i<m;i++ ) mediaDia[i]=0.0;

  maior = A[0][0];
  maiorDia = 0;
  for( i=0;i<n;i++ ){
    for( j=0;j<m;j++ ){
      mediaRefeicao[i]+=(double)A[i][j]/m;
      mediaDia[j]+=(double)A[i][j]/n;
      if( A[i][j] > maior ){
        maior = A[i][j];
        maiorDia = j;
      }
    }
  }

  printf("\tSeg.\tTer.\tQua.\tQui.\tSex.\tSab.\tDom.\tMedia\n");
  printf("Manhã\t");
  for( i=0;i<m;i++ ) printf("%d\t",A[0][i]);
  printf("%lf\n", mediaRefeicao[0]);
  printf("Tarde\t");
  for( i=0;i<m;i++ ) printf("%d\t",A[1][i]);
  printf("%lf\n", mediaRefeicao[1]);
  printf("Noite\t");
  for( i=0;i<m;i++ ) printf("%d\t",A[2][i]);
  printf("%lf\n", mediaRefeicao[2]);
  printf("Média\t");
  for( i=0;i<m;i++ ) printf("%.2lf\t",mediaDia[i]);
  printf("\n");

  printf("Dia de maior refeição: %d\n",maiorDia+1);

  for( i=0;i<m;i++ )
    if( A[0][i] > mediaRefeicao[0] || A[1][i] > mediaRefeicao[1] || A[2][i] > mediaRefeicao[2] )
      printf("No dia %d, comeu acima da média\n",i+1);

  return 0;
}
