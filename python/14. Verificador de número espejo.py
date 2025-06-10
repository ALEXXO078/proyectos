num=input("ingrese el 1er numero: ")
while True:
    num_esp=int(input("ingrese el 2do numero: "))

    #numero 1
    s,p=num
    q=p+s
    nu=int(q)

    #comparacion

    if num_esp==nu:
        print(f"""su numero ingresado fue de:{num} y su numero al reves es de:{nu}
            Su Numero Ha Coincidido :)""")
        break
    else:
        print("el 2do numero no es el reflejo del 1er numero ")