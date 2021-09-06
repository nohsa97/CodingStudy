package p1918_22942;

import java.util.*;
import java.io.*;

public class p1918 {
	static int i;
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack <Character> Stack = new Stack<>();
		String Input  = br.readLine();
		char Array [] = new char [100];
		
		for(i=0 ; i<Input.length(); i++)
			Array[i]=Input.charAt(i);
		
		for(i=0 ; i<Input.length(); i++)
		{
			if(Array[i]>=65 || Array[i]<= 89)
				Stack.push(Array[i]);
			
			else if 
		}
	}
}
