print("Cuenta regresiva de 30 al 1")
a=30
b=0
for i in range(a,b,-1):
    o=(f"{i} ")
    if i%4==0 and i%6==0:
        o+="CUATROSEIS"
    elif i%4==0:
        o+="CUATRO"
    elif i%6==0:
        o+="SEIS"
    print(o)