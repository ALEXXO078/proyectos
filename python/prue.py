alt=int(input("ingrese la altura de la piramide: "))
a="*"
i=alt+1
for i in range(alt):
    al=i
    est=2*(alt-i)-1
    print(" "*al+a*est)
    