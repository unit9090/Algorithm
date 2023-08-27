import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        Map<String, Integer> mapX = new HashMap<>();
        Map<String, Integer> mapY = new HashMap<>();
        
        for(String x : X.split("")) {
            if(mapX.containsKey(x)) {
                int i = mapX.get(x) + 1;
                mapX.put(x, i);
            } else mapX.put(x, 1);
        }
        
        for(String y : Y.split("")) {
            if(mapY.containsKey(y)) {
                int i = mapY.get(y) + 1;
                mapY.put(y, i);
            } else mapY.put(y, 1);
        }
        
        for(int i = 9; i >= 0; i--) {
            String s = Integer.toString(i);
            if(!mapX.containsKey(s) || !mapY.containsKey(s)) continue;
            
            int len = mapX.get(s) < mapY.get(s) ? mapX.get(s) : mapY.get(s);
            for(int j = 0; j < len; j++) sb.append(i);
        }
        
        if("".equals(sb.toString())) answer = "-1";
        else if(sb.substring(0, 1).equals("0")) answer = "0";
        else answer = sb.toString();
        return answer;
    }
    
}