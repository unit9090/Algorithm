import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int plus = 0;        
        for(int i = 0; i <= num; i++) {
            plus += i;
        }
        
        if(plus <= total) {
            for(int i = 0; i <= total; i++) {
                int sum = 0;
                for(int j = 0; j < num; j++) {
                    sum += i + j;                
                    answer[j] = i + j;
                }

                if(total == sum) {                
                    break;
                }
            }
        } else {
            for(int i = 1000; i >= -total; i--) {
                int sum = 0;
                for(int j = 0; j > -num; j--) {
                    sum += i + j;                
                    answer[-j] = i + j;
                }

                if(total == sum) {                
                    break;
                }
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}