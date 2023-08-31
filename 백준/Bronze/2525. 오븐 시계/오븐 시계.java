import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A == 0) A = 24;
        
        int resultH = (A * 60 + B + C) / 60 >= 24 ? (A * 60 + B + C) / 60 - 24 : (A * 60 + B + C) / 60;
        int resultM = (A * 60 + B + C) % 60;
        
        System.out.println(resultH + " " + resultM);
    }
}