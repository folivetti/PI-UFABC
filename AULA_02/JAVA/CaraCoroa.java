/* Ex. 01: CaraCoroa.java
 * Dada duas entradas nos valores 0 (cara), 1 (coroa)  
 * sortear o resultado e mostrar o resultado
 * Entrada: jogada (int)
 * Saída:  ganhou ou perdeu
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 *
 *
 * Utilize a função Math.random() que retorna
 * um valor aleatório entre 0 e 1 para sortear
 * o resultado.
 * Assuma valores menores que 0.5 como cara
 * e maiores ou igual como coroa.
 */

import java.util.Scanner;

class CaraCoroa{
	public static void main(String[] args) {
    int jogada, sorteio;
    double prob;
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Cara (0) ou coroa (1)?: ");
		jogada = leitor.nextInt();

	}
}

