#include <stdio.h>

int main()
{
    int N = 0, byte = 0;
    scanf("%d", &N);
    while(N >= 1)
    {
        printf("long ");
        N -= 4;   
    }
    printf("int");
    return 0;
}