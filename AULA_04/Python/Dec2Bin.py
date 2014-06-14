# -*- coding: cp1252 -*-
'''
Dec2Bin.py
 * Converter um número decimal 
 * para seu equivalente em binário 
 * Entrada: n (int) 
 * Saída: bin 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))
i = 1
bin = 0
while n!=0:
    bin += (n%2)*i
    i *= 10
    n /= 2
print bin
