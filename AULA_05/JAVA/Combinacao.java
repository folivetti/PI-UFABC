/* Ex. 05: Combinacao.java
 * Dado m e n, imprimir todas
 * as combinações de tamanho m
 * dos inteiros de 0 a n-1 em ordem
 * crescente e sem repetição de números.
 *
 * Entrada: m,n (int) 
 * Saída: combinações 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Combinacao{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int m,n;
		m = leitor.nextInt();
		n = leitor.nextInt();

		int [] comb = new int[m]; // as combinações vão ter tamanho m

		for( int i=0;i<m;++i ){ // primeira combinação trivial: 0..m-1
			comb[i]=i;
			System.out.print(i+" ");
		}
		System.out.println("");


	}
}

