import java.util.List;
import java.util.LinkedList;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        List<String> list = new LinkedList<>();
        for(int i = 0; i < my_str.length(); i += n) {
            if(i + n > my_str.length()) {
                list.add(my_str.substring(i, my_str.length()));
            } else {
                list.add(my_str.substring(i, i + n));
            }            
        }
        
        // System.out.println(list);
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}