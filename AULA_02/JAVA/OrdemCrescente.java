/* OrdemCrescente.java
 * Imprimir os 3 números em ordem crescente
 * Entrada: x,y,z (int)
 * Saída: números em ordem crescente
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */



import java.util.Scanner;

class OrdemCrescente{
	public static void main(String[] args) {
		int x,y,z;	
		Scanner leitor = new Scanner(System.in);

		// captura valores
		System.out.println("Entre com 3 números: ");
		x = leitor.nextInt();
		y = leitor.nextInt();
		z = leitor.nextInt();
		
    // x > y > z
    // x > z > y
    // y > x > z
    // y > z > y
    // z > x > y
    // z > y > x
    if( x < y && x < z){
      if( y < z ){
        System.out.println(x + " " + y + " " + z);
      }else{
        System.out.println(x + " " + z + " " + y);
      }
    }else if( y < z ){
      if( x < z ){
        System.out.println(y + " " + x + " " + z);
      }else{
        System.out.println(y + " " + z + " " + x);
      }
    }else{
      if( x < y ){
        System.out.println(z + " " + x + " " + y);
      }else{
        System.out.println(z + " " + y + " " + x);
      }
    }
	}
}

