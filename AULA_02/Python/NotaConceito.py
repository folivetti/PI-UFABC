# -*- coding: cp1252 -*-
'''
NotaConceitoP.py
 * Dada uma nota x, escrever o conceito correspondente
 * Entrada: faltas, MaxFaltas (inteiros) e nota, limiar (double)
 * Saída:  "A", "R" ou "O"

Autor: Fabrício Olivetti de França
Disciplina Processamento da Informação
Universidade Federal do ABC
'''


nota = float(raw_input("nota = "))
limiar = float(raw_input("limiar = "))
MaxFaltas = float(raw_input("MaxFaltas = "))
faltas = float(raw_input("faltas = "))

if faltas > MaxFaltas:
    print "O"
else:
    if nota >= limiar:
        print "A"
    else:
        print "B"
    
