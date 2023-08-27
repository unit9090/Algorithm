import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        String s = "";
        int num = n;
        for(int i = 2; i <= n; i++) {
            if(num % i == 0) {
                if(s.equals("")) {
                    s += Integer.toString(i) + " ";
                } else if(Integer.parseInt(s.split(" ")[s.split(" ").length - 1]) != i) {
                    s += Integer.toString(i) + " ";
                }
                
                num /= i;
                i--;
            }
            
            
        }
        // System.out.println(s);
        String[] str = s.split(" ");
        // System.out.println(Arrays.toString(str));
        
        answer = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }
        
        
        
        return answer;
    }
}