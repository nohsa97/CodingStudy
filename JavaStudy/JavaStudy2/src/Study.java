
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Study {
		public static void main(String[] args) throws IOException {
	    int N,K,i,ct,lct;
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String[] star = sc.readLine().split(" ");
	    N= Integer.parseInt(star[0]);
	    K= Integer.parseInt(star[1]);
	    int [] arr= new int[N+1];
	    for(i=0;i<N;i++)
	    arr[i]=i+1;
	    arr[N]=0;
	    i=0; ct=0;
	    lct=N;
	    System.out.print("<");
	    while(true)
	    {
	    	if(arr[0]==0)
	    	{
	    		System.out.print(">");
	    		break;
	    	}
	    	else if(ct==K-1 && arr[i]!=0)
	    	{
	    		System.out.print(arr[i]);
	    		for(int j=i;arr[j]!=0;j++)
	    		arr[j]=arr[j+1];
	    		ct=0;
	    		if(lct>1)
	    		{
	    			System.out.print(","+" ");
	    			lct--;
	    		}
	    	}
	    	if(arr[i]==0)
	    	{
	    		i=0;
	    		continue;
	    	}
	    	i++;
	    	ct++;
	    }
	    sc.close();
	  }
		
}
