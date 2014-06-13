/* Leet.java
 * Converta uma string em escrita leet
 * Entrada: String s 
 * Saída: String leet 
 * Autor: Fabrício Olivetti de França
 */

import java.util.Scanner;

class Leet{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String s = leitor.nextLine().toLowerCase();
		char [] l = new char [s.length()];

		for( int i=0;i<s.length();i++ ){
			switch( s.charAt(i) ){
				case 'a': 
					l[i] = '4'; break;
				case 'c':
					l[i] = '('; break;
				case 'e':
					l[i] = '&'; break;
				case 'g':
					l[i] = '6'; break;
				case 'h':
					l[i] = '#'; break;
				case 'i':
					l[i] = '!'; break;
				case 'o':
					l[i] = '0'; break;
				case 's':
					l[i] = '$'; break;
				case 't':
					l[i] = '7'; break;
				case 'x':
					l[i] = '%'; break;
				default:
					l[i] = s.chartAt(i); break;
			}



		}
		String leet = new String(l);
		System.out.println( leet );

	}
}

