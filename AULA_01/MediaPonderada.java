/* MediaPonderada.java
 * Implementação de algoritmo para cálculo de
 * média aritmética entre dois números com peso w e (1-w) respectivamente.
 * Entrada: double x, y, w
 * Saída: Média m
 */

/* Ex. 02: Media ponderada
 * Altere o código em Java para calcular a média entre dois números para
 * capturar um terceiro valor w (peça gentilmente para o usuário entrar com
 * um valor entre 0 e 1), e usá-lo para ponderar a média da seguinte maneira:
 * m = w*x + (1-w)*y
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

public class MediaPonderada{
	public static void main( String[] args ){
		double x,y; // entrada
		double m;   // media
		Scanner leitor = new Scanner(System.in); // para pegar entrada do usuário
		System.out.print("Entre com o valor de x:");
		x = leitor.nextDouble();
		System.out.print("Entre com o valor de y:");
		y = leitor.nextDouble();

		m = (x+y)/2;

		System.out.println("A média entre "+x+" e "+y+" é: "+m);
		
	}
}
