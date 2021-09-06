package p1918_22942;

import java.util.*;
import java.io.*;
import java.math.*;
class Circle
{
	int Rad;
	int X;
	
	
}
public class p22942 {
	static int i,j,FirstInput,Cal;
	static int Circle;
	
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Circle Cir1 = new Circle();
		Circle Cir2 = new Circle();
		boolean result=false;
		
		Vector<Circle> Vec = new Vector<Circle>(100);
		
		FirstInput = Integer.parseInt(br.readLine());
		
		for(int i=0; i < FirstInput;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			Circle Cir = new Circle();
			Cir.X= Integer.parseInt(st.nextToken());
			Cir.Rad= Integer.parseInt(st.nextToken());
			Vec.add(Cir);
		}
		i=0;
		j=1;
		while(true)
		{
			Cir1=Vec.get(i);
			Cir2=Vec.get(j);
			Cal=Math.abs(Cir1.X-Cir2.X);
			
			if(Cal==0 && Cir1.Rad!=Cir2.Rad)
				result = true;
			else if(Cal>Cir1.Rad+Cir2.Rad || Math.abs(Cir1.Rad-Cir2.Rad)> Cal )
				result = true;
			else 
			{
				result = false;
				break;
			}
		
			if(j<FirstInput)
				j++;
			if(j==FirstInput)
			{
				i++;
				j=i+1;
			}
			
			if (i==FirstInput-1 && j==FirstInput)
				break;
			
		}
		
		
		
		if(result==true)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}