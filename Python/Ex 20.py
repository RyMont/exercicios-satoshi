#ex20
from math import sqrt
a = int(input("Digite o A da equação: "))
b = int(input("Digite o B da equação: "))
c = int(input("Digite o C da equação: "))
delta = (b*b)-(4*a*c)
if delta<=0:
  print("Não existem raízes reais.")
else:
  raiz1 = (-b+sqrt(delta))/2*a
  raiz2 = (-b-sqrt(delta))/2*a
  print("As raízes da equação são", raiz1, "e", raiz2)