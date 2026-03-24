#include <stdio.h>
#include <string.h>

int main()
{
    int num = 0;
    int total_group_word = 0;
    
    if(scanf("%d", &num) != 1) return 0;
    
    char word[101];
    
    for(int i = 0; i < num; i++)
    {
        int alphabet[26] = {0};
        int is_bad = 0;
        
        scanf("%s", word);
        int length = strlen(word);
        
        for(int j = 0; j < length; j++)
        {
            int index = word[j] - 'a';
            
            if(alphabet[index] > 0)
            {
                if(word[j] != word[j-1])
                {
                    is_bad = 1;
                    break;
                }
            }
            alphabet[index]++;
        }
        if(is_bad == 0)
        {
            total_group_word++;
        }
    }
    printf("%d", total_group_word);
    
    return 0;
}
