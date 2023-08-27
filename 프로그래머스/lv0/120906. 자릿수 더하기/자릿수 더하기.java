class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] str = Integer.toString(n).split("");
        for(String x : str) {
            answer += Integer.parseInt(x);
        }
        return answer;
    }
}