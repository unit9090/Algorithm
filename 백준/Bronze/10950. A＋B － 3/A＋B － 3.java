import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br
            = new BufferedReader(new InputStreamReader(System.in));
        
        int loop = Integer.parseInt(br.readLine());
        
        StringTokenizer st = null;
        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            System.out.println(A + B);
        }
    }
}