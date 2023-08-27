class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String s = numbers;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for(int i = 0; i < number.length; i++) {
            if(s.contains(number[i])) {
                s = s.replaceAll(number[i], Integer.toString(i));
            }
        }
        
        System.out.println(s);
        answer = Long.parseLong(s);
        
        return answer;
    }
}