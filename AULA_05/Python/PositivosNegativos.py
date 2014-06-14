# -*- coding: cp1252 -*-
'''
PositivosNegativos.py
 * Leitura de uma lista de valores 
 * separar positivos de negativos. 
 * Entrada: double [] x
 * Saída: double [] pos, neg 
 * Autor: Fabrício Olivetti de França
'''

f = open("lista.csv")
n = int(f.readline())
x = map(float, f.readline().split(';'))
f.close()

positivo = []
negativo = []
for i in x:
    if i > 0:
        positivo.append(i)
    elif i < 0:
        negativo.append(i)
print positivo, negativo
