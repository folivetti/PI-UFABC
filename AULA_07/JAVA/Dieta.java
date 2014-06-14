/* Dieta.java
 * Leitura de uma matriz e
 * fazer operações na tabela de calorias
 * Entrada: int [][] A
 * Saída: estatísticas 
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class Dieta{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner leitor = new Scanner(new File("calorias.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n");
		int n=3; // manhã, tarde e noite
		int m=7; // 7 dias da semana
		int [][] A = new int [n][m];

		for( int i=0; i<n; i++ ){
			for( int j=0; j<m; j++ ){
				A[i][j] = leitor.nextInt();
			}
		}
		leitor.close();

		double [] mediaDia = new double[7];
		for( int i=0;i<7;i++ ){
			mediaDia[i] = 0.0; // Média de cada Dia
		}
		double [] mediaRefeicao = new double[3];
		for( int i=0;i<3;i++ ){
			mediaRefeicao[i] = 0.0; // Média de cada Refeição
		}

		int maior=A[0][0];
		int diaMaior = 0; // qual maior dia de consumo?
		for( int i=0;i<n;i++ ){
			for( int j=0;j<m;j++ ){
				mediaDia[j] += A[i][j]/n;    // já vamos calcular a média
				mediaRefeicao[i] += A[i][j]/m;
				if( A[i][j] > maior ){
					maior = A[i][j];
					diaMaior = j;
				}
			}
		}

		System.out.println("\tSeg., Ter., Qua., Qui., Sex., Sab., Dom.,Media"); // imprime a tabela!
		System.out.print("Manhã\t");
		for( int i=0;i<m;++i ){
			System.out.print(A[0][i]+", ");
		}
		System.out.println(mediaRefeicao[0]);
		System.out.print("Tarde\t");
		for( int i=0;i<m;++i ){
			System.out.print(A[1][i]+", ");
		}
		System.out.println(mediaRefeicao[1]);
		System.out.print("Noite\t");
		for( int i=0;i<m;++i ){
			System.out.print(A[2][i]+", ");
		}
		System.out.println(mediaRefeicao[2]);
		System.out.print("\t");
		for( int i=0;i<m;i++ ){
			System.out.print(mediaDia[i]+", ");
		}
		System.out.println("");

		System.out.println("Dia de maior caloria foi: "+diaMaior+1);
		for( int i=0;i<m;i++ ){
			if( A[0][i] > mediaRefeicao[0] || A[1][i] > mediaRefeicao[1] || A[2][i] > mediaRefeicao[2] ){
				System.out.println("Dia " + (i+1) + " comeu acima da média.");

			}
		}

	}
}

