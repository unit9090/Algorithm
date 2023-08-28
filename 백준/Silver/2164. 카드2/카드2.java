import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        boolean loop = true;
        int result = 0;
        while(loop) {
            if(queue.size() > 1) {
                queue.remove();
                int n = queue.poll();
                queue.offer(n);
            } else {
                result = queue.poll();
                loop = false;
            }
        }
        
        System.out.println(result);
    }
}