/* Media.java
 * Implementação de algoritmo para cálculo de
 * média aritmética entre dois números.
 * Entrada: double x, y
 * Saída: Média m
 */

import java.util.Scanner;  // pedindo permissão para usar a função Scanner

class Media{
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
