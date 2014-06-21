#include <stdio.h>

int main( ){
  float x,y,z;

  printf("Digite os 3 números: ");
  scanf("%f %f %f",&x,&y,&z);

  if( x<y && x<z ){
    if( y<z ){
      printf("%f %f %f\n",x,y,z);
    }else{
      printf("%f %f %f\n",x,z,y);
    }
  }else if( y<z ){
    if( x<z ){
      printf("%f %f %f\n",y,x,z);
    }else{
      printf("%f %f %f\n",y,z,x);
    }
  }else{
    if( x<y ){
      printf("%f %f %f\n",z,x,y);
    }else{
      printf("%f %f %f\n",z,y,x);
    }
  }

  return 0;
}
