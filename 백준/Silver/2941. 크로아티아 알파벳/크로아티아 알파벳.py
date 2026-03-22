import sys

word1 = sys.stdin.readline().strip()

word2 = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in word2:
    word1 = word1.replace(i, '*')

print(len(word1))