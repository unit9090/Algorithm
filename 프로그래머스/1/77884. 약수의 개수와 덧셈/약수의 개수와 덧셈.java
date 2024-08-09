import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            // 약수 확인
            if(measure(i)) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    /**
        약수 구하는 함수
        약수의 개수가 짝수인 경우, true
        약수의 개수가 홀수인 경우, false
    **/
    public boolean measure(int target) {
        int count = 0;
        
        for(int i = 1; i <= Math.sqrt(target); i++) {    // 해당 값의 제곱근까지 반복
            if(target % i == 0) {
                if(i == target / i) {   // 약수일 때, 해당 값과 나눈 값이 같으면 1개로 처리
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        
        if(count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}