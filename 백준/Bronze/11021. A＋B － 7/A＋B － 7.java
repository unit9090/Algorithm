import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int loop = Integer.parseInt(br.readLine());    // 반복 횟수
        
        for(int i = 1; i <= loop; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()); 
            bw.write("Case #" + i + ": " + sum + "\n");
        }
        
        bw.close();
    }
}