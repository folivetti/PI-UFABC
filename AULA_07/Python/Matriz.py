# -*- coding: cp1252 -*-
'''
ProdMatriz.py
 * Multiplica duas matrizes e imprime o resultado
 * 
 * Entrada: int [][] A, B
 * Saída: double [][] C 
 * Autor: Fabrício Olivetti de França
 *
 * DICA:
 * verifique se as dimensões estão corretas!
'''

f = open("matriz1.csv")
n1,m1 = map(int,f.readline().split(";"))
A = []
for i in range(n1):
    A.append(map(int,f.readline().split(";")))
f.close()

f = open("matriz2.csv")
n2,m2 = map(int,f.readline().split(";"))
B = []
for i in range(n2):
    B.append(map(int,f.readline().split(";")))
f.close()

f = open("vetor1.csv")
n3 = int(f.readline())
x = map(int,f.readline().split(";"))
f.close()

f = open("vetor2.csv")
n4 = int(f.readline())
y = map(int,f.readline().split(";"))
f.close()

# C = A+B
C = [[0]*m1 for _ in range(n1)]
if n1==n2 and m1==m2:
    for i in range(n1):
        for j in range(m1):
            C[i][j] = A[i][j]+B[i][j]
    fw = open("somaMatriz.csv","w")
    print >>fw, C
    fw.close()

# Transposta de A
T = [[0]*n1 for _ in range(m1)]
for i in range(n1):
    for j in range(m1):
        T[j][i] = A[i][j]
fw = open("transposta.csv","w")
print >>fw, T
fw.close()

# produto externo x e y
D = [[0]*n4 for _ in range(n3)]
for i in range(n3):
    for j in range(n4):
        D[i][j] = x[i]*y[j]
fw = open("produtoexterno.csv","w")
print >>fw, D
fw.close()
