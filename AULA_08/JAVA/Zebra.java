/* EX. 03: Zebra.java
 * Implementar o jogo Bois e Vacas
 * (Cows and Bulls) também conhecido
 * como Mastermind.
 * Entrada: n (int) número de 4 dígitos 
 * Saída: nBois, nVacas (int)
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Zebra{

	public static String [] Casa = {"UM", "DOIS", "TRES", "QUATRO", "CINCO"};
	public static String [] Cor = {"VERMELHO", "VERDE", "BRANCO", "AZUL", "AMARELO"};
	public static String [] Nacionalidade = {"BRASILEIRO", "ARGENTINO", "CHILENO", "PERUANO", "CUBANO"};
	public static String [] Bebida = {"CHA", "CAFE", "LEITE", "CERVEJA", "AGUA"};
	public static String [] Comida = {"PIZZA", "FRUTA", "CARNE", "LEGUMES", "DOCES"};
	public static String [] Animal = {"CACHORRO", "GATO", "PASSARO", "CAVALO", "ZEBRA"};	


	// vamos buscar o índice que encontramos a string x na lista
	public static int buscaLista( String [] Lista, String x ){
	}

	// modela todas as dicas que temos em forma de condições/restrições
	public static boolean Possivel( int [] num, int [] cor, int [] bebida, int [] comida, int [] animal ){
		
		if( num.length > 0 && num[ buscaLista( Nacionalidade, "PERUANO" ) ] != buscaLista( Casa, "UM" ) ) // se a Nacionalidade eh Peruana e a casa nao eh a primeira, entao quebrou a premissa
			return false;
	}

	// gera todas as permutações
	public static  ArrayList<int []> Permutacoes(int[] x, int n, int idx, ArrayList<int []> lista) {
		if (idx == x.length) {  
			int [] y = new int [5];
			for( int i=0;i<5;i++ ) y[i]=x[i];
			lista.add(y);
			return lista;
		}
		for (int i = idx; i < n; i++) {
		       int tmp = x[i];
		       x[i] = x[idx];
		       x[idx]=tmp;
		       lista = Permutacoes(x, n, idx+1, lista); // recursividade, não é para vocês ainda!
		       tmp = x[i];
		       x[i] = x[idx];
		       x[idx]=tmp;

		}

		return lista;
	}

	// imprime a tabela
	public static void Imprime( String[] s, int [] x ){
	}



	public static void main(String[] args)  {

		int [][] permutacoes = new int [120][5];
		for( int i=0;i<5;i++ )
			permutacoes[0][i]=i;
		ArrayList< int [] > lista = new ArrayList< int [] >( );
		lista = Permutacoes( permutacoes[0], 5, 0, lista );
		for( int i=0;i<lista.size();i++ ){
			permutacoes[i] = lista.get(i);
		}

                int [] vazio = new int [0]; // isso representara um vetor de permutacao desconhecida



	}
}

