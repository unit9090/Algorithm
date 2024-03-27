import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());    // N
        st = new StringTokenizer(br.readLine());     // token
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());    // v
        
        int result = 0;
        for(int i = 0; i < N; i++) {
            if(v == arr[i]) result++;
        }
        
        System.out.print(result);
    }
}