lim=int(input("ingresa el numero limite(que sea un numero mayor que 50 recomendacion): "))
suma=0
con=0
ini=1
while suma + ini**2<=lim:
    suma+=ini**2
    con+=1
    ini+=2
    
print("la suma total es: ",suma," es menos que :",lim,)
print("la cantidad de numeros usados son de: ", con)