# -*- coding: cp1252 -*-
import math

a = float(raw_input("Entre com o valor de a: "))
b = float(raw_input("Entre com o valor de b: "))
c = float(raw_input("Entre com o valor de c: "))

delta = math.sqrt(b*b - 4*a*c)
x1 = (-b - delta)/(2.0*a)
x2 = (-b + delta)/(2.0*a)
print "x1 = ", x1, " e x2 = ", x2
