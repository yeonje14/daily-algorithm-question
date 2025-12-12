#include <stdio.h>
#include <string.h>

int main() {
    char str[1000001];
    int count = 0;
    fgets(str,sizeof(str),stdin);
    
    int len = strlen(str);
    if(str[len - 1] == '\n')
        str[len - 1] = '\0';

    char *token = strtok(str, " ");
    while (token != NULL) 
    {    
        count++;              
        token = strtok(NULL, " "); 
    }

    printf("%d\n", count);     
    return 0;
}