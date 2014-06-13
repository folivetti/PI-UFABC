/* MediaPonderada.java
 * Implementação de algoritmo para cálculo de
 * média aritmética entre dois números com peso w e (1-w) 
 * respectivamente. Qualquer valor w fora do esperado, deve 
 * assumir o valor padrão w = 0.5
 * Entrada: double x, y, w
 * Saída: Média m
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class MediaPonderada{
	public static void main( String[] args ){
		double x,y, w; // entrada
		double m;   // media
		Scanner leitor = new Scanner(System.in); // para pegar entrada do usuário
		System.out.print("Entre com o valor de x:");
		x = leitor.nextDouble();
		System.out.print("Entre com o valor de y:");
		y = leitor.nextDouble();
		System.out.print("Entre com o valor de w (0<=w<=1): ");
		w = leitor.nextDouble();

		if( w < 0.0 || w > 1.0 ){ // se w está fora da faixa, assume valor padrão
			w = 0.5;
		}

		m = ( w*x + (1-w)*y ) ;

		System.out.println("A média ponderada entre "+x+" e "+y+" é: "+m);
		
	}
}
