class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int height = 0;
        int width = 0;
        if(M < N) {
            answer = (M - 1) + M * (N - 1);
        } else {
            answer = (N - 1) + N * (M - 1);
        }
        
        
        return answer;
    }
}