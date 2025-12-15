a,b = input().split()

a1 = int(a[::-1])
b1 = int(b[::-1])

print(max(a1, b1))