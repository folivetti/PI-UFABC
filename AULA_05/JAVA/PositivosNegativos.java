/* PositivosNegativos.java
 * Leitura de uma lista de valores 
 * separar positivos de negativos. 
 * Entrada: double [] x
 * Saída: double [] pos, neg 
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class PositivosNegativos{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por vírgula
		int n = leitor.nextInt();

		double [] x = new double[n];
		int contaPos=0, contaNeg=0;
		for( int i=0; i<n; i++ ){     // vamos contar quantos positivos e negativos temos
			x[i] = leitor.nextDouble();
			if( x[i] > 0 )
				contaPos++;
			if( x[i] < 0 )
				contaNeg++;
		}
		leitor.close();

		double [] pos = new double[contaPos];  // criamos uma lista com o tamanho certo
		double [] neg = new double[contaNeg];

		int posIdx = 0;  // esses índices guardam a posição que estamos inserindo os elementos
		int negIdx = 0;

		for( int i=0; i<n; i++ ){
			if( x[i] > 0 ){    // se positivo, vai para a lista positivo e atualiza o índice
				pos[posIdx] = x[i];
				posIdx++;
			}else if( x[i] < 0 ){
				neg[negIdx] = x[i];
				negIdx++;
			}
		}

		System.out.println("Lista de positivos: ");
		for( int i=0; i<contaPos; i++ ){
			System.out.print(pos[i]+" ");
		}
		System.out.println("Lista de negativos: ");
		for( int i=0; i<contaNeg; i++ ){
			System.out.print(neg[i]+" ");
		}

	}
}

