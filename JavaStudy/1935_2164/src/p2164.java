import java.io.*;
import java.util.*;
public class p2164 {

	static int i, j, b;
	
	public static void main (String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i=Integer.parseInt(br.readLine());
		Queue<Integer> IQ = new LinkedList<>();
		
		for(j=0; j<i; j++)
			IQ.add(j+1);
		
		while(true)
		{
			IQ.poll();
			b=IQ.poll();
			IQ.add(b);
			if(IQ.size()==1)
				break;
		}
		System.out.print(IQ.poll());
		br.close();
	}
}
