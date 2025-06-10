lim = 16
a, b = 0, 1
for i in range(lim):
    a, b = b, a + b
    print(a,end=" ")