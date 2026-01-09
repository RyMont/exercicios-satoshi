#ex29
inv=0
valor=float(input("Digite o valor do investimento: "))
while inv!=1 and inv!=2:
  inv=int(input("Digite o tipo de investimento poupança (1) e renda fixa (2): "))
if inv==1:
  total=valor*1.03
else:
  total=valor*1.05
print("O valor a ser retirado aós 1 mês é de:", total)