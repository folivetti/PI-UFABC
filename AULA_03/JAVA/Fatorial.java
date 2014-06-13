/* Fatorial.java
 * Calcular o fatorial de um número N
 * Entrada: N (int) 
 * Saída: N! 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class Fatorial{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N, fatorial;
    N = leitor.nextInt();
    fatorial = 1;  // começar do 1 para não multiplicar por 0
    for( int i = 1; i<=N; i++ ){
      fatorial = fatorial * i;
    }
    System.out.println(fatorial);

	}
}

