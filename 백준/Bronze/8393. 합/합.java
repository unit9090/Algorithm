import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int loop = sc.nextInt();
        
        /*
        if(loop % 2 == 1) {
            sum = (loop / 2) * (loop + 1) + 1;
        } else {
            sum = (loop / 2) * (loop + 1);
        }
        
        System.out.println(sum);
        */
        
        for(int i = 1; i <= loop; i++) {
            sum += i;
        }
        
        System.out.println(sum);
    }
}