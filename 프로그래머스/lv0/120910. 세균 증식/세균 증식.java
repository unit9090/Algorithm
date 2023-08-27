class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int x = n;
        for(int i = 1; i <= t; i++) {
            x *= 2;
        }
        
        answer = x;
        
        System.out.println(x);
        
        return answer;
    }
}