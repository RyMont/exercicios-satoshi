#ex21
n1 = float(input("Digite a primeira nota:"))
n2 = float(input("Digite segunda nota: "))
n3 = float(input("Digite a terceira nota: "))
n4 = float(input("Digite a quarta nota: "))
media = (n1+n2+n3+n4)/4
if media >=6:
  print("Aprovado")
if media>=3 and media<6:
  print("Exame")
if media<3:
  print("Retido")