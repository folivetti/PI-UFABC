/* Strings.java
 * realizar inversão da String
 * checar se ela é um pangram
 * contar frequência de cada letra
 * calcular entropia
 * Entrada: String s 
 * Saída: -- 
 * Autor: Fabrício Olivetti de França
 */

import java.util.Scanner;
import java.util.Random;

class Strings{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String s = leitor.nextLine().toLowerCase(); // vamos usar apenas minúsculas
		double [] freq = new double[26]; //26 letras do alfabeto

		for( int i=0;i<26;i++ )
			freq[i]=0;  // começar a contar do zero

		char [] inv = new char[s.length()];
		for( int i=0;i<s.length();i++ ){
			inv[i] = s.charAt(s.length()-i-1);
			freq[ (int) s.charAt(i)-'a' ]++; //  'a' é um símbolo da tabela ASCII com um valor numérico correspondente, qq letra - 'a' resulta em um número de 0 a 25
		}
		String inverso = new String(inv);
		System.out.println( inverso );

		boolean pangram = true;   // vamos assumir que é verdadeiro
		for( int i=0; i<26; i++ ){
			if( freq[i]==0 ){  // se uma letra não foi encontrada, é falso! Termina a busca
				pangram = false;
				break;
			}
		}
		if( pangram ){
			System.out.println("É um pangram");
		}else{
			System.out.println("Não é um pangram");
		}

		double entropia = 0.0;
		for( int i=0;i<26;i++ ){
			if(freq[i]>0){  // para toda letra com frequência > 0, entropia é -freq/n * log(f/n, 2) (log na base 2)
				entropia -= (freq[i]/s.length())*Math.log(freq[i]/s.length())/Math.log(2.0);
			}
		}
		System.out.println("Entropia = "+entropia);

	}
}

