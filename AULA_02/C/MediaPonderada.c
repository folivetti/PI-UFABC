#include <stdio.h>

int main ( ){

  float x,y,w,media;

  printf("Entre com x, y e w: ");
  scanf("%f %f %f",&x,&y,&w);

  media = w*x + (1-w)*y;
  printf("A média é %f\n", media);

  return 0;
}
