class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean argu1 = (0 < num1) && (num1 <= 100);
        boolean argu2 = (0 < num2) && (num2 <= 100);
        
        if(argu1 && argu2) {
            double divide = ((double) num1 / num2) * 1000;
            answer = (int) divide ;
            return answer;
        }
        
        return answer;
    }
}