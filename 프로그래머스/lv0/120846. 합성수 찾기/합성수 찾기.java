class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        if(check(n)) {
            for(int i = 1; i <= n; i++) {
                int count = 0;
                for(int j = 1; j <= i; j++) {
                    if(i % j == 0) {
                        count++;
                    }
                    
                    if(count >= 3) {
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public boolean check(int n) {
        boolean check = false;
        if(n >= 1 && n <= 100) {
            check = true;
        }
        return check;
    }
}