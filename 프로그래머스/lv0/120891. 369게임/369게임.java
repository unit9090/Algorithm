import java.util.Arrays;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] str = Integer.toString(order).split("");
        System.out.println(Arrays.toString(str));
        
        for(String x : str) { 
            int num = Integer.parseInt(x);
            if(num != 1 && num != 0 && num % 3 == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}