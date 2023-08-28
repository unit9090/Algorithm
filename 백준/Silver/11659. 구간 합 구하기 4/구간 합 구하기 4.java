import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {        
        // 받는 개수가 많을 경우, 빠른 속도를 위해 BufferedReader를 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 길게 값을 받을 경우, nextInt()로 받는 것은 힘들다. => StringTokenizer를 사용
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 숫자 N개
        int N = Integer.parseInt(stringTokenizer.nextToken());

        // 질의 횟수 M개
        int M = Integer.parseInt(stringTokenizer.nextToken());

        // 구간 합 N개
        long[] sumN = new long[N + 1];

        // 길게 한 줄 받아오기
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 구간 합 배열 구하기
        for(int i = 1; i <= N; i++) {
            sumN[i] = sumN[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // i번째부터 j번째의 합
        for(int x = 0; x < M; x++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sumN[j] - sumN[i - 1]);
        }
    }
}