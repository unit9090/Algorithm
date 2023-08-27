class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int start = num1;
        if(check(numbers, num1, num2)) {
            answer = new int[num2 - num1 + 1];
            for(int i = 0; i <= (num2 - num1); i++) {
                answer[i] = numbers[start];
                start++;
            }
        }
        return answer;
    }
    
    public boolean check(int[] numbers, int num1, int num2) {
        boolean check = false;
        boolean argu1 = 2 <= numbers.length && numbers.length <= 30;
        boolean argu2 = 0 <= num1 && num1 < num2 && num2 < numbers.length;
        
        if(argu1 && argu2) {
            for(int x : numbers) {
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