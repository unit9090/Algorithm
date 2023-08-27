class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(check(dot)) {
            if(dot[0] > 0 && dot[1] > 0) {
                answer = 1;
            } else if(dot[0] < 0 && dot[1] > 0) {
                answer = 2;
            } else if(dot[0] < 0 && dot[1] < 0) {
                answer = 3;
            } else if(dot[0] > 0 && dot[1] < 0) {
                answer = 4;
            }
        }
        
        return answer;
    }
    
    public boolean check(int[] dot) {
        boolean check = false;
        boolean argu1 = dot.length == 2;
        
        if(argu1) {
            for(int x : dot) {
                if(x == 0 || x < -500 || x > 500) {
                    check = false;
                    break;
                }
                check = true;
            }
        }
        
        return check;
    }
}