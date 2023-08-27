class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = sides[0] < sides[1] ? sides[1] : sides[0];
        int min = sides[0] == max ? sides[1] : sides[0];
        
        System.out.println(max + ", " + min);
        for(int i = 1; i < max + min; i++) {
            if(max >= i && max < i + min) {
                answer++;
            } else if(max < i && i < max + min) {
                answer++;
            }
        }
        
        return answer;
    }
}