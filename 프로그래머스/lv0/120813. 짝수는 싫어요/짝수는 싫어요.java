class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        if(n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }
        int count = 0;
        if(check(n)) {
            for(int i = 1; i <= n; i++) {
                if(i % 2 != 0) {
                    answer[count] = i;
                    count++;
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