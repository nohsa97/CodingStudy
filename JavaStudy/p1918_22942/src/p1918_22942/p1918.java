package p1918_22942;

import java.util.*;
import java.io.*;

public class p1918 {
	static int i;
	static char temp;
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack <Character> Stack = new Stack<>();
		Stack <Character> Stack2 = new Stack<>();
		String Input  = br.readLine();
		char Array [] = new char [100];
		
		for(i=0 ; i<Input.length(); i++)
			Array[i]=Input.charAt(i);
		
		for(i=0 ; i<Input.length(); i++)
			{
			if(Array[i]>=65 && Array[i]<= 90)
				Stack.push(Array[i]);
			
			else if(Array[i] !='(' || Array[i]!=')')
				Stack2.push(Array[i]);
			else 
				{
				temp = Stack2.pop();
				Stack2.push(Array[i]);
				Stack2.push(temp);
				temp=0;
				}
			}
		for(i=0;i<=Stack.size();i++)
			System.out.print(Stack.pop());
		for(i=0;i<=Stack2.size();i++)
			System.out.print(Stack2.pop());
	}
}
