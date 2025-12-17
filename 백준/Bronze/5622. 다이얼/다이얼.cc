#include <stdio.h>

int main()
{
    char word[15];
    int count = 0;
    scanf("%s", word);
    
    for(int i = 0; word[i] != '\0'; i++)
    {
        if(word[i] == 'A' || word[i] == 'B' || word[i] == 'C')
        {
            count = count + 3;
        }
        else if(word[i] == 'D' || word[i] == 'E' || word[i] == 'F')
        {
            count = count + 4;
        }
        else if(word[i] == 'G' || word[i] == 'H' || word[i] == 'I')
        {
            count = count + 5;
        }
        else if(word[i] == 'J' || word[i] == 'K' || word[i] == 'L')
        {
            count = count + 6;
        }
        else if(word[i] == 'M' || word[i] == 'N' || word[i] == 'O')
        {
            count = count + 7;
        }
        else if(word[i] == 'P' || word[i] == 'Q' || word[i] == 'R' || word[i] == 'S')
        {
            count = count + 8;
        }
        else if(word[i] == 'V' || word[i] == 'T' || word[i] == 'U')
        {
            count = count + 9;
        }
        else if(word[i] == 'W' || word[i] == 'X' || word[i] == 'Y' || word[i] == 'Z')
        {
            count = count + 10;
        }
    }
    printf("%d", count);
    return 0;
    
}