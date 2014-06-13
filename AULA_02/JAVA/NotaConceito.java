/* NotaConceito.java
 * Dada uma nota x, escrever o conceito correspondente
 * Entrada: faltas, MaxFaltas (inteiros) e nota, limiar (double)
 * Saída:  "A", "R" ou "O"
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class NotaConceito{
	public static void main(String[] args) {
		int faltas, MaxFaltas;
		double nota, limiar;
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Digite quantas faltas o aluno teve: ");
		faltas = leitor.nextInt();
		System.out.println("Digite o máximo de faltas que o aluno pode ter: ");
		MaxFaltas = leitor.nextInt();

		System.out.println("Digite a nota que o aluno tirou: ");
		nota = leitor.nextDouble();
		System.out.println("Digite a nota mínima para aprovação: ");
		limiar = leitor.nextDouble();

		if( faltas > MaxFaltas ){
			System.out.println("O");
		}else{
			if( nota >= limiar ){
				System.out.println("A");
			}else{
				System.out.println("R");
			}
		}

	}
}

