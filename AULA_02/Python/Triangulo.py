# -*- coding: cp1252 -*-
'''
Triangulo.py
 * Dada as três dimensões de um triângulo
 * determinar se é realmente um triângulo e qual tipo ele é
 * Entrada: x,y,z (double)
 * Saída:  se é triângulo e qual tipo

Autor: Fabrício Olivetti de França
Disciplina Processamento da Informação
Universidade Federal do ABC
'''


x = int( raw_input("x = ") )
y = int( raw_input("x = ") )
z = int( raw_input("x = ") )

if x+y > z and x+z > y and y+z > x:
    if x==y and y==z:
        print "Equilatero"
    elif x==y or y==z or x==z:
        print "Isóceles"
    else:
        print "Escaleno"
else:
    print "Não é um triângulo"
