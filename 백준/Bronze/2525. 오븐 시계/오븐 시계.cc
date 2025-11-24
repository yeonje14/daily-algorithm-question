#include <stdio.h>

int main()
{
    int a,b,c;
    
    scanf("%d %d", &a, &b);
    scanf("%d", &c);
    
    a = a + (b+c)/60;
    b = (b+c)%60;
    
    if(a>23)
        printf("%d %d",a-24, b);
    else
        printf("%d %d",a,b);
    
    
           
    return 0;
            
    
}