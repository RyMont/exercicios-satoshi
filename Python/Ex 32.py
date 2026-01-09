#ex32
num=int(input("Digite um número: "))
n=num
fat=1
while num>1:
    fat=fat*num
    num=num-1
print("O fatorial do número", n, "é",fat)