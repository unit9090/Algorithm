class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int sum = 0;
        if(check(hp)) {
            int x = hp / 5;
            int y = 0;
            int z = 0;
            
            int leftHp = hp - (5 * x);
            if(leftHp != 0) {
                y = leftHp / 3;
                leftHp -=  3 * y;
            }
            
            if(leftHp != 0) {
                z = leftHp / 1;
                leftHp -= z;
            }
            
            System.out.println(x + y + z);
            answer = x + y + z;
        }
        
        return answer;
    }
    
    public boolean check(int hp) {
        boolean check = false;
        if(hp >= 0 && hp <= 1000) {
            check = true;
        }
        return check;
    }
}