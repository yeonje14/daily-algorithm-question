#include <stdio.h>

int main()
{
    int N = 0, A = 0, B = 0;
    scanf("%d", &N);
    while(N--)
    {
        scanf("%d %d", &A, &B);
        printf("%d\n", A+B);
    }
    return 0;
}