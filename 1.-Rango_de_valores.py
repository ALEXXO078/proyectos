ran1=int(input("ingrese el 1er numero del rango: "))
ran2=int(input("ingrese el 2do numero del rango: "))

print("\nlos numeros que su producto es impar son: ")

def sum_dig(n):
    return sum(int(d) for d in str(n))

for num in range(ran1,ran2+1):
    if sum_dig(num) %2!=0:
        print (num)