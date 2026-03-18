import sys
from collections import Counter


word = sys.stdin.readline().strip().upper()

count = Counter(word)

if not count:
    exit()

max_count = max(count.values())

max_chars = [char for char, c in count.items() if c == max_count]

if len(max_chars) > 1:
    print("?")
else:
    print(max_chars[0])