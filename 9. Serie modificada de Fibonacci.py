print("Los primeros números de Fibonacci que sean múltiplos de 4 o de 5 son:")
lim = 100
a, b = 0, 1
while a < lim:
    if a%4==0 or a%5==0:
        print(a)
    a, b = b, a + b

    
    