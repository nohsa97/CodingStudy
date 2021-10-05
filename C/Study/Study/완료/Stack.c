#include<stdio.h>
#include<string.h>

int main()
{
	char* sel[5] = { "push","pop","size","empty","top"};     // 명령어
	char s[10];			//입력받을 문자열
	int i, count,sc;      // count 횟수, sc= push때 입력받을 정수
	int stc = 0;   // 스택 맨위 가르키는것
	int stack[10000];
	for (i = 0; i < 10000; i++)
		stack[i] = 0;
	sc = 0;
	scanf_s("%d", &count,sizeof(count)); //명령횟수
	for (i = 0; i < count; i++)
	{
		scanf_s("%s", s, sizeof(s));
			if (strcmp(s,sel[0])==0)		 //push 일때
			{
				scanf_s("%d", &sc, sizeof(sc));
				stack[stc] = sc;
				stc++;								//입력받고 넣고 증가
			}
			else if (strcmp(s, sel[1]) == 0)
			{
				if (stack[0] == 0)
					printf("-1\n");
				else {
					printf("%d\n", stack[stc-1]);
					stack[stc-1] = 0;
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
				else printf("%d\n", stack[stc-1]);		//  top의 경우도 pop과 같이 전걸 보여줌
			}
	}
	for (i = 0; i < 10; i++)
		printf("%d ", stack[i]);			// 얜걍 스택 출력용
	return 0;
}