#include <stdio.h>

int main()
{
    int N, M, I, J;
    scanf("%d %d", &N, &M);
    int array[101];

    for(int a = 0; a < N; a++)
    {
        array[a] = a + 1;
    }
    
  
    for(int b = 0; b < M; b++)
    {
        scanf("%d %d", &I, &J);
        int left = I - 1;
        int right = J - 1;
        while(left < right)
        {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    for(int a = 0; a < N; a++)
    {
        printf("%d ", array[a]);
    }

    return 0;
}