import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arrList = new LinkedList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                // System.out.println("[" + i + ", " + n / i + "]");
                arrList.add(i);
            }
        }
        
        answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}