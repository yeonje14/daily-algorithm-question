#include <stdio.h>
#include <string.h>
#include <ctype.h>

char str[1000001];
int alphabet[26];

int main()
{
    if(scanf("%s", str) == EOF) return 0;
    
    for(int i = 0; str[i] != '\0'; i++)
    {
        char c = toupper(str[i]);
        alphabet[c - 'A']++;
    }
    
    int max = 0;
    char result = 0;
    int duplicate = 0;
    
    for(int i = 0; i < 26; i++)
    {
        if(alphabet[i] > max)
        {
            max = alphabet[i];
            result = i + 'A';
            duplicate = 0;
        }
        else if(alphabet[i] == max && max != 0)
        {
            duplicate = 1;
        }
    }
    
    if(duplicate)
    {
        printf("?\n");
    }
    else
    {
        printf("%c\n", result);
    }
    
    return 0;
}