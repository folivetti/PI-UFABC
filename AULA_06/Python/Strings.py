# -*- coding: cp1252 -*-
'''
Strings.py
 * realizar inversão da String
 * checar se ela é um pangram
 * contar frequência de cada letra
 * calcular entropia
 * Entrada: String s 
 * Saída: -- 
 * Autor: Fabrício Olivetti de França
'''
from math import log

s = raw_input("Digite a palavra: ").lower()

freq = [0]*26
inv = ''
for i in range(len(s)):
    inv += s[len(s)-i-1]
    if s[i]!=' ':
        freq[ord(s[i])-ord('a')] += 1

print inv

pangram = True
for i in range(26):
    if freq[i]==0:
        pangram=False
        break
print "É pangram? ", pangram

entropia = 0.0
for i in range(26):
    if freq[i]>0:
        p = freq[i]/float(len(s))
        entropia -= p*log(p,2)
print entropia
