import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        StringBuffer sf = new StringBuffer(Arrays.toString(ingredient).replaceAll("[^0-9]", ""));
        // System.out.println(sf);
        
        while(sf.indexOf("1231") > -1) {
            int id = sf.indexOf("1231");
            sf.delete(id, id + 4);
            answer++;
        }
        
        
        return answer;
    }
}