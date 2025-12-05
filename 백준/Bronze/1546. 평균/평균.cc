#include <stdio.h>

int main()
{
    int N = 0;
    int score1[1000] = {0,};
    int max = 0;
    double avg = 0;
    double score2[1000] = {0.0,};
    scanf("%d", &N);
    
    for(int i = 0; i < N; i++)
    {
        int num = 0;
        scanf("%d", &num);
        score1[i] = num;
    }
    for(int i = 0; i < N; i++)
    {
        if(score1[i] > max)
        {
            max = score1[i];
        }
    }
    for(int i = 0; i < N; i++)
    {
         score2[i] = (double)score1[i]/max*100;  
         avg = score2[i] + avg;
    }
    printf("%.2lf", avg/N);
    return 0;
}