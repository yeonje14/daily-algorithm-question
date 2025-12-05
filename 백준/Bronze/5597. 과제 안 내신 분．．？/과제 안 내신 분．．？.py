submitted = [False] * 31 


for _ in range(28):
    num = int(input())
    submitted[num] = True


for i in range(1, 31):
    if not submitted[i]:
        print(i)