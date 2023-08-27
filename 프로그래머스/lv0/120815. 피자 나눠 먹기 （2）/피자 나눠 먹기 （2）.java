class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = 0;    // 최소공약수
        int small = n < 6 ? n : 6;  // 반복할 횟수
        
        if(check(n)) {
            if(n % 6 == 0) {
                answer = n / 6;
            } else {
                for(int i = 1; i <= small; i++) {
                    if(n % i == 0 && 6 % i == 0) {
                        num = i;
                    }
                }
                answer = n / num;
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