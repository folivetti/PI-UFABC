/* SegundoGrau.java
 * Implementa��o de algoritmo para c�lculo da
 * eq. ax^2 + bx + c = 0
 * Entrada: a, b, c (quais os tipos?)
 * Sa�da: x1, x2 (quais os tipos?)
 */

/* Ex. 01: Equacao Segundo Grau
 * Complete o c�digo a seguir para, dado os valores a, b, c 
 * calcular o valor de x1 e x2.
 * � interessante, antes de escrever o c�digo, 
 * escrevar um breve passo a passo do que ser� feito, em forma de coment�rios.
 * Nesse c�digo isso j� foi feito para voc�!
 */

import java.util.Scanner;  // pedindo permiss�o para usar a fun��o Scanner

public class SegundoGrau{
	public static void main( String[] args ){
		double a,b,c; // declare as variaveis a serem utilizadas
		double x1, x2;
		double delta;
		Scanner leitor = new Scanner(System.in); // para pegar entrada do usu�rio

		System.out.println("Entre com os valores de a, b e c: "); // escreva pedindo para o usu�rio entrar com a, b, c
		a = leitor.nextFloat(); // capture tais valores
		b = leitor.nextFloat();
		c = leitor.nextFloat();

		// x = -b +/- raiz(b^2 - 4ac)  / 2a
		delta = Math.sqrt( Math.pow(b,2) - (4*a*c) );

		x1 = (-b + delta)/(2*a); // calcule o valor de x1
		x2 = (-b - delta)/(2*a); // calcule o valor de x2
		// dica: use uma variavel extra para pre-calcular parte da solucao
		
		System.out.println("As solu��es para a eq. = "+x1+ " e " + x2); // imprima na tela
		
	}
}
