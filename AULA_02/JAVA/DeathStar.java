/* Ex. 04: DeathStar.java
 * Dado o centro (cx, cy) e o raio (r) de duas circunferências
 * determinar se elas formam uma Estrela da Morte
 *
 * Um objeto tem chances de ser uma Estrela da Morte se:
 * - um dos raios é 10x maior que o outro
 * - o contorno da circunferência menor encontra-se 
 *   a pelo menos duas unidades da maior.
 *
 * Verifique se um dado objeto tem chance de ser
 * uma estrela da morte. Que a força esteja com você.
 *
 * Dica: estude geometria.
 *
 * Entrada:  cx1, cy1, r1, cx2, cy2, r2 (double)
 * Saída:  Chame o Luke!
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


import java.util.Scanner;

class DeathStar{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
    double cx1, cy1, r1, cx2, cy2, r2;
    System.out.println("Entre com as coordenadas do centro e o raio da circunferência maior: ");
    cx1 = leitor.nextDouble();
    cy1 = leitor.nextDouble();
    r1 = leitor.nextDouble();
    
    System.out.println("Entre com as coordenadas do centro e o raio da circunferência menor: ");
    cx2 = leitor.nextDouble();
    cy2 = leitor.nextDouble();
    r2 = leitor.nextDouble();


	}
}

