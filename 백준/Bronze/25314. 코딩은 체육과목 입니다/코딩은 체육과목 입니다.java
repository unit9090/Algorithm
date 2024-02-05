import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bytes = sc.nextInt();    // N 바이트
        
        for(int i = 0; i < bytes / 4; i++) {
            System.out.print("long ");
        }
        
        System.out.print("int");
    }
}

