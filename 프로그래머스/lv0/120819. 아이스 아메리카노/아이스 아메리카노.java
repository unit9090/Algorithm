class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int coffee = 0;
        int change = 0;
        
        if(check(money)) {
            coffee = money / 5500;
            change = money - (coffee * 5500);
        }
        
        answer[0] = coffee;
        answer[1] = change;
        
        return answer;
    }
    
    public static boolean check(int money) {
        boolean check = false;
        if(0 < money && money <= 1000000) {
            check = true;
        }
        return check;
    }
}