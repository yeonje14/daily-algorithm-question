total_price = int(input())
total_quantity = int(input())
sum_price = 0

for i in range(total_quantity):  
    each_price, each_quantity = map(int, input().split())
    sum_price += each_price * each_quantity

if total_price == sum_price:
    print("Yes")
else:
    print("No")
