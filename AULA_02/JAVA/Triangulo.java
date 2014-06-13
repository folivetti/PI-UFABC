/* Triangulo.java
 * Dada as três dimensões de um triângulo
 * determinar se é realmente um triângulo e qual tipo ele é
 * Entrada: x,y,z (double)
 * Saída:  se é triângulo e qual tipo
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */



import java.util.Scanner;

class Triangulo{
	public static void main(String[] args) {
		double x, y, z; 
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Forneça as 3 dimensões: ");
		x = leitor.nextDouble();
		y = leitor.nextDouble();
		z = leitor.nextDouble();

		if( x+y>z && x+z>y && y+z>x ){
			if( x==y && y==z ){
				System.out.println("Equilatero");
			}else if( x==y || y==z || x==z ){
				System.out.println("Isóceles");
			}else{
				System.out.println("Escaleno");
			}
		}else{
			System.out.println("Não é um triângulo");
		}

	}
}

