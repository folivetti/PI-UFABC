/* FizzBuzz.java
 * Para a sequência de números de 1 até 100
 * imprimir os números em ordem crescente substituindo
 * múltiplos de 3 por Fizz, múltiplos de 5 por Buzz
 * e múltiplos de 3 e 5 por FizzBuzz
 * Entrada: nenhuma 
 * Saída: FizzBuzz
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */


class FizzBuzz{
	public static void main(String[] args) {
    for( int i = 1; i<=100; i++ ){
      if( (i%15)==0 ){ // múltiplos de 3 e 5 são múltiplos de 15!
        System.out.println("FizzBuzz");
      }else if( (i%3) == 0){
        System.out.println("Fizz");
      }else if( (i%5) == 0){
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }

	}
}

