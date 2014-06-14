# -*- coding: cp1252 -*-
'''
GeraPalindromo.py
 * Crie uma rotina que retorne o inverso de um número
 * Use tal rotina para gerar um palindromo.
 *
 * Entrada: n (int) 
 * Saída: palindromo
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

def Inverso( n ):
    inverso = 0
    while n!= 0:
        inverso = inverso*10 + n%10
        n /= 10
    return inverso

if __name__ == "__main__":

    n = int(raw_input("Digite um número: "))
    maxTentativas = 100
    inv = 0
    for it in range(maxTentativas):
        inv = Inverso(n)
        if n==inv:
            break
        n += inv
    if inv==n:
        print "Obtive ",n," após",it,"tentativas"
    else:
        print "Desisto"
