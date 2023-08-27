class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        if(check(numbers)) {
            for(int x : numbers) {
                sum += x;
            }
            
            answer = (double) sum / numbers.length;
        }
        return answer;
    }
    
    public static boolean check(int[] numbers) {
        boolean check = false;
        boolean argu1 = 1 <= numbers.length && numbers.length <= 100;
        boolean argu2 = false;
        for(int x : numbers) {
            if(0 <= x && x <= 1000) {
                argu2 = true;
            } else {
                argu2 = false;
                break;
            }
        }
        
        if(argu1 && argu2) {
            check = true;
        }
        
        return check;
    }
}