# -*- coding: cp1252 -*-
'''
Anagrama.py
 * Verificar se duas strings
 * s1 e s2 são anagramas uma
 * da outra.           
 *
 * Entrada: String s1, s2 
 * Saída: sim ou não
 * Autor: Fabrício Olivetti de França
'''

s = raw_input("Digite a palavra: ").lower()

mapa = {'a':'4', 'c':'(', 'e':'&', 'g':'6', 'h':'#', 'i':'!', 'o':'0',
        's':'$','t':'7','x':'%'}

s2 = ''.join(map(lambda x: mapa[x] if x in mapa else x, s))
print s2
