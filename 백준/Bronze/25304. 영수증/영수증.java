import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        int sum = Integer.parseInt(br.readLine());
        int loop = Integer.parseInt(br.readLine());
        
        StringTokenizer st = null;
        
        for(int i =0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            sum -= Integer.parseInt(st.nextToken()) *
                Integer.parseInt(st.nextToken());
        }
        
        if(sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}