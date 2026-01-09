#ex15
from math import sqrt
cat1 = float(input("Digite o primeiro cateto: "))
cat2 = float(input("Digite o segundo cateto: "))
hip = sqrt((cat1*cat1)+(cat2*cat2))
print(f"A hipotenusa deste triângulo é {hip}")