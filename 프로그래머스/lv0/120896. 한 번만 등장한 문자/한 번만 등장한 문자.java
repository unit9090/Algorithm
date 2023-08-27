import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int count = 0;
        String[] array = s.split("");
        Arrays.sort(array);
        
        for(String x : array) {
            count = 0;
            
            for(int i = 0; i < array.length; i++) {
                if(array[i].equals(x)) {
                    count++;
                }                
            }
            
            if(count == 1) {
                answer += x;
            }
        }
        
        
        
        
        return answer;
    }
}