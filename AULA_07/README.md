AULA 07
========

Nessa aula aprendemos a trabalhar com listas bidimensionais e matrizes (arrays bidimensionais).

As listas bidimensionais podem ser declaradas da seguinte maneira:

```java
tipo [][] matriz = new tipo [dim1][dim2];
```

Com a quantidade de informação processada, agora é conveniente escrever os resultados em um arquivo. Em Java fazemos isso da seguinte forma:

```java
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;

class ProdMatriz{
	public static void main(String[] args) throws FileNotFoundException {

    saida = new PrintWriter(“nomeArquivo");
    saida.print(“”);
    saida.println(“”);
    saida.close();
  }
}

```

Atividade em aula
------------------
Construir a simulação de um incêndio em uma floresta seguindo o modelo de percolação e ponto crítico visto em Comunicação e Redes.

Exercícios
-----------

### 01 - Incêndio na Floresta (Avançado)
Complete o código Floresta.java para simular um incêndio e determinar a porncetagem de árvores salvas. Gere a floresta seguindo uma densidade determinada pelo usuário. Com qual densidade a floresta passa a quase não-afetada para completamente queimada?

### 02 - Jogo da Vida (Intermediário)
Complete o código JogoVida.java para simular o Jogo da Vida conforme regras mostradas em aula.

### 03 - Multiplicação de Matrizes (Avançado)
Complete o código ProdMatriz.java para ler duas matrizes de arquivos distintos, A e B, e escrever a matriz C = A*B em um arquivo de saída.
