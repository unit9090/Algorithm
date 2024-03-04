import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());    // 문제 수
        
        Loop:
        for(int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            char[] c = br.readLine().toCharArray();
            
            for(int j = 0; j < c.length; j++) {
                
                if(c[j] == '(')  {
                    stack.push(c[j]);
                } else if(stack.empty()) {
                    sb.append("NO\n");
                    continue Loop;
                } else {
                    stack.pop();    // 닫힘 괄호를 만나면
                }
                
            }
            
            if(stack.empty()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        
        System.out.println(sb);
        
    }
}