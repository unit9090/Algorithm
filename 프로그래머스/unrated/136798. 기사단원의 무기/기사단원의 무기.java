class Solution {
    public int solution(int number, int limit, int power) {
        // 1 빼고 시작
        int answer = 1;
        
        for(int i = 2; i <= number; i++) {
            // 약수의 개수 구하기
            int count = 0;
            for(int j = 1; j <= Math.sqrt(i); j++) {
                // 예를 들어, 9라고 하면 3일 경우 1개만 더하고
                if(j * j == i) count++;
                // 3이 아닐 경우 (1, 9) 쌍으로 묶어 2개를 더한다.
                else if(i % j == 0) count += 2;
            }
            
            // count = 약수의 개수 = 공격력
            if(count > limit) {
                answer += power;
            } else answer += count;
        }
        
        
        return answer;
    }
}