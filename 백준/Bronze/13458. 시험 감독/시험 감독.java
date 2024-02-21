import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] agrs) throws Exception {
        // input
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        // out
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        // input token
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());    // 시험장의 개수 N
        int[] examinee =                            // 각 시험장에 있는 응시시자의 수
            Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());    // 총감독관이 감시할 수 있는 사람 수
        int C = Integer.parseInt(st.nextToken());    // 부감독관이 감시할 수 있는 사람 수
        
        long result = N;    // 총 감독관 수 = 시험장 수 + a
        for(int i = 0; i < N; i++) {            
            if(examinee[i] - B <= 0) {    // 응시자 - 총감독관이 감시할 수 있는 사람 수
                continue;
            }
            
            // (응시자 - 총감독관이 감시할 수 있는 사람 수) / 부감독관이 감시할 수 있는 사람 수
            int deputy = (int) Math.ceil((double) (examinee[i] - B) / C);
            result += deputy;
        }
        
        bw.write(String.valueOf(result));    // int형을 BufferedWriter로는 출력을 못 함
        bw.close();
    }
}