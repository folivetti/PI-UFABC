/* EX. 04: ProdutoVetores.java
 * Dada duas listas de valores
 * numéricos, calcule o produto 
 * elemento a elemento entre elas.
 *
 * Entrada: double [] x, double [] y
 * Saída: double [] z 
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class ProdutoVetores{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r|\\n|\\r\\n"); // separado por vírgula
		int n = leitor.nextInt();
		Random rnd = new Random();
		double [] x = new double[n];
		double [] y = new double[n];

		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		for( int i=0; i<n; i++ ){
			y[i] = leitor.nextDouble();
		}
		leitor.close();

	}
}

