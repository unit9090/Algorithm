import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();    // 수열의 개수
        int[] arr = new int[n];    // 배열
        Stack<Integer> stack = new Stack<>();    // 스택
        int x = 1;        // 스택에 쌓을 값
        
        // 배열 채우기
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean loop = true;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            // 배열의 값이 x보다 크거나 같을 경우, 그 값까지 stack에 push
            if(arr[i] >= x) {
                while(arr[i] >= x) {
                    stack.push(x++);
                    sb.append("+\n");
                }
                
                stack.pop();
                sb.append("-\n");
            } else {
                // 배열의 값이 작은 경우
                int y = stack.pop();
                
                if(y > arr[i]) {
                    System.out.println("NO");
                    loop = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        
        if(loop) System.out.println(sb.toString());
        
        
    }
}