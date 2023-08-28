import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        
        char[] numArr = str.toCharArray();
        
        int sum = 0;
        for(int i = 0; i < numArr.length; i++) {
            sum += numArr[i] - '0';
        }
        
        System.out.println(sum);
    }
}