class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        if(check(my_string)) {
            String str = my_string.replaceAll("[^0-9]", "");
            int sum = 0;
            for(int i = 0; i < str.length(); i++) {
                int x = Integer.parseInt(str.substring(i, i+1));
                sum += x;
            }
            
            answer = sum;
        }
        
        return answer;
    }
    
    public boolean check(String str) {
        boolean check = false;
        if(str.length() >= 1 && str.length() <= 1000) {
            check = true;
        }
        return check;
    }
}