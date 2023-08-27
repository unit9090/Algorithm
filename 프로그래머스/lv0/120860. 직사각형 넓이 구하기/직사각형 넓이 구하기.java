class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x = dots[0][0];
        for(int i = 0; i < dots.length; i++) {
            if(dots[i][0] != x) {
                x = dots[i][0] > x ? dots[i][0] - x : x - dots[i][0];
                System.out.println(x);
                break;
            }
        }
        
        int y = dots[0][1];
        for(int i = 0; i < dots.length; i++) {
            if(dots[i][1] != y) {
                y = dots[i][1] > y ? dots[i][1] - y : y - dots[i][1];
                System.out.println(y);
                break;
            }
        }
        
        System.out.println(x + ", " + y);
        answer = x * y;
        
        return answer;
    }
}