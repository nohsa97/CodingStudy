package back1874_10799;

import java.util.*;
import java.io.*;
public class p1874  {
	static int checkInput ;
	static int firstInput;
	static int stackInputNum=1;
	static int errorCheck;
	
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		firstInput = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		Queue<Character> result = new LinkedList<>();
		stack.push(0);
		
		for(int i=0; i<firstInput; i++)
		{
			checkInput = Integer.parseInt(br.readLine());
			while(true)
			{
				if(stack.peek()==checkInput)
				{
					result.add('-');
					stack.pop();
					break;
				}
				
				if(stack.peek()>checkInput)
				{
					errorCheck=1;
					break;
				}
				stack.push(stackInputNum);
				result.add('+');
				stackInputNum++;
			}
			
		}
		
		if(errorCheck==1)
		{
			stack.clear();
			result.clear();
			System.out.println("NO");
		}
		
		
		while(!result.isEmpty())
			System.out.println(result.poll());
			
	}
}
