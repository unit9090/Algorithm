// import java.util.Character;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        char[] charArray = my_string.toCharArray();
        
        for(char c : charArray) {
            if(Character.isUpperCase(c)) {
                String n = Character.toString(c).toLowerCase();
                answer += n;
            } else {
                String n = Character.toString(c).toUpperCase();
                answer += n;
            }
        }
        
        return answer;
    }
}