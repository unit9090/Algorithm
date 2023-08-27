import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 문자열을 배열로 변경
        String[] arr = s.split("");
        // 특정 문자의 index
        int index = 0;
        // 특정 문자와 같은 문자 count
        int isX = 0;
        // 특정 문자와 다른 문자 count
        int isNotX = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[index].equals(arr[i])) isX++;
            else isNotX++;
            
            if(isX == isNotX) {
                index = i + 1;
                isX = 0;
                isNotX = 0;
                answer++;
            }
            
            if(isX != isNotX && i == arr.length -1) answer++;
        }
        
        
        return answer;
    }
}