import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // x > 0 && y > 0: 1
        // x > 0 && y < 0: 4
        
        // x < 0 && y > 0: 2
        // x < 0 && y < 0: 3
        int result = x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3;
        System.out.println(result);
    }
}