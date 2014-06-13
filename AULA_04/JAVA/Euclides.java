/* Euclides.java
 * Calcular o MDC entre m e n 
 * utilizando o algoritmo de Euclides
 * Entrada: n,m (int) 
 * Saída: mdc 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Euclides{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n,m;
    n = leitor.nextInt();
    m = leitor.nextInt();
    int r = m%n;

    while( r != 0 ){
      m = n;
      n = r;
      r = m%n;
    }
    System.out.println("MDC = "+n);

  }
}

