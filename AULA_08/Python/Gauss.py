# -*- coding: cp1252 -*-
'''
Gauss.py
 * Usar eliminação de Gauss para
 * encontrar a solução de Ax = b
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

def PegaMaiorLinha( A,linha,n ):
    maior = abs(A[linha][linha])
    maiorIdx = linha
    for i in range(linha+1,n):
        if abs(A[i][linha]) > maior:
            maior = abs(A[i][linha])
            maiorIdx = linha
    return maiorIdx

def EliminaGauss(A,b,n):
    x = [0.0]*n

    for linha in range(n):
        maiorLinha = PegaMaiorLinha(A,linha,n)
        A[linha], A[maiorLinha] = A[maiorLinha], A[linha]
        b[linha], b[maiorLinha] = b[maiorLinha], b[linha]

        for i in range(linha+1,n):
            temp = A[i][linha]/A[linha][linha]
            for coluna in range(linha+1,n):
                A[i][coluna] -= temp*A[linha][coluna]
            A[i][linha] = 0
            b[i] -= temp*b[linha]

    for linha in range(n-1,-1,-1):
        temp = b[linha]
        for j in range(n-1,linha,-1):
            temp -= x[j]*A[linha][j]
        x[linha] = temp/A[linha][linha]

    return x

if __name__ == "__main__":
    
    f = open("matriz.csv")
    n,_ = map(int,f.readline().split(";"))
    A = []
    for i in range(n):
        A.append(map(float,f.readline().split(";")))
    f.close()

    f = open("vetor.csv")
    n = int(f.readline())
    b = map(float,f.readline().split(";"))
    f.close()

    x = EliminaGauss( A, b, n )

    fw = open("vetorX.csv","w")
    print >>fw, n
    print >>fw, ";".join(map(str,x))
    fw.close()
