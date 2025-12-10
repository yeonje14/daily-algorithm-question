#include <stdio.h>

int main()
{
    int N = 0, result = 0;
    scanf("%d", &N);
    char arr[101];
    scanf("%s", arr);
    for(int i = 0; i < N; i++)
    {
        result += arr[i] - '0';
    }
    printf("%d", result);
    return 0;
    
}