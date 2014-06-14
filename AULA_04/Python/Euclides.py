# -*- coding: cp1252 -*-
'''
Euclides.py
 * Calcular o MDC entre m e n 
 * utilizando o algoritmo de Euclides
 * Entrada: n,m (int) 
 * Saída: mdc 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))
m = int(raw_input("m = "))
r = m%n

while r!=0:
    m = n
    n = r
    r = m%n
print "MDC = ", n
