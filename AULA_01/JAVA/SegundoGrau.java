/* SegundoGrau.java
 * Implementação de algoritmo para cálculo da
 * eq. ax^2 + bx + c = 0
 * Entrada: a, b, c (quais os tipos?)
 * Saída: x1, x2 (quais os tipos?)
 */

/* Ex. 01: Equacao Segundo Grau
 * Complete o código a seguir para, dado os valores a, b, c 
 * calcular o valor de x1 e x2.
 * É interessante, antes de escrever o código, 
 * escrevar um breve passo a passo do que será feito, em forma de comentários.
 * Nesse código isso já foi feito para você!
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class SegundoGrau{
	public static void main( String[] args ){
		double a,b,c; // declare as variaveis a serem utilizadas
		double x1, x2;
		double delta;
		Scanner leitor = new Scanner(System.in); // para pegar entrada do usuário

		System.out.println("Entre com os valores de a, b e c: "); // escreva pedindo para o usuário entrar com a, b, c
		a = leitor.nextFloat(); // capture tais valores
		b = leitor.nextFloat();
		c = leitor.nextFloat();

		// x = -b +/- raiz(b^2 - 4ac)  / 2a
		delta = Math.sqrt( Math.pow(b,2) - (4*a*c) );

		x1 = (-b + delta)/(2*a); // calcule o valor de x1
		x2 = (-b - delta)/(2*a); // calcule o valor de x2
		// dica: use uma variavel extra para pre-calcular parte da solucao
		
		System.out.println("As soluções para a eq. = "+x1+ " e " + x2); // imprima na tela
		
	}
}
