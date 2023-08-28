import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 자연수 N
        int N = sc.nextInt();
        
        // count
        int count = 1;
        // start_index
        int startIdx = 1;
        // end_index
        int endIdx = 1;
        // sum
        int sum = 1;
        
        while(endIdx != N) {
            if(sum < N) {
                endIdx++;
                sum += endIdx;
            } else if(sum > N) {
                sum -= startIdx;
                startIdx++;
            } else {
                endIdx++;
                sum += endIdx;
                count++;
            }
        }
        
        System.out.println(count);
    }
}