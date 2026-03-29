#include <stdio.h>
#include <string.h>

int main()
{
    char subject[51];
    double credit;
    char grade[3];
    
    double total_score = 0.0;
    double total_credits = 0.0;
    
    for(int i = 0; i < 20; i++)
    {
        if(scanf("%s %lf %s", subject, &credit, grade) == EOF)
            break;
        if(strcmp(grade, "P") == 0)
            continue;
        double point = 0.0;
        if(grade[0] == 'A')
            point = 4.0;
        else if(grade[0] == 'B')
            point = 3.0;
        else if(grade[0] == 'C')
            point = 2.0;
        else if(grade[0] == 'D')
            point = 1.0;
        else if(grade[0] == 'F')
            point = 0.0;
        
        if(grade[1] == '+')
            point += 0.5;
        
        total_score += (credit * point);
        total_credits += credit;
    }
    
    if(total_credits != 0)
    {
        printf("%lf\n", total_score / total_credits);
    }
    return 0;
}

      