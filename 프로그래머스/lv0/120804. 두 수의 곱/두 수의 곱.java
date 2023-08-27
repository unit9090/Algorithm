class Solution {
    public int solution(int num1, int num2) {
        boolean argu = (num1 >= 0) && (num1 <= 100) && (num2 >= 0) && (num2 <= 100);
        int answer = 0;
        
        if(argu) {
            answer = num1 * num2;
        }
        
        return answer;
    }
}