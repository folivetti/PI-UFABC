# -*- coding: cp1252 -*-
'''
Fibonacci.py
 * Calcular o número de Fibonacci N 
 * Entrada: N (int) 
 * Saída: FN 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

N = int(raw_input("N = "))
fib = 1
fibAnt = 0

if N==0:
    print 0
else:
    for i in range(2,N+1):
        tmp = fib+fibAnt
        fibAnt, fib = fib, tmp
    print fib
