#include <stdio.h>

int main()
{
    int N;
    scanf("%d", &N);
    
    for(int i = 0; i < N; i++)
    {
        for(int a = 0; a < N - 1 - i; a++)
        {
            printf(" ");
        }
        for(int b = 0; b < (2 * i + 1); b++) 
        {
            printf("*");
        }
        printf("\n");
    }
    for(int j = 0; j < N - 1; j++)
    {
        for(int c = 0; c <= j; c++)
        {
            printf(" ");
        }
        for(int d = 0; d < 2 * (N - 1 - j) - 1; d++)
        {
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}