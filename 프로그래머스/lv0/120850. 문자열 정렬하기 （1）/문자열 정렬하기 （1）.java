import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        if(check(my_string)) {
            String str = my_string.replaceAll("[a-z]", "");
            answer = new int[str.length()];
            for(int i = 0; i < str.length(); i++) {
                answer[i] =  Integer.parseInt(str.substring(i, i+1));
            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
    
    public boolean check(String str) {
        boolean check = false;
        if(1 <= str.length() && str.length() <= 100) {
            check = true;
        }
        return check;
    }
}