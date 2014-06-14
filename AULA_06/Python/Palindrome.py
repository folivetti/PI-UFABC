# -*- coding: cp1252 -*-
'''
Palindrome.py
 * verificar se uma String é
 * uma palindrome.
 * Entrada: String s 
 * Saída: sim ou não 
 * Autor: Fabrício Olivetti de França
'''

s = raw_input("Digite a palavra: ").lower()

palindrome = True
for i in range(len(s)/2):
    if s[i] != s[len(s)-i-1]:
        palindrome = False
        break
print "É palíndrome? ", palindrome
