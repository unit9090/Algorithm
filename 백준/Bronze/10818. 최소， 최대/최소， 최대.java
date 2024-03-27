import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());    // N개
        st = new StringTokenizer(br.readLine());    // token 저장
        
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }
}