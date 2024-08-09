import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        String target = Integer.toString(x);
        // 자릿수 합 구하기
        for(int i = 0; i < target.length(); i++) {
            sum += Integer.parseInt(target.substring(i, i + 1));
        }
        
        if(x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}