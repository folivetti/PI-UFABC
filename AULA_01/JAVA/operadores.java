/* operadores.java
 * Exemplo de operadores em Java
 * Entrada: nenhuma
 * Saída: nenhuma
 *
 * Author: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
 */

public class operadores{
	public static void main(String[] args) {
		System.out.println("Numeros inteiros:");
		int x = 10;
		int y = 3;
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+" na potencia de "+y+"="+Math.pow(x,y));
		
		System.out.println(x + "("+ Integer.toBinaryString(x) + ") & "+y+"("+Integer.toBinaryString(y)+") ="+(x&y)+"("+Integer.toBinaryString(x&y)+")");
		System.out.println(x + "("+ Integer.toBinaryString(x) + ") | "+y+"("+Integer.toBinaryString(y)+") ="+(x|y)+"("+Integer.toBinaryString(x|y)+")");
		System.out.println(x + "("+ Integer.toBinaryString(x) + ") ^ "+y+"("+Integer.toBinaryString(y)+") ="+(x^y)+"("+Integer.toBinaryString(x^y)+")");
		
		System.out.println(x + " igual a "+y+"?"+(x==y));
		System.out.println(x + " diferente de "+y+"?"+(x!=y));
		System.out.println(x + " maior que "+y+"?"+(x>y));
		System.out.println(x + " menor que "+y+"?"+(x<y));
		System.out.println(x + " maior ou igual a "+y+"?"+(x>=y));
		System.out.println(x + " menor ou igual a "+y+"?"+(x<=y));

		System.out.println("\nNumeros em ponto flutuante: ");
		float w = 10.0f;
		float z = 3.0f;
		System.out.println(w+"+"+z+"="+(w+z));
		System.out.println(w+"-"+z+"="+(w-z));
		System.out.println(w+"*"+z+"="+(w*z));
		System.out.println(w+"/"+z+"="+(w/z));
		
		System.out.println("\nVariaveis Booleanas:");
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("Nao "+b1+"="+(!b1));
		System.out.println(b1+" ou "+b2+"="+(b1 || b2));
		System.out.println(b1+" e "+b2+"="+(b1 && b2));
		System.out.println(x+" maior que "+y+" OU "+x+" menor que "+y+"?"+( (x>y) || (x<y) ));
		System.out.println(x+" maior que "+y+" E "+x+" menor que "+y+"?"+( (x>y) && (x<y) ));

		System.out.println("\nOperacoes com Strings:");
		String s1 = "Ola ";
		String s2 = "Mundo";
		System.out.println(s1+ " + "+s2+" = "+(s1+s2));
		System.out.println("Letra na posicao 0 de s1 = "+s1.charAt(0));
		System.out.println("Concatenar as 3 primeiras letras de x com y = "+s1.substring(0,3).concat(s2));
		System.out.println("Tem 'a' em Ola? "+ s1.contains("a"));
	}
}
