#include<stdio.h>
#include<math.h>

int main()
{
	/*int i, j;
	for (i = 1; i <= 1000; i++)
	{
		j = 0;
		if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
			j++;
		if (i % 100 / 10 == 3 || i % 100 / 10 == 6 || i % 100 / 10 == 9)
			j++;
		if (i % 1000 / 100 == 3 || i % 1000 / 100 == 6 || i % 1000 / 100 == 9)
			j++;
		if (j > 0)
		{
			printf("%d 박수 ", i);
			for (;j>0;j--)
				printf("짝");
			printf("\n");
		}
	}*/ //단순 방법 , 1자릿수가 늘어날때마다 2줄씩 추가.
	int i, j, k;
	int set = 0;
	int count = 0;
	int arr[10];
	for (i = 999900; i <= 999999; i++)
	{
		k = 0;
		j = i;
		while(1)
		{
			j = j % (int)(pow(10,k+1))/(int)(pow(10, k));
			if (j == 0 && i/(int)(pow(10, k)) ==0)
				break;
			arr[k] = j;
			k++;
			j = i - j;
		}
		for (set = 0; set < 10; set++)
		{
			if (arr[set] == 3 || arr[set] == 6 || arr[set] == 9)
				count++;
		}
		if (count > 0)
		{
			printf("%d 박수 ", i);
			for (; count >0; count--)
				printf("짝");
			printf("\n");
		}
		for (j = 0; j < 10; j++)
			arr[j] = 0;
	}  
	return 0;
}