class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a == b) {
            return 1;
        }
        
        int top = 0;
        int bottom = 0;
        int min = a >= b  ? b : a;
        for(int i = 1; i <= min; i++) {
            if(a % i == 0 && b % i == 0) {
                top = a / i;
                bottom = b / i;
            }
        }
        
        for(int i = 1; i <= bottom; i++) {
            if(bottom % i == 0) {
                if(i % 2 == 0 || i % 5 == 0 || i == 1) {
                    answer = 1;
                } else {
                    answer = 2;
                    break;
                }
            }
        }
        
        return answer;
    }
}