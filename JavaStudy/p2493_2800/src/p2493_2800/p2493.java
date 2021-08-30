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
				Result[i]=0;
				Top.Height=arr[i];
				Top.Index=i;
				Stack.push(Top);
				i++;
			}
			else if(Stack.peek()>arr[i])
			{
				Result[i]=Stack.size()+Count;
				Stack.push(arr[i]);
				i++;
			}
			else if(Stack.peek()<arr[i])
			{
				Stack.pop();
				Count=i;
			}
			
			if(i==FirstInput)
				break;
			
		}
		
		for(i=0 ; i<FirstInput; i++)
			System.out.print(Result[i]);
	}
}
