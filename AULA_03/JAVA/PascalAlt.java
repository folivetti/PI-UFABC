/* Pascal.java
 * Imprimir o tri�ngulo de pascal at� a linha N
 * Entrada: N (int)
 * Sa�da:  --
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

public class PascalAlt {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

		for( int i=1; i<=N; i++ ){ // i e m v�o existir apenas durante o for
			int m = 1;   // come�ando sempre do 1
			System.out.print(m + " ");
			for( int j=2;j<=i; j++ ){ // a linha vai ter i elementos
				m = m*(i-(j-1))/(j-1);   // valor anterior multiplicado por (i-j)/j
				System.out.print(m+ " ");
			}
			System.out.println();
		}
	}
}

