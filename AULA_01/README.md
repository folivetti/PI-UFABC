AULA 01
-----------

Nessa primeira aula aprendemos o conceito de variáveis, tipos e operadores.

A estrutura básica de um programa JAVA é:

class NOMEPROGRAMA{
  public static void main(String[] args){
    // algoritmo
  }
}

Os tipos de variáveis que aprendemos até então:

byte, short, int, long - tipos de números inteiros
float, double - tipos de números fracionários

Idealmente utilizamos os tipos com maior uso de memória, e maior precisão. Caso o uso de memória seja crítico, podemos escolher um tipo que ocupe um menor espaço.
Toda variável a ser utilizada deve ser declarada para o computador saber que iremos utilizá-la:

int x, y, media; // declara três variáveis a serem utilizadas

Nativamente temos diversos operadores matemáticos para utilizarmos: +, -, *, /, %.

Os operadores são avaliados na seguinte ordem:

1) *, /, %
2) +,-
3) da esquerda para a direita

ENTRADA E SAÍDA
-----------------

A entrada de dados é feita utilizando o Scanner. Antes da declaração do nome do programa devemos avisar ao JAVA que iremos utilizá-lo:

import java.util.Scanner;

Dentro da área do código do programa, devemos declarar uma variável para o uso do Scanner:

Scanner leitor = new Scanner(System.in);

Finalmente, pegamos os dados através do comando leitor.nextXXX() onde XXX é o tipo da variável que vai receber os dados:

float x;
x = leitor.nextFloat();

A saída de dados é feita através do comando System.out.println():

System.out.println("O valor de x é: " + x);

Exercícios
-----------

01 - Equação de Segundo Grau (Fácil)
Complete o código SegundoGrau.java para calcular as respostas da equação ax^2 + bx + c = 0

02 - Média Ponderada (Fácil)
Complete o código MediaPonderada.java para calcular a média ponderada entre dois valores x e y, ponderados pela variável w, sendo que 0 <= w <= 1.
Você consegue detectar um possível erro no seu código gerado pelo usuário?

03 - Conversão de Temperatura (Fácil)
Complete o código Temperatura.java para converter a temperatura em Celsius para Kelvin e Fahrenheit.

04 - Idade em Segundos (Fácil)
Complete o código IdadeSegundos.java para converter a idade de uma pessoa em anos para segundos. Comente se o seu código retorna um valor preciso. Em caso negativo, crie soluções para melhorar essa precisão.

05 - Área e Volume das Formas (Fácil)
Complete o código AreaFormas.java para calcular a área e volume das seguintes formas: retângulo, circunferência, triângulo, cubóide, esfera, pirâmide.
