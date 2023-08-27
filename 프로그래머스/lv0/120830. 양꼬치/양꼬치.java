class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 양꼬치 n개를 10으로 나눈 몫이 서비스 음료수의 숫자 => 먹은 음료수 개수 - 서비스 음료 개수
        if(check(n, k)) {
            int service = n / 10;        
            answer = 12000 * n + 2000 * (k - service);
        }      
        
        return answer;
    }
    
    public boolean check(int n, int k) {
        boolean check = false;
        boolean argu1 = 0 < n && n < 1000;
        boolean argu2 = n / 10 <= k && k < 1000;
        
        if(argu1 && argu2) {
            check = true;
        }
        return check;
    }
}