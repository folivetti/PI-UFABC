# -*- coding: cp1252 -*-
'''
ListaNumero.py
 * Listar os N primeiros números naturais separados por vírgula 
 * Entrada: N (int) 
 * Saída: lista separado por vírgula 
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

N = int(raw_input("N = "))
for i in range(N+1):
    print i,
    if i==N:
        break
    print ",",
