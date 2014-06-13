AULA 08
========

Nessa aula aprendemos organizar nosso código através do uso de rotinas. Rotinas são úteis também para reutilizar parte do código em outros programas.

Uma rotina é declarada como:

```java
class Programa{
      public static tipo_retorno NomeRotina( tipo_entrada entrada ){
           // a rotina é escrita aqui
           return saida;
      }
      
      public static void main( String [] args ){
          // programa principal
          int x = NomeRotina( y ); // chama a rotina e guarda o retorno em x
      }
```


Atividade em aula
------------------
Alterar o programa Bois e Vacas para fazer com que o computador jogue sozinho de maneira inteligente.

Exercícios
-----------

### 01 - Operações com Matrizes (Fácil)
Escreva um código com todas as operações em matrizes da aula passada separadas em subrotinas.

### 02 - Incêndio na Floresta (Fácil)
Reescreva o código Floresta.java para definir as subrotinas: GeraFloresta(), AtualizaFloresta(), ImprimeFloresta(), Densidade(). Como ficou a legibilidade do seu código?

### 03 - Jogo da Zebra (Avançado)
Complete o código Zebra.java para encontrar o dono da zebra no quebra-cabeça lógico proposto. O código já contém uma função para gerar uma lista de permutações.
