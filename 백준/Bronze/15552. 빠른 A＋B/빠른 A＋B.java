import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = null;
        int loop = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) + "\n");
        }
        
        bw.close();
        br.close();
    }
}