import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = new String[my_string.length()];
        
        if(check(my_string, n)) {
            // str[i]에 문자열 0번째를 저장
            for(int i = 0; i < my_string.length(); i++) {
                str[i] = my_string.substring(i, i + 1);
                // str[i]에 n - 1번 반복 저장
                for(int j = 0; j < n - 1; j++) {
                    str[i] += my_string.substring(i, i + 1);
                }
            }
            
            // return 값에 모든 문자열 합.
            for(int l = 0; l < str.length; l++) {
                    answer += str[l];
                }
            
        }
        
        return answer;
    }
    
    public boolean check(String str, int n) {
        boolean check = false;
        boolean strCheck = str.length() >= 2 && str.length() <= 5;
        boolean nCheck = n >= 2 && n <= 10;
        
        if(strCheck && nCheck) {
            check = true;
        }
        
        return check;
    }
}