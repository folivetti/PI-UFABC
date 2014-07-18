/* Etiope.java
 * Multiplica��o Et�ope de dois n�meros 
 * Entrada: n,m (int) 
 * Sa�da: mult 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */

import java.util.Scanner;

class Etiope{
	public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int m,n,mult;
    m = leitor.nextInt();
    n = leitor.nextInt();
    mult = 0;

    while( m!=0 ){   // m vai ser dividido sucessivamente por 2, at� chegar em 0
      if( m%2!=0 ){  // se m � par vou somar o valor de n correspondente
        mult += n;
      }
      m /= 2;         // pr�xima linha da tabela, m/2 e n*2
      n *= 2;
    }
    System.out.println(mult);
  }
}

