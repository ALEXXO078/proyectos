cant_alum=int(input("cuantos alumnos han asistido: "))
alum=0
edades=[]

for i in range(cant_alum):
    edad=int(input(f"ingrese la edad del alumno {i+1} : "))
    edades.append(edad)

ed_max=max(edades)
ed_min=min(edades)

#encontramos el indice del maximo y el minimo 

alu_max=edades.index(ed_max)+1
alu_min=edades.index(ed_min)+1

print(f"el mayor es el alumno {alu_max} que tiene {ed_max} años")
print(f"el menor es el alumno {alu_min} que tiene {ed_min} años")



