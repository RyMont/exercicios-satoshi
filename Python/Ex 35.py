#ex35
n1=int(input("Digite um número: "))
n2=int(input("Digite outro numero: "))
sum=0
if n1>n2:
  maior=n1
  maior2=n1
  menor=n2
  menor2=n2
else:
  maior=n2
  maior2=n2
  menor=n1
  menor2=n1
diff=maior-menor
while menor<maior:
  if menor%2==1:
    sum=sum+menor
  menor=menor+1
print("A somatória de todos os números ímpares entre", menor2, "e", maior, "é" ,sum)