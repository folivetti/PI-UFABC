#include <stdio.h>

int main(){
  int jogador1, jogador2;

  printf("Pedra (0), Papel (1), Tesoura (2): ");
  scanf("%d",&jogador1);
  printf("Pedra (0), Papel (1), Tesoura (2): ");
  scanf("%d",&jogador2);

  if( jogador1 > jogador2 || jogador1==0 && jogador2 == 2 ){
    printf("Jogador1 venceu\n");
  }else if( jogador2 > jogador1 || jogador2 == 0 && jogador1 == 2 ){
    printf("Jogador2 venceu\n");
  }else{
    printf("Empate\n");
  }

  return 0;

}
