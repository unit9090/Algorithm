import java.util.List;
import java.util.LinkedList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new LinkedList<>();
        
        for(int x : numlist) {
            if(x % n == 0) {
                list.add(x);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}