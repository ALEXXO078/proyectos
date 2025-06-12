temp_ini=20
temp_med=30
temp_fin=35
print("la temperatura del laboratorio es de :",temp_ini,"C")
while temp_ini<=temp_fin:
    temp_ini+=1
    print("la temperatura del laboratorio es de :",temp_ini,"C")
    if temp_ini==temp_med:
        temp_ini-=5
        
        