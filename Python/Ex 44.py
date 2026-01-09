#ex44
base=int(input("Digite o valor da base: "))
pot=int(input("Digite o valor da potencia: "))
resul=base
for ctd in range(1,pot):
  resul=resul*base
print(resul)