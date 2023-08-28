import java.util.*;
import java.io.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 문자열 길이 S, 부분 문자열 길이 P
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        
        // 임의로 만든 DNA 문자열
        char[] arr = br.readLine().toCharArray();
        
        // 조건 {'A', 'C', 'G', 'T'}
        st = new StringTokenizer(br.readLine());
        int[] check = new int[4];
        int[] now = new int[4];
        
        for(int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < S; i++) {
            if(i < P) {
                switch(arr[i]) {
                    case 'A':
                        now[0]++;
                        break;
                    case 'C':
                        now[1]++;
                        break;
                    case 'G':
                        now[2]++;
                        break;
                    case 'T':
                        now[3]++;
                        break;
                }
            } else {
                int j = i - P;
                
                switch(arr[i]) {
                    case 'A':
                        now[0]++;
                        break;
                    case 'C':
                        now[1]++;
                        break;
                    case 'G':
                        now[2]++;
                        break;
                    case 'T':
                        now[3]++;
                        break;
                }
                
                switch(arr[j]) {
                    case 'A':
                        now[0]--;
                        break;
                    case 'C':
                        now[1]--;
                        break;
                    case 'G':
                        now[2]--;
                        break;
                    case 'T':
                        now[3]--;
                        break;
                }
            }
            
            if(i >= P - 1 && check[0] <= now[0] && check[1] <= now[1] && check[2] <= now[2] && check[3] <= now[3]) {
                result++;
            }
        }
        
        
        System.out.println(result);
        br.close();
    }
}