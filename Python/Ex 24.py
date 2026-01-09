#ex24
valor = int(input("Digite um valor: "))
div2 = valor%2
div3 = valor%3
if div2==0 and div3==0:
  print("O número digitado é divisível por 2 e 3.")
else:
  print("O número digitado não é divisivel por 2 e 3.")