#include <stdio.h>

int main()
{
	int i, N, X, num;
	scanf("%d %d", &N, &X); 
	for(i=1;i<=N;i++)
	{
		scanf("%d", &num);
		if(X>num)
		{
			printf("%d ", num);
		}
	}
	
	return 0;
}