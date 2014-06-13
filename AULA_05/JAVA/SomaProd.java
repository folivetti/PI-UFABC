/* EX. 01: SomaProd.java
 * Dada uma lista de números
 * calcular a somatória e 
 * produtória dos valores dessa lista
 * Entrada: double [] x
 * Saída: double soma, prod 
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class SomaProd{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por vírgula
		int n = leitor.nextInt();

		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();


	}
}

