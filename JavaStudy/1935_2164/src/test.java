import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class test  {
	static int i, j, C, index;  // C= 카운팅
	static double a, b, result, S;  //s= 세이브 

	public static void main(String[]args) throws IOException	{
		String Cal;
		Stack<Double> DT= new Stack<>();
		Stack<String> CT= new Stack<>();
		char [] arr= new char[100];
		double [] drr= new double[26];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=Integer.parseInt(br.readLine());
		Cal=br.readLine();
		
		for(j=0; j<Cal.length(); j++)
			arr[j]=Cal.charAt(j);
		
		for(j=0; j<i; j++)
			drr[j]=Double.parseDouble(br.readLine());
		
		for(j=0; arr[j]!=0 ; j++)
		{
			if(arr[j]!='+' && arr[j]!='-' && arr[j]!='*' && arr[j]!='/' && arr[j]!='%')
			{
				if(!CT.isEmpty() && arr[j]==CT.peek().charAt(0))
					{
						DT.push(drr[C-1]);
					}
				else {
				CT.push(String.valueOf(arr[j]));
				DT.push(drr[C]);
				C++;
					}
			}
			
			else 
			{
				switch (arr[j]) 
				{
				case '+':
					b=DT.pop();
					a=DT.pop();
					DT.push(a+b);
					break;
				case '-':
					b=DT.pop();
					a=DT.pop();
					DT.push(a-b);
					break;
				case '*':
					b=DT.pop();
					a=DT.pop();
					DT.push(a*b);
					break;
				case '/':
					b=DT.pop();
					a=DT.pop();
					DT.push(a/b);
					break;
				case '%':
					b=DT.pop();
					a=DT.pop();
					DT.push(a%b);
					break;
				}
			}
				
		}
		System.out.printf("%.2f",DT.pop());
		
	}
}