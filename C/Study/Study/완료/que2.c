#include<stdio.h>
#include<string.h>

int main()
{
	char* sel[6] = { "push","pop","size","empty","front", "back" };     // 명령어
	char s[10];			//입력받을 문자열
	int i, count, sc;      // count 횟수, sc= push때 입력받을 정수
	int stc = 0;   // 스택 맨위 가르키는것
	int quc = 0;  // pop할때 쓰임
	int que[10000];
	for (i = 0; i < 10000; i++)
		que[i] = 0;
	sc = 0;
	scanf_s("%d", &count, sizeof(count)); //명령횟수
	for (i = 0; i < count; i++)
	{
		scanf_s("%s", s, sizeof(s));
		if (strcmp(s, sel[0]) == 0)		 //push 일때
		{
			scanf_s("%d", &sc, sizeof(sc));
			que[stc] = sc;
			stc++;								//입력받고 넣고 증가
		}
		else if (strcmp(s, sel[1]) == 0)
		{
			if (que[0] == 0)
				printf("-1\n");
			else {
				printf("%d\n", que[0]);
				while (1)
				{
					if (que[quc] == 0)
						break;
					que[quc] = que[quc + 1];
					quc++;							//맨앞부터 뒤에걸 넣고, 만약 그다음 숫자가 0일경우 걍 탈출
				}
				quc = 0;
				stc--;								//pop일때 맨위수를 보여줘야하는데 일단 가르키는건 다음포인트니까 -1해서 보여주고 감소
			}
		}
		else if (strcmp(s, sel[2]) == 0)
			printf("%d\n", stc);				// size는 걍 stc출력.
		else if (strcmp(s, sel[3]) == 0)
		{
			if (stc == 0)
				printf("1\n");
			else printf("0\n");				// empty도 출력
		}
		else if (strcmp(s, sel[4]) == 0)
		{
			if (stc == 0)
				printf("-1\n");
			else printf("%d\n", que[0]);		//  top의 경우도 pop과 같이 전걸 보여줌
		}
		else if (strcmp(s, sel[5]) == 0)
		{
			if (stc == 0)
				printf("-1\n");
			else printf("%d\n", que[stc-1]);		//  top의 경우도 pop과 같이 전걸 보여줌
		}
	}
	for (i = 0; i < 10; i++)
		printf("%d ", que[i]);			// 얜걍 스택 출력용
	return 0;
}