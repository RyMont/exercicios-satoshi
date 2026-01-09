#ex27
voltas=int(input("Digite o número de voltas: "))
metros=float(input("Digite a extensâo do circuito em metros: "))
tempo=float(input("Digite o tempo em minutos: "))
extensao=metros*voltas
vel=3.6*(extensao/(tempo*60))
print("A velocidade média foi: ", vel)