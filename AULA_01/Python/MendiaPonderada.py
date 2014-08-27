# -*- coding: cp1252 -*-
x = float(raw_input("Entre o primeiro valor: "))
y = float(raw_input("Entre o segundo valor: "))
w = float(raw_input("Entre com a ponderação (0<=w<=1): "))
media = ( w*x + (1.0-w)*y )/2.0
print "A média é: ", media
