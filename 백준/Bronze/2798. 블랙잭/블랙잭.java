import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());    // 카드의 개수
        int M = Integer.parseInt(st.nextToken());    // 목표 숫자
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
                
        /*
            3개의 숫자를 더해서 가장 M과 가까운 수 찾기
            ex > arr[4]일 경우,
            arr[0] + arr[1] + arr[2]    arr[0] + arr[1] + arr[3]
            
            arr[1] + arr[2] + arr[3]
            
            0, 1, 2, 3이 있을 경우, 첫번째 더하는 값은 arr[1]까지만 더해도
            전체의 가짓수를 알 수 있음.
        */
        int result = 0;
        Loop:
        for(int i = 0; i < N - 2; i++) {    // 배열의 -2만큼 순회
            for(int j = i + 1; j < N - 1; j++) {    // 배열의 -1만큼 순회
                for(int l = j + 1; l < N; l++) {
                    int sum = arr[i] + arr[j] + arr[l];
                    
                    if (sum == M) {    // 더한 값과 목표값과 같다면 for문 중단
                        result = sum;
                        break Loop;
                    }
                    
                    if(result < sum && sum < M) {    // 더한 값이 현재 result보다 크다면 치환
                        result = sum;
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}