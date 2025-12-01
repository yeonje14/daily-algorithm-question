#include <stdio.h>

int main()
{
    int N = 0, V = 0, count = 0;
    scanf("%d", &N);
    
    int array[100];
    
    for(int i = 0; i < N; i++)
    {
        scanf("%d", &array[i]);
    }
    scanf("%d", &V);
    
    for(int i = 0; i < N; i++)
    {
        if(array[i] == V)
        {
            count++;
        }
    }
    printf("%d", count);
    return 0;
}