# o tipo de x eh int
x = 10
print x, type(x)

# podemos escrever o numero em octal precedendo por 0,
# mas x continua sendo int
x = 010
print x, type(x)

# podemos escrever o numero em hexadecimal precedendo por 0x,
# mas x continua sendo int
x = 0x0F
print x, type(x)

# se o numero inteiro eh muito grande (> 9223372036854775807)
# coloque L ao final do numero
x = 9223372036854775807L
print x, type(x)

# agora x eh um float
x = 10.3
print x, type(x)
# ou em notacao cientifica
x = 1.5e+12
print x, type(x)

# tambem podemos trabalhar com numeros complexos
x = 3 + 5j
print x, type(x)

# agora x eh uma variavel booleana (logica)
x = True 
print x, type(x)

# agora x eh uma string
x = "Agora o tipo de x mudou novamente" 
print x, type(x)

# podemos converter uma string para int
x = int("10")
print x, type(x)
# e int para string
x = str(10)
print x, type(x)

# mas cuidado para converter o que eh valido
# comente a proxima linha apos verificar o erro
x = int("ops")
