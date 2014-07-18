/* Pascal.java
 * Imprimir o triângulo de pascal até a linha N
 * Entrada: N (int)
 * Saída:  --
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

public class PascalAlt {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

		for( int i=1; i<=N; i++ ){ // i e m vão existir apenas durante o for
			int m = 1;   // começando sempre do 1
			System.out.print(m + " ");
			for( int j=2;j<=i; j++ ){ // a linha vai ter i elementos
				m = m*(i-(j-1))/(j-1);   // valor anterior multiplicado por (i-j)/j
				System.out.print(m+ " ");
			}
			System.out.println();
		}
	}
}

