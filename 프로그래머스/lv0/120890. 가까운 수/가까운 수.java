import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] arr = new int[array.length];
        
        for(int i = 0; i < array.length; i++) {
            int a = n - array[i];
            if(a < 0) {
                a = -a;
            }
            arr[i] = a;
        }
        
        int x = 0;  // 인덱스 저장
        int min = arr[0];   // 최소값 저장.
        for(int i = 0; i < arr.length; i++) {
            if(min >= arr[i]) {
                if(min == arr[i]) {
                    min = array[x] < array[i] ? arr[x] : arr[i];
                    x = array[x] < array[i] ? x : i;
                } else {
                    min = arr[i];
                    x = i;
                }                
            }            
        }
        
        answer = array[x];
        
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}