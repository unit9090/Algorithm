class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // String x = my_string.replaceAll("[^0-9+-]", " ");
        // System.out.println(x);
        
        // String[] str = x.split(" ");
        int sum = 0;
        boolean plus = true;
        String[] str = my_string.split(" ");
        for(String s : str) {
            // System.out.println(s);
            if(s.equals("+")) {
                plus = true;
            } else if(s.equals("-")) {
                plus = false;
            } else {
                if(plus) {
                    sum += Integer.parseInt(s);
                } else {
                    sum -= Integer.parseInt(s);
                }
            }
        }
        
        // System.out.println(sum);
        answer = sum;
        
        return answer;
    }
}