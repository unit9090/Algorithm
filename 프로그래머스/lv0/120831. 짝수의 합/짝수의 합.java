class Solution {
    public int solution(int n) {
        int answer = 0;
        if(check(n)) {
            for(int i = 0; i <= n; i++) {
                if(i % 2 == 0) {
                    answer += i;
                }
            }
        }
        return answer;
    }
    
    public boolean check(int n) {
        boolean check = false;
        if(0 < n && n <= 1000) {
            check = true;
        }
        return check;
    }
}