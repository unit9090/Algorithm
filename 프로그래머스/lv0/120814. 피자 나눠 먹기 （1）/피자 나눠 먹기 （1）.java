class Solution {
    public int solution(int n) {
        int answer = 0;
        if(check(n)) {
            if(n <= 7) {
                answer = 1;
            } else {
                if(n % 7 == 0) {
                    answer = n / 7;
                } else {
                    answer = n / 7 + 1;
                }
            }
        }
        
        return answer;
    }
    
    public static boolean check(int n) {
        boolean check = false;
        if(n >= 1 && n <= 100) {
            check = true;
        }
        return check;
    }
}