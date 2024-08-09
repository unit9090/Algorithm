import java.util.*;

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        answer = sb.toString();        
        
        return answer;
    }
}