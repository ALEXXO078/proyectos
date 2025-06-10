import random
n=random.randint(1,50)
inte=5
for i in range(inte):
    print("-----------------------")
    print(f"sus intentos son: {inte}")
    ing=int(input("adivine el numero: "))
    print("-----------------------")
    inte-=1
    print(n)
    if ing==n:
        print("-----------------------")
        print("¡Correcto!")
        print("-----------------------")
        break
    elif inte==0 :
        print("-----------------------")
        print("Fallaste")
        print("-----------------------")
    if ing<n and ing%2==0:
        print("-----------------------")
        print("ESTAS CERCA")
        print("-----------------------")
    elif ing>n :
        print("-----------------------")
        print("intenta un numero menor")
        print("-----------------------")
