class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        if(check(box, n)) {
            int x = box[0] / n;
            int y = box[1] / n;
            int z = box[2] / n;
            
            answer = x * y * z;
        }
        
        return answer;
    }
    
    public boolean check(int[] box, int n) {
        boolean check = false;
        boolean argu1 = box.length == 3;
        boolean argu2 = 1 <= n && n <= 50 && n != 8;
        
        if(argu1 && argu2) {
            for(int x : box) {
                if(x < 1 || x > 100 || n > x) {
                    check = false;
                    break;
                }
                
                check = true;
            }
        }
        return check;
    }
}