class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);
               
        // System.out.println(num1Char + ", " + num2Char);
        
        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, num2Char);
        sb.setCharAt(num2, num1Char);
        
        answer = sb.toString();
        System.out.println(answer);
        
        return answer;
    }
}