remainders = []

for _ in range(10):
    num = int(input())
    remainder = num % 42
    if remainder not in remainders:
        remainders.append(remainder)

print(len(remainders))