class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = s.split(" ");
        int count = 0;
        int sum = 0;
        for(String x : str) {
            if(x.equals("Z")) {
                sum -= count;
            } else {
                sum += Integer.parseInt(x);
                count = Integer.parseInt(x);
            }
        }
        
        System.out.println(sum);
        answer = sum;
        
        return answer;
    }
}