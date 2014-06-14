# -*- coding: cp1252 -*-
'''
PedraPapelTesoura.py
 * Dada duas entradas nos valores 0 (pedra), 1 (papel) ou 2 (tesoura), 
 * verificar quem ganho o jogo.
 * Entrada: jogador1, jogador2 (int)
 * Saída:  jogador1 ganhou, jogador2 ganhou, empate

Autor: Fabrício Olivetti de França
Disciplina Processamento da Informação
Universidade Federal do ABC
'''


jogador1 = int( raw_input("Pedra (0), Papel (1) ou Tesoura (2)? ") )
jogador2 = int( raw_input("Pedra (0), Papel (1) ou Tesoura (2)? ") )

if jogador1 > jogador2 or jogador1==0 and jogador2 == 2:
    print "Jogador 1 venceu"
elif jogador2 > jogador1 or jogador1==2 and jogador2 == 0:
    print "Jogador 2 venceu"
else:
    print "Empate"
