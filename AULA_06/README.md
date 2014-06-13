AULA 06
========

Nessa aula aprendemos a trabalhar com o tipo String (texto) em Java.

O tipo String tem diversas operações diferentes dos tipos numéricos:

```java
String s = "Testando";
int n = s.length(); // tamanho de s
char c = s.charAt(0); // 'T', símbolo na posição 0

String s2 = "123";
s = s + s2; // concatena string: s == "Testando123"

n = Int.valueOf(s2).intValue(); // retorna 123 no tipo int
s = s + 456; // converte automaticamente 456 em String e concatena

String ss = s.substring(0,3); // ss == "Tes", retorna o pedaço da String entre 0 e 2
String su = s.toUpperCase(); // TESTANDO123456
String sl = s.toLowerCase(); // testando123456

String [] listaS = "Teste 123".split(" "); // ["Teste", "123"]

boolean b = ss.equals("Tes")==0;  // true

char [] c = {'t','e','s','t','e'};
s = String(c); // s == "teste"
```

Atividade em aula
------------------
Criptografar uma frase utilizando a Cifra de César.

Exercícios
-----------

### 01 - Binário para Decimal (Fácil)
Complete o código Bin2Dec.java para converter uma String contendo um número binário em seu equivalente decimal.

### 02 - Numeração Romana (Avançado)
Complete o código Roman.java para converter um número decimal em romano e vice-versa.

### 03 - Anagrama (Intermediário)
Complete o código Anagrama.java para determinar se uma String s1 é anagrama da String s2.

### 04 - A Velha a Fiar (Intermediário)
Complete o código VelhaFiar.java para imprimir a letra da música A Velha a Fiar utilizando o menor número de linhas de código possível, tirando proveito da estrutura de repetição da música.
