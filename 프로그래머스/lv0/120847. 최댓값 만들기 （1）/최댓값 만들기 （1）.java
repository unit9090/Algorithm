class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        if(check(numbers)) {
            int max1 = numbers[0];
            int max2 = numbers[0];
            
            for(int x : numbers) {
                if(max1 < x) {
                    max1 = x;
                }
            }
            
            if(max1 == max2) max2 = numbers[1];
            
            for(int x : numbers) {
                if(max1 == x) continue;
                if(max2 < x) {
                    max2 = x;
                }
            }
            
            System.out.println(max1 + ", " + max2);
            answer = max1 * max2;
        }
        
        return answer;
    }
    
    public boolean check(int[] numbers) {
        boolean check = false;
        boolean argu1 = numbers.length <= 100 && numbers.length >= 2;
        
        if(argu1) {
            for(int x : numbers) {
                if(x < 0 && x > 10000) {
                    check = false;
                    break;
                }
                
                check = true;
            }
        }
        return check;
    }
}