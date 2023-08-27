import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        if(check(n)) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
    
    public static boolean check(int n) {
        boolean check = false;
        if(1 <= n && n <= 10) {
            check = true;
        }
        return check;
    }
}