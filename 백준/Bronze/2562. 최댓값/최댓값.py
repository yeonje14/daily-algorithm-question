max_data = 0
location = 0

for i in range(9):
    num = int(input())
    if num > max_data:
        max_data = num
        location = i + 1

print(max_data)
print(location)