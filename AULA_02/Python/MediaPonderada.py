# -*- coding: cp1252 -*-
'''
MediaPonderada.py
Calcula a média ponderada entre dois números
Entrada: x,y
Saída: media

Autor: Fabrício Olivetti de França
Disciplina Processamento da Informação
Universidade Federal do ABC
'''

x = float(raw_input("Entre o primeiro valor: "))
y = float(raw_input("Entre o segundo valor: "))
w = float(raw_input("Entre com a ponderação (0<=w<=1): "))
media = ( w*x + (1.0-w)*y )/2.0
print "A média é: ", media
