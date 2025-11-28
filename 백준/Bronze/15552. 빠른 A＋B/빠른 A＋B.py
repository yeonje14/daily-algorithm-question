import sys

input = sys.stdin.readline
N = int(input())
output = []

for _ in range(N):
    A, B = map(int, input().split())
    output.append(str(A + B))

sys.stdout.write('\n'.join(output))