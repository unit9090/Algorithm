class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        if(check(numbers, k)) {
            answer = 1;
            int num = 0;
            for(int x = 0; x < k - 1; x++) {
                if(num + 2 < numbers.length) {
                    num += 2;
                    answer = numbers[num];
                } else {
                    num = num + 2 - numbers.length;
                    answer = numbers[num];
                }
                
                System.out.println(num);
            }
        }
        
        return answer;
    }
    
    public boolean check(int[] numbers, int k) {
        boolean check = false;
        boolean argu1 = numbers.length > 2 && numbers.length < 100;
        boolean argu2 = k > 0 && k < 1000;
        
        if(argu1 && argu2) {
            check = true;
        }
        
        return check;
    }
}