#include <stdio.h>

int main()
{
    int array[31] = {0};
    int min = 31, max = 0;

    for (int i = 0; i < 28; i++) 
    {
        int num;
        scanf("%d", &num);
        array[num] = 1; 
    }

    for (int i = 1; i <= 30; i++) 
    {
        if (array[i] == 0)
        { 
            if (i > max) max = i;
            if (i < min) min = i;
        }
    }

    printf("%d\n%d", min, max);

    return 0;
}