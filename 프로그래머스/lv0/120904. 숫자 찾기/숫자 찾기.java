class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int n = Integer.toString(num).indexOf(Integer.toString(k));
        answer = n;
        if(n != -1) {
            answer += 1;
        }
        
        
        System.out.println(n);
        return answer;
    }
}