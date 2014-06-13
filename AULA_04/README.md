AULA 04
========

Nessa aula aprendemos outra estrutura de repetição:

```java
while( condição ){
    // repete instruções enquanto condição for verdadeira
}
```

Atividade em Aula
------------------
Multiplicação Etíope: descreve a operação de multiplicação de dois inteiros, x e y, utilizando apenas multiplicação e divisão por 2 e soma.
Escreva os dois números lado a lado em uma tabela:

| x  | y  |
| -- |:--:|

Na coluna de x, divida-o sucessivamente até obter 0, na coluna de y dobre o valor sucessivamente:

| x  | y  |
| -- |:--:|
| x/2| y*2|
| x/4| y*4|
...
| 0  |y*2^n|

Some os valores da coluna y, para todos os elementos da coluna x que é um número ímpar.

Exercícios
-----------

### 01 - Pedra, Papel, Tesoura (Fácil)
Complete o código PedraPapelTesoura.java para repetir a competição até que o usuário entre com um valor inválido.

### 02 - Monte Carlo II (Fácil)
Complete o código MonteCarlo.java estimar o valor de pi até que a diferença do valor estimado e o valor real de pi seja menor que um valor **p** definido pelo usuário. Use Math.PI para obter o valor real (ou quase) de pi.

### 03 - Palíndromo (Intermediário)
Complete o código Palindromo.java determinar se um número é palíndromo.

### 04 - Monty Hall (Intermediário)
Complete o código Montyhall.java para fazer uma simulação de Monte Carlo para verificar a validade do paradoxo de Monty Hall.

### 05 - Persistência Aditiva (Intermediário)
Complete o código PersistenciaAditiva.java para calcular a persistência aditiva de um número.

### 06 - Divisão de Dígitos (Avançado)
Complete o código DivideDigitos.java para encontrar o menor valor **d** de separação de segmentos de um número de forma que gere uma lista de números crescentes.

### 07 - Cartão de Crédito (Avançado)
Comeplte o código CartaoCredito.java para determinar se um número digitado pelo usuário é válido seguindo os critérios dados em aula.
