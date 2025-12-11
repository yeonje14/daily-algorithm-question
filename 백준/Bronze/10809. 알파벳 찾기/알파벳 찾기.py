word = input()
index = [-1] * 26

for i in range(len(word)):
    ch = ord(word[i]) - ord('a')
    if index[ch] == -1:
        index[ch] = i

for i in range(26):
    print(index[i], end = ' ')