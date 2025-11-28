#include <stdio.h>

int main()
{
	int a,i, A,B;
	scanf("%d", &a);
	for(i=1;i<=a;i++)
	{
		scanf("%d %d", &A, &B);
		printf("Case #%d: %d\n", i, A+B);
	}
	return 0;
}
