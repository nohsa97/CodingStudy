#include <stdio.h>

int A, B, C;
int result;
//int cnt = 0;
int mul(int a, int b, int c)
{
	if (b == 1)
	{

		result = result*a;
		printf("%d\n", result);
		return result = result%c;
	}

	else
	{
		int mid = b / 2;
		if (b % 2 == 0)
		{
			mul(a, mid, c);
			mul(a, mid, c);
		}
		else {
			mul(a, mid, c);
			mul(a, mid + 1, c);
		}
	}
}

int main()
{
	scanf("%d %d %d", &A, &B, &C);
	result = 1;
	result = mul(A,B,C);
	printf("%d", result);
}