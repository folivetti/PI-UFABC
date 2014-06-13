/* Palindrome.java
 * verificar se uma String é
 * uma palindrome.
 * Entrada: String s 
 * Saída: sim ou não 
 * Autor: Fabrício Olivetti de França
 */

import java.util.Scanner;
import java.util.Random;

class Palindrome{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String s = leitor.nextLine();

		boolean palindrome = true;
		for( int i=0; i<(s.length()/2)+1; i++ ){ // só preciso verificar até o meio
			if( s.charAt(i) != s.charAt(s.length()-i-1) ){
				palindrome = false;
				break;
			}
		}

		if( palindrome ){
			System.out.println("é palíndrome");
		}else{
			System.out.println("não é palíndrome");
		}
	}
}

