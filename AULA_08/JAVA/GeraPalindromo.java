/* GeraPalindromo.java
 * Crie uma rotina que retorne o inverso de um número
 * Use tal rotina para gerar um palindromo.
 *
 * Entrada: n (int) 
 * Saída: palindromo
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class GeraPalindromo{

	// subrotina para  gerar o inverso de um número
	public static int Inverso( int n ){
		int inverso=0;
		while( n!=0 ){
			inverso = inverso*10 + (n%10);
			n /= 10;
		}
		return inverso;
	}

	// principal
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		n = leitor.nextInt();
		int maxTentativas = 100;
		int i=0;
		int inv=0;
		for( ;i<maxTentativas;i++ ){
			inv = Inverso(n); // inverte o número
			if( n == inv ){ // se for palíndromo, beleza
				break;
			}
			n += inv; // senão soma n + inverso
		}
		if( inv == n ){
			System.out.println("Obtive "+n+ " após "+i+" tentativas");
		}else{
			System.out.println("Desisto");
		}

	}
}

