#ex45
num=1
den=num
serie=0
alt=1
while num!=16:
  serie=serie+((num/den)*alt)
  alt=alt*(-1)
  num=num+1
  den=num*num
print(serie)