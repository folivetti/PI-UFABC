/* AnoBissexto.java
 * Determinar se um ano é bissexto
 * Entrada: ano (int)
 * Saída: se é bissexto ou não
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */



import java.util.Scanner;

class AnoBissexto{
	public static void main(String[] args) {
		int ano;	
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Qual ano?: ");
		ano = leitor.nextInt();
		
		if( ano%400 == 0 || (ano%4==0 && ano%100!=0) ){
			System.out.println("É bissexto");
		}else{
			System.out.println("Não é um bissexto");
		}

	}
}

