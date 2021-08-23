package back1874_10799;

import java.util.*;
import java.io.*;

public class p10799 {
		static int result;
		static int Count;
	public static void main (String[] args) throws IOException
	{
		  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  		String InputLine;
		  		Stack<Character> Pipe = new Stack<>();
		  		
		  		InputLine = br.readLine();
		  		
		  		for(int i=0 ; i<InputLine.length(); i++)
		  		{
		  			if(InputLine.charAt(i)=='(')
		  			{
		  				Pipe.push(InputLine.charAt(i));
		  				Count++;
		  			}
		  			else if (InputLine.charAt(i) == InputLine.charAt(i-1))
		  			{
		  				Pipe.pop();
		  				Count--;
		  				result++;
		  			}
		  			else 
		  			{
		  				Pipe.pop();
		  				result+=--Count;
		  			}
		  		}
		  		
		  		System.out.print(result);
		  		
	}
} 
