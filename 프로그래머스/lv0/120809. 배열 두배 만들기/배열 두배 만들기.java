class Solution {
    public int[] solution(int[] numbers) {
        if(numbers.length >= 1 && numbers.length <= 10000) {
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] >= -10000 && numbers[i] <= 10000) {
                    numbers[i] *= 2;
                }
            }
        }
        
        int[] answer = numbers;
        return answer;
    }
}