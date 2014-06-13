/* DivideDigitos.java
 * Dado um número x, determinar a divisão
 * desse número de d em d dígitos
 * que forme uma sequência de números
 * em ordem crescente.
 *
 * Entrada: x (int) 
 * Saída: lista de inteiros
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class DivideDigitos{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		long x;
		x = leitor.nextInt();


		// primeiro determine o número de dígitos
		//
		// para todas as divisões possíveis, teste cada uma se
		// ela forma números em ordem crescente.
		//
		// Dica: o i-gésimo dígito de uma divisão de d em d é
		// 10^digitos-(i-1)*d

	}
}
