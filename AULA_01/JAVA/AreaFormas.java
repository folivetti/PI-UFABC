/* AreaFormas.java
 * Implementação de algoritmo para cálculo da
 * área e volume de diferentes formas geométricas
 * Entrada: dimensões da forma
 * Saída: área ou volume
 *
 * Author: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
*/

/* Ex. 05: Area e Volume das Formas
 * Complete o código a seguir para, capturar a dimensão de diferentes formas 
 * e retornar a área ou volume dela (dependendo da forma).
 * É interessante, antes de escrever o código, 
 * escrevar um breve passo a passo do que será feito, em forma de comentários.
 * Nesse código isso ainda não foi feito! Mas já foi dado um exemplo para o retângulo.
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class AreaFormas{
	public static void main( String[] args ){
		double area, volume;    // todas as formas podem utilizar essas variáveis
		double altura, largura; // declare as variaveis a serem utilizadas

		Scanner leitor = new Scanner(System.in); 
		System.out.println("Entre com a altura do retângulo: "); // escreva pedindo a altura
		altura = leitor.nextDouble();
		System.out.println("Entre com a largura do retângulo: "); // escreva pedindo a largura
		largura = leitor.nextDouble();

		area = altura*largura;
		System.out.println("Area do retângulo é "+area); // mostra o resultado

		// triângulo
		
		// circunferência

		// Cubo

		// Esfera

		// Pirâmide
		
	}
}
