#include <stdio.h>

int main() {
  float x,y,z;

  printf("Entre com as 3 dimensões: ");
  scanf("%f %f %f",&x,&y,&z);

  if( x+y>z && x+z>y && z+y>x ){
    if( x==y && y==z ){
      printf("Equilatero\n");
    }else if( x==y || y==z || x==z ){
      printf("Isóceles\n");
    }else{
      printf("Escaleno\n");
    }
  }else{
    printf("Não é triangulo\n");
  }

  return 0;
}
