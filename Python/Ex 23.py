#ex23
v1 = float(input("Digite o primeiro valor: "))
v2 = float(input("Digite o segudo valor: "))
if v1>v2:
  print("O segundo número menor que o primeiro.")
else:
  v3 = float(input("Digite o terceiro valor: "))
  if v3<v2:
    print("O terceiro número é menor que o segundo")
  else:
    v4 = float(input("Digite o quarto valor: "))
    if v4>=v3:
      print(v4, v3, v2, v1)
    else:
      if v4>=v2:
        print(v3, v4, v2, v1)
      else:
        if v4>=v1:
          print(v3, v2, v4, v1)
        else:
          print(v3, v2, v1, v4)