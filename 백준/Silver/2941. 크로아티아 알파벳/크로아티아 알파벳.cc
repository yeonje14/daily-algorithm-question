#include <stdio.h>
#include <string.h>

int main()
{
    char input[101];
    int count = 0;
    
    if(scanf("%s", input) != 1) return 0;
    
    int len = strlen(input);
    
    for (int i = 0; i < len; i++) {
        count++;

        if (input[i] == 'd' && input[i+1] == 'z' && input[i+2] == '=') {
            i += 2; 
        }
        else if (input[i] == 'c' && (input[i+1] == '=' || input[i+1] == '-')) {
            i += 1;
        }
        else if (input[i] == 'd' && input[i+1] == '-') {
            i += 1;
        }
        else if ((input[i] == 'l' || input[i] == 'n') && input[i+1] == 'j') {
            i += 1;
        }
        else if ((input[i] == 's' || input[i] == 'z') && input[i+1] == '=') {
            i += 1;
        }
    }
    printf("%d", count);
    
    return 0;
}