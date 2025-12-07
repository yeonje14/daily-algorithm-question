#include <stdio.h>
#include <string.h>

int main()
{
    int num = 0;
    char list[1000];
    scanf("%d", &num);
    while(num--)
    {
        scanf("%s", list);
        int len = strlen(list); 
        printf("%c%c\n", list[0], list[len - 1]); 
    }
    return 0;
}