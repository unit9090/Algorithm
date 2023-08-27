class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        boolean argu1 = (numer1 > 0) && (numer1 < 1000);
        boolean argu2 = (numer2 > 0) && (numer2 < 1000);
        boolean argu3 = (denom1 > 0) && (denom1 < 1000);
        boolean argu4 = (denom2 > 0) && (denom2 < 1000);
        
        if(argu1 && argu2 && argu3 && argu4) {
            int numer = numer1 * denom2 + numer2 * denom1;
            int denom = denom1 * denom2;
            int num = 0;
            
            for(int i = 1; i <= denom; i++) {
                if(numer % i == 0 && denom % i == 0) {
                   num = i;
                }                    
            }
            
            int top = numer / num;
            int bottom = denom / num;
            
            answer[0] = top;
            answer[1] = bottom;
        }
        
        return answer;
        
    }
    
    
}