#ex36
num=int(input("Digite um número: "))
n=num
resultado=1
fat=1
if num==0:
  resultado=0
else:
  for ctd in range(1,n+1):
      fat=fat*ctd
      resultado=resultado+(1/fat)
print(resultado)