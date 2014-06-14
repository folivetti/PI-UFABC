# -*- coding: cp1252 -*-
'''
Adivinhe.py
 * Sorteie um número de 1 até 100 
 * e peça para o usuário adivinhar
 * dando dicas se é > ou <
 * Entrada: n (int) 
 * Saída: nada 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

from random import randint

x = randint(1,100)
while True:
    n = int(raw_input("n = "))
    if n>x:
        print "O número é menor!"
    elif n < x:
        print "O número e maior!"
    else:
        print "Acertou"
        break
