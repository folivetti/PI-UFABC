/* SomaDigitos.java
 * Somar os dígitos de um número n 
 * Entrada: n (int) 
 * Saída: soma (int) 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class SomaDigitos{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n,soma;
    n = leitor.nextInt();
    soma = 0;

    while( n!=0 ){	// faço até chegar em 0
      soma += n%10;	// retiro um dígito
      n/=10;		// reduzo o número
    }
    System.out.println(soma);
  }
}

