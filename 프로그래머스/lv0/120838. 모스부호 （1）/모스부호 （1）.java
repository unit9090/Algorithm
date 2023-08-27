import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        // String[] split(String a): a를 기준으로 문자열을 나눈 후 배열로 반환.
        String[] morseStr = letter.split(" ");
        // System.out.println(Arrays.toString(morseStr));
        
        for(int i = 0; i < morseStr.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                // System.out.println("<" + morseStr[i] + ", " + morse[j] + ">");
                if(morseStr[i].equals(morse[j])) {
                    System.out.println(morse[j]);
                    answer += alpha.substring(j, j + 1);
                }
            }
        }
        
        return answer;
    }
}