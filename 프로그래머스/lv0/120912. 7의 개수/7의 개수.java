class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String str = "";
        for(int x : array) {
            String s = Integer.toString(x);
            str += s;
        }
        
        String[] strings = str.split("");
        for(String x : strings) {
            if(x.equals("7")) {
                answer++;
            }
        }
        
        return answer;
    }
}