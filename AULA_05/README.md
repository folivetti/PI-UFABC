AULA 05
========

Nessa aula aprendemos a trabalhar com listas (array) em Java.

Para declarar uma lista utilizamos a seguinte sintaxe:

```java
tipo [] lista = new tipo [tamanho];
```

Sendo tipo qualquer um dos tipos já aprendidos até então. Muitas vezes é interessante trabalhar com listas grandes, e portanto, a entrada diretamente do usuário não é conveniente. Para ler uma lista diretamente de um arquivo texto, convencionamos que a primeira linha do arquivo conterá o tamanho da lista e a segunda linha os elementos da lista separados por ";".

Para ler o arquivo usamos:

```java
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class leitor{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner leitor = new Scanner(new File("lista.csv")); 
	  leitor.useDelimiter("\\s*;\\s*|\\r?\\n"); 
	  
		int tamanho = leitor.nextInt();
		double [] x = new double[tamanho];
		for( int i=0; i<tamanho; i++ ){
			x[i] = leitor.nextDouble();
		}
		leitor.close();
	}
}
```

Atividade em aula
------------------
Dado uma lista numérica ordenada, encontrar um elemento usando o menor número possível de passos.

Exercícios
-----------

### 01 - Soma e Produto (Fácil)
Complete o código SomaProduto.java para ler uma lista de valores e calcular a somatória e produtória dessa lista.

### 02 - Embaralhando a lista (Shuffle) (Intermediário)
Complete o código Shuffle.java embaralhar os elementos da lista utlizando o procedimento descrito em aula.

### 03 - Ordenação (Intermediário)
Complete o código Ordena.java para ordenar uma lista numérica utilizando procedimento descrito em aula.

### 04 - Operação elemento-a-elemento (Fácil)
Dadas duas listas numéricas, complete o código ProdutoVetores.java para realizar a operação de multiplicação elemento a elemento gerando uma nova lista com resultado.

### 05 - Combinações (Avançado)
Complete o código Combinacao.java para imprimir todas as combinações de tamanho m dos números de 0 até n-1 em ordem crescente.

### 06 - Bois e Vacas (Avançado)
Complete o código BoisVacas.java para implementar o jogo Bois e Vacas (Mastermind) de adivinhação.
