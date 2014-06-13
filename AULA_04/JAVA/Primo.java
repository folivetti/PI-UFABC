/* Primo.java
 * Verificar se um número n é primo 
 * Entrada: n (int) 
 * Saída: é primo ou não 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Primo{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n;
    n = leitor.nextInt();
    int i = n-1;
    boolean primo = true; //vamos assumir que é primo

    while( i>1 ){	// não verifica o 1, pois vai ser divisível
      if( n%i == 0 ){
        primo = false;    // se achar um número que n é divisível, não precisa continuar
        break;
      }
      i--;
    }
    if( primo ){
      System.out.println("É primo");
    }else{
      System.out.println("Não é primo");
    }
  }
}

