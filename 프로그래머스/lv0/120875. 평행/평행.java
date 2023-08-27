class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        for(int i = 1; i < 4; i++) {
            int x1 = dots[i][0] - dots[0][0];
            int y1 = dots[i][1] - dots[0][1];
            
            int x2; int y2;
            if(i == 1) {
                x2 = dots[2][0] - dots[3][0];
                y2 = dots[2][1] - dots[3][1];
            } else if(i == 2) {
                x2 = dots[1][0] - dots[3][0];
                y2 = dots[1][1] - dots[3][1];
            } else {
                x2 = dots[2][0] - dots[1][0];
                y2 = dots[2][1] - dots[1][1];
            }
            
            if(x1 == x2 && x1 == 0) {
                answer = 1;
                break;
            } else if(x1 != 0 || x2 != 0) {
                double slope1 = (double) y1 / (double) x1;
                double slope2 = (double) y2 / (double) x2;
                
                if(slope1 == slope2) {
                    answer = 1;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}