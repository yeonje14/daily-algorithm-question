#include <stdio.h>
#include <string.h>

int main()
{
    char word[101];
    int index[26];    
    scanf("%s", word);
    
    for(int i = 0; i < 26; i++)
    {
        index[i] = -1;
    }
    for(int i = 0; word[i] != '\0'; i++)
    {
        int ch = word[i] - 'a';
        if(index[ch] == -1)
        {
            index[ch] = i;
        }
    }
    for(int i = 0; i < 26; i++)
    {
        printf("%d ", index[i]);
    }
    return 0;
}