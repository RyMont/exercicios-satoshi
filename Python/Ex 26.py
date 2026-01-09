#ex26
num1 =  int(input("Digite um número: "))
num2 = int(input("Digite outro número: "))
if num1>num2:
  restodiv = num1%num2
else:
  restodiv = num2%num1
if restodiv==0:
  print("O maior numero é múltiplo do menor")
else:
  print("O maior número não é múltiplo do menor")