#include<stdio.h>
#include<string.h>

int main()
{
	char* sel[6] = { "push","pop","size","empty","top","end" };
	char s[10];
	int i, count,c,sc;
	int stack[10000];
	sc = 0;
	scanf_s("%d", &count,sizeof(count)); //¸í·ÉÈ½¼ö
	for (i = 0; i < count; i++)
	{
		scanf_s("%s", s, sizeof(s));
		for(c=0;c<6;c++)
			if (strcmp(s,sel[c]))
			{
				stack[sc] = 1;
				sc++;
				break;
			}
	}
	for (i = 0; i < 10; i++)
		printf("%d ", stack[i]);
}