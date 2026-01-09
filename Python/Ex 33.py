#ex33
num=int(input("Digite um número: "))
resultado=1
ctd=1
if num==0:
  resultado=0
else:
  while ctd!=num:
    ctd=ctd+1
    resultado=resultado+(1/ctd)
print(resultado)