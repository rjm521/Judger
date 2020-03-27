#include <stdio.h>

int main()
{
	int s = 0;
        int x = 0;
	for(int i = 1; i <= 10; i ++)
	{
		scanf("%d", &x);
		s += x;
	}
	printf("add 1 to 10 equals: %d\n", s);
	return 0;
}
