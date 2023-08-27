class Solution {
    public int solution(int num1, int num2) {
        boolean argu1 = (num1 > 0) && (num1 <= 100);
        boolean argu2 = (num2 > 0) && (num2 <= 100);
        int answer = 0;
        
        if(argu1 && argu2) {
            answer = num1 / num2;
        }
        
        return answer;
    }
}