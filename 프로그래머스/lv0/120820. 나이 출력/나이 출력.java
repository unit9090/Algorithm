class Solution {
    public int solution(int age) {
        int answer = 0;
        boolean argu = (age > 0) && (age <= 120);
        
        if(argu) {
            answer = 2022 - age + 1;
        }
        
        return answer;
    }
}