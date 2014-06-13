/* Dec2Bin.java
 * Converter um número decimal 
 * para seu equivalente em binário 
 * Entrada: n (int) 
 * Saída: bin 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Dec2Bin{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n,bin;
    n = leitor.nextInt();
    int i = 1;
    bin = 0;

    while( n != 0 ){
      bin += (n%2)*i;  //cada bit extraído vai ocupar um dígito de um número decimal
      i *= 10;  // para isso multiplico ele por potências de dez
      n /= 2;
    }
    System.out.println(bin);

  }
}

