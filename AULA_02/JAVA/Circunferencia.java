/* Ex. 03: Circunferencia.java
 * Dado o centro (cx, cy) e o raio (r) de uma circunferência
 * determinar se um ponto x,y está dentro ou fora dela
 * Entrada:  cx, cy, r, x, y (double)
 * Saída:  Está dentro ou fora
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Circunferencia{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    double cx, cy, r, x, y;
    System.out.println("Entre com as coordenadas do centro da circunferência: ");
    cx = leitor.nextDouble();
    cy = leitor.nextDouble();
    System.out.println("Entre com o raio da circunferência: ");
    r = leitor.nextDouble();

    System.out.println("Entre com as coordenadas do ponto: ");
    x = leitor.nextDouble();
    y = leitor.nextDouble();


	}
}

