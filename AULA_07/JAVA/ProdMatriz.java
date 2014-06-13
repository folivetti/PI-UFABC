/* EX. 03: ProdMatriz.java
 * Multiplica duas matrizes e imprime o resultado
 * 
 * Entrada: int [][] A, B
 * Saída: double [][] C 
 * Autor: Fabrício Olivetti de França
 *
 * DICA:
 * verifique se as dimensões estão corretas!
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class ProdMatriz{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("matriz1.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n1 = leitor.nextInt();
		int m1 = leitor.nextInt();
		int [][] A = new int [n1][m1];

		for( int i=0; i<n1; i++ ){
			for( int j=0; j<m1; j++ ){
				A[i][j] = leitor.nextInt();
			}
		}
		leitor.close();

		leitor = new Scanner(new File("matriz3.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n2 = leitor.nextInt();
		int m2 = leitor.nextInt();
		int [][] B = new int [n2][m2];

		for( int i=0; i<n2; i++ ){
			for( int j=0; j<m2; j++ ){
				B[i][j] = leitor.nextInt();
			}
		}
		leitor.close();




	}
}

