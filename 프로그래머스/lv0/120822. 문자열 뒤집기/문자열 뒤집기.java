import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] value = new String[my_string.length()];
        if(check(my_string)) {
            for(int i = 0; i < my_string.length(); i++) {
                int x = my_string.length() - 1 - i;
                value[x] = my_string.substring(i, i + 1);
            }

            for(int i = 0; i < value.length; i++) {
                answer += value[i];
            }
        }
        
        
        
        return answer;
    }
    
    public static boolean check(String my_string) {
        boolean check = false;
        if(1 <= my_string.length() && my_string.length() <= 1000) {
            check = true;
        }
        return check;
    }
}