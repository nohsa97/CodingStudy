#include <stdio.h>
#include <math.h>

int N, r, c;
int Count;
int result;
int resu;
void visit(int x, int y , int z )  
{
	if (z == 1)
	{
		if (x == r && y == c)
		{
			//printf("%d %d\n", r, c);
			result = Count;
			return;
	
		}
		//printf("x =%d , y = %d, c = %d\n", x, y, Count);
		Count++;
	}
	

	else {
		int mid = z / 2;
		visit(x, y, mid);
		visit(x, y + mid, mid);
		visit(x + mid, y, mid);
		visit(x + mid, y+mid, mid);
	}

}

int main()
{
	N = 0;
	r = 0;
	c = 0;
	Count = 0;
	scanf("%d %d %d", &N, &r, &c);

	 // 매트릭스 사이즈.
	int Size = (int)pow(2.0, N);
	
	visit(0, 0, Size);
	printf("%d", result);
	
}