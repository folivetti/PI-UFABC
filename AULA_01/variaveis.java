public class variaveis{
	public static void main(String[] args) {

		/* 
		 * Existem 4 tipos de variaveis com valores inteiros
		 * no Java. A diferença entre eles é a faixa de valores
		 * que eles comportam, mas com a contrapartida de ocuparem
		 * mais ou menos memória. 
		 * */

		/* o tipo byte ocupa 8 bits de memoria
		 * seu valor varia entre -128 e 127 */
		byte b = 100;
		System.out.println( "b="+b );

		/* o tipo short ocupa 16 bits de memoria
		 * seu valor varia entre -32768 e 32767*/
		short s = 32000;
		System.out.println( "s="+s );

		/* o tipo int ocupa 32 bits de memoria
		 * seu valor varia entre -2^31 e 2^31 - 1 */
		int i = 12801213;
		System.out.println( "i="+i );

		/* o tipo long ocupa 64 bits de memoria
		 * seu valor varia entre -2^63 e 2^63 - 1 
		 * os numeros devem ter a letra L no final */
		long l = 128943243242L;
		System.out.println( "l="+l );

		/* o tipo float ocupa 32 bits de memoria
		 * e representa valores em ponto flutuante */
		float f = 323.2f;
		System.out.println( "f="+f );
		
		/* o tipo double ocupa 64 bits de memoria
		 * e representa valores em ponto flutuante
		 * de precisão dupla. */
		double d = 1.2d;
		System.out.println( "d="+d );

		/* podemos escrever em formato 
		 * de notação científica */
		double d2 = 1.2e+5;
		System.out.println( "d2="+d2 );

		/* o tipo boolean utiliza apenas 1 bit
		 * e representa valores lógicos
		 * Verdadeiro - true
		 * Falso - false
		 * ATENÇÃO: true e false devem ser escritos em letras minúsculas
		 * */
		boolean bo = true;
		System.out.println( "bo="+bo );

		/* o tipo char utiliza 16 bits e representa 
		 * um caracter de uma palavra */
		char c = 'c';
		System.out.println( "c="+c );

		/* o tipo String armazena uma sequencia de caracteres */
		String str = "Oi!";
		System.out.println( "str="+str );
	}
}
