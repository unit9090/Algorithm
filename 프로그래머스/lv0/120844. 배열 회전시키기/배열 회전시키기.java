class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(check(numbers, direction)) {
            if(direction.equals("left")) {
                for(int i = 0; i < numbers.length - 1; i++) {
                    answer[i] = numbers[i + 1];
                }
                answer[numbers.length - 1] = numbers[0];
            } else {
                for(int i = numbers.length - 1; i > 0; i--) {
                    answer[i] = numbers[i - 1];
                }
                answer[0] = numbers[numbers.length - 1];
            }
            
        }
        
        return answer;
    }
    
    public boolean check(int[] numbers, String direction) {
        boolean check = false;
        boolean argu1 = numbers.length >= 3 && numbers.length <= 20;
        boolean argu2 = direction.equals("left") || direction.equals("right");
        
        if(argu1 && argu2) {
            check = true;
        }
        
        return check;
    }
}