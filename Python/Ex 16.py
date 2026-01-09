#ex16
hrs = float(input("Digite o numero de horas trabalhadas: "))
valorhr = float(input("Digite o valor/hora: "))
desconto = float(input("Digite o percentual de desconto: "))
dependentes = int(input("Digite o número de dependentes: "))
bruto = hrs*valorhr
liquido = bruto*(1-(desconto/100))+dependentes*100
print("O salário liquido é:", liquido)