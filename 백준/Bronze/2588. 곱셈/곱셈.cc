#include <stdio.h>

int main(){
    int a,b,num1,num2,num3,sum;
    
    scanf("%d %d", &a, &b);
    
    num1 = a*(b%10);
    num2 = a*((b/10)-(b/100)*10);
    num3 = a*(b/100);
      
    printf("%d\n", num1);
    printf("%d\n", num2);
    printf("%d\n", num3);
    printf("%d", num1+num2*10+num3*100);
    
    return 0;
}