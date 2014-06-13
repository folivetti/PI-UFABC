/* EX. 01: Floresta.java
 * Incêndio em uma floresta.
 * Entrada: int n 
 * Saída: int [][] F 
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Floresta{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		double p = leitor.nextDouble();
		int [][] F = new int [n][n];  // a floresta é uma matriz quadrada

		// Floresta inicialmente vazia

		// Plantar alguams árvores de acordo com a probabilidade p

		// Vou botar fogo na primeira árvore que encontrar

		// Dica: a vizinhança de uma árvore (i,j) é definida por (i+k1,j+k2) com k1,k2 = -1..1

	}
}

