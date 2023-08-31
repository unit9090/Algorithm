import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        int result = 0;
        
        if(a == b && a == c) {    // 3개 다 같으면
            result = 10000 + a * 1000;
        } else if(!(a != b && a != c && b != c)) {    // 3개 중 2개만 맞을 시
            int x = a == b ? a : a == c ? a : b == c ? b : 0;
            result = 1000 + x * 100;
        } else {    // 모두 다를 시
            int y = a >= b && a >= c ? a : b >= c ? b : c;
            result = y * 100;            
        }
        
        System.out.println(result);
    }
}