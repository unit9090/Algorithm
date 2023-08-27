class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        if(check(array, n)) {
            for(int x : array) {
                if(x == n) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public boolean check(int[] array, int n) {
        boolean check = false;
        boolean argu1 = array.length >= 1 && array.length <= 100;
        boolean argu2 = n >= 0 && n <= 1000;
        
        if(argu1 && argu2) {
            for(int x : array) {
                if(x < 0 || x > 1000) {
                    check = false;
                    break;
                }
                check = true;
            }
        }
        
        return check;
    }
}