# -*- coding: cp1252 -*-
'''
Primo.py
 * Verificar se um número n é primo 
 * Entrada: n (int) 
 * Saída: é primo ou não 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))
i = n-1
primo = True

while i>1:
    if n%i == 0:
        primo = False
        break
    i -= 1
if primo:
    print "É primo"
else:
    print "Não e primo"
