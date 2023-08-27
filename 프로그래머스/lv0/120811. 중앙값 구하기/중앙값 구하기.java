// Arrays 클래스 호출
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        if(check(array)) {
            Arrays.sort(array);
            System.out.println(Arrays.toString(array)); 
            
            answer = array[array.length / 2];
            System.out.println(answer);
        }
        
        return answer;
    }
    
    //  제한사항 확인 메소드
    public boolean check(int[] array) {
        boolean checkCondition = false;
        if((array.length > 0) && (array.length < 100) && (array.length % 2 != 0)) {
            for(int x : array) {
                if(x > -1000 && x < 1000) {
                    checkCondition = true;
                }
            }
        }
        
        return checkCondition;
    }
    
}
