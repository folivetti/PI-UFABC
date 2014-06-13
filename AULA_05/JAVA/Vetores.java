/* Vetores.java
 * Leitura de uma lista de valores
 * cálculo da média, variância,
 * desvio-padrão e menor e maior
 * elementos.
 * Entrada: double [] x
 * Saída: media, var, desvpad, menor, maior
 * Autor: Fabrício Olivetti de França
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Vetores{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); // agora vou ler do arquivo
		leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); // separado por vírgula
		int n = leitor.nextInt();
		double [] x = new double[n];
		for( int i=0; i<n; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();

    double media = 0.0, var = 0.0, desvpad = 0.0;
    double menor, maior;
    int menorIdx, maiorIdx;

    for( int i=0; i<n; i++ ){ // média = soma(x)/n
      media += x[i];
    }
    media /= n;
    System.out.println("Média = "+media);

    for( int i=0; i<n; i++ ){  // variância = (x-media)^2 / n
      var += (x[i]-media)*(x[i]-media);
    }
    var /= n;
    desvpad = Math.sqrt(var);    //desvio-padrão = raiz(variância)
    System.out.println("Variância = "+var);
    System.out.println("Desvio-padrão = "+desvpad);

    menorIdx = 0;
    maiorIdx = 0;
    menor = x[0];
    maior = x[0];
    for( int i=1; i<n; i++ ){  // quem é o maior?
      if( x[i] > maior ){
        maior = x[i];
        maiorIdx = i;
      }
      if( x[i] < menor ){ // quem é o menor?
        menor = x[i];
        menorIdx = i;
      }
    }
    System.out.println("Maior valor = "+maior+" na posição "+maiorIdx);
    System.out.println("Menor valor = "+menor+" na posição "+menorIdx);

    leitor = new Scanner(System.in);
    System.out.println("Digite um valor para buscar: ");
    double val = leitor.nextDouble();
    int i = 0;
    for( ; i<n; i++ ){
      if( x[i] == val )   // assim que encontrar o valor, não precisa procurar mais!
        break;
    }
    if( i<n ){
      System.out.println("elemento encontrado em: "+i);
    }else{
      System.out.println("elemento não existe");
    }

	}
}

