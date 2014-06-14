# -*- coding: cp1252 -*-
'''
SomaDigitos.py
 * Somar os dígitos de um número n 
 * Entrada: n (int) 
 * Saída: soma (int) 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))

soma = 0

while n!=0:
    soma += n%10
    n /= 10
print soma
