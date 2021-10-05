package GAL;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class gal {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ct,i,j;
		int l,r,c;
		ct=0;
		l=0;
		r=0;
		c=0;
		String st;
		char [] arr = new char[50];
		for(i=0;i<50;i++)
			arr[i]=' ';
		ct= Integer.parseInt(br.readLine());
		for(i=0;i<ct;i++)
		{
			st=br.readLine();
			arr = st.toCharArray();
			if(arr[0]!='(' && arr[0]!=')')
				System.out.println("Wrong Input");
			else if(arr[0]==')')
				System.out.println("NO");
			else if (arr[0]=='('){
					for(j=0;j<arr.length;j++)
					{
						if(arr[j]=='(')
							l++;					
						if(arr[j]==')')
							r++;
						 if(r>l)
							c=1;
					}
				
				if(c!=1 && l==r)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			l=0;
			r=0;
			c=0;
		}
	}
}
