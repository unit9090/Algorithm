import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        
        for(int i = 0; i < N; i++) { // 배열 안에 단어 저장
            arr[i] = br.readLine();
        }
        
        // Comparator(util) => compare(T o1, T o2)
        // Comparable(lang) => comparaTo(T o)
        // 1차 조건: 단어 길이, 2차 조건: 사전순
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) { // 단어길이
                // 단어의 길이가 같을 경우
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);    // 사전순
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        
        System.out.println(arr[0]);
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
        
    }
}