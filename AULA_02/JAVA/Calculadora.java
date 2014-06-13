/* Ex. 06: Calculadora.java
 * Dados dois operandos e um operador, realizar a operação correspondente
 * Entrada: x,y (double), op (char)
 * Saída: resultado da operação 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 *
 *
 * Dica: utilize o tipo char para capturar o operador
 * char op;
 * op = leitor.next().charAt(0);
 * if( op == '+' ) // faça operação de soma
 */

import java.util.Scanner;

class Calculadora{
	public static void main(String[] args) {
		double x,y;
    char op;
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Digite os operandos: ");
		x = leitor.nextDouble();
    y = leitor.nextDouble();
		System.out.println("Digite a operação: ");
    op = leitor.next().charAt(0);


	}
}

