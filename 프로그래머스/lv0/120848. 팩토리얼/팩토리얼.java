class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int pack = 1;   // n의 값이 pack이랑 같으면 그 팩토리얼
        for(int i = 1; i <= n; i++) {
            pack *= i;
            if(pack == n) {
                System.out.println(i);
                answer = i;
                break;
            }
            
            if(pack > n) {
                System.out.println(i - 1);
                answer = i - 1;
                break;
            }
        }
        
        return answer;
    }
    
    public boolean check(int n) {
        boolean check = false;
        if(0 < n && n <= 3628800) {
            check = true;
        }
        return check;
    }
}