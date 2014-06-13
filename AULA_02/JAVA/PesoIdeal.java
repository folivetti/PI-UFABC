/* Ex. 02: PesoIdeal.java
 * Verifique se a pessoa está acima do peso recomendado
 * Entrada: sexo (int), altura, peso (double)
 * Saída:  acima do peso (bool)
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class PesoIdeal{
	public static void main(String[] args) {
    int sexo;
    double peso, altura;
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Homem (0) ou mulher (1)?: ");
		sexo = leitor.nextInt();
    System.out.println("Digite seu peso e sua altura: ");
    peso = leitor.nextDouble();
    altura = leitor.nextDouble();

	}
}

