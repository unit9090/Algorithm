class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        // 세 숫자가 모두 같다면
        if(a == b && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if(a == b || a == c || b == c) {     // 세 숫자 중 두 숫자가 같다면
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else {        // 세 숫자가 모두 다르다면
            answer = a + b + c;
        }
        
        return answer;
    }
}