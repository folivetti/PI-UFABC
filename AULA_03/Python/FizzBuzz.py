# -*- coding: cp1252 -*-
'''
FizzBuzz.py
 * Para a sequência de números de 1 até 100
 * imprimir os números em ordem crescente substituindo
 * múltiplos de 3 por Fizz, múltiplos de 5 por Buzz
 * e múltiplos de 3 e 5 por FizzBuzz
 * Entrada: nenhuma 
 * Saída: FizzBuzz
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

for i in range(1,101):
    if i%15 == 0:
        print "FizzBuzz"
    elif i%3 == 0:
        print "Fizz"
    elif i%5 == 0:
        print "Buzz"
    else:
        print i
