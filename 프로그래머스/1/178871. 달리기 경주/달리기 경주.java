import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;


class Solution {
    public ArrayList solution(String[] players, String[] callings) {
        
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(players));
        for(int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }
        
        for(String s : callings) {
            int i = map.get(s);
            
            list.remove(i);
            list.add(i - 1, s);
            // System.out.println("list: " + list);
            
            map.put(list.get(i), i);
            map.put(list.get(i - 1), i - 1);
        }
        
        return list;
    }
    
    
}