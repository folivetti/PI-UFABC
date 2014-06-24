#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

  FILE * f;
  int n, i, j,k;
  float * lista;
  int contaPos, contaNeg;
  float * listaPos, * listaNeg;

  f = fopen("lista.csv","r");
  fscanf(f,"%d\n",&n);
  lista = (float *) malloc(n*sizeof(float));

  for(i=0;i<n;i++){
    fscanf(f,"%f;",&lista[i]);
  }
  fclose(f);

  contaPos=0;
  contaNeg=0;
  for( i=0;i<n;i++ ){
    if( lista[i]>0 )
      ++contaPos;
    if( lista[i]<0 )
      ++contaNeg;
  }
  listaPos = (float *) malloc(contaPos*sizeof(float));
  listaNeg = (float *) malloc(contaNeg*sizeof(float));
  
  j=0;
  k=0;
  for( i=0;i<n;i++ ){
    if( lista[i]>0 )
      listaPos[j++]=lista[i];
    if( lista[i]<0 )
      listaNeg[k++]=lista[i];
  }

  for( i=0;i<contaPos;i++ )
    printf("%f ",listaPos[i]);
  printf("\n");
  for( i=0;i<contaNeg;i++ )
    printf("%f ",listaNeg[i]);
  printf("\n");

  free(lista);
  free(listaPos);
  free(listaNeg);

  return 0;
}
