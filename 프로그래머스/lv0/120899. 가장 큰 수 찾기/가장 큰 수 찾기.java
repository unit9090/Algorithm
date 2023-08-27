import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int index = 0;
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        // System.out.println("[" + max + ", " + index + "]");
        
        return answer;
    }
}