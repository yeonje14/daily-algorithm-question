#include <stdio.h>

int main()
{
    int total_price = 0, total_quantity = 0, each_price = 0, each_quantity = 0, sum_price = 0;
    scanf("%d %d", &total_price, &total_quantity);
    
    for(int i = 1; i <= total_quantity; i++)
    {
        scanf("%d %d", &each_price, &each_quantity);
        sum_price = sum_price + (each_price * each_quantity);
    }
    
    if(total_price == sum_price)
        printf("Yes");
    else
        printf("No");
    
    return 0;
}