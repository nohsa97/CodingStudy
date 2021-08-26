package p2493_2800;

import java.util.*;
import java.io.*;

public class p2800 {
	static int Count;
	public static void main (String [] args) throws IOException
	{
		//Stack<Character> Stack = new Stack<>();
		HashMap<Character,Integer> Hash = new HashMap<>();
		char [] Array = new char [200];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		String Input = br.readLine();
		
		for(int i =0 ; i<Input.length() ; i++ )
			Array[i]=Input.charAt(i);
		
		for(int i =0 ; i<Input.length() ; i++ )
		{
			if(Array[i]=='(')
			{
			//	Stack.push(Array[i]);
				Hash.put('(',Count);
				Count++;
				max++;
			}
			else if(Array[i]==')')
			{
				//Stack.pop();
				Hash.put(')',Count);
				Count--;
			}	
		}
		
		for(int i=0 ; i<max; i++)
		{
			
			
		}
		
	}

}
