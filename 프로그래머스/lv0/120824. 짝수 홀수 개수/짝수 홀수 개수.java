class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;   // 짝수
        int odd = 0;    // 홀수
        if(check(num_list)) {
            for(int x : num_list) {
                if(x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            
            answer[0] = even;
            answer[1] = odd;
        }
        
        return answer;
    }
    
    public boolean check(int[] z) {
        boolean check = false;
        boolean argu1 = (1 <= z.length) && (z.length <= 100);
        if(argu1) {
            for(int x : z) {
                if((0 <= x) && (x <= 1000)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}