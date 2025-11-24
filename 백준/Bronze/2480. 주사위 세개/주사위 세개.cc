#include <stdio.h>

int main()
{
    int first, second, third;
    scanf("%d %d %d",&first, &second, &third);
    
    if (first == second && second == third)
        printf("%d", 10000+(first * 1000));
    else if (first == second || first == third)
        printf("%d", 1000+(first * 100));
    else if (second == third)
        printf("%d", 1000+(second*100));
    else {
        int max = first;
        if (second > max) max = second;
        if (third > max) max = third;
        printf("%d\n", max * 100);
    }
    
    return 0;
}