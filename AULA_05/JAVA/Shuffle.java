/* EX. 02: Shuffle.java
 * Dada uma lista de números
 * embaralhe o conteúd dessa lista
 * Entrada: double [] x
 * Saída: double [] x 
 * Autor: Fabrício Olivetti de França
 *
 * DICA:
 * use o tipo Random para sortear
 * a posição de troca
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Shuffle{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por vírgula
		int n = leitor.nextInt();
		Random rnd = new Random();
		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();



	}
}

