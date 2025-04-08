import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        List<Integer> arrList = Arrays.stream(arr)
                                        .boxed()
                                        .collect(Collectors.toList());
        
        for(int i = 0; i < queries.length; i++) {
            int a = arrList.get(queries[i][0]);
            int b = arrList.get(queries[i][1]);
            
            arrList.set(queries[i][1], a);
            arrList.set(queries[i][0], b);
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}