# -*- coding: cp1252 -*-
'''
OrdemCrescente.py
 * Imprimir os 3 números em ordem crescente
 * Entrada: x,y,z (int)
 * Saída: números em ordem crescente

Autor: Fabrício Olivetti de França
Disciplina Processamento da Informação
Universidade Federal do ABC
'''


x = float(raw_input("x = "))
y = float(raw_input("y = "))
z = float(raw_input("z = "))

if x<y and x<z:
    if y<z:
        print x,y,z
    else:
        print x,z,y
elif y<z:
    if x<z:
        print y,x,z
    else:
        print y,z,x
else:
    if x<y:
        print z,x,y
    else:
        print z,y,x
