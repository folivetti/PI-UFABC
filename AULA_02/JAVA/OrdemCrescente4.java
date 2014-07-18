/* OrdemCrescente4.java
 * Imprimir os 4 numeros em ordem crescente
 * Entrada: x,y,z,w (int)
 * Saida: numeros em ordem crescente
 *
 * Autor: Fabricio Olivetti de Franca
 * Disciplina Processamento da Informacao
 * Universidade Federal do ABC
 */



import java.util.Scanner;

class OrdemCrescente4{
	public static void main(String[] args) { 
		int x,y,z,w, temp;	
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Entre com 3 numeros: ");
		x = leitor.nextInt();
		y = leitor.nextInt();
		z = leitor.nextInt();
		w = leitor.nextInt();
		
    if( x > y ){
      temp = x;
      x = y;
      y = temp;
    }
    if( y > z ){
      temp = y;
      y = z;
      z = temp;
    }
    if( z > w ){
      temp = z;
      z = w;
      w = temp;
    }
    if( x > y ){
      temp = x;
      x = y;
      y = temp;
    }
    if( y > z ){
      temp = y;
      y = z;
      z = temp;
    }
    if( x > y ){
      temp = x;
      x = y;
      y = temp;
    }
    System.out.println(x + " " + y + " " + z + " " + w);
  }
}

