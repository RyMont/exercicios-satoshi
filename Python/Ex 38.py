#ex38
n=int(input("Digite um número: "))
if n<0:
    while n<0:
      print("Número invalido, digite novamente. ")
      n=int(input("Digite um número:"))
menor=n
maior=n
for ctd in range(1,100):
  n=int(input("Digite um número: "))
  if n<0:
    while n<0:
      print("Número invalido, digite novamente. ")
      n=float(int("Digite um número: "))
  else:
    if (n>maior):
      maior=n
    if (n<menor):
      menor=n
print("O maior número é:",maior)
print("O menor número é:",menor)