/* Matriz.java
 * Leitura de uma matriz e
 * soma de duas matrizes, 
 * transposta delas
 * produto externo de dois vetores
 * Entrada: int [][] A, B, int []  x, y
 * Saída: double [][] C 
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Matriz{
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

		leitor = new Scanner(new File("matriz2.csv")); // agora vou ler do arquivo
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

		leitor = new Scanner(new File("vetor1.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n3 = leitor.nextInt();
		int [] x= new int [n3];

		for( int i=0; i<n3; i++ ){
			x[i] = leitor.nextInt();     
		}
		leitor.close();

		leitor = new Scanner(new File("vetor2.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n4 = leitor.nextInt();
		int [] y= new int [n4];

		for( int i=0; i<n4; i++ ){
			y[i] = leitor.nextInt();     
		}
		leitor.close();


		// C = A + B
		int [][] C = new int [n1][m1];
		if( n1 == n2 && m1 == m2 ){ // só faço a soma se as dimensões forem iguais
			for( int i=0;i<n1;i++ ){
				for( int j=0;j<m1;j++ ){
					C[i][j] = A[i][j] + B[i][j];
				}
			}
		}
		PrintWriter saida = new PrintWriter("somaMatriz.csv"); // vamos gravar em um arquivo!
		saida.println(n1+";"+m1);
		for( int i=0; i<n1;i++ ){
			for( int j=0; j<m1-1; j++ ){
				saida.print(C[i][j]+";");
			}
			saida.println(C[i][m1-1]);
		}
		saida.close();

		// Transposta de A
		int [][] T = new int [m1][n1]; // dimensões invertidas de A
		for( int i=0;i<n1;i++ ){
			for( int j=0;j<m1;j++ ){
				T[j][i] = A[i][j];
			}
		}

		saida = new PrintWriter("transposta.csv");
		saida.println(m1+";"+n1);
		for( int i=0; i<m1;i++ ){
			for( int j=0; j<n1-1; j++ ){
				saida.print(T[i][j]+";");
			}
			saida.println(T[i][n1-1]);
		}
		saida.close();

		// produto externo x e y
		int [][] D = new int [n3][n4]; // D vai ter a dimensão de x e y
		for( int i=0;i<n3;i++ ){
			for( int j=0;j<n4;j++ ){
				D[i][j] = x[i]*y[j];
			}
		}
		saida = new PrintWriter("produtoexterno.csv");
		saida.println(n3+";"+n4);
		for( int i=0; i<n3;i++ ){
			for( int j=0; j<n4-1; j++ ){
				saida.print(D[i][j]+";");
			}
			saida.println(D[i][n4-1]);
		}
		saida.close();

	}
}

