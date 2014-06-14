# -*- coding: cp1252 -*-
'''
Vetores.py
 * Leitura de uma lista de valores
 * cálculo da média, variância,
 * desvio-padrão e menor e maior
 * elementos.
 * Entrada: double [] x
 * Saída: media, var, desvpad, menor, maior
 * Autor: Fabrício Olivetti de França
'''

from math import sqrt

f = open("lista.csv")
n = int(f.readline())
x = map(float, f.readline().split(';'))
f.close()

var = 0.0
maior = menor = x[0]
maiorIdx = menorIdx = 0

media = sum(x)/float(n)
for xx in x:
    var += (xx-media)**2
# var = map( lambda x: (x-media)**2, x )/float(n)    
var /= float(n)
desvpad = sqrt(var)

print media, var, desvpad

for i, xx in enumerate(x):
    if xx > maior:
        maior = xx
        maiorIdx = i
    if xx < menor:
        menor = xx
        menorIdx = i
print "Maior: ", maior, maiorIdx
print "Menor: ", menor, menorIdx

val = float(raw_input("Digite um valor para buscar: "))
for i, xx in enumerate(x):
    if xx==val:
        break
if i<n:
    print "Elemento em ", i
else:
    print "Elemento não encontrado"
