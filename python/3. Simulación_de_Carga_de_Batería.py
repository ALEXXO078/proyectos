bat=5
min=1

while bat<=85:
    men=""
    if bat==50:
        men = "Mitad alcanzada"
    elif bat==85:
        men = "se desconectara automaticamente para cuidar la bateria"
    print(f"minuto {min}, su bateria es de: {bat}% {men}")
    min+=1
    bat+=5

