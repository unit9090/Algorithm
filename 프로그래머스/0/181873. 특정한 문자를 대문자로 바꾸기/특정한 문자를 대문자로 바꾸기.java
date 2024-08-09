import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char chrAlp = alp.charAt(0);
        String upAlp = String.valueOf(Character.toUpperCase(chrAlp));
        
        answer = my_string.replaceAll(alp, upAlp);
        return answer;
    }
}