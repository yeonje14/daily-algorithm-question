#include <stdio.h>

int main()
{
    int a[6];
    int b[6] = {1,1,2,2,2,8};
    for(int i = 0; i < 6; i++)
    {
        scanf("%d", &a[i]);
    }
    
    for(int j = 0; j < 6; j++)
    {
        printf("%d ", b[j]-a[j]);
    }
    
    return 0;
}