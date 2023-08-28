import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] scores = new int[N];
        
        long max = 0;
        long sum = 0;
        
        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            
            if(max < scores[i]) max = scores[i];
            
            sum += scores[i];
        }
        
        System.out.println(sum * 100.0 / max / N);
        
    }
}