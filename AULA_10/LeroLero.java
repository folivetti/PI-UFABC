import java.util.Hashtable;
import java.util.Random;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class LeroLero{
	// Hashmap
	public static Hashtable<String, List<String>> markovChain = new Hashtable<String, List<String>>();
	static Random rnd = new Random();

	public static void adicionaPalavras(String sentenca) {
		// cria uma array de palavras
		String[] palavras = sentenca.split(" ");

		// Para cada palavra, checa se ela já existe no dicionário
		// Se não existe, cria a entrada no dicionário e acrescenta palavra -> próxima
		// e anterior -> palavra
		// Se é a primeira ou última palavra, use _inicio, _fim

		for (int i=0; i<palavras.length; i++) {
			List<String> listaPalavras;

			if (i == 0) {
				// se for a primeira palavra da frase, coloca ela como palavra inicial
				listaPalavras = markovChain.get("_inicio");
				listaPalavras.add(palavras[i]);

				// se tiver mais palavras pela frente
				if(i!=palavras.length-1){
					// adiciona a próxima palavra
					listaPalavras = markovChain.get(palavras[i]);
					if (listaPalavras == null) {
						listaPalavras = new ArrayList<String>();
						markovChain.put(palavras[i], listaPalavras);
					}
					listaPalavras.add(palavras[i+1]);
				}


			} 
			// se for no final, adiciona na lista de fim
			// não podemos usar else if pois a palavra pode 
			// ser a primeira e última
			if (i == palavras.length-1) {
				listaPalavras = markovChain.get("_fim");
				listaPalavras.add(palavras[i]);

			}

			// se ela está no meio, adiciona a próxima palavra
			// na lista da palavra atual
			if( i>0 && i < palavras.length-1 ) {	
				listaPalavras = markovChain.get(palavras[i]);
				if (listaPalavras == null) {
					listaPalavras = new ArrayList<String>();
					listaPalavras.add(palavras[i+1]);
					markovChain.put(palavras[i], listaPalavras);
				} else {
					listaPalavras.add(palavras[i+1]);
					markovChain.put(palavras[i], listaPalavras);
				}
			}
		}				
	}


	public static void geraSentenca() {

		// vamos montar uma lista de palavras
		List<String> novaFrase = new ArrayList<String>();

		String proxima = "";

		// pegamos a primeira palavra
		// aleatoriamente da lista inicio
		// se a palavra aparece muitas vezes
		// as chances de escolhe-la aumenta
		List<String> listaPalavras = markovChain.get("_inicio");
		int tamanho = listaPalavras.size();
		proxima = listaPalavras.get(rnd.nextInt(tamanho));
		novaFrase.add(proxima);

		// vamos adicionar palavras na lista enquanto:
		// - existe a palavra na lista de chaves E
		// - a frase ainda está curta OU
		// - a palavra está na lista de últimas palavras
		while ( markovChain.containsKey(proxima) && (novaFrase.size() < 5 || !markovChain.get("_fim").contains(proxima)) ){

			listaPalavras = markovChain.get(proxima);
			tamanho = listaPalavras.size();
			proxima = listaPalavras.get(rnd.nextInt(tamanho));
			novaFrase.add(proxima);
		}

		System.out.println(novaFrase.toString()); // imprime a frase	
	}

	public static void main(String[] args) throws FileNotFoundException {

		markovChain.put("_inicio", new ArrayList<String>());
		markovChain.put("_fim", new ArrayList<String>());

		Scanner leitor = new Scanner(new File("texto.txt")); 
		String s;
		while( leitor.hasNext() ){ // enquanto tem linhas a serem lidas
			s = leitor.nextLine();
			adicionaPalavras(s);  // adiciona palavras no HashTable
		}
		geraSentenca();  // vamos enrolar
	}
}
