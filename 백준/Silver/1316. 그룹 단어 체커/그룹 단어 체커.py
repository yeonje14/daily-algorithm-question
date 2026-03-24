import sys

num = int(sys.stdin.readline())
total_group_word = 0

for _ in range(num):
    word = sys.stdin.readline().strip()
    visited = [] 
    is_bad = False
    
    for i in range(len(word)):
        if word[i] in visited:
            if word[i] != word[i-1]:
                is_bad = True
                break
        else:
            visited.append(word[i])
            
    if not is_bad:
        total_group_word += 1

print(total_group_word)