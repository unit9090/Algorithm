class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        if(check(num_list)) {
            for(int i = 0; i < num_list.length; i++) {
                int x = num_list.length - 1 - i;
                answer[x] = num_list[i];
            }
        }
        
        return answer;
    }
    
    public static boolean check(int[] num_list) {
        boolean check = false;
        if(1 <= num_list.length && num_list.length <= 1000) {
            for(int x : num_list) {
                if(0 <= x && x <= 1000) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
        }
        
        return check;
    }
}