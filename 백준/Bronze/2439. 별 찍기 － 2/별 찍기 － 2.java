import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int loop = sc.nextInt();
        
        int x = 1;
        while(x <= loop) {
            for(int i = 0; i < loop - x; i++) {
                System.out.print(" ");
            }
        
            for(int j = 0; j < x; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
            x++;
        }
        
        
    }
}