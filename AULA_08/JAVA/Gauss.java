/* Gauss.java
 * Usar eliminação de Gauss para
 * encontrar a solução de Ax = b
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Gauss{

	public static int PegaMaiorLinha( double [][] A, int linha, int n ){
		double maior = Math.abs(A[linha][linha]);
		int maiorIdx = linha;
		for( int i=linha+1;i<n;i++ ){
			if( Math.abs(A[i][linha]) > maior ){
				maior = Math.abs(A[i][linha]);
				maiorIdx = i;
			}
		}
		return maiorIdx;
	}

	public static double [][] TrocaLinha( double [][] A, int l1, int l2, int n ){
		double temp;
		for( int i=0;i<n;i++ ){
			temp = A[l1][i];
			A[l1][i] = A[l2][i];
			A[l2][i] = temp;
		}
		return A;
	}

	public static double [] EliminaGauss( double [][] A, double [] b, int n ){
		int i, j, coluna, linha, maiorLinha;
		double temp;

		for (linha=0; linha<n; linha++ ){
			maiorLinha = PegaMaiorLinha( A, linha, n );
			A = TrocaLinha( A, linha, maiorLinha, n );
			temp = b[linha];
			b[linha] = b[maiorLinha];
			b[maiorLinha] = temp;

			for (i = linha + 1; i < n; i++) {
				temp = A[i][linha] / A[linha][linha];
				for (coluna = linha+1; coluna < n; coluna++)
					A[i][coluna] -= temp * A[linha][coluna];
				A[i][linha] = 0;
				b[i] -= temp * b[linha];
			}
		}

		double [] x = new double[n];
		for (linha = n - 1; linha >= 0; linha--) {
			temp = b[linha];
			for (j = n - 1; j > linha; j--)
				temp -= x[j] * A[linha][j];
			x[linha] = temp / A[linha][linha];
		}
		return x;
	}


	public static void main(String[] args)  throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("matriz.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n = leitor.nextInt();
		n = leitor.nextInt();
		double [][] A = new double [n][n];

		for( int i=0; i<n; i++ ){
			for( int j=0; j<n; j++ ){
				A[i][j] = leitor.nextDouble();
			}
		}
		leitor.close();

		leitor = new Scanner(new File("vetor.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		n = leitor.nextInt();
		double [] b = new double [n];

		for( int i=0; i<n; i++ ){
			b[i] = leitor.nextDouble();     
		}
		leitor.close();

		double [] x = EliminaGauss( A, b, n );

		PrintWriter saida = new PrintWriter("vetorX.csv");
		saida.println(n);
		for( int i=0; i<n-1;i++ ){
			saida.print(x[i]+";");
		}
		saida.print(x[n-1]);
		saida.close();


	}
}

