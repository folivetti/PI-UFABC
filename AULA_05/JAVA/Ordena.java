/* EX. 03: Ordena.java
 * Dada uma lista de números
 * ordene essa lista utilizando
 * método descrito em aula.
 *
 * Entrada: double [] x
 * Saída: double [] x 
 * Autor: Fabrício Olivetti de França
 *
 * Dica: use x.length para determinar
 * o tamanho da lista x
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Ordena{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\n|\\r|\\r\\n");
		int n = leitor.nextInt();
		Random rnd = new Random();

		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();


	}
}

