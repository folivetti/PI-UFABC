# -*- coding: cp1252 -*-
'''
Dieta.py
 * Leitura de uma matriz e
 * fazer operações na tabela de calorias
 * Entrada: int [][] A
 * Saída: estatísticas 
 * Autor: Fabrício Olivetti de França
'''

f = open("calorias.csv")
A = []
for i in range(3):
    A.append(map(int,f.readline().split(";")))
f.close()
n,m = 3,7

mediaDia = [0.0]*7
mediaRefeicao = [0.0]*3

maior = A[0][0]
diaMaior = 0
for i in range(n):
    for j in range(m):
        mediaDia[j] += A[i][j]/n
        mediaRefeicao[i] += A[i][j]/m
        if A[i][j] > maior:
            maior = A[i][j]
            diaMaior = j

print "\tSeg., Ter., Qua., Qui., Sex., Sab., Dom.,Media"
print "Manhã\t", ",".join(map(str,A[0])), mediaRefeicao[0]
print "Tarde\t", ",".join(map(str,A[1])), mediaRefeicao[1]
print "Noite\t", ",".join(map(str,A[2])), mediaRefeicao[2]
print "\t","\t".join(map(str,mediaDia))

print "Dia de maior caloria foi: ", diaMaior+1
for i in range(m):
    if A[0][i] > mediaRefeicao[0] or A[1][i] > mediaRefeicao[1] or A[2][i] > mediaRefeicao[2]:
        print "Dia ", i+1, "comeu acima da média."
