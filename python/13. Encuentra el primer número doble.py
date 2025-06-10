import random
a=random.randint(1,10)
print("---------------------------------------------")
print("adivina el numero y que sea igual o el doble ")
print("---------------------------------------------")
con=0
n=0
print(a)

while True:
    try:
        n=int(input("ingrese un numero: "))
        con+=1
        if n==a or n==a*2:
            print("-----------------------")
            print("ACERTASTES!!!")
            print("Tus intentos son: ",con)
            print("-----------------------")
            break
        else:
            print("ERROR INTENTELO DE NUEVO")
    except ValueError:
        print("ingrese un numero valido")