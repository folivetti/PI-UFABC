# -*- coding: cp1252 -*-
'''
Fatorial.py
 * Calcular o fatorial de um número N
 * Entrada: N (int) 
 * Saída: N! 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

N = int(raw_input("N = "))
fatorial = 1
for i in range(1,N+1):
    fatorial = fatorial*i
print fatorial
