import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class p1935  {
	static int i, j, Index;  // C= 카운팅
	static double a, b, result, S;  //s= 세이브 

	public static void main(String[]args) throws IOException	{
		
		String Cal;
		Stack<Double> inputNumStack= new Stack<>();
		Stack<String> operandStack= new Stack<>();
		char [] postExpression= new char[100];
		double [] operandArray= new double[26];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=Integer.parseInt(br.readLine());
		Cal=br.readLine();
		
		for(j=0; j<Cal.length(); j++)
			postExpression[j]=Cal.charAt(j);
		
		for(j=0; j<i; j++)
			operandArray[j]=Double.parseDouble(br.readLine());
		
		for(j=0; postExpression[j]!=0 ; j++)
		{
			if(postExpression[j]!='+' && postExpression[j]!='-' && postExpression[j]!='*' && postExpression[j]!='/' && postExpression[j]!='%')
			{
				if(!operandStack.isEmpty() && postExpression[j]==operandStack.peek().charAt(0))
					{
						inputNumStack.push(operandArray[Index-1]);
				}
				else {
					operandStack.push(String.valueOf(postExpression[j]));
					inputNumStack.push(operandArray[Index]);
					Index++;
				}
			}
			
			else 
			{
				switch (postExpression[j]) 
				{
				case '+':
					b=inputNumStack.pop();
					a=inputNumStack.pop();
					inputNumStack.push(a+b);
					break;
				case '-':
					b=inputNumStack.pop();
					a=inputNumStack.pop();
					inputNumStack.push(a-b);
					break;
				case '*':
					b=inputNumStack.pop();
					a=inputNumStack.pop();
					inputNumStack.push(a*b);
					break;
				case '/':
					b=inputNumStack.pop();
					a=inputNumStack.pop();
					inputNumStack.push(a/b);
					break;
				case '%':
					b=inputNumStack.pop();
					a=inputNumStack.pop();
					inputNumStack.push(a%b);
					break;
				}
			}
				
		}
		System.out.printf("%.2f",inputNumStack.pop());
		
	}
}