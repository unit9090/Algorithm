import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            String[] people = photo[i];
            answer[i] = memory(name, yearning, people);
            // System.out.println(answer[i]);
        }
        
        return answer;
    }
    
    public int memory(String[] name, int[] yearning, String[] people) {
        int memoryScoreSum = 0;
        
        for(int i = 0; i < people.length; i++) {
            int memoryIndex = Arrays.asList(name).indexOf(people[i]);
            
            if(memoryIndex >= 0) {
                memoryScoreSum += yearning[memoryIndex];
            }
        }
        
        return memoryScoreSum;
    }
}