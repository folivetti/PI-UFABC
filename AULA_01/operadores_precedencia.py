# para os tipos numericos temos os seguintes operadores:
# + - * / % **

print "Numeros inteiros:"
a = 20
b = 10
c = 15
d = 5

# A precedencia de operadores eh:
# **
# * / %
# + -
# &
# ^ |
# <=, <, >=, >
# <>, ==, !=
#
# Use parenteses para facilitar a leitura

print a + b * c - a+b**d # o que isso esta fazendo?
print a + (b*c) - a + (b**d) # melhor!

e = (a + b) * c / d       #( 30 * 15 ) / 5
print "Valor de (a + b) * c / d = ",  e

e = ((a + b) * c) / d     # (30 * 15 ) / 5
print "Valor de ((a + b) * c) / d = ",  e

e = (a + b) * (c / d);    # (30) * (15/5)
print "Valor de (a + b) * (c / d) = ",  e

e = a + (b * c) / d;      #  20 + (150/5)
print "Valor de a + (b * c) / d = ",  e
