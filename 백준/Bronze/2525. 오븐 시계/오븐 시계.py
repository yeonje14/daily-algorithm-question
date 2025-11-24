hour, minute = map(int, input().split())
add = int(input())

total = (hour * 60) + minute + add
hour = total // 60
minute = total % 60

if hour >= 24:
    hour %= 24

print(hour, minute)