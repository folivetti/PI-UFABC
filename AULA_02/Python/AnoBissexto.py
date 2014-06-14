# -*- coding: cp1252 -*-
'''
AnoBissexto.py
Verifica se um dado ano é bissexto
Entrada: ano
Saída: sim ou não

Autor: Fabrício Olivetti de França
Disciplina Processamento da Informação
Universidade Federal do ABC
'''

ano = float(raw_input("Qual ano? "))

if ano%400 == 0 or (ano%4==0 and ano%100==0):
    print "É bissexto
else:
    print "Não é bissexto"
