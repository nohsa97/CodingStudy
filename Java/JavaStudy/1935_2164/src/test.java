import java.io.*;
import java.util.HashMap;
import java.util.Stack;

public class test {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Double> map = new HashMap<>();
        Stack<Double> stack = new Stack<>();

        double N = Double.parseDouble(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if ('A' <= temp && temp <= 'Z') {
                map.put(temp, Double.parseDouble(br.readLine()));
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                stack.push((double) map.get(ch));
            }

            else {
                double b = stack.pop();
                double a = stack.pop();

                switch (ch) {
                    case '+':
                        double n = a + b;
                        stack.push(n);
                        break;

                    case '-':
                        n = a - b;
                        stack.push(n);
                        break;

                    case '*':
                        n = a * b;
                        stack.push(n);
                        break;

                    case '/':
                        n = a / b;
                        stack.push(n);
                        break;
                }

            }
        }
        System.out.printf("%.2f%n", stack.pop());
        bw.flush();

    }
}