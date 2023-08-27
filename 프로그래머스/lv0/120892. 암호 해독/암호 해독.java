class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] cip = cipher.split("");
        int x = code;
        for(int i = 0; i < cip.length; i++) {
            if(i == (x - 1)) {
                answer += cip[i];
                x += code;
            }
        }
        
        return answer;
    }
}