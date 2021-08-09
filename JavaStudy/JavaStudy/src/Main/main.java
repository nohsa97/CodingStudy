package Main;
import java.util.*;

public class main {
		public static void main(String[] args) {
	    int N,K,i,ct;
	    Scanner sc = new Scanner(System.in);
	    N=sc.nextInt();
	    K=sc.nextInt();
	    int [] arr= new int[N+1];
	    for(i=0;i<N;i++)
	    arr[i]=i+1;
	    arr[N]=0;
	    i=0; ct=0;
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
	    		System.out.print(arr[i]+","+" ");
	    		for(int j=i;arr[j]!=0;j++)
	    		arr[j]=arr[j+1];
	    		ct=0;
	    	}
	    	if(arr[i]==0)
	    	{
	    		i=0;
	    		continue;
	    	}
	    	i++;
	    	ct++;
	    }
	    
	  }
}
