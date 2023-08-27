class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        for(String s : str) {
            if(s.length() > 0) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}