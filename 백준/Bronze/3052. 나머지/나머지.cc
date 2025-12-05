#include <stdio.h>

int main()
{
	int a,b,i,result,count,j;
	int arr[10]; 
	result = 0;
	
	for(i=0; i<10; i++)
	{	
		scanf("%d", &a);
		arr[i] = (a % 42);
	}
	for(i=0;i<10;i++)
	{
		int count = 0;
		for(j=i+1;j<10;j++)
		{
			if(arr[i] == arr[j]) 
            {
                count++;
            }
		}
		if(count == 0) 
        {    
            result++;
        }
		
	}
	printf("%d", result);
	return 0;	
}
