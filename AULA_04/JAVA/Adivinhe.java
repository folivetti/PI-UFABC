/* Adivinhe.java
 * Sorteie um número de 1 até 100 
 * e peça para o usuário adivinhar
 * dando dicas se é > ou <
 * Entrada: n (int) 
 * Saída: nada 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;
import java.util.Random;

class Adivinhe{
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Random rnd = new Random();
    int n;
    int x = rnd.nextInt(100) + 1;
    while( true ){
      n = leitor.nextInt();
      if( n > x ){
        System.out.println("O número é menor!");
      }else if( n < x ){
        System.out.println("O número é maior!");
      }else{
        System.out.println("Acertou!");
        break;
      }
    }
  }
}
