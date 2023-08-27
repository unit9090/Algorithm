import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        List<Integer> newArr = new ArrayList<>();
        Set<Integer> multiSet = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < lines.length; i++) {
            for(int j = lines[i][0]; j <= lines[i][1]; j++) {
                if(newArr.contains(j)) {
                    if((multiSet.contains(j + 1) || multiSet.contains(j - 1))) {
                        result.add(j);
                    }
                    multiSet.add(j);
                }
                newArr.add(j);
            }
        }
        System.out.println(newArr);
        System.out.println(multiSet);
        System.out.println(result);
        
        if(multiSet.size() > 2) {
            if(multiSet.size() == result.size()) {
                answer = result.size() - 1;
            } else {
                answer = result.size();
            }            
        }       
        
        
        return answer;
    }
}