package p2493_2800;

import java.util.*;
import java.io.*;

	class Top
	{
		int Index;
		int Height;
	}

public class p2493 {
	static int FirstInput;
	static String SecondInput;
	static int i,j,Count;
	public static void main(String[]args) throws IOException
	{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		Top Top = new Top();
		FirstInput=Integer.parseInt(br.readLine());
		int arr [] = new int [FirstInput];
		int Result [] = new int [FirstInput];
		Stack<Top> Stack = new Stack<>();
		
		SecondInput = br.readLine();
		StringTokenizer st = new StringTokenizer(SecondInput);
		
		for( i = 0; i<FirstInput; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		i=0;
		while(true)
		{
			if(Stack.isEmpty())
			{
				Top.Height = arr[i];
				Top.Index = i+1;
				Stack.push(Top);
				Result [i]=0;
				System.out.printf("빌 공 %d번째실행, Id : %d , 높이 : %d \n", i , Stack.peek().Index,Stack.peek().Height);
				i++;
			}
			else if(Stack.peek().Height>arr[i])
			{
				Result [i]=Stack.peek().Index;
				Top.Height = arr[i];
				Top.Index = i+1;
				Stack.push(Top);
				System.out.printf("%d번째실행, Id : %d , 높이 : %d \n", i , Stack.peek().Index,Stack.peek().Height);
				i++;
			}
			else if(Stack.peek().Height<arr[i])
			{
				System.out.printf("팝 %d \n",Stack.peek().Height);
				Stack.pop();
			}
			
			if(i==FirstInput)
				break;
			
		}
		
		for(i=0 ; i<FirstInput; i++)
			System.out.print(Result[i]);
	}
}
