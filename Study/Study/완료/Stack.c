#include<stdio.h>
#include<string.h>

int main()
{
	char* sel[5] = { "push","pop","size","empty","top"};     // ��ɾ�
	char s[10];			//�Է¹��� ���ڿ�
	int i, count,sc;      // count Ƚ��, sc= push�� �Է¹��� ����
	int stc = 0;   // ���� ���� ����Ű�°�
	int stack[10000];
	for (i = 0; i < 10000; i++)
		stack[i] = 0;
	sc = 0;
	scanf_s("%d", &count,sizeof(count)); //���Ƚ��
	for (i = 0; i < count; i++)
	{
		scanf_s("%s", s, sizeof(s));
			if (strcmp(s,sel[0])==0)		 //push �϶�
			{
				scanf_s("%d", &sc, sizeof(sc));
				stack[stc] = sc;
				stc++;								//�Է¹ް� �ְ� ����
			}
			else if (strcmp(s, sel[1]) == 0)
			{
				if (stack[0] == 0)
					printf("-1\n");
				else {
					printf("%d\n", stack[stc-1]);
					stack[stc-1] = 0;
					stc--;								//pop�϶� �������� ��������ϴµ� �ϴ� ����Ű�°� ��������Ʈ�ϱ� -1�ؼ� �����ְ� ����
				}
			}
			else if (strcmp(s, sel[2]) == 0)
				printf("%d\n", stc);				// size�� �� stc���.
			else if (strcmp(s, sel[3]) == 0)
			{
				if (stc == 0)
					printf("1\n");
				else printf("0\n");				// empty�� ���
			}
			else if (strcmp(s, sel[4]) == 0)
			{
				if (stc == 0)
					printf("-1\n");
				else printf("%d\n", stack[stc-1]);		//  top�� ��쵵 pop�� ���� ���� ������
			}
	}
	for (i = 0; i < 10; i++)
		printf("%d ", stack[i]);			// ��� ���� ��¿�
	return 0;
}