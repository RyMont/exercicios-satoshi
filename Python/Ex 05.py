#ex5
from math import sqrt
a = int(input("Digite o A da equação: "))
b = int(input("Digite o B da equação: "))
c = int(input("Digite o C da equação: "))
delta = (b*b)-(4*a*c)
result1 = (-b+sqrt(delta))/2*a
result2 = (-b-sqrt(delta))/2*a
print(f"As raízes da euquação são {result1} e {result2}")