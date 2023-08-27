class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean argu1 = (0 <= num1) && (num1 <= 10000);
        boolean argu2 = (0 <= num2) && (num2 <= 10000);
        boolean compare = num1 == num2;
        
        if(argu1 && argu2) {
            if(compare) {
                answer = 1;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}