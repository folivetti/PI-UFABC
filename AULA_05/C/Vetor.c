#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

  FILE * f;
  int n, i;
  float * lista;
  float media, var, std;
  float maior, menor;
  int maiorIdx, menorIdx;
  float x;

  f = fopen("lista.csv","r");
  fscanf(f,"%d\n",&n);
  lista = (float *) malloc(n*sizeof(float));

  for(i=0;i<n;i++){
    fscanf(f,"%f;",&lista[i]);
  }
  fclose(f);

  media = 0.0;
  for( i=0;i<n;i++ )
    media += lista[i];
  media /= n;

  var = 0.0;
  for( i=0;i<n;i++ )
    var += (lista[i]-media)*(lista[i]-media);
  var /= n;
  std = sqrt(var);

  printf("%f %f %f\n",media,var,std);

  maior = lista[0];
  maiorIdx = 0;
  menor = lista[0];
  menorIdx = 0;

  for( i=1;i<n;i++ ){
    if( lista[i] > maior ){
      maior = lista[i];
      maiorIdx = i;
    }
    if( lista[i] < menor ){
      menor = lista[i];
      menorIdx = i;
    }
  }
  printf("(%f, %d); (%f, %d)\n",maior,maiorIdx,menor,menorIdx);

  printf("Digite um número: ");
  scanf("%f",&x);
  for( i=0;i<n;i++ )
    if( lista[i]==x )
      break;
  if( i<n )
    printf("Encontrado em %d!\n",i);
  else
    printf("Não encontrado!\n");


  free(lista);

  return 0;
}
