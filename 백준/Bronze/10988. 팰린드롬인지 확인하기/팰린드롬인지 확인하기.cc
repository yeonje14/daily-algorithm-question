#include <stdio.h>
#include <string.h>

int main() {
    char word[105];
    
    if(fgets(word, sizeof(word), stdin) == NULL)
        return 0;
    word[strcspn(word,"\n")] = '\0';
    
    int len = strlen(word);
    int palindrome = 1;
    
    for(int i = 0; i < len / 2; i++)
    {
        if(word[i] != word[len - 1 - i])
        {
            palindrome = 0;
            break;
        }
    }
    printf("%d\n", palindrome);
    
    return 0;
}