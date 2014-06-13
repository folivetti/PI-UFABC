/* ListaNumero.java
 * Listar os N primeiros números naturais separados por vírgula 
 * Entrada: N (int) 
 * Saída: lista separado por vírgula 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class ListaNumero{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N;
    N = leitor.nextInt();
    for( int i = 0; i<=N; i++ ){
      System.out.print(i);
      if( i == N ) break;  // se só tem uma instrução não preciso de {}
      System.out.print(",");
    }
    System.out.println("");

	}
}

