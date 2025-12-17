word = input()
count = 0

for r in word:
    if r in "ABC":
        count += 3
    elif r in "DEF":
        count += 4
    elif r in "GHI":
        count += 5
    elif r in "JKL":
        count += 6
    elif r in "MNO":
        count += 7
    elif r in "PQRS":
        count += 8
    elif r in "TUV":
        count += 9
    elif r in "WXYZ":
        count += 10
print(count)