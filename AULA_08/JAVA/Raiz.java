/* Raiz.java
 * Encontrar a raiz n do número x
 * utilizando o método de Newton
 *
 * Entrada: y,n (double) 
 * Saída: raiz
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class Raiz{

	// avalia a função f(x) = x^n - y
	public static double f( double x, double y, double n ){
		return Math.pow(x,n)-y;
	}

	// avalia f'(x) = n*x^(n-1)
	public static double df( double x, double n ){
		return Math.pow(x,n-1)*n;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double y, n;
		y = leitor.nextDouble();
		n = leitor.nextDouble();

		double x = 1, xAnt = 2;

		while( Math.abs(x-xAnt) > 0.01 ){ // até que altere apenas a segunda casa decimal
			xAnt = x;
			x -= f(x,y,n)/df(x,n);  // método de Newton
		}
		System.out.println("A raíz " + n + " de " + y + " = " + x);

	}
}

