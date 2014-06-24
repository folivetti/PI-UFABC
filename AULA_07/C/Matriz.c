#include <stdio.h>
#include <stdlib.h>

int main(){

  double **A, **B, **C, **T, **D;
  double *x, *y;
  FILE * f;
  int n1,m1, n2,m2, n3, n4;
  int i,j;

  f = fopen("matriz1.csv","r");
  fscanf(f,"%d;%d",&n1,&m1);

  A = (double **) malloc(n1*sizeof(double *));
  for( i=0;i<n1;i++ ) A[i]=(double *) malloc(m1*sizeof(double));

  for( i=0;i<n1;i++ )
    for( j=0;j<m1;j++ )
      fscanf(f,"%lf;",&A[i][j]);
  fclose(f);

  f = fopen("matriz2.csv","r");
  fscanf(f,"%d;%d",&n2,&m2);

  B = (double **) malloc(n1*sizeof(double *));
  for( i=0;i<n2;i++ ) B[i] = (double *) malloc(m2*sizeof(double));

  for( i=0;i<n2;i++ )
    for( j=0;j<m2;j++ )
      fscanf(f,"%lf;",&B[i][j]);
  fclose(f);

  f = fopen("vetor1.csv","r");
  fscanf(f,"%d",&n3);
  x = (double *) malloc(n3*sizeof(double));
  for( i=0;i<n3;i++ ) fscanf(f,"%lf;",&x[i]);
  fclose(f);

  f = fopen("vetor2.csv","r");
  fscanf(f,"%d",&n4);
  y = (double *) malloc(n4*sizeof(double));
  for( i=0;i<n4;i++ ) fscanf(f,"%lf;",&y[i]);
  fclose(f);

  /* C = A + B */
  if( n1==n2 && m1==m2 ){
    C = (double **) malloc(n1*sizeof(double *));
    for( i=0;i<n1;i++ ) C[i] = (double *) malloc(m1*sizeof(double));

    for( i=0;i<n1;i++ )
      for( j=0;j<m1;j++ )
        C[i][j] = A[i][j] + B[i][j];

    f = fopen("somaMatriz.csv","w+");
    fprintf(f, "%d;%d\n", n1,m1);
    for( i=0;i<n1;i++ ){
      for( j=0;j<m1-1;j++ ){
        fprintf(f, "%lf;", C[i][j]);
      }
      fprintf(f, "%lf\n", C[i][j]);
    }
    fclose(f);
  }

  /* T = A' */
  T = (double **) malloc(m1*sizeof(double *));
  for( i=0;i<m1;i++ ) T[i] = (double *) malloc(n1*sizeof(double));

  for( i=0;i<n1;i++ )
    for( j=0;j<m1;j++ )
      T[j][i] = A[i][j];

  f = fopen("transposta.csv","w+");
  fprintf(f, "%d;%d\n", m1,n1);
  for( i=0;i<m1;i++ ){
    for( j=0;j<n1-1;j++ ){
      fprintf(f, "%lf;", T[i][j]);
    }
    fprintf(f, "%lf\n", T[i][j]);
  }
  fclose(f);

  /* x o y = D */
  D = (double **) malloc(n3*sizeof(double *));
  for( i=0;i<n3;i++ ) D[i] = (double *) malloc(n4*sizeof(double));

  for( i=0;i<n3;i++ )
    for( j=0;j<n4;j++ )
      D[i][j] = x[i]*y[j];

  f = fopen("produtoexterno.csv","w+");
  fprintf(f, "%d;%d\n", n3,n4);
  for( i=0;i<n3;i++ ){
    for( j=0;j<n4-1;j++ ){
      fprintf(f, "%lf;", D[i][j]);
    }
    fprintf(f, "%lf\n", D[i][j]);
  }
  fclose(f);

  return 0;
}
