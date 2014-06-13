/* EX. 06: BoisVacas.java
 * sortear um número aleatório
 * de 4 dígitos. A cada tentativa
 * do usuário adivinhar, será contabilizado
 * quantos dígitos ele acertou
 * na ordem correta (bois) e quantos ele
 * acertou fora da ordem (vaca).
 *
 * Entrada: n (int) número de 4 dígitos 
 * Saída: nBois, nVacas (int)
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 *
 * DICA:
 * Use vetores de tal forma que possa
 * adaptar o jogo para N dígitos.
 */

import java.util.Scanner;
import java.util.Random;

class BoisVacas{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int [] segredo = new int[4];

		Random rnd = new Random();
		int n = rnd.nextInt(10000); // número com 4 dígitos, de 0 até 9999
		for( int i=3;i>=0;i-- ){  // vamos colocar o número em um vetor
			// faça!
		}


	}
}

