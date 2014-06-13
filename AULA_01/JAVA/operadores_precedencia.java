/* operadores_precedencia.java
 * Demonstração da precedência dos operadores em Java
 * Entrada: nenhum
 * Saída: nenhum
 *
 * Author: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

public class operadores_precedencia{
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int c=15;
		int d=5;

		System.out.println( a+b*c-a+b*d ); // o que vai dar de resultado?
		System.out.println( a + (b*c) - a + (b*d) ); //Fica fácil ver a ordem de operações
		int e = (a + b) * c / d;
		System.out.println("Valor de (a + b) * c / d = " + e);

		e = ( (a+b) * c) / d;
		System.out.println("Valor de ((a + b) * c) / d = " + e);
		
		e = (a+b) * (c/d);
		System.out.println("Valor de (a + b) * (c / d) = " + e);

		e = a + (b * c) / d;
		System.out.println("Valor de a + (b * c) / d = " + e);

	}
}

