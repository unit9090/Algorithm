import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        if(check(emergency)) {
            for(int i = 0; i < emergency.length; i++) {
                answer[i]++;
                for(int j = 0; j < emergency.length; j++) {
                    if(emergency[i] < emergency[j]) {
                        answer[i]++;
                    }                    
                }
            }
        }
        
        return answer;
    }
    
    public boolean check(int[] emergency) {
        boolean check = false;
        if(emergency.length <= 10) {
            for(int x : emergency) {
                if(x >= 1 && x <= 100) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}