package back1874_10799;
import java.util.Scanner;
import java.util.Stack;
 
public class test {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        Stack<Integer> stack = new Stack<>();
	        int count = 0;
	        
	        for(int i=0; i<s.length(); i++) {
	            if(s.substring(i,i+1).equals("("))
	                stack.push(i);
	            else {
	                if(stack.peek() == i-1) {
	                    stack.pop();
	                    count+=stack.size();
	                }
	                else {
	                    stack.pop();
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	    }

	
}