import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        char[] y = sc.next().toCharArray();
        
        for(int i = y.length - 1; i >= 0 ; i--) {
            int z = y[i] - '0';
            System.out.println(x * z);            
        }
        
        String sum = "";
        for(int i = 0; i < y.length; i++) {
            sum += y[i];
        }
        
        System.out.println(x * Integer.parseInt(sum));
        
        
    }
}