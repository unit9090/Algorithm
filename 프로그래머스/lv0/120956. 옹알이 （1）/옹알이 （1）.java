class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab = {"aya", "ye", "woo", "ma"};
        for(String s : babbling) {
            for(String b : bab) {
                s = s.replace(b, " ");
            }
            s = s.replace(" ", "");
            if(s.length() == 0) answer++;
        }
        
        return answer;
    }
}