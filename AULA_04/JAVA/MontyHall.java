/* EX. 04Ç MontyHall.java
 * Fazer uma simulação de Monte Carlo
 * para estimar a validade do paradoxo 
 * de Monty Hall (trocar de porta leva
 * a probabilidade de 2/3 de vitória.
 *
 * Entrada: partidas (int) 
 * Saída: pTroca, pNaoTroca 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 *
 * Dica:
 * use o tipo Random para gerar as escolhas
 * rnd.nextInt(3) retornará um número de 0 a 2
 */


import java.util.Scanner;
import java.util.Random;

class MontyHall{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int porta,escolha;
    int partidas = leitor.nextInt();
    int contaVitorias, contaDerrotas;
    Random rnd = new Random();
    double pTroca=0, pNaoTroca=0;

  }
}

