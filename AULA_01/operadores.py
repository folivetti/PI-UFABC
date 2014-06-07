# para os tipos numericos temos os seguintes operadores:
# + - * / % **

print "Numeros inteiros:"
x = 10
y = 3
print x, "+", y, "=", x + y
print x, "+", y, "=", x - y
print x, "+", y, "=", x*y
print x, "+", y, "=", x/y # repare como o resultado eh um inteiro
print x, "+", y, "=", x % y # esse eh o resto da divisao
print x, "+", y, "=", x**y # esse eh o operador potencia, x elevado a potencia de y
print x, "(",bin(x),") & ",y,"(",bin(y),") =", x&y # operador binario E
print x, "(",bin(x),") | ",y,"(",bin(y),") =", x|y # operador binario OU
print x, "(",bin(x),") ^ ",y,"(",bin(y),") =", x^y # operador binario XOU
print x," igual a ",y,"? ", x==y
print x," diferente de ",y,"? ", x!=y
print x," maior que ",y,"? ", x>y
print x," menor que ",y,"? ", x<y
print x," maior ou igual a ",y,"? ", x>=y
print x," menor ou igual a ",y,"? ", x<=y

print "\nNumeros em ponto flutuante: "
x = 10.0
y = 3.0
print x, "+", y, "=", x + y
print x, "+", y, "=", x - y
print x, "+", y, "=", x*y
print x, "+", y, "=", x/y # agora eh um numero real
print x, "+", y, "=", x % y # esse eh o resto da divisao
print x, "+", y, "=", x**y # esse eh o operador potencia, x elevado a potencia de y

print "\nNumeros complexos:"
x = 1 + 1j
y = 2 + 1j
print x, "+", y, "=", x + y
print x, "+", y, "=", x - y
print x, "+", y, "=", x*y
print x, "+", y, "=", x/y # agora eh um numero real
print x, "+", y, "=", x % y # esse eh o resto da divisao
print x, "+", y, "=", x**y # esse eh o operador potencia, x elevado a potencia de y

print "\nVariaveis Booleanas:"
# agora x eh uma variavel booleana (logica)
x = True
y = False
print "Nao ", x, "=", not x
print x," ou ",y,"=",x or y
print x," e ",y,"=",x and y
x = 10
y = 3
print x, " maior que ", y, " OU ", x, " menor que ", y, "? ", x>y or x<y
print x, " maior que ", y, " E ", x, " menor que ", y, "? ", x>y and x<y

print "\nOperacao com Strings:"
x = "Ola "
y = "Mundo"
print x," + ",y," = ",x+y
print x," *2 = ",x*2
print x,"*2 + ",y," = ",x*2 + y
print "Letra na posicao 0 de x = ",x[0]
print "Concatenar as 3 primeiras letras de x com y = ",x[0:3] + y


# Operadores Relacionais
print "Tem 'a' em Ola? ", "a" in x
print "Nao tem 'b' em Ola? ", "b" not in x

