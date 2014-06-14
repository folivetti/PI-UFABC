# -*- coding: cp1252 -*-
'''
Raiz.py
 * Encontrar a raiz n do número x
 * utilizando o método de Newton
 *
 * Entrada: y,n (double) 
 * Saída: raiz
 *
 * Autor: Fabrício Olivetti de França
 * Disciplina Processamento da Informação
 * Universidade Federal do ABC
'''

def f( x,y,n ):
    return x**n - y

def df( x,n ):
    return n*(x**(n-1))

if __name__ == "__main__":

    y = float(raw_input("y = "))
    n = float(raw_input("n = "))
    x = 1.0
    xAnt = 2.0
    while abs(x-xAnt) > 0.01:
        xAnt = x
        x -= f(x,y,n)/df(x,n)
    print "Raíz",n,"de",y,"=",x
        
