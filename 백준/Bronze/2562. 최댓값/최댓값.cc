#include <stdio.h>

int main()
{
    int list[9];
    int max, location = 0;

    for(int i = 0; i < 9; i++)
    {
        scanf("%d", &list[i]);
    }

    max = list[0]; 
    location = 1;

    for(int i = 1; i < 9; i++)
    {
        if(list[i] > max)
        {
            max = list[i];
            location = i + 1; 
        }
    }

    printf("%d\n%d", max, location);
    return 0;
}