import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H == 0) {
            H = 24;
        }
        int resultH = (H * 60 + M - 45) / 60 == 24 ? 0 : (H * 60 + M - 45) / 60;
        int resultM = (H * 60 + M - 45) % 60;
        
        System.out.println(resultH + " " + resultM);
    }
}