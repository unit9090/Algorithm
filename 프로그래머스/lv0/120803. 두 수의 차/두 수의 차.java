class Solution {
    public int solution(int num1, int num2) {
        boolean argu = (num1 >= -50000) && (num1 <= 50000) && (num2 >= -50000) && (num2 <= 50000);
        int answer = 0;
        if(argu) {
            answer = num1 - num2;
        }
        return answer;
    }
}