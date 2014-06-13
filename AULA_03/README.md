AULA 03
========

Nessa aula aprendemos o conceito de estruturas de repetição e solução de problemas de forma iterativa.

A estrutura de repetição que aprendemos nessa aula segue o seguinte modelo:

```java
for( int i=0; i<N; i++ ) {
  // repete as instruções com i de 0 até N-1
}
```

Aprendemos também as operações de incremento e decremento:

```java
int i = 0;
i++;    // i == 1
i--;    // i == 0
i+=10;  // i == 10
i-=2;   // i == 8
i/=2;   // i == 4
i*=3;   // i == 12
```

Também aprendemos que uma variável tem um tempo de vida. Ela vive apenas dentro da { } em que ela foi declarada:

```java
{
    int x = 0;  // x está vivo!
}
x++; // o Java mostra uma mensagem de erro pois x está morto :(
```

Atividade em aula
------------------
Imprimir as N primeiras linhas do triângulo de Pascal, sabendo que o elemento Pj da linha i é dado por Pj = P(j-1) * (i-j)/j.

Exercícios
-----------

### 01 - Soma de Séries (Intermediário)
Complete o código SomaSeries.java para, dada duas séries:
S1 = 1/1 + 1/3 + ... + 1/(2*n+1)
e
S2 = 1/2 + 1/4 + ... + 1/2n

Calcular S1 - S2 para um valor de n.
Note que temos diversas maneiras de realizar essa operação, consegue identificar a melhor?

### 02 - Potência (Fácil)
Complete o código Potencia.java para calcular x na potência de y.

### 03 - Coeficiente Binomial (Intermediário)
Complete o código Binomial.java calcular o coeficiente binomial (n,k). Note que esse coeficiente cresce rapidamente com n e k. Até que valor é possível obter uma resposta? Novamente existem diversas maneiras de fazer essa operação, existe alguma maneira que possibilite o cálculo de (n,k) maiores dos que obtidos anteriormente?

### 04 - Monte Carlo (Intermediário)
Complete o código MonteCarlo.java estimar o valor de pi utilizando o método de Monte Carlo com um número fixo de iterações (repetições). Utilize Math.random() para gerar números aleatórios.
