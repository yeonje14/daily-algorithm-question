#include <stdio.h>

int main()
{
    char N[1000];
    int num;
    scanf("%s %d", &N, &num);
    printf("%c", N[num-1]);
    return 0;  
}