package p2493_2800;

import java.util.*;
import java.io.*;
import java.lang.Math;

class Gal{
	int Index;
	char gal;
}

public class p2800 {
	static int Count,i,id;
	
	
	
	public static void main (String [] args) throws IOException
	{
		//Stack<Character> Stack = new Stack<>();
		Gal G= new Gal();
		Stack<Gal> Stack = new Stack<>();
		Stack<Gal> Stack2 = new Stack<>();
		
		char [] Array = new char [200];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		String Input = br.readLine();
		Count = 1;
		for( i =0 ; i<Input.length() ; i++ )
			Array[i]=Input.charAt(i);
		
		for( i =0 ; i<Input.length() ; i++ )
		{
			if(Array[i]=='(')
			{
				G.Index = Count;
				G.gal=Array[i];
				Stack.push(G);
				Count++;
			}
			else if(Array[i]!='(' && Array[i]!=')')
			{
				G.Index = 0;
				G.gal=Array[i];
				Stack.push(G);
			}
			else if(Array[i]==')')
			{
				G.Index = Count;
				G.gal=Array[i];
				Stack.push(G);
				Count--;
			}
		}
		Count=1;
		while(true)
		{
			if(Stack2.isEmpty())
			{
				Stack2=Stack;
				Count++;
			}
			else if(Stack2.peek().Index==0)
			{
				System.out.print(Stack2.pop());
			}
			else if(Stack2.peek().gal=='(')
			{
				
			}
			else if(Stack2.peek().gal==')')
			{
				
			}
			
			if(Count==Math.pow(2, Count)-1)
				break;
		}
		
	}

}
